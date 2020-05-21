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

import payment.model.vo.OrderInfoDetail;
import productQnA.model.vo.AdminProductQnA;
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
		String query = "SELECT QNA_TITLE, QNA_DATE FROM QNA ORDER BY 2 DESC";
		
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
	public ArrayList<ProductQnaIn> selectOrderSearch(Connection conn, String searchDate, String firstDate, String secondDate, int currentPage, int limit, String mNo) {
		System.out.println("여기까진오지?");
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ProductQnaIn qna = null;
		ArrayList<ProductQnaIn> list = new ArrayList<>();
//		String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN "
//				+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA WHERE M_NO= ?) "
//				+ "WHERE rnum between ? and ? ";
		
		try {
			int startRow = (currentPage -1) * limit +1;
			int endRow = startRow + (limit -1);
			
//			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, mNo);
//			pstmt.setInt(2, startRow);
//			pstmt.setInt(3, endRow);
//			
//			rset = pstmt.executeQuery();
			
			// 맨 처음 리스트 출력 값
		if(searchDate == null && firstDate == null) {

			System.out.println("searchDate가 null일때" + searchDate);
	
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN "
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA WHERE M_NO= ?) "
					+ "WHERE rnum between ? and ? ";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			rset = pstmt.executeQuery();
			
			
		// 클라이언트가 '오늘'선택 했을 때
		}else if(searchDate != null && searchDate.equals("today")) {
			System.out.println("-------------------------"+searchDate+"-----------------------");
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN " 
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') = TO_DATE(SYSDATE,'RRRR/MM/DD')) "
					+ "WHERE rnum between ? and ?";
					
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			rset = pstmt.executeQuery();
			


		// 클라이언트가 '7일' 선택 했을 때
		}else if(searchDate != null &&  searchDate.equals("week")) {
//			System.out.println("-------------------------week-----------------------");
			System.out.println("-------------------------"+searchDate+"-----------------------");
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN	"
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA "
					+ "WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-7) WHERE rnum between ? and ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			rset = pstmt.executeQuery();
			
			
		// 클라이언트가 '한달' 선택 했을 때
		}else if(searchDate != null &&  searchDate.equals("month")) {
//			System.out.println("-------------------------month-----------------------ok");
			System.out.println("-------------------------"+searchDate+"-----------------------");
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN	"
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA "
					+ "WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')- 30) WHERE rnum between ? and ?";
			
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			rset = pstmt.executeQuery();
			
			
		// 클라이언트가 '3개월' 선택 했을 때
		}else if(searchDate != null &&  searchDate.equals("3months")) {
//			System.out.println("-------------------------3months-----------------------ok");
			System.out.println("-------------------------"+searchDate+"-----------------------");
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN	"
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA "
					+ "WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')- 90) WHERE rnum between ? and ?";
							
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			rset = pstmt.executeQuery();
			
			
		// 클라이언트가 '6개월' 선택 했을 때
		}else if(searchDate != null &&  searchDate.equals("6months")) {
			System.out.println("-------------------------6months-----------------------");
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN	"
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA "
					+ "WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-180) WHERE rnum between ? and ?";
			
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			
			rset = pstmt.executeQuery();
			
			
		// 클라이언트가 '1년' 선택 했을 때	
		}else if(searchDate != null &&  searchDate.equals("year")) {
			System.out.println("-------------------------year-----------------------");
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN	"
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA "
					+ "WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') >= TO_DATE(SYSDATE,'RRRR/MM/DD')-365) WHERE rnum between ? and ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			pstmt.setString(1, mNo);
			
			rset = pstmt.executeQuery();
			
			
		// 클라이언트가 날짜 선택했을 때
		}else {
			System.out.println("캘린더 선택 날자선택");
			
			String query = "SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN	"
					+ "from (SELECT QNA_NO,M_NO,QNA_TITLE,QNA_CONTENTS,QNA_DATE,P_NO2,B_NO,RE_YN ,rownum as rnum FROM QNA "
					+ "WHERE M_NO= ? AND TO_DATE(QNA_DATE,'RRRR/MM/DD') BETWEEN TO_DATE(?,'RRRR/MM/DD') AND TO_DATE(?,'RRRR/MM/DD')) where rnum between ? and ?";

				
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(4, startRow);
			pstmt.setInt(5, endRow);
			pstmt.setString(1 , mNo);
			pstmt.setString(2, firstDate);
			pstmt.setString(3, secondDate);
			
			rset = pstmt.executeQuery();
			
			
						}
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
	// 상품문의 (클라이언트) 상세페이지_혜린
	public AdminProductQnA ProductQnaDetail(Connection conn, String mNo, String qnaNo) {
		
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			AdminProductQnA apq = null;
			
//			String query = "select q.qna_no, m_id, m_name,p_no2, p_name, qna_title, qna_contents, qna_date, re_yn , qnare_id, qnare_content, qnare_date "
//					+ "from qna q join qnare qre on q.qna_no = qre.qna_no join member m on m.m_no = q.m_no join product p on q.p_no2 = p.p_no";
			
			String query = "select q.qna_no, m_id, m_name,p_no2, p_name, qna_title, qna_contents, to_char(qna_date,'yy/mm/dd'), re_yn , qnare_id, qnare_content, qnare_date "
					+ "from qna q join qnare qre on q.qna_no = qre.qna_no join member m on m.m_no = q.m_no join product p on q.p_no2 = p.p_no";
			try {
				pstmt = conn.prepareStatement(query);
				
				
				rset = pstmt.executeQuery();
				
				if(rset.next()) {
					apq = new AdminProductQnA(
							rset.getInt("QNA_No"),
							rset.getString("M_ID"),
							rset.getString("M_NAME"),
							rset.getString("P_NO2"),
							rset.getString("P_NAME"),
							rset.getString("QNA_TITLE"),
							rset.getString("QNA_CONTENTS"),
							rset.getString("to_char(qna_date,'yy/mm/dd')"),
							rset.getString("RE_YN"),
							rset.getString("QNARE_ID"),
							rset.getString("QNARE_CONTENT"),
							rset.getString("QNARE_DATE")
							
							
							);

				}
//				System.out.println("Dao apq : " + apq);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close(pstmt);
				close(rset);
			}
			
			return apq;
	}

}
