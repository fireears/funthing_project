package payment.model.service;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.ArrayList;

import payment.model.dao.PaymentDao;
import payment.model.vo.OrderList;
import payment.model.vo.OrderUpdate;

public class PaymentService {
	
//	public ArrayList<OrderList> oList(String userNo){
//		Connection conn = getConnection();
//		
//		ArrayList<OrderList> list = new PaymentDao().orderList(userNo);
//		
//		close(conn);
//		
//		return list;
//		
//	}
	
	public ArrayList<OrderList> orderListView(String userNo){
		Connection conn = getConnection();
		ArrayList<OrderList> oList = new PaymentDao().oderListView(conn, userNo);
		
		return oList;
	}
	
	
	public int getOrderListCount(String userNo) {
		Connection conn = getConnection();
	
		int orderListCount = new PaymentDao().getOrderListCount(conn, userNo);
		
		return orderListCount;
	}
	
	
	public ArrayList<OrderUpdate> selectOrderList(String searchDate, String firstDate, String secondDate, int currentPage,
			int limit, String userNo) {
		
		Connection conn = getConnection();
		
		ArrayList<OrderUpdate> oList = new PaymentDao().selectOrderList(conn, searchDate, firstDate, secondDate, currentPage, limit, userNo);
		
		close(conn);
		
		return oList;
	}

	// 배송지수정 페이지_혜린
	public int updateShipModi(OrderUpdate ou) {
		Connection conn = getConnection();
		
		int result = new PaymentDao().updateShipModi(conn,ou);
		
		// DML작업이니 트랜잭션 처리
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	// 주무뉘소 페이지_혜린
	public int orderCancle(OrderUpdate ou) {
		Connection conn = getConnection();
		
		int result = new PaymentDao().orderCancle(conn,ou);
		
		// DML작업이니 트랜잭션 처리
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

}
