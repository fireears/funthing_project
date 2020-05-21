/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-20 15:24:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.*;
import java.util.ArrayList;
import board.model.vo.*;

public final class adminMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589986584055L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("board.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("member.model.vo");
    _jspx_imports_classes = new java.util.HashSet<>();
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

	ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
	String userName = (String)request.getAttribute("userName");
	String userId = (String)request.getAttribute("userId");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\t<style>\r\n");
      out.write("      h2{text-align:center;}\r\n");
      out.write("      form{height: 100px; background-color: rgb(199, 196, 196);}\r\n");
      out.write("      #nav_section{margin:auto; width: 60%;}\r\n");
      out.write("      #nav_section ul{height: 100px; margin: auto; width: 100%; padding: 0px;}\r\n");
      out.write("      #nav_section ul li{float: left; list-style-type: none; padding-left: 50px; padding-right: 50px; font-size:18px; line-height: 100px; }\r\n");
      out.write("      #nav_section ul li .box{width: 300px; height:30px;}\r\n");
      out.write("      #nav_section ul li:last-child { float:right;}\r\n");
      out.write("      \r\n");
      out.write("      #area{margin: auto; width: 100%;}\r\n");
      out.write("      #area table{width: 100%; border: 1px solid;}\r\n");
      out.write("      #area table th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}\r\n");
      out.write("      #area table tr button{width: 80%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255);}\r\n");
      out.write("      \r\n");
      out.write("      /* 상품계시판 밑에 버튼 */\r\n");
      out.write("      #pageBtn{margin:auto; width:48%;}\r\n");
      out.write("      #pageBtn>button{margin:auto; width:4.2%; height:30px; text-align: center;}\r\n");
      out.write("      .pageBtn {border: 0; font-size: middle; background: white; cursor: pointer;}\r\n");
      out.write("      \r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("                        <li><button type=\"button\" onclick=\"reviewManage\">리뷰관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"qnaManage();\">1:1문의 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"pointManage();\">포인트</button></li>\n");
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
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction qnaManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/personalQna\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction pointManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
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
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<h2>회원관리</h2>\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/admin/memberList\" method=\"GET\">\r\n");
      out.write("\t\t<div id=\"nav_section\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><lable>회원 이름 : </lable><input type=\"text\" class=\"box\" id=\"userName\" name=\"userName\"></li>\r\n");
      out.write("\t\t\t\t<li><lable>회원 아이디 : </lable><input type=\"text\" class=\"box\" id=\"userId\" name=\"userId\"></li>\r\n");
      out.write("\t\t\t\t<li><input id=\"btn\" type=\"submit\" value=\"조회하기\" style=\"background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr clear=\"both\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=area>\r\n");
      out.write("\t\t<article>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t");
 if(!list.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>회원번호</th>\r\n");
      out.write("                    <th>아이디</th>\r\n");
      out.write("                    <th>성명</th>\r\n");
      out.write("                    <th>생년월일</th>\r\n");
      out.write("                    <th>이메일</th>\r\n");
      out.write("                    <th>휴대폰번호</th>\r\n");
      out.write("                    <th>회원가입날짜</th>\r\n");
      out.write("                    <th>추천인</th>\r\n");
      out.write("                    <th>알람수신동의여부</th>\r\n");
      out.write("                    <th>등급코드</th>\r\n");
      out.write("                    <th>적립금</th>\r\n");
      out.write("                    <th>누적결제금액</th>\r\n");
      out.write("                    <th>회원탈퇴유무</th>\r\n");
      out.write("                    <th>변경</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("                ");
 for(Member b : list){ 
      out.write("\r\n");
      out.write("                <tr align=\"center\">\r\n");
      out.write("                \t<input type=\"hidden\" value=\"");
      out.print( b.getRnum());
      out.write("\">\r\n");
      out.write("                    <td>");
      out.print(b.getmNo() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getmId() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getmName() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getbDay() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getmEmail() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getmTell() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getJoinDate() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getReference() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getAlarm_YN() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getGradeCode() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getmPoint() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.gethPoint() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(b.getStatus_YN() );
      out.write("</td>\r\n");
      out.write("                    <td><button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/modify?userId=");
      out.print( b.getmId());
      out.write("';\">수정</button></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("                ");
}else{ 
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\t                <th>회원번호</th>\r\n");
      out.write("                    <th>아이디</th>\r\n");
      out.write("                    <th>성명</th>\r\n");
      out.write("                    <th>생년월일</th>\r\n");
      out.write("                    <th>이메일</th>\r\n");
      out.write("                    <th>휴대폰번호</th>\r\n");
      out.write("                    <th>회원가입날짜</th>\r\n");
      out.write("                    <th>추천인</th>\r\n");
      out.write("                    <th>알람수신동의여부</th>\r\n");
      out.write("                    <th>등급코드</th>\r\n");
      out.write("                    <th>적립금</th>\r\n");
      out.write("                    <th>누적결제금액</th>\r\n");
      out.write("                    <th>회원탈퇴유무</th>\r\n");
      out.write("                    <th>변경</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr style=\"margin-top:30px;\">\r\n");
      out.write("                \t<td colspan=\"6\"><div style=\"text-align:center\">검색 결과가 없습니다. 다시 검색해주세요.</div></td>\r\n");
      out.write("                </tr>\t\r\n");
      out.write("               \t\r\n");
      out.write("                ");
} 
      out.write("\r\n");
      out.write("       \t\t</table>\r\n");
      out.write("       \t\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("        \t<div id=\"pageBtn\" align=\"center\">\r\n");
      out.write("        \t<!--  페이징 처리 -->\r\n");
      out.write("\t        \t<button class=\"pageBtn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("//admin/memberList?currentPage=");
      out.print(1);
      out.write("&userName=");
      out.print(userName);
      out.write("&userId=");
      out.print(userId);
      out.write("'\"> << </button>\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
if(currentPage <= 1){ 
      out.write("\r\n");
      out.write("\t        \t<button class=\"pageBtn\" disabled> < </button>\r\n");
      out.write("\t        \t");
}else{ 
      out.write("\r\n");
      out.write("\t        \t<button class=\"pageBtn\" onclick=\"location.href=;");
      out.print(request.getContextPath() );
      out.write("/admin/memberList?currentPage=");
      out.print(currentPage-1 );
      out.write("&userName=");
      out.print(userName);
      out.write("&userId=");
      out.print(userId);
      out.write("'\"> < </button>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
for(int p = startPage; p <= endPage; p++){ 
      out.write("\r\n");
      out.write("\t        \t\t");
if(p == currentPage){ 
      out.write("\r\n");
      out.write("\t        \t\t\t<button class=\"pageBtn\" disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t        \t\t");
}else{ 
      out.write("\r\n");
      out.write("\t        \t\t\t<button class=\"pageBtn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/memberList?currentPage=");
      out.print(p );
      out.write("&userName=");
      out.print(userName);
      out.write("&userId=");
      out.print(userId);
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t        \t\t");
} 
      out.write("\r\n");
      out.write("\t        \t");
} 
      out.write("\t\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");
if(currentPage == maxPage) { 
      out.write("\r\n");
      out.write("\t        \t\t<button class=\"pageBtn\" disabled> > </button>\r\n");
      out.write("\t        \t");
}else{ 
      out.write("\r\n");
      out.write("\t        \t\t<button class=\"pageBtn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/memberList?currentPage=");
      out.print(currentPage+1 );
      out.write("&userName=");
      out.print(userName);
      out.write("&userId=");
      out.print(userId);
      out.write("'\"> > </button>\r\n");
      out.write("\t        \t");
} 
      out.write("\r\n");
      out.write("\t        \t<button class=\"pageBtn\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/memberList?currentPage=");
      out.print(maxPage );
      out.write("&userName=");
      out.print(userName);
      out.write("&userId=");
      out.print(userId);
      out.write("'\"> >> </button>\r\n");
      out.write("       \t\t</div>\r\n");
      out.write("    \t</article>\r\n");
      out.write("\t</section>\r\n");
      out.write("</body>\r\n");
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
