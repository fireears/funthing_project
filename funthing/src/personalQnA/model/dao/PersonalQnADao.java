package personalQnA.model.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		
		String query = "SELECT COUNT(*) FROM PER_LIST WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
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
	public ArrayList<PersonalQnA> selectPersonalQnA(Connection conn, String searchDate, String firstDate, String secondDate, int currentPage, int limit, String userNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		// personalQnA객체
		PersonalQnA pq = null;
		
		// personalQnA 리스트
		ArrayList<PersonalQnA> perList = new ArrayList<>();
		System.out.println("Dao에서 searchDate: " + searchDate);
		
		
		// rnum 
		int startRow = (currentPage -1) * limit +1;
		int endRow = startRow + (limit -1);
		System.out.println("firstDate" + firstDate);
		System.out.println("secondDate" + secondDate);
		
		try {
			
			// 맨 처음 리스트 출력 값
			if(searchDate == null && firstDate == "2009/01/01" ) {

				System.out.println("searchDate가 null일때" + searchDate);
		
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
						"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE\r\n" + 
								"FROM PER_LIST\r\n" + 
								"WHERE M_NO=?)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '오늘'선택 했을 때
			}else if(searchDate != null && searchDate.equals("today")) {
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') = TO_DATE(SYSDATE,'YYYY/MM/DD'))\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
						
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				


			// 클라이언트가 '7일' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("week")) {
				System.out.println("-------------------------week-----------------------");
				String query =  "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') >= TO_DATE(SYSDATE,'YYYY/MM/DD')-7)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '한달' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("month")) {
				System.out.println("-------------------------month-----------------------ok");
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') >= TO_DATE(SYSDATE,'YYYY/MM/DD')-30)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '3개월' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("3months")) {
				System.out.println("-------------------------3months-----------------------ok");
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') >= TO_DATE(SYSDATE,'YYYY/MM/DD')-90)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '6개월' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("6months")) {
				System.out.println("-------------------------6months-----------------------");
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') >= TO_DATE(SYSDATE,'YYYY/MM/DD')-180)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '1년' 선택 했을 때	
			}else if(searchDate != null &&  searchDate.equals("year")) {
				System.out.println("-------------------------year-----------------------");
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') >= TO_DATE(SYSDATE,'YYYY/MM/DD')-365)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 날짜 선택했을 때
			}else {
				System.out.println("캘린더 선택 날자선택");
				
				String query = "SELECT RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'YYYY/MM/DD') BETWEEN TO_DATE(?,'YYYY/MM/DD') AND TO_DATE(?,'YYYY/MM/DD'))\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";

					
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(4, startRow);
				pstmt.setInt(5, endRow);	
				pstmt.setString(1 , userNo);
				pstmt.setString(2, firstDate);
				pstmt.setString(3, secondDate);
				
				rset = pstmt.executeQuery();
				
				
			}
			
			while(rset.next()) {
				System.out.println("while(rset.next())");
				pq = new PersonalQnA(rset.getInt("RNUM"),
						rset.getInt("PER_QNA_NO"),
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
				
				System.out.println("pq는?" + pq);
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

	
	// 일대일 문의 디테일 페이지(클라이언트)_희지
	public PersonalQnA perDetail(Connection conn, String mNo, String perNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		PersonalQnA pq = null;
		
		String query ="SELECT P.PER_QNA_NO, P.PER_TITLE, P.PER_CONTENTS, P.P_NO, PD.P_NAME, P.B_NO, P.M_NO, P.PER_RE_YN, P.ADDFILE, P.O_NO, P.PER_CATE, \r\n" + 
				"        P.PER_DATE, M.M_ID, M.M_NAME, PR.PQRE_NO, PR.PQRE_ID, PR.PQRE_CONTENT, PR.PQRE_DATE \r\n" + 
				"FROM PERSONAL_QNA P \r\n" + 
				"    JOIN MEMBER M ON (P.M_NO = M.M_NO)\r\n" + 
				"    JOIN PRODUCT PD ON (P.P_NO = PD.P_NO)\r\n" + 
				"    FULL JOIN PQ_RE PR ON (P.PER_QNA_NO = PR.PER_QNA_NO)\r\n" + 
				"WHERE P.M_NO = ? AND P.PER_QNA_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mNo);
			pstmt.setString(2, perNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				pq = new PersonalQnA(rset.getInt("PER_QNA_NO"),
						rset.getString("PER_TITLE"),
						rset.getString("PER_CONTENTS"),
						rset.getString("P_NO"),
						rset.getString("P_NAME"),
						rset.getString("B_NO"),
						rset.getString("M_NO"),
						rset.getString("M_NAME"),
						rset.getString("M_ID"),
						rset.getString("PER_RE_YN"),
						rset.getString("ADDFILE"),
						rset.getString("O_NO"),
						rset.getString("PER_CATE"),
						rset.getDate("PER_DATE"),
						rset.getString("PQRE_ID"),
						rset.getInt("PQRE_NO"),
						rset.getString("PQRE_CONTENT"),
						rset.getDate("PQRE_DATE"));
			
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return pq;
	}


}



