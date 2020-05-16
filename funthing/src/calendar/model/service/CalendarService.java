package calendar.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import calendar.model.dao.CalendarDao;
import product.model.vo.Product;

public class CalendarService {

	public ArrayList<Product> selectCalendar() {
		Connection conn = getConnection();
		
		ArrayList<Product> list = new CalendarDao().selectCalendar(conn);
		
		close(conn);
		
		return list;
	}

	public ArrayList<Product> clickDate(String thisDate) {
		Connection conn = getConnection();
		ArrayList<Product> cList = new CalendarDao().clickDate(conn,thisDate);
		
		close(conn);
		
		return cList;
	}

}
