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
import payment.model.vo.OrderUpdate;

public class MemberService {
	// 로그인_진교
	public Member loginMember(Member member) {
		Connection conn = getConnection();
		
		Member loginMember = new MemberDao().loginMember(conn,member);
		
		close(conn);
		
		return loginMember;
	}
	// 아이디 찾기_진교
	public Member searchIdMember(Member member) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		Member searchIdMember = new MemberDao().searchIdMember(conn, member);
		
		close(conn);
		
		return searchIdMember;
	}
	// 비밀번호 찾기_진교
	public Member searchPwd(String userId) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		Member searchPwd = new MemberDao().searchPwd(conn, userId);
		
		close(conn);
		
		return searchPwd;
	}
	// myPage 회원 정보 창_진교
	public Member selectMember(String userId) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		Member loginMember = new MemberDao().selectMember(conn,userId);
		
		close(conn);
		
		return loginMember;
	}
	// 회원가입_진교
	public int insertMember(Member member) {
//		System.out.println("Service단까지 옴");
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn, member);
		
		close(conn);
		
		return result;
	}
	// 아이디 중복 체크_진교
	public int idCheck(String userId) {
		Connection conn = getConnection();
		int result = 0;
		
		result = new MemberDao().idCheck(conn, userId);
		
		close(conn);
		
		return result;
	}
	
	// 회원 정보 수정 update_진교
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
	//shoppingbag 페이자 :한솔
	public int shoppinglistCount(String userNo) {
		Connection conn = getConnection();
		int result = new MemberDao().getshoppingbagCount(conn,userNo);
		return result;
	}
	//shoppingbag 페이자 :한솔
	public ArrayList<MemberShoppingBag> shoppingbagselectList(String userNo) {
		Connection conn = getConnection();
		ArrayList<String> list1 = new MemberDao().selectshoppingbaglist2(userNo, conn);
		ArrayList<Integer> list2 = new MemberDao().selectshoppingbaglist3(userNo, conn);
		ArrayList<MemberShoppingBag> list =  new MemberDao().selectshoppingbaglist(userNo,conn,list1,list2);
		return list;
	}
	
	// 메일 인증(회원 메일 가져오기)_진교
	public Member memberemail(String email) {
		Connection conn = getConnection();
		
		Member memberEmail = new MemberDao().memberEmail(conn,email);
		
		close(conn);
		
		return memberEmail;
	}
	// 비밀번호 변경(회원 아이디 가져오기)_진교
	public Member memberSend(String userId) {
		Connection conn = getConnection();
		
		Member memberSend = new MemberDao().memberSend(conn,userId);
		
		close(conn);
		
		return memberSend;	
	}
	
	// 비밀번호 변경(update)_진교
	public int UpdatePwd(Member member) {
		Connection conn = getConnection();
		
		System.out.println("servlet은 왔나");
		System.out.println("M_Id : " + member.getmId());
		System.out.println("M_PWD : " + member.getmPwd());
		int result = new MemberDao().updatePwd(conn, member);
		
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		} 
		close(conn);
		
		return result;
	}

	//shoppingbag 페이자 :한솔
	public int shoppingbagInsert(String p_no, int number, String userNo) {
		Connection conn = getConnection();
		String sql = new MemberDao().InsertShoppingbag(p_no,conn,number,userNo);
		int result = new MemberDao().InsertShoppingBagsql(sql,conn);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		} 
		close(conn);
		return result;
	}
	//shoppingbag 페이자 :한솔
	public int shoppingbagDelete(String[] check) {
		Connection conn = getConnection();
		int result = new MemberDao().DeleteShoppingbag(conn,check);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		} 
		close(conn);
		return result;
	}



	
	// 마이페이지 회원 이름, 등급, 적립금 내역 가져오기_희지
	public MemberPoint memberInfo(String userNoM) {
		Connection conn = getConnection();
		MemberPoint mp = new MemberPoint();
		
		mp = new MemberDao().memberInfo(conn, userNoM);
		
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
	
	
	// 마이 페이지 최근 주문 목록 리스트 카운트_희지
	public int currentListCount(String userNoM) {
		Connection conn = getConnection();
		
		int currentListCount = new MemberDao().currentListCount(conn, userNoM);
			
		close(conn);
		
		return currentListCount;
	}
	
	
	// 마이 페이지 최근 주문 목록 select_희지
	public ArrayList<OrderUpdate> selectCurrentOrderList(int currentPage, int limit, String userNoM) {
		Connection conn = getConnection();
		
		ArrayList<OrderUpdate> coList = new MemberDao().selectCurrentOrderList(conn,currentPage,limit,userNoM);
		
		close(conn);
		
		return coList;
	}



}
