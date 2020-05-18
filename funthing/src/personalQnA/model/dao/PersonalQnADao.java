package personalQnA.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import personalQnA.model.vo.PersonalQnA;
import member.model.vo.Member;
import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;

import static common.JDBCTemplate.*;

public class PersonalQnADao {

	public int insertPerQnA(Connection conn, PersonalQnA perQA, String q1_num) {
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		int result = 0;
		
		String query = "INSERT INTO PERSONAL_QNA VALUES (SEQ_PQ.NEXTVAL, ?, ?, NULL, NULL, ?, 'N', ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			System.out.println(q1_num);
			
			pstmt.setString(1, perQA.getPerTitle());		// 제목
			pstmt.setString(2, perQA.getPerContents());		// 내용
			// 상품 번호 NULL
			// 브랜드번호 NULL
			pstmt.setString(3, q1_num);						// 회원번호
			// 관리자 답변 유무는 위에서 처리함
			pstmt.setString(4, perQA.getAddFile());			// 첨부파일
			pstmt.setString(5, perQA.getoNo());				// 주문번호
			pstmt.setString(6, perQA.getPerCate());			// 문의유형
			
			result = pstmt.executeUpdate();
			
//			System.out.println("DAO : " + result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			close(pstmt);
		}
		return result;
	}

	public ArrayList<OrderInfoDetail> orderListView(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderInfoDetail> oiList = new ArrayList<>();
		
		String query = "SELECT O_NO, THUMBNAIL, P.P_NO, P_NAME, M_ID, TOTAL_PRICE FROM ORDER_DETAIL OD JOIN PRODUCT P ON(OD.P_NO = P.P_NO) WHERE M_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				OrderInfoDetail oid = new OrderInfoDetail(
						rs.getInt("TOTAL_PRICE"),
						rs.getString("O_NO"),
						rs.getString("M_ID"),
						rs.getString("THUMBNAIL"),
						rs.getString("P_NAME")
						);
				oiList.add(oid);
			}
			
			System.out.println(oiList.get(0));
//			System.out.println(oiList);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return oiList;
	}



	
}



























