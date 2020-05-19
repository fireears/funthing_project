package women.model.dao;
import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import women.model.vo.WomenVo;

public class WomenDao {
public ArrayList<WomenVo> selectList(Connection conn, int currentPage, int limit) {
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE  SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
		int startRow = (currentPage - 1) * limit +1;
		int endRow = startRow + limit -1;
		String type=null;
		try {
			pstmt = conn.prepareStatement(sql);	
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				String str=rs.getString("SUBSTR(P_NO,4,5)");
				
				if(str.substring(0,2).equals("01")) {
					type="outer";
				}else if(str.substring(0,2).equals("02")) {
					type="top";
				}else if(str.substring(0,2).equals("03")) {
					type ="bottom";
				}else if(str.substring(0,2).equals("04")) {
					type="Jean";
				}else {
					type="onepiece";
				}									
				WomenVo sb = new WomenVo(rs.getString("P_NAME"), type, rs.getString("THUMBNAIL"), rs.getInt("RETAIL_PRICE"),rs.getInt("DC_RATE"),rs.getInt("P_PRICE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM (SELECT SUBSTR(P_NO,4,5) FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W' GROUP BY SUBSTR(P_NO,4,5))";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next())
			{
				listCount = rset.getInt(1); //1의 의미는 COUNT(*)
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(stmt);
			close(rset);
		}
		return listCount;
	}
}
