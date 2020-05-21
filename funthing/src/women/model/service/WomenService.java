package women.model.service;
import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import women.model.dao.WomenDao;
import women.model.vo.WomenVo;


public class WomenService {
	public ArrayList<WomenVo> selectList(int currentPage, int limit){
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectList(conn,currentPage, limit);
		return list;
		
	}
	public int WomenListCount() {
		Connection conn = getConnection();
		
		int listCount = new WomenDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	public int WomenBottomListCount() {
		Connection conn = getConnection();
		
		int listCount = new WomenDao().getBottomCount(conn);
		
		close(conn);
		
		return listCount;
	}
	public ArrayList<WomenVo> selectListBottom(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListBottom(conn,currentPage, limit);
		return list;
	}
	public int WomenJeanListCount() {
		Connection conn = getConnection();
		
		int listCount = new WomenDao().getJeanCount(conn);
		
		close(conn);
		
		return listCount;
	}
	public ArrayList<WomenVo> selectListJean(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListJean(conn,currentPage, limit);
		return list;
	}
	public int WomenOnepieceListCount() {
		Connection conn = getConnection();
		
		int listCount = new WomenDao().getOnepieceCount(conn);
		
		close(conn);
		
		return listCount;
	}
	public ArrayList<WomenVo> selectListOnepiece(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListOnepiece(conn,currentPage, limit);
		return list;
	}
	public int WomenOuterListCount() {
		Connection conn = getConnection();
		
		int listCount = new WomenDao().getOuterListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	public ArrayList<WomenVo> selectListOuter(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListOuter(conn,currentPage, limit);
		return list;
	}
	public int WomenTopListCount() {
		Connection conn = getConnection();
		
		int listCount = new WomenDao().getTopListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	public ArrayList<WomenVo> selectListTop(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListTop(conn,currentPage, limit);
		return list;
	}
	public ArrayList<WomenVo> selectListHighPrice(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListHighPrice(conn,currentPage, limit);
		return list;
	}
	public ArrayList<WomenVo> selectListLowPrice(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListLowPrice(conn,currentPage, limit);
		return list;
	}
	public ArrayList<WomenVo> selectListCloseToCompletion(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListCloseToCompletion(conn,currentPage, limit);
		return list;
	}
	public ArrayList<WomenVo> selectListNewProduct(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<WomenVo> list = new WomenDao().selectListNewProduct(conn,currentPage, limit);
		return list;
	}
}
