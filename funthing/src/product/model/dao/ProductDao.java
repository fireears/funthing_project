package product.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import product.model.vo.Product;

public class ProductDao {

	public ArrayList<Product> arriSelectProduct(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		
		String query = "SELECT THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE\r\n" +
						"FROM PRODUCT\r\n" + 
						"WHERE F_YN = 'Y'\r\n"+
						"GROUP BY THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE\r\n" +
						"ORDER BY 4 DESC";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product(rset.getString("thumbnail"),
								rset.getString("p_name"),
								rset.getInt("p_price"),
								rset.getDate("f_start_date"),
								rset.getDate("f_end_date"));
				
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}

	public ArrayList<Product> bestSelectProduct(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		
		//누적판매금액으로 best뽑아냄
		String query = "SELECT THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE, F_SEL_PRICE\r\n" + 
						"FROM PRODUCT\r\n" + 
						"GROUP BY THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE, F_SEL_PRICE\r\n" + 
						"ORDER BY F_SEL_PRICE DESC";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product(rset.getString("thumbnail"),
						rset.getString("p_name"),
						rset.getDate("f_start_date"),
						rset.getDate("f_end_date"));
		
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Product> closeSelectProduct(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		
		String query = "SELECT THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE\r\n" + 
						"FROM PRODUCT\r\n" + 
						"WHERE F_END_DATE > SYSDATE\r\n" + 
						"GROUP BY THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE\r\n" + 
						"ORDER BY 5 ASC";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product(rset.getString("thumbnail"),
						rset.getString("p_name"),
						rset.getInt("p_price"),
						rset.getDate("f_start_date"),
						rset.getDate("f_end_date"));
		
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}

}
