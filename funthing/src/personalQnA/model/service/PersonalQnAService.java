package personalQnA.model.service;

import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import personalQnA.model.dao.PersonalQnADao;
import personalQnA.model.vo.PersonalQnA;

import java.sql.Connection;
import java.util.ArrayList;

import personalQnA.model.dao.PersonalQnADao;
import personalQnA.model.vo.PersonalQnA;

import static common.JDBCTemplate.*;

public class PersonalQnAService {

	public int insertPerQnA(PersonalQnA perQA, String q1_num) {
		Connection conn = getConnection();
		PersonalQnADao perDao = new PersonalQnADao();
		
		int result = perDao.insertPerQnA(conn,perQA, q1_num);
		

		if(result > 0){
			commit(conn);
		}else{
			rollback(conn);
		}
		
		return result;
	}

	public ArrayList<OrderInfoDetail> orderListView(String userId) {
		Connection conn = getConnection();
		ArrayList<OrderInfoDetail> oiList = new PersonalQnADao().orderListView(conn,userId);
		
		return oiList;
	}



	// 일대일 문의 리스트 카운트_희지
	public int getPerListCount(String userNo) {
		
		Connection conn = getConnection();
		
		int perListCount = new PersonalQnADao().getPerListCount(conn, userNo);
		
		close(conn);
		
		return perListCount;
	}

	
	// 일대일 문의 리스트 조회_희지
	public ArrayList<PersonalQnA> selectPersonalQnA(int currentPage, int limit, String userNo) {
		
		Connection conn = getConnection();
		
		ArrayList<PersonalQnA> perList = new PersonalQnADao().selectPersonalQnA(conn,currentPage, limit, userNo);
		
		close(conn);
		
		return perList;
	}


}
