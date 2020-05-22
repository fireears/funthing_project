// 적립금 다오_희지
package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import member.model.vo.MemberPoint;

import static common.JDBCTemplate.*;

public class MemberPointDao {

	// 적립금 리스트 카운트_희지
	public int getPListCount(Connection conn, String userNo) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int pListCount = 0;
		
		String query = "SELECT COUNT(*) FROM POINT_LIST WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				pListCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return pListCount;
	}

	
	// 적립금 리스트 조회_희지
	public ArrayList<MemberPoint> selectMemberPoint(Connection conn, String searchDate, String firstDate,
			String secondDate, int currentPage, int limit, String userNo) {
	
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		MemberPoint mp = null;
		
		ArrayList<MemberPoint> list = new ArrayList<>();
		
		int startRow = (currentPage -1) * limit +1;
		int endRow = 20; // 다시 보기
		
		
		try {
			
			if(searchDate == null && firstDate == null) {
				
				String query = "SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ?)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
				
			
			
			}else if(searchDate != null && searchDate.equals("today")) {
				
				String query ="SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(POINT_DATE,'RRRR/MM/DD')=TO_DATE(SYSDATE,'RRRR/MM/DD'))\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
				
				
			}else if(searchDate != null && searchDate.equals("week")) {
				
				String query = "SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(POINT_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-7)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
				
			}else if(searchDate != null && searchDate.equals("month")) {
				
				String query="SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(POINT_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-30)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
				
				
			}else if(searchDate != null && searchDate.equals("3months")) {
				
				String query = "SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(POINT_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-90)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
			
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
			
			
			}else if(searchDate != null && searchDate.equals("6months")) {
				
				String query = "SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(POINT_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-180)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
			
				
			}else if(searchDate !=null && searchDate.equals("year")) {
				
				String query ="SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(POINT_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-365)\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setInt(2, startRow);
				pstmt.setInt(3, endRow);
				
				rset = pstmt.executeQuery();
				
			
			// 클라이언트가 날짜 선택 했을 때
			}else {
				
				String query = "SELECT RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM (SELECT ROWNUM RNUM, POINT_NO, POINT_DATE, O_NO, POINT_CONTENT, POINT_AMOUNT, M_NO, POINT_CATE, MY_POINT\r\n" + 
						"FROM POINT_LIST\r\n" + 
						"WHERE M_NO = ? AND TO_DATE(PER_DATE,'RRRR/MM/DD') BETWEEN TO_DATE(?,'RRRR/MM/DD') AND TO_DATE(?, 'RRRR/MM/DD'))\r\n" + 
						"WHERE RNUM BETWEEN ? AND ?";
				
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userNo);
				pstmt.setString(2, firstDate);
				pstmt.setString(3,secondDate);
				pstmt.setInt(4, startRow);
				pstmt.setInt(5, endRow);
				
				rset = pstmt.executeQuery();
				
				
			}
			
			while(rset.next()) {
				mp = new MemberPoint(rset.getInt("RNUM"),
						rset.getString("POINT_NO"),
						rset.getDate("POINT_DATE"),
						rset.getString("O_NO"),
						rset.getString("POINT_CONTENT"),
						rset.getInt("POINT_AMOUNT"),
						rset.getString("M_NO"),
						rset.getString("POINT_CATE"),
						rset.getInt("MY_POINT"));
				
				list.add(mp);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return list;
	}


	// 로그인 유저 정보 받아오기_희지
	public MemberPoint memberInfo(Connection conn, String userNo) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		MemberPoint mp = null;
		
		String query ="SELECT M.M_NAME, G.GRADE_NAME, M.M_POINT \r\n" + 
				"FROM MEMBER M\r\n" + 
				"    JOIN GRADE G ON(M.GRADE_CODE = G.GRADE_CODE)\r\n" + 
				"WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				mp = new MemberPoint(rset.getInt("M_POINT"),
						rset.getString("GRADE_NAME"),
						rset.getString("M_NAME"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return mp;
	}
		
		
}
