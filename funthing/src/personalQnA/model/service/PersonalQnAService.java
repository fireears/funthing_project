package personalQnA.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import personalQnA.model.dao.PersonalQnADao;
import personalQnA.model.vo.PersonalQnA;

import static common.JDBCTemplate.*;


public class PersonalQnAService {

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
