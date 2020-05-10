package qna.model.dao;

import static common.JDBCTemplate.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;


import qna.model.vo.QnA;
public class QnaDao {
	
	Properties prop = new Properties();
	
	public QnaDao()
	{
		String fileName = QnaDao.class.getResource("/sql/QnA/QnA-query.properties").getPath();
		
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<QnA> selectQnaDao(Connection conn) {
		
		ArrayList<QnA> list = new ArrayList<>();
		QnA qna = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
//		String query = prop.getProperty("mainSelectQnA");
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
