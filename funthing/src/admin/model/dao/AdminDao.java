// 주문관리 페이지 검색창_혜린
package admin.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import brand.model.vo.Brand;
import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import product.model.vo.Product;

public class AdminDao {

	public int getListCount(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM PRODUCT";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				listCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pstmt);
		close(rset);
		
		
		return listCount;
	}

	public ArrayList<Product> selectProductList(Connection conn, int currentPage, int limit) {
		
		ArrayList<Product> list = new ArrayList<>();
		Product p = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int startRow = (currentPage - 1)*limit +1;
		int endRow = startRow + limit -1;
		String query = "SELECT P_NO, P_NAME, P_CATEGORY, RETAIL_PRICE, DC_RATE, P_PRICE, F_YN, F_START_DATE, F_END_DATE FROM PRODUCTLIST WHERE RNUM BETWEEN ? AND ?";
		
		System.out.println("새로 list담자");
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product();
				p.setpNo(rset.getString("p_no"));
				p.setpName(rset.getString("p_name"));
				p.setpCategory(rset.getInt("p_category"));
				p.setRetailPrice(rset.getInt("retail_price"));
				p.setDcRate(rset.getInt("dc_rate"));
				p.setpPrice(rset.getInt("p_price"));
				p.setfYn(rset.getString("f_yn"));
				p.setfStartDate(rset.getDate("f_start_date"));
				p.setfEndDate(rset.getDate("f_end_date"));
				
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pstmt);
		close(rset);
		
		return list;
	}

	// 주문관리 페이지_혜린	
	public ArrayList<OrderInfo> selectOrderSearch(Connection conn, int currentPage, int limit, String searchKind,
			String searchText) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<OrderInfo> searchList = new ArrayList<>();
		String query = null;
		
		
		int startRow = (currentPage -1) * limit + 1;	// 현재 페이지에서 보여주는 게시글 목록의 행번호 값
		int endRow = startRow + (limit - 1);			// 현재 페이지에서 보여주는 게시글 행번호 마지막 값
		
		
		
		try {
		if(searchKind == null && searchText == null ) {	
			query = "SELECT * FROM ORDER_INFO WHERE RNUM BETWEEN ? AND ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
		}else if(searchKind != null && searchText.equals("")) {
			query = "SELECT * FROM ORDER_INFO WHERE RNUM BETWEEN ? AND ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
		}else if(searchKind != null && searchText != null) {
			query = "SELECT * FROM ORDER_INFO WHERE "+searchKind+"= ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, searchText);			
		}
			
			rset = pstmt.executeQuery();
			
			while(rset.next()){
				OrderInfo om = new OrderInfo(
						rset.getString("O_NO"),
						rset.getString("M_ID"),
						rset.getString("PMNT_MTHD"),
						rset.getString("PAID_YN"),
						rset.getString("PRCS_STATUS"),
						rset.getInt("PMNT_PRICE"),
						rset.getString("CANCEL_YN"),
						rset.getInt("RNUM"));
				searchList.add(om);
			}
	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close(pstmt);
				close(rset);
			}
		return searchList;
		
	}

	// 주문관리 페이지_혜린	
	public int getOrderListCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM ORDER_INFO";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				listCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pstmt);
		close(rset);
	
		
		return listCount;
	}

	// 주문관리 페이지 상세보기_혜린
	public OrderInfoDetail selectOrderDetail(Connection conn, String mid) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderInfoDetail od = new OrderInfoDetail();
		
		String query = "SELECT * FROM ORDER_DETAIL WHERE M_ID = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mid);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				od = new OrderInfoDetail( 
						rset.getString("O_DATE"),
						rset.getString("RCV_NAME"),
						rset.getString("RCV_ADRS"),
						rset.getInt("RCV_PHONE"),
						rset.getString("COMMENTT"),
						rset.getInt("EXPT_POINT"),
						rset.getString("P_NO"),
						rset.getInt("O_NUM"),
						rset.getInt("TOTAL_PRICE"),
						rset.getInt("POINT_USE"),
						rset.getInt("PMNT_PRICE"),
						rset.getString("O_NO"),
						rset.getString("M_ID"));

			}
