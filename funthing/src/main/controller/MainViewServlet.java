package main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;
import product.model.service.ProductService;
import product.model.vo.Product;
import qna.model.service.QnaService;
import qna.model.vo.QnA;

/**
 * Servlet implementation class MainViewServlet
 */
@WebServlet("/main/mainView")
public class MainViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductService pService = new ProductService();
		QnaService qService = new QnaService();
		NoticeService nService = new NoticeService();
		
		ArrayList<Product> arriProduct = new ArrayList<>();
		ArrayList<Product> bestProduct = new ArrayList<>();
		ArrayList<Product> closeProduct = new ArrayList<>();
		ArrayList<QnA> qnalist = new ArrayList<>();
		ArrayList<Notice> noticelist = new ArrayList<>();
		
		arriProduct = pService.arriSelctProduct();		//신상품
		bestProduct = pService.bestSelectProduct();		//best상품
		closeProduct = pService.closeSelectProduct();	//종료임박상품
		qnalist = qService.mainselectQnaService();		//QnA
		noticelist = nService.mainselectNoticeService();//공지사항
		
		RequestDispatcher view = request.getRequestDispatcher("/views/main/main.jsp");
		request.setAttribute("arriProduct", arriProduct);
		request.setAttribute("bestProduct", bestProduct);
		request.setAttribute("closeProduct", closeProduct);
		request.setAttribute("qnalist", qnalist);
		request.setAttribute("noticelist", noticelist);
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
