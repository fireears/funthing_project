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
}