//			System.out.println("Dao od : " + od);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		return od;
	}

	public Product selectOneProductDetail(Connection conn, String pNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Product p = null;
		
		String query = "SELECT * FROM PRODUCT WHERE P_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pNo);
			
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				p = new Product(rset.getString("p_no"),
								rset.getString("b_no"),
								rset.getString("thumbnail"),
								rset.getString("p_name"),
								rset.getString("p_color"),
								rset.getString("p_size"),
								rset.getInt("retail_Price"),
								rset.getInt("dc_rate"),
								rset.getInt("p_price"),
								rset.getInt("p_category"),
								rset.getInt("s_no"),
								rset.getString("p_detail"),
								rset.getString("img_router"),
								rset.getInt("p_point"),
								rset.getDate("ship_date"),
								rset.getDate("f_start_date"),
								rset.getDate("f_end_date"),
								rset.getInt("f_goal"),
								rset.getInt("f_sel_price"),
								rset.getString("f_yn"),
								rset.getString("cal_no"),
								rset.getInt("f_prg_rate"));
								
				
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
		return p;
	}

	public int productDelete(Connection conn, String pNo) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = "UPDATE PRODUCT SET F_YN = 'N' WHERE P_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(pstmt);
		}
		return result;
	}

	public int productUpdate(Connection conn, Product p, String pNo, String afterPno) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE PRODUCT SET \r\n" + 
				"P_NO = ?, P_COLOR = ?, P_SIZE = ?, RETAIL_PRICE = ?, DC_RATE = ?, P_PRICE = ?, P_DETAIL = ?, P_POINT = ?, SHIP_DATE = ?, F_START_DATE = ?, F_END_DATE = ?, F_GOAL = ?, F_YN = ? \r\n" + 
				"WHERE P_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, afterPno);
			pstmt.setString(2, p.getP_color());
			pstmt.setString(3, p.getP_size());
			pstmt.setInt(4, p.getRetailPrice());
			pstmt.setInt(5, p.getDcRate());
			pstmt.setInt(6, p.getpPrice());
			pstmt.setString(7, p.getpDetail());
			pstmt.setInt(8, p.getpPoint());
			pstmt.setDate(9, p.getShipDate());
			pstmt.setDate(10, p.getfStartDate());
			pstmt.setDate(11, p.getfEndDate());
			pstmt.setInt(12, p.getfGoal());
			pstmt.setString(13, p.getfYn());
			pstmt.setString(14, pNo);
			
			result = pstmt.executeUpdate();
			System.out.println("dao result : " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(pstmt);
		}
		return result;
	}

	
	
	
	// 브랜드 관리자 페이지(리스트 카운트 메소드)_희지
	public int getBrandListCount(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int brandListCount = 0;
		
		String query = "SELECT COUNT(*) FROM BRAND";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			if(rset.next()) 
			{
				brandListCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return brandListCount;
	}
	

	// 브랜드 관리자 페이지(브랜드 조회하는 메소드)_희지
	public ArrayList<Brand> selectBrandList(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Brand> brandList = new ArrayList<>();
	
		
		String query = "SELECT B_NO, B_NAME, B_CEO, B_PHONE, B_ADDRESS, B_EMAIL, B_LCH_DATE, B_LCH_YN FROM BRANDLIST WHERE RNUM BETWEEN ? AND ?";
		
		
		int startRow = (currentPage -1) * limit +1;
		
		int endRow = startRow + (limit -1);
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Brand b = new Brand(rset.getString("B_NO"),
						rset.getString("B_NAME"),
						rset.getString("B_CEO"),
						rset.getString("B_PHONE"),
						rset.getString("B_ADDRESS"),
						rset.getString("B_EMAIL"),
						rset.getDate("B_LCH_DATE"),
						rset.getString("B_LCH_YN"));
				
				brandList.add(b);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return brandList;
	}

		
	// 브랜드 등록 페이지(정보 insert 메소드)_희지
	public int insertBrand(Connection conn, Brand b) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query="INSERT INTO BRAND VALUES(SEQ_BR.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getbName());
			pstmt.setString(2, b.getbCeo());
			pstmt.setString(3, b.getbPhone());
			pstmt.setString(4, b.getbAddress());
			pstmt.setString(5, b.getbEmail());
			pstmt.setDate(6, b.getbLchDate());
			pstmt.setString(7, b.getbLchYn());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


	// 브랜드 update위해 한 브랜드 정보 select_희지
	public Brand selectOneBrand(Connection conn, String bNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Brand brand = null;
		
		String query = "SELECT * FROM BRAND WHERE B_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bNo);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
					brand = new Brand(rset.getString("B_NO"),
						rset.getString("B_NAME"),
						rset.getString("B_CEO"),
						rset.getString("B_PHONE"),
						rset.getString("B_ADDRESS"),
						rset.getString("B_EMAIL"),
						rset.getDate("B_LCH_DATE"),
						rset.getString("B_LCH_YN"));
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return brand;
	}

	
	// 브랜드 update_희지
	public int updateBrand(Connection conn, Brand b, String bNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query="UPDATE BRAND SET B_NO=?, B_NAME=?, B_CEO=?, B_PHONE=?,\r\n" + 
				"B_ADDRESS=?, B_EMAIL=?, B_LCH_DATE=?, B_LCH_YN=? WHERE B_NO =?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,b.getbNo());
			pstmt.setString(2, b.getbName());
			pstmt.setString(3, b.getbCeo());
			pstmt.setString(4, b.getbPhone());
			pstmt.setString(5, b.getbAddress());
			pstmt.setString(6, b.getbEmail());
			pstmt.setDate(7, b.getbLchDate());
			pstmt.setString(8, b.getbLchYn());
			pstmt.setString(9, bNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			
		}
		
		return result;
	}

	
	// 브랜드 delete_희지
	public int deleteBrand(Connection conn, String bNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE BRAND SET B_LCH_YN='N' WHERE B_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bNo);
			
			result = pstmt.executeUpdate();
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	
	
	
	
	
	
	
}
