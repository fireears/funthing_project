package payment.model.service;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.ArrayList;

import member.model.vo.MemberPoint;
import payment.model.dao.PaymentDao;
import payment.model.vo.OrderList;

import payment.model.vo.OrderUpdate;

import payment.model.vo.Payment;
import payment.model.vo.ProductOrder;
import payment.model.vo.ShoppingPayment;
import product.model.vo.Product;


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

	// 주문목록 상세페이지_혜린
	public ArrayList<OrderUpdate> selectOrderDetail(String oNo, String userNo) {
		Connection conn = getConnection();
		
		ArrayList<OrderUpdate> oList = new PaymentDao().selectOrderDetail(conn, oNo, userNo);
		
		close(conn);
		
		return oList;
	}


	//상원
	public int insertPayment(Payment p, String mNo, MemberPoint mp, ArrayList<ProductOrder> orderList) {
		Connection conn = getConnection();
		
		PaymentDao pDao = new PaymentDao();
		
		//paymentInfo insert
		int result = pDao.insertPayment(conn, p);
		//jumun insert
		int result1 = pDao.insertJumun(conn, mNo);
		//point insert
		int result2 = pDao.insertPoint(conn, mp);
		//product_order insert
		int result3 = pDao.insetProductOrder(conn, orderList);
		if(result > 0 && result1 > 0 && result2 > 0 && result3 > 0)
		{
			commit(conn);	
		}
		else
		{
			rollback(conn);
		}
		close(conn);
		return result2;
	}



//	   public int insertPayment(Payment p, String mNo, MemberPoint mp, ArrayList<Product> pNoList) {
//	      Connection conn = getConnection();
//	      
//	      PaymentDao pDao = new PaymentDao();
//	      
//	      int result = pDao.insertPayment(conn, p);
//	      if(result > 0)
//	      {
//	         commit(conn);
//	      }
//	      else
//	      {
//	         rollback(conn);
//	      }
//	      close(conn);
//	      return result;
//	   }



	public int updateProduct(ArrayList<Product> productList) {
		Connection conn = getConnection();
		
		int result = new PaymentDao().updateProduct(conn, productList);
		
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


	public int insetJumun(String mNo) {
		Connection conn = getConnection();
		
		int result = new PaymentDao().insertJumun(conn, mNo);
		
		
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


	


	

   public ArrayList<ShoppingPayment> searchProducts(ArrayList<ShoppingPayment> list)
   {
      Connection conn = getConnection();
      PaymentDao pDao = new PaymentDao();
      
      ArrayList<ShoppingPayment> servicelist = new ArrayList<>();
      
      servicelist = pDao.searchProducts(conn, list);
      
      close(conn);
      return servicelist;
   }


   public int insertMpoint(MemberPoint mp) {
	   Connection conn = getConnection();
	   PaymentDao pDao = new PaymentDao();
	   
	   int result = pDao.updateMpoint(conn, mp);
	   
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


    public String[] searchBrand(String[] pNo) {
    	Connection conn = getConnection();
    	
    	String[] b_no = new PaymentDao().searchBrand(conn, pNo);
    	
    	close(conn);
		return b_no;
	}




	   

}