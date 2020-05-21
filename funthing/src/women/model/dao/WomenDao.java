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
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE  SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
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

	public int getBottomCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM (SELECT SUBSTR(P_NO,4,5) FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W' AND SUBSTR(P_NO,4,2)='03'  GROUP BY SUBSTR(P_NO,4,5))";
		
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

	public ArrayList<WomenVo> selectListBottom(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE ( SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? )  AND SUBSTR(P_NO,4,2)='03' GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public int getJeanCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM (SELECT SUBSTR(P_NO,4,5) FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W' AND SUBSTR(P_NO,4,2)='04'  GROUP BY SUBSTR(P_NO,4,5))";
		
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

	public ArrayList<WomenVo> selectListJean(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE ( SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? )  AND SUBSTR(P_NO,4,2)='04' GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public int getOnepieceCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM (SELECT SUBSTR(P_NO,4,5) FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W' AND SUBSTR(P_NO,4,2)='05'  GROUP BY SUBSTR(P_NO,4,5))";
		
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

	public ArrayList<WomenVo> selectListOnepiece(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE ( SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? )  AND SUBSTR(P_NO,4,2)='05' GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public int getOuterListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM (SELECT SUBSTR(P_NO,4,5) FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W' AND SUBSTR(P_NO,4,2)='01'  GROUP BY SUBSTR(P_NO,4,5))";
		
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

	public ArrayList<WomenVo> selectListOuter(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE ( SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? )  AND SUBSTR(P_NO,4,2)='01' GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public int getTopListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM (SELECT SUBSTR(P_NO,4,5) FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W' AND SUBSTR(P_NO,4,2)='02'  GROUP BY SUBSTR(P_NO,4,5))";
		
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

	public ArrayList<WomenVo> selectListTop(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE ( SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? )  AND SUBSTR(P_NO,4,2)='02' GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY SUBSTR(SUBSTR(P_NO,4,5),3,3))";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public ArrayList<WomenVo> selectListHighPrice(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE  SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY P_PRICE DESC)";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public ArrayList<WomenVo> selectListLowPrice(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE  SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY P_PRICE ASC)";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public ArrayList<WomenVo> selectListCloseToCompletion(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE  SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY (F_END_DATE - SYSDATE) ASC)) WHERE F_END_DATE>SYSDATE";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	public ArrayList<WomenVo> selectListNewProduct(Connection conn, int currentPage, int limit) {
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		ArrayList<WomenVo> list = new ArrayList<WomenVo>();
		String sql = "SELECT * FROM (SELECT * FROM (SELECT SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE FROM (SELECT * FROM PRODUCT WHERE SUBSTR(P_NO,1,1)='W') WHERE  SUBSTR(SUBSTR(P_NO,4,5),3,3) BETWEEN ? AND ? GROUP BY SUBSTR(P_NO,4,5),THUMBNAIL,P_NAME,RETAIL_PRICE,DC_RATE,P_PRICE,F_START_DATE,F_END_DATE ORDER BY (F_START_DATE - SYSDATE) DESC)) WHERE F_START_DATE<SYSDATE";
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
				sb.setStart_date(rs.getString("F_START_DATE"));
				sb.setEnd_date(rs.getString("F_END_DATE"));
				System.out.println(sb);
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}
}