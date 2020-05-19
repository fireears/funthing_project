package personalQnA.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import personalQnA.model.vo.PersonalQnA;

import static common.JDBCTemplate.*;


public class PersonalQnADao {

	
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
		
		// firstDate, secondDate의 형변환 -> 맨 처음 마이페이지에서 들어갔을 때의 셀렉 값을 보여주기 위해 jsp에서 설정한 초기값으로 비교
		// string -> date로 (내가 설정한 초기값을 date형으로)
	
		
		// rnum 
		int startRow = (currentPage -1) * limit +1;
		int endRow = 20;
		System.out.println("firstDate" + firstDate);
		System.out.println("secondDate" + secondDate);
		
		try {
			
			// 맨 처음 리스트 출력 값
			if(searchDate == null && firstDate == null) {

				System.out.println("searchDate가 null일때" + searchDate);
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
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
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') = TO_DATE(SYSDATE,'RRRR/MM/DD'))\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
						
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				


			// 클라이언트가 '7일' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("week")) {
				System.out.println("-------------------------week-----------------------");
				String query =  "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-7)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '한달' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("month")) {
				System.out.println("-------------------------month-----------------------ok");
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-30)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '3개월' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("3months")) {
				System.out.println("-------------------------3months-----------------------ok");
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-90)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '6개월' 선택 했을 때
			}else if(searchDate != null &&  searchDate.equals("6months")) {
				System.out.println("-------------------------6months-----------------------");
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-180)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 '1년' 선택 했을 때	
			}else if(searchDate != null &&  searchDate.equals("year")) {
				System.out.println("-------------------------year-----------------------");
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-365)\r\n" + 
								"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				pstmt.setString(1, userNo);
				
				rset = pstmt.executeQuery();
				
				
			// 클라이언트가 날짜 선택했을 때
			}else {
				System.out.println("캘린더 선택 날자선택");
				
				String query = "SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
								"FROM(SELECT ROWNUM RNUM, PER_QNA_NO, PER_TITLE, PER_CONTENTS, P_NO, B_NO, M_NO, PER_RE_YN ,ADDFILE, O_NO, PER_CATE, PER_DATE \r\n" + 
									"FROM PER_LIST\r\n" + 
									"WHERE M_NO=? AND TO_DATE(PER_DATE,'RRRR/MM/DD') BETWEEN TO_DATE(?,'RRRR/MM/DD') AND TO_DATE(?,'RRRR/MM/DD'))\r\n" + 
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

	// && firstDate.equals("09/01/01") && secondDate.equals("09/01/01")
	
}
