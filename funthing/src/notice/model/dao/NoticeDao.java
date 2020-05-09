package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import notice.model.vo.Notice;

import static common.JDBCTemplate.*;

public class NoticeDao {

	public ArrayList<Notice> mainSelectNoticeService(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Notice> list = new ArrayList<>();
		Notice n = null;
		
		String query = "SELECT N_TITLE, N_DATE\r\n" + 
						"FROM NOTICE\r\n" + 
						"WHERE N_DEL_YN = 'N'";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				n = new Notice(rset.getString("n_title"),
								rset.getDate("n_date"));
				
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

}
