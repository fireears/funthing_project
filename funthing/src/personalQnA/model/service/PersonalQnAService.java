package personalQnA.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import personalQnA.model.dao.PersonalQnADao;
import personalQnA.model.vo.PersonalQnA;

public class PersonalQnAService {

	public int insertPerQnA(PersonalQnA perQA) {
		Connection conn = getConnection();
		PersonalQnADao perDao = new PersonalQnADao();
		
		System.out.println("가기전 service");
		
		int result = perDao.insertPerQnA(conn,perQA);
		
		System.out.println("여기는 service");

		if(result > 0){
			commit(conn);
		}else{
			rollback(conn);
		}
		
		return result;
	}

}
