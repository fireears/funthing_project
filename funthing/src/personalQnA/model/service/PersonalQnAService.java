package personalQnA.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import personalQnA.model.dao.PersonalQnADao;
import personalQnA.model.vo.PersonalQnA;

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

}
