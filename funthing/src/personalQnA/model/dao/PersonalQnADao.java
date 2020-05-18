package personalQnA.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import personalQnA.model.vo.PersonalQnA;
import member.model.vo.Member;

import static common.JDBCTemplate.*;

public class PersonalQnADao {

	public int insertPerQnA(Connection conn, PersonalQnA perQA, String q1_num) {
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		int result = 0;
		
		String query = "INSERT INTO PERSONAL_QNA VALUES (SEQ_PQ.NEXTVAL, ?, ?, NULL, ?, ?, 'N', ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			System.out.println(q1_num);
			
			pstmt.setString(1, perQA.getPerTitle());
			pstmt.setString(2, perQA.getPerContents());
			pstmt.setString(3, perQA.getpNo());	// 상품번호
//			pstmt.setString(4, perQA.getbNo());	// 브랜드번호 // 입력 가능 창 없음
			pstmt.setString(4, q1_num);	// 회원번호?? personal vo에는 회원 번호 받아주는 애가 없음 / db에는 회원번호 있음
			// 관리자 답변 유무는 위에서 처리함
			pstmt.setString(5, perQA.getAddFile());		// 첨부파일
			pstmt.setString(6, perQA.getoNo());	// 주문번호
			pstmt.setString(7, perQA.getPerCate());	// 문의유형
			
			result = pstmt.executeUpdate();
			
			System.out.println("DAO : " + result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			close(pstmt);
		}
		return result;
	}

	
}
