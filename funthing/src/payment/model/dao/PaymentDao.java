package payment.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import member.model.vo.MemberPoint;
import payment.model.vo.OrderList;

import payment.model.vo.OrderUpdate;

import payment.model.vo.Payment;


import personalQnA.model.vo.PersonalQnA;

import payment.model.vo.ShoppingPayment;

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

	
	
	public ArrayList<OrderUpdate> selectOrderList(Connection conn, String searchDate, String firstDate, String secondDate, int currentPage,
			int limit, String userNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderUpdate ol = null;
		
		ArrayList<OrderUpdate> oList = new ArrayList<>();
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
				
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
										+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
										+ " FROM PRODUCT_ORDER PO "
										+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
										+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
										+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
										+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
										+ " WHERE M.M_NO= ?) " 
										+ " WHERE RNUM BETWEEN ? AND ? ";
						
						pstmt = conn.prepareStatement(query);
						
						pstmt.setString(1, userNo);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '오늘'선택 했을 때
					}else if(searchDate != null && searchDate.equals("today")) {
						System.out.println("--------------------------today");
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') = TO_DATE(SYSDATE,'RRRR/MM/DD'))" 
								+ " WHERE RNUM BETWEEN ? AND ? ";
						
								
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						


//					 클라이언트가 '7일' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("week")) {
						System.out.println("-------------------------week-----------------------");
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-7) "
								+ " WHERE RNUM BETWEEN ? AND ? ";  
						
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '한달' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("month")) {
						System.out.println("-------------------------month-----------------------ok");
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-30) "
								+ " WHERE RNUM BETWEEN ? AND ? ";  
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '3개월' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("3months")) {
						System.out.println("-------------------------3months-----------------------ok");
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-90) "
								+ " WHERE RNUM BETWEEN ? AND ? ";  
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '6개월' 선택 했을 때
					}else if(searchDate != null &&  searchDate.equals("6months")) {
						System.out.println("-------------------------6months-----------------------");
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-180) "
								+ " WHERE RNUM BETWEEN ? AND ? ";  
						
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 '1년' 선택 했을 때	
					}else if(searchDate != null &&  searchDate.equals("year")) {
						System.out.println("-------------------------year-----------------------");
						String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum,pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-365) "
								+ " WHERE RNUM BETWEEN ? AND ? ";  
						
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(2, startRow);
						pstmt.setInt(3, endRow);
						pstmt.setString(1, userNo);
						
						rset = pstmt.executeQuery();
						
						
					// 클라이언트가 날짜 선택했을 때
					}else {
						System.out.println("캘린더 선택 날자선택");
						
						String query = "THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, commentt, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
								+ " FROM(SELECT rownum rnum, pd.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt, M.M_NO ,J.PRCS_STATUS,j.CANCEL_YN,  PO.O_NUM "
								+ " FROM PRODUCT_ORDER PO "
								+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
								+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
								+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
								+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
								+ " WHERE M.M_NO= ? AND TO_DATE(O_DATE,'RRRR/MM/DD') BETWEEN TO_DATE(?,'RRRR/MM/DD') AND TO_DATE(?,'RRRR/MM/DD')) " 
								+ " WHERE RNUM BETWEEN ? AND ? ";
					

							
						pstmt = conn.prepareStatement(query);
						pstmt.setString(1 , userNo);
						pstmt.setString(2, firstDate);
						pstmt.setString(3, secondDate);
						pstmt.setInt(4, startRow);
						pstmt.setInt(5, endRow);	
						
						rset = pstmt.executeQuery();
						
						
					}
					
					while(rset.next()) {
						/* System.out.println("while(rset.next())"); */
						
						ol = new OrderUpdate(
//											rset.getInt("rownum"),
											rset.getString("THUMBNAIL"),
											rset.getString("P_NAME"),
											rset.getString("P_COLOR"),
											rset.getString("P_SIZE"),
											rset.getInt("TOTAL_PRICE"),
											rset.getString("O_NO"),
											rset.getDate("O_DATE"),
											rset.getString("RCV_NAME"),
											rset.getString("RCV_ADRS"),
											rset.getInt("RCV_PHONE"),
											rset.getString("COMMENTT"),
											rset.getString("M_NO"),
											rset.getString("PRCS_STATUS"),
											rset.getString("CANCEL_YN"),
											rset.getInt("O_NUM"));
						
						oList.add(ol);
					}
					System.out.println("orderupdate list ?" + oList);
					
			
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close(pstmt);
					close(rset);
				}
				return oList;
		
		
		
		
	}



	// 배송지 수정 페이지_혜린
	public int updateShipModi(Connection conn, OrderUpdate ou) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		
		String query = "update payment_info  set RCV_NAME = ? , RCV_ADRS = ? ,RCV_PHONE = ?, COMMENTT = ?   where o_no = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ou.getRcv_name());
			pstmt.setString(2, ou.getRcv_adrs());
			pstmt.setInt(3, ou.getRcv_phone());
			pstmt.setString(4, ou.getComment());
			pstmt.setString(5, ou.getO_no());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


	// 주문취소 페이지_혜린
	public int orderCancle(Connection conn, OrderUpdate ou) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		
		String query = "update jumun set cancel_yn = 'Y' where o_no = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ou.getO_no());
		
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}


	// 주문목록 상세 페이지_혜린
	public ArrayList<OrderUpdate> selectOrderDetail(Connection conn, String oNo, String userNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderUpdate ou = null;
		ArrayList<OrderUpdate> list = new ArrayList<>();
		
		String query =" SELECT  O_NO, O_DATE, P_NAME, P_COLOR, P_SIZE, O_NUM, RCV_NAME, rcv_adrs, rcv_phone, commentt,  TOTAL_PRICE, point_use,pmnt_mthd,SHIP_PRICE, pmnt_price, expt_point ,PRCS_STATUS,CANCEL_YN "
						+ " FROM(SELECT  PO.O_NO, PI.O_DATE, PD.P_NAME, PD.P_COLOR, PD.P_SIZE,PO.O_NUM, pi.RCV_NAME, pI.rcv_adrs, pi.rcv_phone, pi.commentt,  PI.TOTAL_PRICE, pi.point_use, pi.pmnt_mthd, pi.SHIP_PRICE,pi.pmnt_price, pi.expt_point, J.PRCS_STATUS, j.CANCEL_YN "
						+ " FROM PRODUCT_ORDER PO "
						+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO " 
						+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
						+ " JOIN JUMUN J ON PO.O_NO = J.O_NO " 
						+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
						+ " WHERE j.o_no= ?) ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,oNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				ou = new OrderUpdate(
						rset.getString("O_NO"),
						rset.getDate("O_DATE"),
						rset.getString("P_NAME"),
						rset.getString("P_COLOR"),
						rset.getString("P_SIZE"),
						rset.getInt("O_NUM"),
						rset.getString("RCV_NAME"),
						rset.getString("rcv_adrs"),
						rset.getInt("rcv_phone"),
						rset.getString("commentt"),
						rset.getInt("TOTAL_PRICE"),
						rset.getInt("point_use"),
						rset.getString("pmnt_mthd"),
						rset.getString("SHIP_PRICE"),
						rset.getInt("pmnt_price"),
						rset.getInt("expt_point"),
						rset.getString("PRCS_STATUS"),
						rset.getString("CANCEL_YN")
						);
				
				list.add(ou);
			}
			
			System.out.println("detail list : " + list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		return list;

	}
	
	 public int insertPayment(Connection conn, Payment p) {
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      int result = 0;
	      
	      String query = "INSERT INTO PAYMENT_INFO(O_NO, O_DATE, RCV_NAME, RCV_ADRS, RCV_PHONE, COMMENTT, TOTAL_PRICE, POINT_USE, SHIP_PRICE, PMNT_PRICE, EXPT_POINT, M_NO)\r\n" + 
	            "VALUES('0'||TO_CHAR(SEQ_PAYINFO.NEXTVAL),SYSDATE,?,?,?,?,?,?,?,?,?, 'M01')";
	      
	      try {
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, p.getRcv_name());
	         pstmt.setString(2, p.getRcv_adrs());
	         pstmt.setString(3, p.getRcv_phone());
	         pstmt.setString(4, p.getComment());
	         pstmt.setInt(5, p.getTotal_price());
	         pstmt.setInt(6, p.getPoint_use());
	         pstmt.setString(7, p.getShip_price());
	         pstmt.setInt(8, p.getPmnt_price());
	         pstmt.setInt(9, p.getExpt_point());
	         
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



	   public ArrayList<ShoppingPayment> searchProducts(Connection conn, ArrayList<ShoppingPayment> list) {
	      PreparedStatement pstmt = null;
	      ResultSet rset = null;
	      
	      ShoppingPayment shoppingPayment = null;
	      ArrayList<ShoppingPayment> daoList = new ArrayList<>();
	      
	         try {
	            for(ShoppingPayment sp : list)
	            {
	               String query = "SELECT P_NO, THUMBNAIL, P_NAME, P_COLOR, P_SIZE, RETAIL_PRICE, DC_RATE, P_PRICE, P_POINT\r\n" + 
	                     "FROM PRODUCT\r\n" + 
	                     "WHERE P_NO = ?";
	               pstmt = conn.prepareStatement(query);
	               
	               pstmt.setString(1, sp.getP_no());
	               
	               rset = pstmt.executeQuery();
	               while(rset.next())
	               {
	                  shoppingPayment = new ShoppingPayment(rset.getString("p_no"),
	                                                rset.getString("thumbnail"),
	                                                rset.getString("p_name"),
	                                                rset.getString("p_color"),
	                                                rset.getString("p_size"),
	                                                rset.getInt("retail_price"),
	                                                rset.getInt("dc_rate"),
	                                                rset.getInt("p_price"),
	                                                rset.getInt("p_point"),
	                                                sp.getNumber());
	                  
	                  daoList.add(shoppingPayment);
	               }
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
	      
	      
	      return daoList;
	   }



	   

	   
	   

	

	

	

	
	

}
