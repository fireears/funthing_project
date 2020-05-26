package main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.vo.PageInfo;
import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class MainNoticeServlet
 */
@WebServlet("/MainNoticeServlet")
public class MainNoticeServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainNoticeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      try
      {
         request.setCharacterEncoding("utf-8"); 
         String Search = request.getParameter("noticeSearch"); 
         NoticeService ls = new NoticeService();
         
         System.out.println("search는 : "+Search);
         
         int currentPage;   //현재 페이지를 저장할 변수
          int limit;         // 한 페이지에 보여질 게시글 수
          int maxPage;      // 전체 페이지의 맨 마지막 페이지
          int startPage;      // 한번에 표시될 페이지가 시작할 페이지
          int endPage;      // 한번에 표시될 페이지가 끝나는 페이지
          currentPage = 0;
         
         System.out.println("cruuent : " + request.getParameter("currentPage"));
         
          if(Search != null &&Search!="") {
             request.setAttribute("search", Search);
             
          }
         
          
          if(request.getParameter("currentPage") != null)
            {
               currentPage = Integer.valueOf(request.getParameter("currentPage")); // String -> int
            }
          else
          {
             currentPage = 1;
          }
          
          if(request.getParameter("noticeSearch") ==null) {
              Search = request.getParameter("search");
          }
             
         
          int listCount = ls.NoticeCount(Search);
          System.out.println(listCount);
          System.out.println("currentPage : "+currentPage);
          System.out.println("Search : "+Search);
          limit = 10;
          maxPage = (int)((double)listCount/10 + 0.9);
          startPage = (((int)((double)currentPage/10 + 0.9)) - 1)*10 + 1;
          endPage = startPage + limit - 1;
            
          if(endPage > maxPage){
               endPage = maxPage;
            }
          System.out.println("currentpage : "+request.getParameter("currentPage"));
       
         ArrayList<Notice> list = ls.selectList(Search,currentPage,limit);
         RequestDispatcher view = null;
         PageInfo pi = new PageInfo(currentPage, listCount, limit, maxPage, startPage, endPage);
         System.out.println(pi);
            System.out.println();
            for(int i =0; i<list.size();i++) {
               System.out.println(list.get(i));
            }
         if(list.isEmpty()){
            request.setAttribute("msg","게시판 리스트 조회 실패!");
            view = request.getRequestDispatcher("adminMain.jsp");
            
         }else{   
            request.setAttribute("list", list);
            request.setAttribute("pi", pi);
            view = request.getRequestDispatcher("/views/notice/notice.jsp");
         
         }
         view.forward(request, response);
      }
      catch(NumberFormatException e)
      {
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
