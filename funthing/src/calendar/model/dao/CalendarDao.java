package calendar.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import product.model.vo.Product;

public class CalendarDao {

	public ArrayList<Product> selectCalendar(Connection conn) {
		ArrayList<Product> list = new ArrayList();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "SELECT SUBSTR(P_NO, 1, 8), THUMBNAIL, P_NAME, F_START_DATE, F_END_DATE, RETAIL_PRICE, P_PRICE, F_PRG_RATE FROM PRODUCT GROUP BY SUBSTR(P_NO, 1, 8), THUMBNAIL, P_NAME, F_START_DATE, F_END_DATE, RETAIL_PRICE, P_PRICE, F_PRG_RATE";		
		
//		System.out.println("calendar dao");
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				Product prd = new Product();
				
				prd.setpNo(rs.getString("SUBSTR(P_NO,1,8)"));
				prd.setThumbnail(rs.getString("THUMBNAIL"));
				prd.setpName(rs.getString("p_name"));
				prd.setfStartDate(rs.getDate("f_start_date"));
				prd.setfEndDate(rs.getDate("f_end_date"));
				prd.setRetailPrice(rs.getInt("RETAIL_PRICE"));
				prd.setpPrice(rs.getInt("P_PRICE"));
				prd.setfPrgRate(rs.getInt("F_PRG_RATE"));
				
				list.add(prd);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(stmt);
			close(rs);
		}
		
		
		return list;
	}

	public ArrayList<Product> clickDate(Connection conn, String thisDate) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Product> cList = new ArrayList<>();
		
		String query = "SELECT SUBSTR(P_NO,1,8), THUMBNAIL, P_NAME, RETAIL_PRICE, P_PRICE, F_START_DATE, F_END_DATE, F_PRG_RATE, F_GOAL, F_SEL_PRICE FROM PRODUCT WHERE F_START_DATE <= TO_DATE(?, 'YY/MM/DD') AND TO_DATE(?, 'YY/MM/DD') <= F_END_DATE GROUP BY SUBSTR(P_NO,1,8), THUMBNAIL, P_NAME, RETAIL_PRICE, P_PRICE, F_START_DATE, F_END_DATE, F_PRG_RATE, F_GOAL, F_SEL_PRICE";
		
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, thisDate);
			pstmt.setString(2, thisDate);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Product p = new Product(
						rs.getString("SUBSTR(P_NO,1,8)"),
						rs.getString("THUMBNAIL"),
						rs.getString("P_NAME"),
						rs.getInt("RETAIL_PRICE"),
						rs.getInt("P_PRICE"),
						rs.getDate("F_START_DATE"),
						rs.getDate("F_END_DATE"),
						rs.getInt("F_GOAL"),
						rs.getInt("F_SEL_PRICE"),
						rs.getInt("F_PRG_RATE"));
				
				cList.add(p);
			}
			System.out.println("dao cList" + cList);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}		
		
		
		return cList;
	}

}
