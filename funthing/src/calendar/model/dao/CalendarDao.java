package calendar.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import product.model.vo.Product;

import static common.JDBCTemplate.*;

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

}
