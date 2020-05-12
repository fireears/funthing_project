package productQnA.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import productQnA.model.dao.ProductQnADao;
import productQnA.model.vo.ProductQnA;
public class ProductQnAService {
	
	public ArrayList<ProductQnA> mainselectQnaService() {
		
		Connection conn = getConnection();
		
		ProductQnADao qDao = new ProductQnADao();
		
		ArrayList<ProductQnA> list = new ArrayList<>();
		
		list = qDao.selectQnaDao(conn);
		close(conn);
		
		return list;
	}

}
