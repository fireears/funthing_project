package qna.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import qna.model.vo.QnA;

import static common.JDBCTemplate.*;
public class QnaDao {

	public ArrayList<QnA> selectQnaDao(Connection conn) {
		
		ArrayList<QnA> list = new ArrayList<>();
		QnA qna = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT QNA_TITLE, QNA_DATE FROM QNA ";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				qna = new QnA(rset.getString("qna_title"),
								rset.getDate("qna_date"));
				
				list.add(qna);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(pstmt);
			close(rset);
		}
		return list;
	}

}
