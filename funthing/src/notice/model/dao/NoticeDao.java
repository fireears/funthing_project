package notice.model.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import notice.model.vo.Notice;


public class NoticeDao {
	
	Properties prop = new Properties();
	
	

	public NoticeDao() {
//		super();
//		
//		String fileName = NoticeDao.class.getResource("/sql/notice/notice-query.properties").getPath();
//		
//		
//		try {
//			prop.load(new FileReader(fileName));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}



	public ArrayList<Notice> mainSelectNoticeService(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Notice> list = new ArrayList<>();
		
		
//		String query = prop.getProperty("mainSelectNotice");
		String query = "SELECT * FROM NOTICE WHERE N_DEL_YN='N' ORDER BY 4 DESC" ;
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				Notice n  = new Notice(rset.getInt("N_NO"), rset.getString("N_TITLE"),
								rset.getDate("N_DATE"));
				
				list.add(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pstmt);
		close(rset);
		
		return list;
	}



	public ArrayList<Notice> selectList(Connection conn, String search, int currentPage, int limit) {
		ArrayList<Notice> al = new ArrayList<Notice>();
		try {
		if(search != null) {
			PreparedStatement pstmt = null;
			String quary = "SELECT * FROM ( SELECT ROWNUM RN,  N_NO , N_TITLE,N_CONTENTS,N_DATE,N_DEL_YN FROM NOTICE   WHERE N_TITLE LIKE '%"+search+"%' ORDER BY N_NO ASC) where RN >= ? AND RN<=?";
			int startRow =(currentPage -1)*limit +1;
			int endRow = startRow + limit -1;
			pstmt = conn.prepareStatement(quary);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Notice nt = new Notice(rs.getInt("N_NO"), rs.getString("N_TITLE"), rs.getString("N_CONTENTS"),rs.getString("N_DATE"),rs.getString("N_DEL_YN"));	
				al.add(nt);
			}
		}else{
			PreparedStatement pstmt = null;
			String quary = "SELECT * FROM NOTICE  WHERE N_NO BETWEEN ? AND ? ";
			int startRow =(currentPage -1)*limit +1;
			int endRow = startRow + limit -1;
			System.out.println("여기까진 가냐?");
			pstmt = conn.prepareStatement(quary);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Notice nt = new Notice(rs.getInt("N_NO"), rs.getString("N_TITLE"), rs.getString("N_CONTENTS"),rs.getString("N_DATE"),rs.getString("N_DEL_YN"));
				
				al.add(nt);
			}
	
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return al;
	}



	public int insertList(Connection conn, Notice nt) {
		String quary ="INSERT INTO NOTICE(N_NO,N_TITLE,N_CONTENTS,N_DATE,N_DEL_YN) VALUES(SEQ_NOTI.NEXTVAL,?,?,SYSDATE,?)";
		int rs=0;
		try {
			PreparedStatement ps = conn.prepareStatement(quary);
			ps.setString(1, nt.getnTitle());
			ps.setString(2, nt.getnContents());
			ps.setString(3, nt.getnDelYn());
			rs =ps.executeUpdate();
			if(rs>0) {
				commit(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return rs;
	}



	public int getNoticeCount(Connection conn, String search) {
		Statement stmt =null;
		ResultSet rset = null;
		int noticeCount=0;
		
		
		try { 			
			if(search != null) {
					
				String query = "SELECT COUNT(*) FROM NOTICE  WHERE N_TITLE LIKE '%"+search+"%'";
				stmt =conn.createStatement();
				rset=stmt.executeQuery(query);
				if(rset.next()) {
					noticeCount = rset.getInt(1);
				}
				
			}else {
				String query = "SELECT COUNT(*) FROM NOTICE";
				stmt =conn.createStatement();
				rset=stmt.executeQuery(query);
				if(rset.next()) {
					noticeCount = rset.getInt(1);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(stmt);
			close(rset);
		}
		
		return noticeCount;
	}
}