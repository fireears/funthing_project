package admin.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.service.AdminService;
import board.model.vo.PageInfo;
import member.model.vo.Member;

/**
 * Servlet implementation class AdminNoticeDelete
 */
@WebServlet("/admin/NoticeDelete")
public class AdminNoticeDelete extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminNoticeDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      AdminService mListService = new AdminService();
      System.out.println("한솔");
       String[] nNo =request.getParameterValues("nNo");   // 아이디 검색 값
      int result = mListService. deleteNotice(nNo);
      System.out.println("nNo"+nNo);
      RequestDispatcher view = null;
      if(result>0) {
         view = request.getRequestDispatcher("/admin/NoticeView");
         request.setAttribute("noticeSearch", null);
      }else if(result<=0||nNo==null){
         view = request.getRequestDispatcher("/admin/NoticeView");
         request.setAttribute("msg", "게시판 리스트 삭제실패!");
         
      }
      
      view.forward(request, response);
   }


   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}