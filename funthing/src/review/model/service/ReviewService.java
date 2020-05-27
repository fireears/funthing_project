package review.model.service;

import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

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


	public int updateMemberPoint(String revmNo) {
		Connection conn = getConnection();
		ReviewDao rvDao = new ReviewDao();
		
		int mbRs = rvDao.updateMemberPoint(conn,revmNo);

		if(mbRs > 0){
			commit(conn);
		}else{
			rollback(conn);
		}
		
		return mbRs;
	}


	public ArrayList<Review> selectReview(String pNo) {
		Connection conn = getConnection();
		ArrayList<Review> rvListView = new ReviewDao().selectReview(conn, pNo);
		
		
		
		return rvListView;
	}


	public ArrayList<Review> reviewSelect(String mNo) {
		Connection conn = getConnection();
		ArrayList<Review> rvList = new ArrayList<>();
		
		
		ReviewDao rd = new ReviewDao();
		rvList = rd.reviewSelect(conn,mNo);
		
		return rvList;
	}


	



}
