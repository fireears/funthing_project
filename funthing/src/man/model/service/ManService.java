package man.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import static common.JDBCTemplate.*;
import man.model.dao.Mandao;
import man.model.vo.ManVo;
import women.model.dao.WomenDao;
import women.model.vo.WomenVo;

public class ManService {

	public int ManListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mandao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<ManVo> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectList(conn,currentPage, limit);
		return list;
	}

	public int ManBottomListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mandao().getBottomCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<ManVo> selectListBottom(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListBottom(conn,currentPage, limit);
		return list;
	}

	public int ManJeanListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mandao().getJeanCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<ManVo> selectListJean(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListJean(conn,currentPage, limit);
		return list;
	}

	public int ManOuterListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mandao().getOuterListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<ManVo> selectListOuter(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListOuter(conn,currentPage, limit);
		return list;
	}

	public int ManTopListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mandao().getTopListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<ManVo> selectListTop(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListTop(conn,currentPage, limit);
		return list;
	}

	public ArrayList<ManVo> selectListCloseToCompletion(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListCloseToCompletion(conn,currentPage, limit);
		return list;
	}

	public ArrayList<ManVo> selectListLowPrice(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListLowPrice(conn,currentPage, limit);
		return list;
	}

	public ArrayList<ManVo> selectListHighPrice(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectListHighPrice(conn,currentPage, limit);
		return list;
	}

	public ArrayList<ManVo> selectListNewProduct(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<ManVo> list = new Mandao().selectNewProduct(conn,currentPage, limit);
		return list;
	}

	
}
