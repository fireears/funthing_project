package admin.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;

import brand.model.vo.Brand;
import brand.model.vo.Brand2;

import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;

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


	
	// 브랜드 관리자 페이지(리스트 카운트 메소드)_희지
	public int getBrandListCount() {
		
		Connection conn = getConnection();
		
		int brandListCount = new AdminDao().getBrandListCount(conn);
		
		close(conn);
		
		return brandListCount;
	}

	
	// 브랜드 관리자 페이지(브랜드 조회하는 메소드)_희지
	public ArrayList<Brand> selectBrandList(int currentPage, int limit) {
		
		Connection conn = getConnection();
		
		ArrayList<Brand> brandList = new AdminDao().selectBrandList(conn, currentPage, limit);
		
		close(conn);
		
		return brandList;
	}

	
	// 브랜드 등록 페이지(정보 insert 메소드)_희지
	public int insertBrand(Brand2 b) {
		Connection conn = getConnection();
		
		int result = new AdminDao().insertBrand(conn, b);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
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

	

}
