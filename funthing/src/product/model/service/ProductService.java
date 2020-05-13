package product.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import brand.model.dao.BrandDao;
import brand.model.vo.Brand;
import product.model.dao.ProductDao;
import product.model.vo.Product;

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
	
	
}
