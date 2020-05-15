package admin.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;
import payment.model.vo.OrderInfo;
import product.model.vo.Product;
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
	public ArrayList<OrderInfo> selectSearch(int currentPage, int limit, String searchKind, String searchText) {
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

	

}
