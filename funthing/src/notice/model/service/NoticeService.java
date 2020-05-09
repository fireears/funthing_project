package notice.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;

public class NoticeService {

	public ArrayList<Notice> mainselectNoticeService() {
		Connection conn = getConnection();
		NoticeDao nDao = new NoticeDao();
		ArrayList<Notice> list = new ArrayList<>();
		
		list = nDao.mainSelectNoticeService(conn);
		
		close(conn);
		
		return list;
	}

}
