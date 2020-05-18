package productQnA.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;


import productQnA.model.vo.ProductQnA;
import productQnA.model.vo.ProductQnaIn;

public class ProductQnADao {
	
	Properties prop = new Properties();
	
	public ProductQnADao()
	{
		String fileName = ProductQnADao.class.getResource("/sql/QnA/QnA-query.properties").getPath();
		
		
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

	public ArrayList<ProductQnA> selectQnaDao(Connection conn) {
		
		ArrayList<ProductQnA> list = new ArrayList<>();
		ProductQnA qna = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
//		String query = prop.getProperty("mainSelectQnA");
		String query = "SELECT QNA_TITLE, QNA_DATE FROM QNA ";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				qna = new ProductQnA(rset.getString("qna_title"),
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
	// 상품 문의 페이지(클라이언트)입력_혜린
	public int insertMember(Connection conn, ProductQnaIn qna) {
		PreparedStatement pstmt = null;
		int result = 0;

		String query = "insert into qna values(SEQ_QNA.nextval, ?, ?, ?,sysdate, ?,?,'N') ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, qna.getmNo());
			pstmt.setString(2, qna.getQnaTitle());
			pstmt.setString(3, qna.getQnaContents());
			pstmt.setString(4, qna.getpNo());
			pstmt.setString(5, qna.getbNo());
		
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	// 상품문의 list페이지_혜린
	public int getListCount(Connection conn, String mNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int listCount = 0;
		
		String query = "SELECT COUNT(*) FROM QNA WHERE m_No = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mNo);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				listCount = rset.getInt("COUNT(*)");
				
			}
//			System.out.println("list dao listcount:" + listCount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(pstmt);
		close(rset);
		
		
		return listCount;
	}
	// 상품 문의페이지(클라이언트)리스트_혜린
	public ArrayList<ProductQnaIn> selectOrderSearch(Connection conn, int currentPage, int limit, String mNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ProductQnaIn qna = null;
		ArrayList<ProductQnaIn> list = new ArrayList<>();
		String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN "
				+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA WHERE M_NO= ?) "
				+ "WHERE rnum between ? and ? ";
		
		try {
			int startRow = (currentPage -1) * limit +1;
			int endRow = startRow + (limit -1);
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mNo);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				qna = new ProductQnaIn(
						rset.getInt("QNA_NO"),
						rset.getString("M_NO"),
						rset.getString("QNA_TITLE"),
						rset.getString("QNA_CONTENTS"),
						rset.getDate("QNA_DATE"),
						rset.getString("P_NO2"),
						rset.getString("B_NO"),
						rset.getString("RE_YN")
							);
			list.add(qna);
			}
			System.out.println("ListDao list : " + list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return list;
	}

}
