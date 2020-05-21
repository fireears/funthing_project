package product.model.dao;

import static common.JDBCTemplate.close;

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
import product.model.vo.ProductDetail;
import productQnA.model.vo.AdminProductQnA;
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

	// 제품 상세 페이지_혜린
	public ArrayList<ProductDetail> selectProDetail(Connection conn, String pName) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ProductDetail> list = new ArrayList<>();
		ProductDetail pd = null;
		
		String query = "select distinct substr(p.P_NO,0,8),p.B_NO,b_name,THUMBNAIL,P_NAME,P_COLOR,P_SIZE,RETAIL_PRICE,DC_RATE,P_PRICE,P_CATEGORY,S_NO,P_DETAIL,IMG_ROUTER,P_POINT,SHIP_DATE,F_START_DATE,F_END_DATE,F_GOAL,F_SEL_PRICE,F_YN,CAL_NO,F_PRG_RATE, o_num "
				+ " from product p " 
				+ " full join product_order po on p.p_no = po.p_no "
				+ " full join brand b on p.B_NO = b.b_no "
				+ " where p_name = ? "
				+ " order by p_size desc";

		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pName);
			rset = pstmt.executeQuery();
			while(rset.next()) {
			pd = new ProductDetail(
				rset.getString("substr(p.P_NO,0,8)"),
				rset.getString("B_NO"),
				rset.getString("B_NAME"),
				rset.getString("THUMBNAIL"),
				rset.getString("P_NAME"),
				rset.getString("P_COLOR"),
				rset.getString("P_SIZE"),
				rset.getInt("RETAIL_PRICE"),
				rset.getInt("DC_RATE"),
				rset.getInt("P_PRICE"),
				rset.getInt("P_CATEGORY"),
				rset.getInt("S_NO"),
				rset.getString("P_DETAIL"),
				rset.getString("IMG_ROUTER"),
				rset.getInt("P_POINT"),
				rset.getDate("SHIP_DATE"),
				rset.getDate("F_START_DATE"),
				rset.getDate("F_END_DATE"),
				rset.getInt("F_GOAL"),
				rset.getInt("F_SEL_PRICE"),
				rset.getString("F_YN"),
				rset.getString("CAL_NO"),
				rset.getInt("F_PRG_RATE"),
				rset.getInt("O_NUM"));
			
				list.add(pd);
				
			}
			System.out.println("productDetail Dao list : " + list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return list;
	}

	// 제품 상세 페이지 사이즈_혜린
	public ArrayList<ProductDetail> sizeSelectProDetail(Connection conn, String pName) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ProductDetail> list = new ArrayList<>();
		ProductDetail pd = null;
		
		String query = " select distinct substr(p.P_NO,0,8), P_NAME, p_size "
				+ " from product p "
				+ " where p_name = ? "
				+ " order by p_size desc"; 
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pName);
			rset = pstmt.executeQuery();
			while(rset.next()) {
			pd = new ProductDetail(
				rset.getString("substr(p.P_NO,0,8)"),
				rset.getString("P_NAME"),
				rset.getString("P_SIZE"));
			
				list.add(pd);
				
			}
			System.out.println("size productDetail Dao list : " + list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return list;
	}

	// 제품 상세 페이지(qna)_혜린
	public int getListCount(Connection conn, String pName) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		String query = 
				  "select p_name, m_id, qna_title,qna_date "
				+ " from qna q "
				+ " join member m on q.m_no = m.m_no "
				+ " join product p on q.p_no2 = p.p_no "
				+ " where p_name = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pName);
			rset =  pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return result;
	}
	
	// 제품 상세 페이지(qna)_혜린
	public ArrayList<AdminProductQnA> qnaSelectProduct(Connection conn, String pName) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<AdminProductQnA> list = new ArrayList<>();
		AdminProductQnA ap = null;
		
		String query = 
				  "select p_name, m_id, qna_title,qna_date "
				+ " from qna q "
				+ " join member m on q.m_no = m.m_no "
				+ " join product p on q.p_no2 = p.p_no "
				+ " where p_name = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pName);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				ap = new AdminProductQnA(
				rset.getString("p_name"),
				rset.getString("m_id"),
				rset.getString("qna_title"),
				rset.getString("qna_date"));
			
				list.add(ap);
				
			}
			System.out.println("AdminProductQnA Dao list : " + list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return list;
	}

}
