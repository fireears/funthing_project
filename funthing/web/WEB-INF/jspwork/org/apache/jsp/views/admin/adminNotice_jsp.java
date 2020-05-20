/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-20 03:26:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import notice.model.vo.Notice;
import board.model.vo.PageInfo;

public final class adminNotice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589897606729L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
    _jspx_imports_classes.add("board.model.vo.PageInfo");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
PageInfo pi =(PageInfo)request.getAttribute("pi");
int listCount =pi.getListCount();
int currentPage = pi.getCurrentPage();
int maxPage = pi.getMaxPage();
int startPage = pi.getStartPage();
int endPage = pi.getEndPage();



String search =(String)request.getAttribute("search");



      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <style>\r\n");
      out.write("            #noticeArea{margin: auto; width: 90%;}\r\n");
      out.write("\r\n");
      out.write("            h3{font-weight:bold; font-size: 40px;}\r\n");
      out.write("\r\n");
      out.write("            #search{width: 500px; height: 30px; border: 1px solid black; border-radius: 7px; margin-right: 30px;}\r\n");
      out.write("            #searchBtn{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}\r\n");
      out.write("\t\t\t#WriteBtn{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}\r\n");
      out.write("            #noticelistArea{width: 100%; margin-top: 40px; border: 1px solid rgb(208, 206, 206); border-collapse: collapse;}\r\n");
      out.write("            #noticelistArea>tbody>tr{border-bottom: 2px solid black; height: 30px;}\r\n");
      out.write("            #noticelistArea>tbody>tr>td{text-align: center;}\r\n");
      out.write("            #noticelistArea>tbody:first-child{height: 80px;}\r\n");
      out.write("            \r\n");
      out.write("            .pageBtn{margin-top: 10px;}\r\n");
      out.write("            .pageBtn>button{border: 0px; width: 30px; height: 30px; font-weight: 600; size: 10px;}\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("    \t");
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
      out.write("/memberList.me\";\n");
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
      out.write("    \t\r\n");
      out.write("         <section id=\"noticeArea\">\r\n");
      out.write("            <h3>LIST Search</h3>\r\n");
      out.write("            <form  method=\"GET\" action=\"");
      out.print(request.getContextPath());
      out.write("/admin/NoticeView\">\r\n");
      out.write("            <input type=\"text\" id=\"search\" name=\"noticeSearch\"  placeholder=\"검색어를 입력해주세요\"> <input type=\"submit\" id=\"searchBtn\" value=\"SEARCH\">\r\n");
      out.write("            <input type=\"Button\"  onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/views/admin/insertNotice.jsp'\"  id=\"WriteBtn\" value=\"글쓰기\">\r\n");
      out.write("            \r\n");
      out.write("            <table id=\"noticelistArea\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>NO</th> <th>제목</th> <th>작성자</th> <th>날짜</th> <th>삭제여부</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("             ");
 
             if(list!=null){
                for(int i =0;i<list.size();i++){
                	
      out.write(" <tr>  \r\n");
      out.write("\t                        <td>");
      out.print(list.get(i).getnNo());
      out.write("</td>\r\n");
      out.write("\t                        <td>");
      out.print(list.get(i).getnTitle());
      out.write("</td>\r\n");
      out.write("\t                        <td>");
      out.print(list.get(i).getnContents());
      out.write("</td>\r\n");
      out.write("\t                        <td>");
      out.print(list.get(i).getnDaatee());
      out.write("</td>\r\n");
      out.write("\t                        <td>");
      out.print(list.get(i).getnDelYn());
      out.write("</td>\r\n");
      out.write("\t                    </tr>\t\r\n");
      out.write("                  ");
}
                   }else{
                	   
      out.write("\r\n");
      out.write("                \t   <tr>\r\n");
      out.write("                \t   \t\t<td>값이 존재하지않습니다.</td>\r\n");
      out.write("                \t   </tr>\r\n");
      out.write("                \t   ");

                   }
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("\t\t\t\t");

				if(search ==null){
				
      out.write("\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t <!-- search가 널일때  -->\r\n");
      out.write("\t\t\t\t <!-- 맨 처음으로 -->\r\n");
      out.write("\t\t\t\t alert(\"전체조회\");\r\n");
      out.write("            <button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(1 );
      out.write("'\"> << </button>\r\n");
      out.write("       \r\n");
      out.write("            <!-- 이전 페이지 -->\r\n");
      out.write("            ");
if(currentPage <= 1) {
      out.write("\r\n");
      out.write("               <button disabled> < </button>\r\n");
      out.write("            ");
}else {
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(currentPage-1);
      out.write("'\"> < </button>\r\n");
      out.write("            ");
} 
      out.write("                                \r\n");
      out.write("            <!-- 10개의 페이지 목록 -->\r\n");
      out.write("            ");
for(int p = startPage; p<=endPage; p++){
            
      out.write("\r\n");
      out.write("            \t");
if(currentPage == p) {
      out.write("\r\n");
      out.write("                  <button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("               \t");
} else{
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                  <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(p);
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->\r\n");
      out.write("               ");
} 
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("\t\t\t   <!-- 다음 페이지로 -->\r\n");
      out.write("            ");
if(currentPage >= maxPage) {
      out.write("\r\n");
      out.write("               <button disabled> > </button>\r\n");
      out.write("            ");
}else { 
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(currentPage + 1);
      out.write("'\"> > </button>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            <!-- 맨 끝으로  -->\r\n");
      out.write("            <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(maxPage );
      out.write("'\"> >> </button>\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <!-- 맨 처음으로 -->\r\n");
      out.write("            <button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(1 );
      out.write("&search=");
      out.print(search);
      out.write("'\"> << </button>\r\n");
      out.write("       \r\n");
      out.write("            <!-- 이전 페이지 -->\r\n");
      out.write("            ");
if(currentPage <= 1) {
      out.write("\r\n");
      out.write("               <button disabled> < </button>\r\n");
      out.write("            ");
}else {
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(1 );
      out.write("&search=");
      out.print(search);
      out.write("'\"> < </button>\r\n");
      out.write("            ");
} 
      out.write("                                \r\n");
      out.write("            <!-- 10개의 페이지 목록 -->\r\n");
      out.write("            ");
for(int p = startPage; p<=endPage; p++){
            
if(currentPage == p) {
      out.write("\r\n");
      out.write("                  <button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("               ");
} else{
      out.write("\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("                  <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(p );
      out.write("&search=");
      out.print(search);
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->\r\n");
      out.write("               ");
} 
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("\t\t\t   <!-- 다음 페이지로 -->\r\n");
      out.write("            ");
if(currentPage >= maxPage) {
      out.write("\r\n");
      out.write("               <button disabled> > </button>\r\n");
      out.write("            ");
}else { 
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(currentPage + 1);
      out.write("&search=");
      out.print(search);
      out.write("'\"> > </button>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            <!-- 맨 끝으로  -->\r\n");
      out.write("            <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/NoticeView?currentPage=");
      out.print(maxPage );
      out.write("&search=");
      out.print(search);
      out.write("'\"> >> </button>\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
}						
				
      out.write("\r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("             <div class=\"pageinArea\" align=\"center\">\r\n");
      out.write("           \r\n");
      out.write("         </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
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
