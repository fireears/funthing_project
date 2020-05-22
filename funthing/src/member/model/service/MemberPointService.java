// 적립금 서비스_희지
package member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import member.model.dao.MemberDao;
import member.model.dao.MemberPointDao;
import member.model.vo.MemberPoint;

import static common.JDBCTemplate.*;

public class MemberPointService {

	// 적립금 리스트 카운트_희지
	public int getPListCount(String userNo) {
		
		Connection conn = getConnection();
		
		int pListCount = new MemberPointDao().getPListCount(conn, userNo);
		
		close(conn);
		
		return pListCount;
	}

	// 적립금 리스트 조회_희지
	public ArrayList<MemberPoint> selectMemberPoint(String searchDate, String firstDate, String secondDate,
			int currentPage, int limit, String userNo) {
		
		Connection conn = getConnection();
		
		ArrayList<MemberPoint> list = new MemberPointDao().selectMemberPoint(conn, searchDate, firstDate, secondDate, currentPage, limit, userNo);
		
		close(conn);
		
		return list;
	}
	

	// 로그인 유저 값 받아오기_희지
	public MemberPoint memberInfo(String userNo) {
		Connection conn = getConnection();
		MemberPoint mp = new MemberPoint();
		
		mp = new MemberPointDao().memberInfo(conn,userNo);
		
		close(conn);
		
		return mp;
	}

}
