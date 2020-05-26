/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-26 02:51:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.PageInfo;
import product.model.vo.Product;
import brand.model.vo.Brand;
import java.util.ArrayList;
import java.text.DecimalFormat;

public final class adminMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1590387855490L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("product.model.vo.Product");
    _jspx_imports_classes.add("brand.model.vo.Brand");
    _jspx_imports_classes.add("board.model.vo.PageInfo");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    	ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("list");
    	ArrayList<Brand> blist = (ArrayList<Brand>)request.getAttribute("blist");
    	ArrayList<Product> plist = (ArrayList<Product>)request.getAttribute("plist");
    	Product product = (Product)request.getAttribute("product");
    	
    	PageInfo pi = (PageInfo)request.getAttribute("pi");
    	String msg = (String)request.getAttribute("msg");
    	
    	DecimalFormat formatter = new DecimalFormat("###,###");
    	
    	int num = 0;
    	int currentPage = pi.getCurrentPage();
    	int listCount = pi.getListCount();
    	int limit = pi.getLimit();
    	int maxPage = pi.getMaxPage();
    	int startPage = pi.getStartPage();
    	int endPage = pi.getEndPage();
    	
    	
    
      out.write("\r\n");
      out.write("      \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\th2{text-align:center;}\r\n");
      out.write("\t\tform{height: 100px; background-color: rgb(199, 196, 196);}\r\n");
      out.write("\t\t#nav_section{margin:auto; width: 90%;}\r\n");
      out.write("\t\t#nav_section ul{height: 100px; margin: auto; width: 100%; padding: 0px;}\r\n");
      out.write("\t\t#nav_section ul li{float: left; list-style-type: none; padding-left: 20px; padding-right: 10px; line-height: 50px;}\r\n");
      out.write("\t\t#nav_section ul li .box{width: 150px;}\r\n");
      out.write("\t\t#nav_section ul li:last-child { float:right;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#area{margin: auto; width: 100%;}\r\n");
      out.write("\t\t#area table{width: 100%; border: 1px solid;}\r\n");
      out.write("\t\t#area table th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}\r\n");
      out.write("\t\t/* #area table tr button{width: 100%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255);} */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 상품계시판 밑에 버튼 */\r\n");
      out.write("\t\t#pageBtn{margin:auto; width:50%;}\r\n");
      out.write("\t\t#pageBtn>button{margin:auto; width:3%; height:30px; text-align: center; border: 0px; background-color:white;}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>FUN-THING ADMIN</title>\r\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<title>FUN-THING</title>\n");
      out.write("\t\t<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{margin: auto; width: 100%;}\n");
      out.write("            /* #nav{margin: auto; width: 50%;} */\n");
      out.write("            #nav{background-color: rgb(199, 196, 196);}\n");
      out.write("            #nav_header{margin:auto; width:100%; height: 90px;}\n");
      out.write("            #nav_header ul li{float: left; width:6%; list-style-type: none; padding-right: 15px; padding-left: 15px; padding-top: 20px; line-height: auto;}\n");
      out.write("            #nav_header ul li button{width: 100%; height: 50px; background-color: gray; border-radius: 10px; border: 0px; font-size: 13px; font-weight: 400; color: white;}\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <br>\n");
      out.write("            <h1 style=\"text-align: center;\">FUN-THING ADMIN</h1>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"nav\" align=\"center\">\n");
      out.write("                <div id=\"nav_header\" align=\"center\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><button type=\"button\" onclick=\"productManage();\">상품관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"productQnA();\">상품문의</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"orderManage();\">주문관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"\">매출관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"\">상품통계</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"memberManage();\">회원 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"brandManage();\">브랜드 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"reviewManage();\">리뷰관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"qnaManage();\">1:1문의 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"pointManage();\">적립금</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"notice();\">공지사항 게시판</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"client();\">클라이언트</button></li>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <!-- <li><button>캘린더 관리</button></li> -->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <hr clear=\"both\">\n");
      out.write("\t</body>\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction productManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/mainView?table=\" + \"PRODUCT\";\n");
      out.write("\t\t}\n");
      out.write("\t\t//상품 문의\n");
      out.write("\t\tfunction productQnA()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/productQnA\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction orderManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/orderInfo\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction memberManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction brandManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/brandServlet\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction reviewManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/AdminReviewSelect\";\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction qnaManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/personalQna\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction pointManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/point\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction notice()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/admin/NoticeView\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction client()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/main/mainView\";\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t \n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<h2>상품관리</h2>\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/admin/mainView?search=search\" method=\"GET\">\r\n");
      out.write("\t\t<div id=\"nav_section\">\r\n");
      out.write("\t\t\t");
