package qna.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import qna.model.dao.QnaDao;
import qna.model.vo.QnA;
public class QnaService {
	
	public ArrayList<QnA> mainselectQnaService() {
		
		Connection conn = getConnection();
		
		QnaDao qDao = new QnaDao();
		
		ArrayList<QnA> list = new ArrayList<>();
		
		list = qDao.selectQnaDao(conn);
		close(conn);
		
		return list;
	}

}
