package productQnA.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;
import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import productQnA.model.dao.ProductQnADao;
import productQnA.model.vo.AdminProductQnA;
import productQnA.model.vo.ProductQnA;
import productQnA.model.vo.ProductQnaIn;
public class ProductQnAService {
	
	public ArrayList<ProductQnA> mainselectQnaService() {
		
		Connection conn = getConnection();
		
		ProductQnADao qDao = new ProductQnADao();
		
		ArrayList<ProductQnA> list = new ArrayList<>();
		
		list = qDao.selectQnaDao(conn);
		close(conn);
		
		return list;
	}

	public int productQnaInsert(ProductQnaIn qna) {
		Connection conn = getConnection();
		
		int result = new ProductQnADao().insertMember(conn,qna);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}
	// 상품문의 list 페이지_혜린
	public int getListQnaCount(String mNo) {
		Connection conn = getConnection();
		
		ProductQnADao aDao = new ProductQnADao();
		
		int listCount = aDao.getListCount(conn, mNo);
		
		close(conn);
		return listCount;
	}

	// 상품문의 페이지(클라이언트) 셀렉_혜린
	public ArrayList<AdminProductQnA> selectProductQnaCList(String searchDate, String firstDate, String secondDate, int currentPage, int limit, String mNo) {
		Connection conn = getConnection();
		
		ArrayList<AdminProductQnA> list = new ProductQnADao().selectOrderSearch(conn, searchDate, firstDate, secondDate, currentPage, limit, mNo);
		
		
		close(conn);
		return list;
	}

	
	// 상품문의 페이지 (클라이언트) 상세 페이지_혜린
	public AdminProductQnA ProductQnaDetail(String mNo, String qnaNo) {
		Connection conn = getConnection();
		AdminProductQnA apq = new ProductQnADao().ProductQnaDetail(conn,mNo, qnaNo);
		
		close(conn);
		
		
		return apq;
	}
	


}
