package payment.model.service;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.ArrayList;

import member.model.vo.MemberPoint;
import payment.model.dao.PaymentDao;
import payment.model.vo.OrderList;
import payment.model.vo.Payment;
import payment.model.vo.ShoppingPayment;

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
	
	
	public ArrayList<OrderList> selectOrderList(String searchDate, String firstDate, String secondDate, int currentPage,
			int limit, String userNo) {
		
		Connection conn = getConnection();
		
		ArrayList<OrderList> oList = new PaymentDao().selectOrderList(conn, searchDate, firstDate, secondDate, currentPage, limit, userNo);
		
		close(conn);
		
		return oList;
	}


	public int insertPayment(Payment p) {
		Connection conn = getConnection();
		
		PaymentDao pDao = new PaymentDao();
		
		int result = pDao.insertPayment(conn, p);
		if(result > 0)
		{
			commit(conn);
		}
		else
		{
			rollback(conn);
		}
		close(conn);
		return result;
	}


	public ArrayList<ShoppingPayment> searchProducts(ArrayList<ShoppingPayment> list) {
		Connection conn = getConnection();
		PaymentDao pDao = new PaymentDao();
		
		ArrayList<ShoppingPayment> servicelist = new ArrayList<>();
		
		servicelist = pDao.searchProducts(conn, list);
		
		close(conn);
		return servicelist;
	}


	

}
