package product.model.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import product.model.dao.ProductDao;
import product.model.vo.Product;

public class ProductService {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "FUNTHING";
	String password = "FUNTHING";
	public ProductService() {
		super();
	}
	
	public ArrayList<Product> arriSelctProduct() {
		
		Connection conn = null;
		ArrayList<Product> list = new ArrayList<>();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			conn.setAutoCommit(false);
			
			ProductDao pDao = new ProductDao();
			list = pDao.arriSelectProduct(conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	public ArrayList<Product> bestSelectProduct() {
		Connection conn = null;
		ArrayList<Product> list = new ArrayList<>();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			conn.setAutoCommit(false);
			
			ProductDao pDao = new ProductDao();
			list = pDao.bestSelectProduct(conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	public ArrayList<Product> closeSelectProduct() {
		Connection conn = null;
		ArrayList<Product> list = new ArrayList<>();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			conn.setAutoCommit(false);
			
			ProductDao pDao = new ProductDao();
			list = pDao.closeSelectProduct(conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		
	}
	
	
}
