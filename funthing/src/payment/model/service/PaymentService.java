package payment.model.service;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.ArrayList;

import payment.model.dao.PaymentDao;
import payment.model.vo.OrderList;

public class PaymentService {
	
	public ArrayList<OrderList> orderList(String mId){
		Connection conn = getConnection();
		
		ArrayList<OrderList> list = new PaymentDao().orderList();
		
		close(conn);
		
		return list;
		
	}
	
	public int getOrderListCount(String userNo) {
		Connection conn = getConnection();
	
		int orderListCount = new PaymentDao().getOrderListCount(conn, userNo);
	}

}
