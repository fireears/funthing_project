package product.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;
import payment.model.vo.OrderInfo;
import product.model.dao.ProductDao;
import product.model.vo.Product;
import product.model.vo.ProductDetail;
import productQnA.model.vo.AdminProductQnA;

import static common.JDBCTemplate.*;
public class ProductService {
	

	public ProductService() {
		super();
	}
	
	public ArrayList<Product> arriSelctProduct() {
		
		Connection conn = getConnection();
		ArrayList<Product> list = new ArrayList<>();
		
		ProductDao pDao = new ProductDao();
		list = pDao.arriSelectProduct(conn);
			
		close(conn);
		return list;
	}
	public ArrayList<Product> bestSelectProduct() {
		Connection conn = getConnection();
		ArrayList<Product> list = new ArrayList<>();
			
		ProductDao pDao = new ProductDao();
		list = pDao.bestSelectProduct(conn);
		
		close(conn);
		
		return list;
	}
	public ArrayList<Product> closeSelectProduct() {
		Connection conn = getConnection();
		ArrayList<Product> list = new ArrayList<>();
		
		ProductDao pDao = new ProductDao();
		list = pDao.closeSelectProduct(conn);
			
		close(conn);
		return list;
		
	}

	public ArrayList<Product> productSearch(String search) {
		
		Connection conn = getConnection();
		
		ProductDao pDao = new ProductDao();
		
		ArrayList<Product> plist = new ArrayList<>();
		
		plist = pDao.productSearch(conn, search);
		
		close(conn);
		
		return plist;
	}

	public ArrayList<Product> brandSearch(String search) {
		Connection conn = getConnection();
		
		ProductDao pDao = new ProductDao();
		
		ArrayList<Product> blist = new ArrayList<>();
		
		blist = pDao.brandSearch(conn, search);
		
		close(conn);
		return blist;
	}

	
	// 제품 상세 페이지_혜린
	public ArrayList<ProductDetail> selectProDetail(String pName) {
		Connection conn = getConnection();
		
		ArrayList<ProductDetail> list = new ProductDao().selectProDetail(conn,pName);
		
		close(conn);
		
		return list;
	}
	
	// 제품 상세 페이지_혜린
	public ArrayList<ProductDetail> sizeSelectProDetail(String pName) {
		Connection conn = getConnection();
		
		ArrayList<ProductDetail> list = new ProductDao().sizeSelectProDetail(conn,pName);
		
		close(conn);
		
		return list;
	}
	
	// 제품 상세 페이지(qna)_혜린
	public ArrayList<AdminProductQnA> qnaSelectProduct(String pName) {
		Connection conn = getConnection();
		
		ArrayList<AdminProductQnA> list = new ProductDao().qnaSelectProduct(conn,pName);
		
		close(conn);
		
		return list;
	}
	
	// 제품 상세 페이지(qna)_혜린
	public int getListCount(String pName) {
		Connection  conn = getConnection();
		int result = new ProductDao().getListCount(conn,pName);
		
		close(conn);
		return result;
	}
	// 제품 상세 페이지_혜린
	public ArrayList<ProductDetail> colorSelectProDetail(String pName) {
		Connection conn = getConnection();
		
		ArrayList<ProductDetail> list = new ProductDao().colorSelectProDetail(conn,pName);
		
		close(conn);
		
		return list;
	}
	
	
}
