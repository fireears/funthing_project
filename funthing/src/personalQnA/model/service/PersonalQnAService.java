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



}
