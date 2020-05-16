/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-16 08:00:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import brand.model.vo.*;
import board.model.vo.*;

public final class adminBrand_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589522559914L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("board.model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("brand.model.vo");
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

      out.write("<!-- 브랜드 관리자 페이지_희지 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Brand> list = (ArrayList<Brand>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");

	// PageIngo값 뽑아내기
	int currentPage = pi.getCurrentPage();
	/* int listCount = pi.getBrandListCount(); */
	int limit = pi.getLimit();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>admin_brand</title>\r\n");
      out.write("    <script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        a {text-decoration:none; color:#666;} \r\n");
      out.write("\r\n");
      out.write("        ul {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            margin-block-start: 0;\r\n");
      out.write("            margin-block-end: 0;\r\n");
      out.write("            margin-inline-start: 0px;\r\n");
      out.write("            margin-inline-end: 0px;\r\n");
      out.write("            padding-inline-start: 0px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1, h2, h3, h4, h5, h6 {\r\n");
      out.write("            padding:0;\r\n");
      out.write("            margin:0;\r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("        /* 브랜드 관리 */\r\n");
      out.write("        form{height:100px; background-color:rgb(199,196,196);}\r\n");
      out.write("        \r\n");
      out.write("        #nav_section{margin: 0 auto; width:90%;}\r\n");
      out.write("        #nav_section ul{heigth:100px; margin:0 auto; width:100%; padding:0px;}\r\n");
      out.write("        #nav_section ul li{float:left; padding-left:20px; padding-right:10px; line-height:50px;}\r\n");
      out.write("      /*   .nav_section ul:after {clear:both; content:\"\"; display:block;} */\r\n");
      out.write("\t\t#nav_section ul li .box{width:150px;}\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("        /* 브랜드 조회 내역 list 영역 */\r\n");
      out.write("        .area{margin:0 auto; width:100%;}\r\n");
      out.write("        .area table{margin:0 auto; width:98%; border:1px solid;}\r\n");
      out.write("        .area table th{background-color: rgb(199,196,196); color:rgb(53,52,52);}\r\n");
      out.write("        /* 수정 삭제 버튼 */\r\n");
      out.write("        .area table tr button{width:48%; height:30px; background-color:gray; border:1px solid; border-color:white; font-weight:600; color:rgb(255,255,255);}\r\n");
      out.write("       \r\n");
      out.write("        /* 조회 & 등록 하기 버튼 */\r\n");
      out.write("        #search{background-color:gray; color:white; border-radius:5px; border:0px; width:150px; heigth: 30px; font-size:15px; padding:10px;}\r\n");
      out.write("        #insert{background-color:gray; color:white; border-radius:5px; border:0px; width:150px; heigth: 30px; font-size:15px; padding:10px;}\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t\t/* 페이징 처리 부분 */     \r\n");
      out.write("        .pagingArea{margin: 0 auto; margin-top:20px; margin-bottom:20px;}\r\n");
      out.write("        .pagingArea button{border:0; font-size:middle; background:white; cursor:pointer;}\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<title>Insert title here</title>\n");
      out.write("        <style>\n");
      out.write("            body{margin: auto; width: 100%;}\n");
      out.write("            /* #nav{margin: auto; width: 50%;} */\n");
      out.write("            #nav{background-color: rgb(199, 196, 196);}\n");
      out.write("            #nav_header{margin:auto; width:100%; height: 90px;}\n");
      out.write("            #nav_header ul li{float: left; width:7.5%; list-style-type: none; padding-right: 15px; padding-left: 15px; padding-top: 20px; line-height: auto;}\n");
      out.write("            #nav_header ul li button{width: 100%; height: 50px; background-color: gray; border-radius: 10px; border: 0px; font-size: 16px; font-weight: 600; color: white;}\n");
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
      out.write("            <div id=\"nav\">\n");
      out.write("                <div id=\"nav_header\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><button type=\"button\" onclick=\"productManage();\">상품관리</button></li>\n");
      out.write("                        <!-- <li><button>상품등록</button></li> -->\n");
      out.write("                        <li><button type=\"button\" onclick=\"orderManage();\">주문관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"\">매출관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"\">상품통계</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"memberManage();\">회원 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"brandManage();\">브랜드 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"reviewManage();\">리뷰관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"qnaManage();\">1:1문의 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"pointManage();\">포인트</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"notice();\">공지사항 게시판</button></li>\n");
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
      out.write("\t\tfunction orderManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction memberManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
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
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction pointManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction notice()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <h2 style=\"text-align: center;\">브랜드 관리</h2>\r\n");
      out.write("        <form method=\"post\" action=\"#\">\r\n");
      out.write("            <div id=\"nav_section\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><label>브랜드 코드 : </label><input type=\"text\" name=\"b_no\" class=\"box\" id=\"b_no\"></li>\r\n");
      out.write("                    <li><label>브랜드 명 : </label><input type=\"text\" name=\"b_name\" class=\"box\" id=\"b_name\"></li>\r\n");
      out.write("                    <li><button type=\"submit\" value=\"조회하기\" id=\"search\">조회하기</button></li>\r\n");
      out.write("                    <li><button id=\"insert\" type=\"button\" onclick=\"insertBrand();\">브랜드 등록</button></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("       \r\n");
      out.write("       \t<br>\r\n");
      out.write("        <hr clear=\"both\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"area\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>브랜드 코드</th>\r\n");
      out.write("                    <th>브랜드 명</th>\r\n");
      out.write("                    <th>대표 명</th>\r\n");
      out.write("                    <th>연락처</th>\r\n");
      out.write("                    <th>회사 주소</th>\r\n");
      out.write("                    <th>이메일</th>\r\n");
      out.write("                    <th>입점 날짜</th>\r\n");
      out.write("                    <th>입점 유무</th>\r\n");
      out.write("                    <th>변경</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
for(Brand b : list){ 
      out.write("\r\n");
      out.write("                <tr align=\"center\">\r\n");
      out.write("                \t<input type=\"hidden\" value=\"");
      out.print(b.getbNo() );
      out.write("\">\r\n");
      out.write("                \t<td>");
      out.print(b.getbNo() );
      out.write("</td>\r\n");
      out.write("                \t<td>");
      out.print(b.getbName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getbCeo() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getbPhone() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getbAddress() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getbEmail() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getbLchDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(b.getbLchYn() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" id=\"modifyBrand\" onclick=\"modifyBrand();\">수정</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" id=\"deleteBrand\" onclick=\"deleteBrand();\">삭제</button>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 페이징 처리 시작 -->\r\n");
      out.write("\t\t<div class=\"pagingArea\" align=\"center\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- 맨 처음으로 -->\r\n");
      out.write("\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/brandServlet?currntPage=1'\"> << </button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- 이전 페이지로 -->\r\n");
      out.write("\t\t\t");
if(currentPage == 1){ 
      out.write("\r\n");
      out.write("\t\t\t\t<button disabled> < </button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/brandServlet?currentPage=");
      out.print(currentPage -1 );
      out.write("'\"> < </button>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- 10개의 페이지 목록 -->\r\n");
      out.write("\t\t\t");
for(int p = startPage; p <= endPage; p++){ 
      out.write("\r\n");
      out.write("\t\t\t\t");
if(currentPage == p){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/brandServlet?currentPage=");
      out.print(p );
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 다음 페이지로 -->\r\n");
      out.write("\t\t\t");
if(currentPage == maxPage){ 
      out.write("\r\n");
      out.write("\t\t\t\t<button disabled> > </button>\r\n");
      out.write("\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/brandServlet?currentPage=");
      out.print(currentPage + 1 );
      out.write("'\"> > </button>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- 맨 뒷 페이지로  -->\r\n");
      out.write("\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/admin/brandServlet?currentPage=");
      out.print(maxPage );
      out.write("'\"> >> </button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    \t// 리스트 한줄 한줄 효과 주는 것\r\n");
      out.write("    \t$(\".area td\").mouseenter(function(){\r\n");
      out.write("    \t\t$(this).parent().css({\"background\" : \"darkgray\",\"cursor\" : \"pointer\"});\r\n");
      out.write("    \t}).mouseout(function(){\r\n");
      out.write("    \t\t$(this).parent().css({\"background\" : \"white\"});\r\n");
      out.write("    \t});\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t// 새로운 브랜드 등록 함수\r\n");
      out.write("    \tfunction insertBrand(){\r\n");
      out.write("    \t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/views/admin/insertBrand.jsp\";\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t// 기존 브랜드 정보 수정 함수\r\n");
      out.write("    \tfunction modifyBrand(){\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t// 브랜드 정보 삭제 함수\r\n");
      out.write("    \tfunction deleteBrand(){\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
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
