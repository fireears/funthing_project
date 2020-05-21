package women.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import women.model.service.WomenService;
import women.model.vo.WomenVo;

/**
 * Servlet implementation class WomenLowPrice
 */
@WebServlet("/WomenLowPrice")
public class WomenLowPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WomenLowPrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			WomenService ws = new WomenService();
			int listCount = ws.WomenListCount();
			
			int currentPage;	//현재 페이지를 저장할 변수
			int limit;			// 한 페이지에 보여질 게시글 수
			int maxPage;		// 전체 페이지의 맨 마지막 페이지
			int startPage;		// 한번에 표시될 페이지가 시작할 페이지
			int endPage;		// 한번에 표시될 페이지가 끝나는 페이지
			currentPage = 0;
			if(request.getParameter("currentPage") != null)
			{
				currentPage = Integer.valueOf(request.getParameter("currentPage")); // String -> int
			}
			else
			{
				currentPage = 1;
			}
			limit = 80;
			maxPage = (int)((double)listCount/80 + 0.9999);
			startPage = (((int)((double)currentPage/10 + 0.9)) - 1)*10 + 1;
			endPage = startPage + 10 - 1;
			
			if(endPage >= maxPage){
				endPage = maxPage;
			}
			ArrayList<WomenVo> list =null;
			PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
			RequestDispatcher view = null;
			System.out.println(pi);
			list = ws.selectListLowPrice(currentPage, limit);	
					
			if(list.isEmpty()){
				request.setAttribute("msg","게시판 리스트 조회 실패!");
				view = request.getRequestDispatcher("index.jsp");
			}else{
				request.setAttribute("list", list);
				request.setAttribute("pi", pi);
				view = request.getRequestDispatcher("views/main/woman.jsp");
			}	
			view.forward(request, response);
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
