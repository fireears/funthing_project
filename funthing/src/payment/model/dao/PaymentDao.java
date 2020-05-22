package payment.model.dao;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import payment.model.vo.OrderList;
import personalQnA.model.vo.PersonalQnA;

public class PaymentDao {

//	public ArrayList<OrderList> orderList(String userNo) {
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		
//		ArrayList<OrderList> list = new ArrayList<>();
//		
//		String query = "SELECT * FROM ORDER_LIST WHERE M_NO =?";
//		
//		
//		
//		
//		
//		return null;
//	}
	
	public ArrayList<OrderList> oderListView(Connection conn, String userNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderList orderList = null;
		
		ArrayList<OrderList> oList = new ArrayList<>();
		
		String query = "SELECT * FROM ORDER_LIST WHERE M_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				orderList = new OrderList(rset.getString("o_no"),
											rset.getString("p_name"),
											rset.getString("p_color"),
											rset.getString("p_size"),
											rset.getInt("p_price"),
											rset.getInt("o_num"),
											rset.getString("prcs_status"),
											rset.getDate("o_date"),
											rset.getString("m_no")
											);
				
				oList.add(orderList);
			
			}
			System.out.println("dao list " + oList) ;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
	
	public int getOrderListCount(Connection conn, String userNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int orderListCount = 0;
		
		String query = "SELECT COUNT(*) FROM ORDER_LIST WHERE M_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				orderListCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		return orderListCount;
	}

	
	
	public ArrayList<OrderList> selectOrderList(Connection conn, String searchDate, String firstDate, String secondDate, int currentPage,
			int limit, String userNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderList ol = null;
		
		ArrayList<OrderList> oList = new ArrayList<>();
		System.out.println("Dao에서 searchDate: "+searchDate);
		
		// rnum 
				int startRow = (currentPage -1) * limit +1;
				int endRow = startRow + (limit -1);
				System.out.println("firstDate" + firstDate);
				System.out.println("secondDate" + secondDate);
				try {
					
					// 맨 처음 리스트 출력 값
					if(searchDate == null && firstDate == null) {

						System.out.println("searchDate가 null일때" + searchDate);
				
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=?)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
						
						pstmt = conn.prepareStatement(query);
						
						pstmt.setString(1, userNo);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '오늘'선택 했을 때
					}else if(searchDate != null && searchDate.equals("today")) {
						System.out.println("--------------------------today");
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
											"FROM ORDER_LIST\r\n" + 
											"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') = TO_DATE(SYSDATE,'RRRR/MM/DD'))\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";
								
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						


//					 클라이언트가 '7일' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("week")) {
						System.out.println("-------------------------week-----------------------");
						String query =  "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-7)\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '한달' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("month")) {
						System.out.println("-------------------------month-----------------------ok");
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-30)\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '3개월' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("3months")) {
						System.out.println("-------------------------3months-----------------------ok");
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-90)\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '6개월' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("6months")) {
						System.out.println("-------------------------6months-----------------------");
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-180)\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";
						
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '1년' 선택 했을 때	
					}else if(searchDate != null &&  searchDate.equals("year")) {
						System.out.println("-------------------------year-----------------------");
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-365)\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 날짜 선택했을 때
					}else {
						System.out.println("캘린더 선택 날자선택");
						
						String query = "SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" + 
										"FROM(SELECT ROWNUM RNUM, O_NO, P_NAME, P_COLOR, P_SIZE, P_PRICE, O_NUM, PRCS_STATUS ,M_NO, O_DATE \r\n" +  
										"FROM ORDER_LIST\r\n" + 
										"WHERE M_NO=? AND TO_DATE(O_DATE,'RRRR/MM/DD') BETWEEN TO_DATE(?,'RRRR/MM/DD') AND TO_DATE(?,'RRRR/MM/DD'))\r\n" + 
										"WHERE RNUM BETWEEN ? AND ?";

							
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(4, startRow);
						pstmt.setInt(5, endRow);	
						pstmt.setString(1 , userNo);
						pstmt.setString(2, firstDate);
						pstmt.setString(3, secondDate);
						
						rset = pstmt.executeQuery();
						
						
					}
					
					while(rset.next()) {
						System.out.println("while(rset.next())");
						ol = new OrderList(rset.getInt("rnum"),
											rset.getString("o_no"),
											rset.getString("p_name"),
											rset.getString("p_color"),
											rset.getString("p_size"),
											rset.getInt("p_price"),
											rset.getInt("o_num"),
											rset.getString("prcs_status"),
											rset.getDate("o_date"),
											rset.getString("m_no"));
						
						System.out.println("orerlist는?" + ol);
						oList.add(ol);
					}
					
					System.out.println("");
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close(pstmt);
					close(rset);
				}
				return oList;
		
		
		
		
	}

	
	

}
