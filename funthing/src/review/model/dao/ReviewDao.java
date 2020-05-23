package review.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import review.model.vo.Review;

import static common.JDBCTemplate.*;

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
				rvList.add(new Review(rs.getString("P_NO")));
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


}
