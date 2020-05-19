package notice.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;

public class NoticeService {

	public ArrayList<Notice> mainselectNoticeService() {
		Connection conn = getConnection();
		NoticeDao nDao = new NoticeDao();
		ArrayList<Notice> list = new ArrayList<>();
		
		list = nDao.mainSelectNoticeService(conn);
		
		close(conn);
		
		return list;
	}
	public ArrayList<Notice> selectList(String search, int currentPage, int limit) {
	      
	      Connection conn = getConnection();
	      System.out.println("노티스 서블릿");
	      System.out.println("search"+search);
	      System.out.println("currentPage"+currentPage);
	      System.out.println("limit" + limit);
	      ArrayList<Notice> list = new NoticeDao().selectList(conn,search,currentPage,limit);
	      //BoardDao를 가서 selectList메소드 구현하기
	      close(conn);
	      System.out.println("list : "+list.isEmpty());
	      return list;
	   }
	
	public int insertList(Notice nt) {
		Connection conn = getConnection();
		int num = new NoticeDao().insertList(conn,nt);
		close(conn);
		return num;
	}
	public int NoticeCount(String search) {
		Connection conn = getConnection();
		int num = new NoticeDao().getNoticeCount(conn,search);
		close(conn);
		return num;
	}

}
