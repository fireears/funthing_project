package personalQnA.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import personalQnA.model.vo.PersonalQnA;

import static common.JDBCTemplate.*;


public class PersonalQnADao {

	
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