if(product == null) { 
      out.write("\r\n");
      out.write("\t\t    <ul>\r\n");
      out.write("\t\t        <li><label>상품번호 : </label><input type=\"text\" class=\"box\" id=\"p_no\" name=\"p_no\"></li>\r\n");
      out.write("\t\t        <li><label>브랜드 : </label>\r\n");
      out.write("\t\t        <select class=\"box\" name=\"b_no\">\r\n");
      out.write("\t\t        ");
for(Brand b : blist) {
      out.write("\r\n");
      out.write("\t\t        \t<option value=");
      out.print(b.getbNo() );
      out.write('>');
      out.print(b.getbName() );
      out.write("</option>\r\n");
      out.write("\t\t        ");
} 
      out.write("\r\n");
      out.write("\t\t        </select></li>\r\n");
      out.write("\t\t        <li><label>스타일 번호 : </label><input type=\"text\" class=\"box\" id=\"s_no\" name=\"s_no\" value=\"001\"></li>\r\n");
      out.write("\t\t        <li><label>상품명 : </label><input type=\"text\" class=\"box\" id=\"p_name\" name=\"p_name\"></li>\r\n");
      out.write("\t\t        <li>\r\n");
      out.write("\t\t        \t<label>상품종류 : </label>\r\n");
      out.write("\t\t        \t<!-- <input type=\"text\" class=\"box\" id=\"p_category\" name=\"p_category\" placeholder=\"01\"> -->\r\n");
      out.write("\t\t        \t<select name=\"pCategory\">\r\n");
      out.write("\t\t        \t\t<option value=\"1\">OUTER</option>\r\n");
      out.write("\t\t        \t\t<option value=\"2\">TOP</option>\r\n");
      out.write("\t\t        \t\t<option value=\"3\">BOTTOM</option>\r\n");
      out.write("\t\t        \t\t<option value=\"4\">JEAN</option>\r\n");
      out.write("\t\t        \t\t<option value=\"5\">ONEPICE</option>\r\n");
      out.write("\t\t        \t</select>\r\n");
      out.write("\t\t        </li>\r\n");
      out.write("\t\t        <li><label>상품가격 : </label><input type=\"text\" class=\"box\" id=\"p_price\" name=\"p_price\" value=\"0\" ></li>\r\n");
      out.write("\t\t        <li><label>펀딩 시작 날짜 : </label><input type=\"date\" class=\"box\" id=\"f_start_date\" name=\"f_start_date\" value=\"2000-01-01\"></li>\r\n");
      out.write("\t\t        <li><label>펀딩 종료 날짜 : </label><input type=\"date\" class=\"box\" id=\"f_end_date\" name=\"f_end_date\" value=\"2900-12-31\"></li>\r\n");
      out.write("\t\t        <li><label>펀딩 진행 유무 : </label>\r\n");
      out.write("\t            <select name=\"f_yn\" id=\"f_yn\" style=\"height: 28px;\">\r\n");
      out.write("\t        \t\t<option value=\"Y\">진행중</option>\r\n");
      out.write("\t        \t\t<option value=\"N\">종료</option>\r\n");
      out.write("\t    \t\t</select>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"submit\" value=\"조회하기\" style=\"background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;\"></li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" id=\"productInsert\" style=\"background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;\">상품등록</button></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("\t        ");
} else { 
      out.write("\r\n");
      out.write("\t        \t<ul>\r\n");
      out.write("\t\t\t        <li><label>상품번호 : </label><input type=\"text\" class=\"box\" id=\"p_no\" name=\"p_no\" value=\"");
      out.print(product.getpNo());
      out.write("\"></li>\r\n");
      out.write("\t\t\t        <li><label>브랜드 : </label>\r\n");
      out.write("\t\t\t        <select class=\"box\" name=\"b_no\">\r\n");
      out.write("\t\t\t        ");
for(Brand b : blist) {
      out.write("\r\n");
      out.write("\t\t\t        \t<option value=");
      out.print(b.getbNo() );
      out.write('>');
      out.print(b.getbName() );
      out.write("</option>\r\n");
      out.write("\t\t\t        ");
} 
      out.write("\r\n");
      out.write("\t\t\t        </select></li>\r\n");
      out.write("\t\t\t        <li><label>스타일 번호 : </label><input type=\"text\" class=\"box\" id=\"s_no\" name=\"s_no\" value=\"");
      out.print(product.getsNo());
      out.write("\"></li>\r\n");
      out.write("\t\t\t        <li><label>상품명 : </label><input type=\"text\" class=\"box\" id=\"p_name\" name=\"p_name\" value=\"");
      out.print(product.getpName());
      out.write("\"></li>\r\n");
      out.write("\t\t\t        <li>\r\n");
      out.write("\t\t\t        \t<label>상품종류 : </label>\r\n");
      out.write("\t\t\t        \t<!-- <input type=\"text\" class=\"box\" id=\"p_category\" name=\"p_category\" placeholder=\"01\"> -->\r\n");
      out.write("\t\t\t        \t<select name=\"pCategory\">\r\n");
      out.write("\t\t\t        \t\t<option value=\"1\">OUTER</option>\r\n");
      out.write("\t\t\t        \t\t<option value=\"2\">TOP</option>\r\n");
      out.write("\t\t\t        \t\t<option value=\"3\">BOTTOM</option>\r\n");
      out.write("\t\t\t        \t\t<option value=\"4\">JEAN</option>\r\n");
      out.write("\t\t\t        \t\t<option value=\"5\">ONEPICE</option>\r\n");
      out.write("\t\t\t        \t</select>\r\n");
      out.write("\t\t\t        </li>\r\n");
      out.write("\t\t\t        <li><label>상품가격 : </label><input type=\"text\" class=\"box\" id=\"p_price\" name=\"p_price\" value=\"");
      out.print(product.getpPrice());
      out.write("\" ></li>\r\n");
      out.write("\t\t\t        <li><label>펀딩 시작 날짜 : </label><input type=\"date\" class=\"box\" id=\"f_start_date\" name=\"f_start_date\" value=\"");
      out.print(product.getfStartDate());
      out.write("\"></li>\r\n");
      out.write("\t\t\t        <li><label>펀딩 종료 날짜 : </label><input type=\"date\" class=\"box\" id=\"f_end_date\" name=\"f_end_date\" value=\"");
      out.print(product.getfEndDate());
      out.write("\"></li>\r\n");
      out.write("\t\t\t        <li><label>펀딩 진행 유무 : </label>\r\n");
      out.write("\t\t            <select name=\"f_yn\" id=\"f_yn\" style=\"height: 28px;\">\r\n");
      out.write("\t\t        \t\t<option value=\"Y\">진행중</option>\r\n");
      out.write("\t\t        \t\t<option value=\"N\">종료</option>\r\n");
      out.write("\t\t    \t\t</select>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><input type=\"submit\" value=\"조회하기\" style=\"background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;\"></li>\r\n");
      out.write("\t\t\t\t\t<li><button type=\"button\" id=\"productInsert\" style=\"background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;\">상품등록</button></li>\r\n");
      out.write("\t\t        </ul>\r\n");
      out.write("\t        ");
} 
      out.write("\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr clear=\"both\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<section id=area>\r\n");
      out.write("        <article>\r\n");
      out.write("            <table id=\"product_table\">\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\t                <th>번호</th> <th>상품번호</th> <th>상품명</th> <th>상품종류</th> <th>정가</th> <th>할인율</th> <th>판매가</th> \r\n");
      out.write("\t                <th>펀딩 진행 유무</th> <th>펀딩 시작 날짜</th> <th>펀딩 종료 날짜</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
if(!list.isEmpty()) { 
      out.write("\r\n");
      out.write("\t            ");
for(Product p : list) {
	            	int retailPrice = p.getRetailPrice();
	            	int pPrice = p.getpPrice();
	            
      out.write("\r\n");
      out.write("\t            <tr align=\"center\">\r\n");
      out.write("\t            \t<input type=\"hidden\" value=\"");
      out.print(p.getpNo() );
      out.write("\">\r\n");
      out.write("\t            \t<td>");
      out.print(p.getrNum() );
      out.write("</td> <td>");
      out.print(p.getpNo() );
      out.write("</td> <td>");
      out.print(p.getpName() );
      out.write("</td> <td>");
      out.print(p.getpCategory() );
      out.write("</td> <td>");
      out.print(formatter.format(retailPrice) );
      out.write("</td> <td>");
      out.print(p.getDcRate() );
      out.write("%</td> <td>");
      out.print(formatter.format(pPrice) );
      out.write("</td> <td>");
      out.print(p.getfYn() );
      out.write("</td> <td>");
      out.print(p.getfStartDate() );
      out.write("</td> <td>");
      out.print(p.getfEndDate() );
      out.write("</td>\r\n");
      out.write("\t            \t\r\n");
      out.write("\t            </tr>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                ");
} else if(list.isEmpty()) { 
      out.write("\r\n");
      out.write("                <tr align=\"center\">\r\n");
      out.write("\t            \t\r\n");
      out.write("\t            \t<td colspan=\"10\" align=\"center\">");
      out.print(msg );
      out.write("</td> \r\n");
      out.write("\t            \t\r\n");
      out.write("\t            </tr>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t        \r\n");
      out.write("\t        \r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t$(\"#product_table td\").mouseenter(function() {\r\n");
      out.write("\t\t\t\t\t$(this).parent().css({\"background\" : \"darkgrey\",\"cursor\" : \"pointer\"});\r\n");
      out.write("\t\t\t\t}).mouseout(function() {\r\n");
      out.write("\t\t\t\t\t$(this).parent().css({\"background\" : \"white\"});\r\n");
      out.write("\t\t\t\t}).click(function() {\r\n");
      out.write("\t\t\t\t\tvar pNo = $(this).parent().children(\"input\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/admin/productDetail?pNo=\"+ pNo\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#productInsert\").click(function(){\r\n");
      out.write("\t\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/views/admin/adminProductInsert.jsp\";\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#f_start_date\").val(new Date().toDateInputValue());\r\n");
      out.write("\t\t\t\t$(\"#f_end_date\").val(new Date().toDateInputValue());\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t        <br><br>\r\n");
      out.write("\t        ");
if(product == null) { 
      out.write("\r\n");
      out.write("\t        <div id=\"pageBtn\" align=\"center\">\r\n");
      out.write("\t        \t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/mainView?currentPage=");
      out.print(1 );
      out.write("'\"> << </button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
if(currentPage <= 1) { 
      out.write("\r\n");
      out.write("\t        \t\t<button disabled> < </button>\r\n");
      out.write("\t        \t");
} else {
      out.write("\r\n");
      out.write("\t        \t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/mainView?currentPage=");
      out.print(currentPage-1);
      out.write("'\"> < </button>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t");
for(int p = startPage; p<=endPage; p++) { 
      out.write("\r\n");
      out.write("\t        \t");
	if(p == currentPage) { 
      out.write("\r\n");
      out.write("\t        \t\t\t<button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
	} else{ 
      out.write("\r\n");
      out.write("\t        \t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/mainView?currentPage=");
      out.print(p);
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t        \t");
} 
      out.write("\t\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
if(currentPage == maxPage) {
      out.write("\r\n");
      out.write("\t        \t\t<button disabled> > </button>\r\n");
      out.write("\t        \t");
} else { 
      out.write("\r\n");
      out.write("\t        \t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/mainView?currentPage=");
      out.print(currentPage+1 );
      out.write("'\"> > </button>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/mainView?currentPage=");
      out.print(maxPage);
      out.write("'\"> >> </button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        ");
} else { 
      out.write("\r\n");
      out.write("\t        \r\n");
      out.write("\t        <div id=\"pageBtn\" align=\"center\">\r\n");
      out.write("\t        \t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/mainView?currentPage=");
      out.print(1 );
      out.write("&p_no=");
      out.print(product.getpNo());
      out.write("&b_no=");
      out.print(product.getbNo());
      out.write("&s_no=");
      out.print(product.getsNo());
      out.write("&p_name=");
      out.print(product.getpName());
      out.write("&pCategory=");
      out.print(product.getpCategory());
      out.write("&p_price=");
      out.print(product.getpPrice());
      out.write("&f_start_date=");
      out.print(product.getfStartDate());
      out.write("&f_end_date=");
      out.print(product.getfEndDate());
      out.write("&f_yn");
      out.print(product.getfYn());
      out.write("'\"> << </button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
if(currentPage <= 1) { 
      out.write("\r\n");
      out.write("\t        \t\t<button disabled> < </button>\r\n");
      out.write("\t        \t");
} else {
      out.write("\r\n");
      out.write("\t        \t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/mainView?currentPage=");
      out.print(currentPage-1);
      out.write("&p_no=");
      out.print(product.getpNo());
      out.write("&b_no=");
      out.print(product.getbNo());
      out.write("&s_no=");
      out.print(product.getsNo());
      out.write("&p_name=");
      out.print(product.getpName());
      out.write("&pCategory=");
      out.print(product.getpCategory());
      out.write("&p_price=");
      out.print(product.getpPrice());
      out.write("&f_start_date=");
      out.print(product.getfStartDate());
      out.write("&f_end_date=");
      out.print(product.getfEndDate());
      out.write("&f_yn=");
      out.print(product.getfYn());
      out.write("'\"> < </button>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t");
for(int p = startPage; p<=endPage; p++) { 
      out.write("\r\n");
      out.write("\t        \t");
	if(p == currentPage) { 
      out.write("\r\n");
      out.write("\t        \t\t\t<button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
	} else{ 
      out.write("\r\n");
      out.write("\t        \t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/mainView?currentPage=");
      out.print(p);
      out.write("&p_no=");
      out.print(product.getpNo());
      out.write("&b_no=");
      out.print(product.getbNo());
      out.write("&s_no=");
      out.print(product.getsNo());
      out.write("&p_name=");
      out.print(product.getpName());
      out.write("&pCategory=");
      out.print(product.getpCategory());
      out.write("&p_price=");
      out.print(product.getpPrice());
      out.write("&f_start_date=");
      out.print(product.getfStartDate());
      out.write("&f_end_date=");
      out.print(product.getfEndDate());
      out.write("&f_yn=");
      out.print(product.getfYn());
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t        \t");
} 
      out.write("\t\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
if(currentPage == maxPage) {
      out.write("\r\n");
      out.write("\t        \t\t<button disabled> > </button>\r\n");
      out.write("\t        \t");
} else { 
      out.write("\r\n");
      out.write("\t        \t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/mainView?currentPage=");
      out.print(currentPage+1 );
      out.write("&p_no=");
      out.print(product.getpNo());
      out.write("&b_no=");
      out.print(product.getbNo());
      out.write("&s_no=");
      out.print(product.getsNo());
      out.write("&p_name=");
      out.print(product.getpName());
      out.write("&pCategory=");
      out.print(product.getpCategory());
      out.write("&p_price=");
      out.print(product.getpPrice());
      out.write("&f_start_date=");
      out.print(product.getfStartDate());
      out.write("&f_end_date=");
      out.print(product.getfEndDate());
      out.write("&f_yn=");
      out.print(product.getfYn());
      out.write("'\"> > </button>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/mainView?currentPage=");
      out.print(maxPage);
      out.write("&p_no=");
      out.print(product.getpNo());
      out.write("&b_no");
      out.print(product.getbNo());
      out.write("&s_no");
      out.print(product.getsNo());
      out.write("&p_name");
      out.print(product.getpName());
      out.write("&pCategory");
      out.print(product.getpCategory());
      out.write("&p_price");
      out.print(product.getpPrice());
      out.write("&f_start_date");
      out.print(product.getfStartDate());
      out.write("&f_end_date");
      out.print(product.getfEndDate());
      out.write("&f_yn");
      out.print(product.getfYn());
      out.write("'\"> >> </button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        ");
} 
      out.write("\r\n");
      out.write("\t    </article>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
