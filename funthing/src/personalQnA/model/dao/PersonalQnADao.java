package personalQnA.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import payment.model.vo.OrderInfoDetail;
import personalQnA.model.vo.PersonalInsert;
import personalQnA.model.vo.PersonalQnA;



public class PersonalQnADao {
	// 일대일문의 삽입 서윤
	public int insertPerQnA(Connection conn, PersonalInsert perQA, String q1_num) {
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		int result = 0;
		
		String query = "INSERT INTO PERSONAL_QNA VALUES (SEQ_PQ.NEXTVAL, ?, ?, NULL, NULL, ?, 'N', ?, ?, ?, SYSDATE)";
		
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
			
//			System.out.println(oiList);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return oiList;
	}



	// 일대일 문의 리스트 카운트_희지
	public int getPerListCount(Connection conn, String userNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int perListCount = 0;
		
		String query = "SELECT COUNT(*) FROM PERSONAL_QNA WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				perListCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return perListCount;
	}

	
	// 일대일 문의 리스트 조회_희지
	public ArrayList<PersonalQnA> selectPersonalQnA(Connection conn, int currentPage, int limit, String userNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		PersonalQnA pq = null;
		ArrayList<PersonalQnA> perList = new ArrayList<>();
		
		String query = "SELECT PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE FROM PER_LIST WHERE RNUM BETWEEN ? AND ? AND M_NO=?";
		
		int startRow = (currentPage -1) * limit +1;
		int endRow = startRow + (limit -1);
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, userNo);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				pq = new PersonalQnA(rset.getInt("PER_QNA_NO"),
						rset.getString("PER_TITLE"),
						rset.getString("PER_CONTENTS"),
						rset.getString("P_NO"),
						rset.getString("B_NO"),
						rset.getString("M_NO"),
						rset.getString("PER_RE_YN"),
						rset.getString("ADDFILE"),
						rset.getString("O_NO"),
						rset.getString("PER_CATE"),
						rset.getDate("PER_DATE"));
				
				perList.add(pq);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		return perList;
	}

}



























