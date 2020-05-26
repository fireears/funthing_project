package review.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import member.model.vo.MemberPoint;
import review.model.vo.Review;

public class ReviewDao {

	public ArrayList<Review> searchOrder(Connection conn, String revmId, String revpNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Review> rvList = null;
		
		String sPno = revpNo + "%";
		
		String query = "SELECT * FROM ORDER_DETAIL WHERE P_NO LIKE ? AND M_ID = ?";

		System.out.println("dao id : " + revmId);
		
		System.out.println("dao : " + revpNo);
		System.out.println("dao : " + sPno);
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sPno);
			pstmt.setString(2, revmId);
			
			rs = pstmt.executeQuery();
			
			rvList = new ArrayList<>();
			
			while(rs.next()) {
				rvList.add(new Review(rs.getString("P_NO"),
						rs.getString("O_NO")));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		
		return rvList;		
	}

	public int insertReview(Connection conn, Review rv, String revmId) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		System.out.println(revmId);
		
		String query = "INSERT INTO REVIEW VALUES(SEQ_REV.NEXTVAL, ?, ?, ?, ?, SYSDATE, 0, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, rv.getmNo());
			pstmt.setString(2, rv.getRevTitle());
			pstmt.setString(3, rv.getpNo());
			pstmt.setString(4, rv.getRevContents());
			pstmt.setInt(5, rv.getRate());
			pstmt.setString(6, rv.getRevPic());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			close(pstmt);
		}
		
		
		return result;
	}

	public int insertReviewPoint(Connection conn, String oNo, String revmNo, int revmPoint) {
		ArrayList<MemberPoint> mp = new ArrayList<>();
		PreparedStatement pstmt = null;
		int pointRs = 0;
		
		String query = "INSERT INTO POINT VALUES('POINT'||SEQ_POINT.NEXTVAL, SYSDATE, ?, ?, ?, ?, ?, ?)";
		
		String pContent = "구매 확정 후 리뷰 적립";		// 포인트 지급 이유
		int point = 10000;							// 포인트 지급 금액
		String pCate = "리뷰적립";						// 포인트 카테고리
		
		int totalPoint = revmPoint + point;
		
		System.out.println("포인트 테이블 총 적립금 : " + totalPoint);
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, oNo);
			pstmt.setString(2, pContent);
			pstmt.setInt(3, point);
			pstmt.setString(4, revmNo);
			pstmt.setString(5, pCate);
			pstmt.setInt(6, totalPoint);
			
			pointRs = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return pointRs;
	}

	public int updateMemberPoint(Connection conn, String revmNo) {
		PreparedStatement pstmt = null;
		int mbRs = 0;
		
		int point = 10000;		// 지급 포인트
		
		
		System.out.println(revmNo);
		
		String query = "UPDATE MEMBER SET M_POINT = M_POINT + 10000 WHERE M_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
//			pstmt.setInt(1, point);
			pstmt.setString(1, revmNo);
			

			mbRs = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		
		return mbRs;
	}

	public ArrayList<Review> selectReview(Connection conn, String p_no) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Review> rvListView = new ArrayList<>();
		
		System.out.println("dao p_no : " + p_no);
		
		String p_noLike = p_no + "%";		// 상품 번호의 색상, 사이즈 다른 값까지 찾아 줌
		
		String query = "SELECT * FROM REVIEW R JOIN MEMBER M ON(R.M_NO = M.M_NO) WHERE P_NO LIKE ? ORDER BY 1 DESC";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, p_noLike);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Review rv = new Review(
						rs.getInt("REV_NO"),
						rs.getString("REV_TITLE"),
						rs.getString("P_NO"),
						rs.getString("REV_CONTENTS"),
						rs.getString("REV_DATE"),
						rs.getInt("VIEWS_NUM"),
						rs.getInt("RATE"),
						rs.getString("REV_PIC_DIR"),
						rs.getString("M_NAME"));
				
				rvListView.add(rv);
			}

			// 받아준 rate 숫자형을 문자형으로 변경
			for(int i = 0; i < rvListView.size(); i ++) {
				switch(rvListView.get(i).getRate()) {
					case 1 : rvListView.get(i).setRateStar("★☆☆☆☆"); break;
					case 2 : rvListView.get(i).setRateStar("★★☆☆☆"); break;
					case 3 : rvListView.get(i).setRateStar("★★★☆☆"); break;
					case 4 : rvListView.get(i).setRateStar("★★★★☆"); break;
					case 5 : rvListView.get(i).setRateStar("★★★★★"); break;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		
		return rvListView;
	}

	public ArrayList<Review> reviewSelect(Connection conn, String mNo) {
		ArrayList<Review> rvList = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT ROWNUM RN, M_NAME, REV_TITLE, P_NO, REV_CONTENTS, REV_DATE, VIEWS_NUM, RATE, REV_PIC_DIR FROM REVIEW R JOIN MEMBER M ON(R.M_NO = M.M_NO) WHERE R.M_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, mNo);

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Review rv = new Review(
						rs.getString("REV_TITLE"),
						rs.getString("P_NO"),
						rs.getString("REV_CONTENTS"),
						rs.getString("REV_DATE"),
						rs.getInt("VIEWS_NUM"),
						rs.getInt("RATE"),
						rs.getString("REV_PIC_DIR"),
						rs.getString("M_NAME"),
						rs.getInt("RN"));
				
				rvList.add(rv);
			}

			// 받아준 rate 숫자형을 문자형으로 변경
			for(int i = 0; i < rvList.size(); i ++) {
				switch(rvList.get(i).getRate()) {
					case 1 : rvList.get(i).setRateStar("★☆☆☆☆"); break;
					case 2 : rvList.get(i).setRateStar("★★☆☆☆"); break;
					case 3 : rvList.get(i).setRateStar("★★★☆☆"); break;
					case 4 : rvList.get(i).setRateStar("★★★★☆"); break;
					case 5 : rvList.get(i).setRateStar("★★★★★"); break;
				}
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		return rvList;
	}


}
