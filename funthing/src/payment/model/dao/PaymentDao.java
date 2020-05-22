package payment.model.dao;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import payment.model.vo.OrderList;

public class PaymentDao {

	public ArrayList<OrderList> orderList() {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<OrderList> list = new ArrayList<>();
		
		String query = "SELECT * FROM ORDER_LIST WHERE M_ID =?";
		
		
		return null;
	}
	
	

}
