package admin.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;
import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import product.model.vo.Product;
import productQnA.model.vo.AdminProductQnA;
import productQnA.model.vo.ProductQnAReply;
public class AdminService {
	
	
	public int getListCount() {
		
		Connection conn = getConnection();
		
		AdminDao aDao = new AdminDao();
		
		int listCount = aDao.getListCount(conn);
		
		close(conn);
		return listCount;
	}

	public ArrayList<Product> selectProductList(int currentPage, int limit) {

		ArrayList<Product> list = new ArrayList<>();
		AdminDao aDao = new AdminDao();
		
		Connection conn = getConnection();
		
		list = aDao.selectProductList(conn, currentPage, limit);
		
		close(conn);
		return list;
	}

	// 주문관리 페이지_혜린	
	public ArrayList<OrderInfo> selectOrderSearch(int currentPage, int limit, String searchKind, String searchText) {
		Connection conn = getConnection();
		
		ArrayList<OrderInfo> searchList = new AdminDao().selectOrderSearch(conn, currentPage, limit,searchKind, searchText);
		
		close(conn);
		
		return searchList;
		
	}

	// 주문관리 페이지_혜린	
	public int getOrderListCount() {

		Connection conn = getConnection();
		
		AdminDao aDao = new AdminDao();
		
		int listCount = aDao.getOrderListCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	// 주문관리 페이지 상세보기_혜린
	public OrderInfoDetail selectOrderDetail(String mid) {
		Connection conn = getConnection();
		OrderInfoDetail od = new AdminDao().selectOrderDetail(conn,mid);
		
		close(conn);
		
		
		return od;
		
	}
	//  상품문의 페이지_혜린
	public int getListQnaCount() {
		Connection  conn = getConnection();
		int result = new AdminDao().getListQnaCount(conn);
		
		close(conn);
		return result;
	}

	// 상품문의 페이지_혜린
	public ArrayList<AdminProductQnA> selectTenList(int currentPage, int limit) {
		Connection conn = getConnection(); 
		ArrayList<AdminProductQnA> list = new AdminDao().selectTenList(conn,currentPage, limit);
		
		close(conn);
		return list;
	}

	public Product selectOneProductDetail(String pNo) {
		Connection conn = getConnection();
		Product product = new AdminDao().selectOneProductDetail(conn, pNo);
		
		close(conn);
		return product;
	}

	public int productDelete(String pNo) {
		Connection conn = getConnection();
		
		int result = new AdminDao().productDelete(conn, pNo);
		
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

	public int productUpdate(Product p, String pNo) {
		Connection conn = getConnection();
		
		int result = new AdminDao().productUpdate(conn, p, pNo);
		
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

	// 상품문의 댓글 페이지_혜린
	public ArrayList<ProductQnAReply> insertReply(ProductQnAReply r) {
		Connection conn = getConnection();
		
		// BoardDao 메소드 두개를 호출하기 때문에 그냥 참조변수로 선언하자
		AdminDao bDao = new AdminDao();
		
		int result = bDao.insertReply(conn, r);
		// BoardDao로 가서 insertReply 메소드 완성시키고오자
		
		
		ArrayList<ProductQnAReply> rlist = null;
		
		if(result > 0) {
			commit(conn);
			rlist = bDao.selectReplyList(conn, r.getQnaNo());
		}else {
			rollback(conn);
		}
		close(conn);
		return rlist;
	}

	

}
