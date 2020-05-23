package review.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import member.model.vo.Member;
import member.model.vo.MemberPoint;
import review.model.dao.ReviewDao;
import review.model.vo.Review;

public class ReviewService {

	public ArrayList<Review> searchOrder(String revmId, String revpNo) {
		Connection conn = getConnection();
		ReviewDao rvDao = new ReviewDao();
		ArrayList<Review> rvList =  rvDao.searchOrder(conn,revmId,revpNo);
				
		return rvList;
	}

	
	public int insertReview(Review rv, String revmId) {
		Connection conn = getConnection();
		ReviewDao rvDao = new ReviewDao();
		
		int result = rvDao.insertReview(conn,rv,revmId);

		if(result > 0){
			commit(conn);
		}else{
			rollback(conn);
		}
		
		return result;
	}


	public int insertReviewPoint(String oNo, String revmNo, int revmPoint) {
		Connection conn = getConnection();
		ReviewDao rvDao = new ReviewDao();
		
		int pointRs = rvDao.insertReviewPoint(conn,oNo,revmNo,revmPoint);

		if(pointRs > 0){
			commit(conn);
		}else{
			rollback(conn);
		}
		
		
		return pointRs;
	}


	



}
