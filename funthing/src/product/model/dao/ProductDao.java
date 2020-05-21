package product.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import product.model.vo.Product;

import static common.JDBCTemplate.*;
public class ProductDao {
	
	Properties prop = new Properties();
	
	

	public ProductDao() {
		super();
		
		String fileName = ProductDao.class.getResource("/sql/product/product-query.properties").getPath();
		
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ArrayList<Product> arriSelectProduct(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		
		String query = prop.getProperty("arriSelectProduct");

		
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
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

	public ArrayList<Product> bestSelectProduct(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		
		//누적판매금액으로 best뽑아냄
		String query = prop.getProperty("bestSelectProduct");
//		String query = "SELECT THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE, F_SEL_PRICE\r\n" + 
//						"FROM PRODUCT\r\n" + 
//						"GROUP BY THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE, F_SEL_PRICE\r\n" + 
//						"ORDER BY F_SEL_PRICE DESC";
		
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
		finally
		{
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

	public ArrayList<Product> closeSelectProduct(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		
		String query = prop.getProperty("closeSelectProduct");
//		String query = "SELECT THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE\r\n" + 
//						"FROM PRODUCT\r\n" + 
//						"WHERE F_END_DATE > SYSDATE\r\n" + 
//						"GROUP BY THUMBNAIL, P_NAME, P_PRICE, F_START_DATE, F_END_DATE\r\n" + 
//						"ORDER BY 5 ASC";
		
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
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

	public ArrayList<Product> productSearch(Connection conn, String search) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Product p = null;
		ArrayList<Product> plist = new ArrayList<>();
		
		
		String query = "SELECT distinct substr(p_no,0,8),b_no, p_name, thumbnail ,p_price, f_start_date, f_end_date\n" + 
				"FROM PRODUCT \n" + 
				"WHERE P_NAME like '%"+search+"%'";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product(rset.getString("substr(p_no,0,8)"),
								rset.getString("b_no"),
								rset.getString("thumbnail"),
								rset.getString("p_name"),
								rset.getInt("p_price"),
								rset.getDate("f_start_date"),
								rset.getDate("f_end_date"));
				plist.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(pstmt);
			close(rset);
		}
		
		return plist;
	}

	public ArrayList<Product> brandSearch(Connection conn, String search) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Product p = null;
		ArrayList<Product> blist = new ArrayList<>();
		
		
		String query = "SELECT distinct substr(p_no,0,8),B_NAME, p_name, thumbnail ,p_price, f_start_date, f_end_date\n" + 
				"FROM PRODUCT P\n" + 
				"JOIN BRAND B ON P.B_NO = B.B_NO\n" + 
				"WHERE B_NAME LIKE '%"+ search +"%'";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product(rset.getString("substr(p_no,0,8)"),
						rset.getString("b_name"),
						rset.getString("thumbnail"),
						rset.getString("p_name"),
						rset.getInt("p_price"),
						rset.getDate("f_start_date"),
						rset.getDate("f_end_date"));
				
				blist.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(pstmt);
			close(rset);
		}
		
		return blist;
		
	}

}
