package member.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import member.model.vo.Member;

import static common.JDBCTemplate.*;

public class MemberDao {

	Properties prop = new Properties();
	
	public MemberDao() {
		String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
		
		try {
			
			prop.load(new FileReader(fileName));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 로그인
	public Member loginMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		
//		String query = prop.getProperty("loginMember");
		String query = "SELECT * FROM MEMBER WHERE M_ID=? AND M_PWD=?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmId());
			pstmt.setString(2, member.getmPwd());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				loginMember = new Member(rset.getString("M_NO"),
										 rset.getString("M_ID"),
										 rset.getString("M_PWD"),
										 rset.getString("M_NAME"),
										 rset.getString("B_DAY"),
										 rset.getString("M_EMAIL"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("REFERENCE"),
										 rset.getString("GRADE_CODE"),
										 rset.getString("ALARM_YN"),
										 rset.getString("STATUS_YN"),
										 rset.getInt("M_POINT"),
										 rset.getString("M_TELL"),
										 rset.getInt("H_POINT"));
			}
//			System.out.println(loginMember);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return loginMember;
	}
	
	// 아이디 찾기
	public Member searchIdMember(Connection conn, Member member) {
		System.out.println("Dao단 까지 옴");
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member searchIdMember = null;
		
		String query = "SELECT * FROM MEMBER WHERE M_NAME=? AND (M_EMAIL=? OR M_TELL=?)";
						
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmName());
			pstmt.setString(2, member.getmEmail());
			pstmt.setString(3, member.getmTell());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				searchIdMember = new Member(rset.getString("M_NO"),
											 rset.getString("M_ID"),
											 rset.getString("M_PWD"),
											 rset.getString("M_NAME"),
											 rset.getString("B_DAY"),
											 rset.getString("M_EMAIL"),
											 rset.getDate("JOIN_DATE"),
											 rset.getString("REFERENCE"),
											 rset.getString("GRADE_CODE"),
											 rset.getString("ALARM_YN"),
											 rset.getString("STATUS_YN"),
											 rset.getInt("M_POINT"),
											 rset.getString("M_TELL"),
											 rset.getInt("H_POINT"));
			}
			
			System.out.println(searchIdMember);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return searchIdMember;
	}
	// 비밀번호 찾기
	public Member searchPwd(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member searchPwd = null;
		
		String query = "SELECT * FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				searchPwd = new Member(rset.getString("M_NO"),
						 rset.getString("M_ID"),
						 rset.getString("M_PWD"),
						 rset.getString("M_NAME"),
						 rset.getString("B_DAY"),
						 rset.getString("M_EMAIL"),
						 rset.getDate("JOIN_DATE"),
						 rset.getString("REFERENCE"),
						 rset.getString("GRADE_CODE"),
						 rset.getString("ALARM_YN"),
						 rset.getString("STATUS_YN"),
						 rset.getInt("M_POINT"),
						 rset.getString("M_TELL"),
						 rset.getInt("H_POINT"));
			}
			System.out.println(searchPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return searchPwd;
	}
	// myPage 회원 정보 수정
	public Member selectMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		
		String query = "SELECT M_NO, M_ID, M_PWD, M_NAME, M_EMAIL, M_TELL, TO_CHAR(B_DAY,'YYYY/MM/DD'), JOIN_DATE, REFERENCE, GRADE_CODE, ALARM_YN, STATUS_YN, M_POINT, H_POINT FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				loginMember = new Member(rset.getString("M_NO"),
										 rset.getString("M_ID"),
										 rset.getString("M_PWD"),
										 rset.getString("M_NAME"),
										 rset.getString("TO_CHAR(B_DAY,'YYYY/MM/DD')"),
										 rset.getString("M_EMAIL"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("REFERENCE"),
										 rset.getString("GRADE_CODE"),
										 rset.getString("ALARM_YN"),
										 rset.getString("STATUS_YN"),
										 rset.getInt("M_POINT"),
										 rset.getString("M_TELL"),
										 rset.getInt("H_POINT"));
			}
			System.out.println(loginMember);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return loginMember;
	}
	// 회원 가입
	public int insertMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO MEMBER VALUES('M'||SEQ_MEM.NEXTVAL,?,?,?,TO_CHAR(TO_DATE(?,'YYYY/MM/DD'),'YY/MM/DD'),?,SYSDATE,?,'G3',?,'Y',135000,?,3450000)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmId());
			pstmt.setString(2, member.getmPwd());
			pstmt.setString(3, member.getmName());
			pstmt.setString(4, member.getbDay());
			pstmt.setString(5, member.getmEmail());
			pstmt.setString(6, member.getReference());
			pstmt.setString(7, member.getAlarm_YN());
			pstmt.setString(8, member.getmTell());
			
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	// 아이디 중복 체크
	public int idCheck(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int result = 0;
		
		String query = "SELECT COUNT(*) FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
	return result;
}

	public int updateMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE MEMBER SET M_ID=?,M_NAME=?,B_DAY=TO_CHAR(TO_DATE(?,'YYYY/MM/DD'),'YY/MM/DD'),M_EMAIL=?,M_TELL=? WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmId());
			pstmt.setString(2, member.getmName());
			pstmt.setString(3, member.getbDay());
			pstmt.setString(4, member.getmEmail());
			pstmt.setString(5, member.getmTell());
			pstmt.setString(6, member.getmNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}
