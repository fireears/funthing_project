// 주문관리 페이지 검색창_혜린
package admin.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import product.model.vo.Product;

import static common.JDBCTemplate.*;

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
		
//		System.out.println("새로 list담자");
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

	
}
