package member.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import member.model.vo.MemberPoint;
import member.model.vo.MemberShoppingBag;

public class MemberService {
	// 로그인
	public Member loginMember(Member member) {
		Connection conn = getConnection();
		
		Member loginMember = new MemberDao().loginMember(conn,member);
		
		close(conn);
		
		return loginMember;
	}
	// 아이디 찾기
	public Member searchIdMember(Member member) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		Member searchIdMember = new MemberDao().searchIdMember(conn, member);
		
		close(conn);
		
		return searchIdMember;
	}
	// 비밀번호 찾기
	public Member searchPwd(String userId) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		Member searchPwd = new MemberDao().searchPwd(conn, userId);
		
		close(conn);
		
		return searchPwd;
	}
	// myPage 회원 정보 수정
	public Member selectMember(String userId) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		Member loginMember = new MemberDao().selectMember(conn,userId);
		
		close(conn);
		
		return loginMember;
	}
	// 회원가입
	public int insertMember(Member member) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn, member);
		
		close(conn);
		
		return result;
	}
	// 아이디 중복 체크
	public int idCheck(String userId) {
		Connection conn = getConnection();
		int result = 0;
		
		result = new MemberDao().idCheck(conn, userId);
		
		close(conn);
		
		return result;
	}
	
	// 회원 정보 update
	public int updateMember(Member member) {
		Connection conn = getConnection();
		
		int result = new MemberDao().updateMember(conn, member);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		} 
		close(conn);
		
		return result;
	}
	public int shoppinglistCount(String userId) {
		Connection conn = getConnection();
		int result = new MemberDao().getshoppingbagCount(conn,userId);
		return result;
	}
	public ArrayList<MemberShoppingBag> shoppingbagselectList(String userId) {
		Connection conn = getConnection();
		ArrayList<MemberShoppingBag> list =  new MemberDao().selectshoppingbaglist(userId,conn);
		return list;
	}

	
	// 마이페이지 회원 이름, 등급, 적립금 내역 가져오기_희지
	public MemberPoint memberInfo(String userNo) {
		Connection conn = getConnection();
		MemberPoint mp = new MemberPoint();
		
		mp = new MemberDao().memberInfo(conn, userNo);
		
		close(conn);
		
		return mp;
	}

	//paymentInfo 페이지 : 상원
	public MemberPoint paymentMemberSearch(String userNo) {
		Connection conn = getConnection();
		
		MemberPoint m = new MemberDao().paymentMemberSearch(conn, userNo);
		
		close(conn);
		return m;
	}



}
