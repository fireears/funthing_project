/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-21 00:08:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import member.model.vo.Member;

public final class myPageMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1589892672357L));
    _jspx_dependants.put("/views/member/../common/myPageSide.jsp", Long.valueOf(1590019627973L));
    _jspx_dependants.put("/views/member/../common/myPageHeader.jsp", Long.valueOf(1589628483771L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1589628484051L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>myPage</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.r-cont-header {width: 100%;padding: 50px 20px;border-top: 7px solid #0f4a7e;border-bottom: 1px solid #0f4a7e;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.r-cont-header:after {clear: both;content: \"\";display: block;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.r-cont-header2 {width: 30%;margin: 0 0 0 0;margin-right: 0;padding: 0 0 0 0;float: left;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.r-cont-header span {width: 500px;color: cadetblue;font-weight: 200;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.r-cont-header h2 {font-size: 24px;font-weight: 200;color: #003148;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 적립금 아이콘 부분 div */\r\n");
      out.write("\t\t.r-cont-header-images {width: 70%;text-align: center;margin-right: 0;float: right;margin-top: 0;text-align: center;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 적립금 아이콘 부분 div */\r\n");
      out.write("\t\t.r-cont-header-images h4 {margin: 0;padding-bottom: 10px;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 적립금 아이콘 */\r\n");
      out.write("\t\t#header-images {width: 60px;height: 60px;opacity: 0.5;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t /* 주문 현황 부분 */\r\n");
      out.write("\t\t.order {padding-left: 20px;width: 100%;margin: 60px 0;}\r\n");
      out.write("\t\t.order-cont {padding-bottom: 30px;}\r\n");
      out.write("\t\t.order-cont span {font-size: 13px;font-weight: 100;}\r\n");
      out.write("\t\t/* 주문 현황의 아이콘 있는 영역 */\r\n");
      out.write("\t\t.order-icon {height: 200px;border-left: 0.5px solid lightgray;border-right: 0.5px solid lightgray;border-top: 1px solid #0f4a7e;border-bottom: 0.5px solid lightgray;}\r\n");
      out.write("\t\t/* 주문 현황의 주문 진행과정 */\r\n");
      out.write("\t\t.order-icon span {line-height: 20px;margin: 67px;color: #666;font-weight: bold;}\r\n");
      out.write("\t\t.order-icon-pro {margin-top: 40px;} \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 최근 주문 정보 */\r\n");
      out.write("\t\t.recent {padding-left: 20px;width: 100%;margin: 60px 0;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent span {font-size: 13px;font-weight: 100;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent-tb {margin-top: 30px;border-top: 2px solid #0f4a7e;width: 100%;border-bottom: 1px solid #0f4a7e;line-height: 50px;border-collapse: collapse;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent-tb th {border-bottom: 1px solid #0f4a7e;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent-tb tr {border: 0;padding: 0;border-bottom: 1px solid #bbb;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent-tb td {text-align: center;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent-tb .tb-first {width: 200px;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.recent-tb .tb-last {width: 200px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

    	Member loginUser = (Member)session.getAttribute("loginUser");
    
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<title>Insert title here</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/main.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\">\n");
      out.write("\t    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/slick/slick.css\"/>\n");
      out.write("\t    <!-- Add the new slick-theme.css if you want the default styling -->\n");
      out.write("\t    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/slick/slick-theme.css\"/>\n");
      out.write("\t\t\n");
      out.write("  \t\t  <script src=\"https://kit.fontawesome.com/39b470622c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/action.js\"></script>\n");
      out.write("\t\t<!--script src=\"<!--%=request.getContextPath()%>/js/swiper.min.js\"></script-->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/slick/slick.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<header id=\"header\">\n");
      out.write("\t        <div class=\"menu-wrap\">\n");
      out.write("\t            <div class=\"log-menu\">\n");
      out.write("\t            \n");
      out.write("\t            ");
 if(loginUser != null){ 
      out.write("\n");
      out.write("\t                <ul class=\"log-sec login\">\n");
      out.write("\t                ");
if(loginUser.getmId().equals("master")){ 
      out.write("\n");
      out.write("\t                \t<li class=\"master\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/mainView\">MASTER</a></li>\n");
      out.write("\t                \t");
} 
      out.write("\n");
      out.write("\t                    <li><a href=\"#none\">HELP</a></li>\n");
      out.write("\t                    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/logout.me\">LOGOUT</a></li>\n");
      out.write("\t                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/myPageMain.jsp\">MY PAGE</a></li>\n");
      out.write("\t                    <li><a href=\"#none\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t                ");
 }else{ 
      out.write("\n");
      out.write("\t                <ul class=\"log-sec logout\">\n");
      out.write("\t                    <li><a href=\"#none\">HELP</a></li>\n");
      out.write("\t                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberJoin.jsp\">JOIN</a></li>\n");
      out.write("\t                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberLogin.jsp\">LOGIN</a></li>\n");
      out.write("\t                    <li><a href=\"#none\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t                ");
 } 
      out.write("\n");
      out.write("\t                \n");
      out.write("\t            </div>\n");
      out.write("\t        </div>\n");
      out.write("\t        <div id=\"nav-wrap\">\n");
      out.write("\t            <div class=\"logo-wrap\">\n");
      out.write("\t                <h1 class=\"logo\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/index.jsp\">FUN-THING</a></h1>\n");
      out.write("\t                \n");
      out.write("\t                <div class=\"search-box\"><span><i class=\"fas fa-search\"></i></span></div>\n");
      out.write("\t                \n");
      out.write("\t            </div>\n");
      out.write("\t            <nav id=\"nav\">\n");
      out.write("\t                <ul>\n");
      out.write("\t                    <li>\n");
      out.write("\t                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/WomenServlet?type=");
      out.print(0);
      out.write("\">WOMAN</a>\n");
      out.write("\t                        <ul class=\"sub-menu\">\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/WomenServlet?type=");
      out.print(1);
      out.write("'\">OUTER</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">TOP</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">BOTTOM</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">JEAN</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">ONEPIECE</a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </li>\n");
      out.write("\t                    <li>\n");
      out.write("\t                    \n");
      out.write("\t                        <a href=\"#none\">MAN</a>\n");
      out.write("\t                        <ul class=\"sub-menu\">\n");
      out.write("\t                            <li><a href=\"#none\">OUTER</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">TOP</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">BOTTOM</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">JEAN</a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </li>\n");
      out.write("\t                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CalendarSelect\">CALENDAR</a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t            </nav>\n");
      out.write("\t        </div>\n");
      out.write("\t        <!-- nav end -->\n");
      out.write("\t    </header>\n");
      out.write("\t    \n");
      out.write("\t    <div class=\"searchWrap\">\n");
      out.write("\t        <form id=\"search\" action=\"");
      out.print(request.getContextPath() );
      out.write("/MainSearch\" method=\"GET\">\n");
      out.write("\t        \n");
      out.write("\t            <input type=\"text\" id=\"search\" name=\"search\" /><button type=\"submit\" id=\"submitBtn\" style=\"background-color:transparent; border:0px;\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("\t        </form>\n");
      out.write("\t        <div class=\"close\"><i class=\"fas fa-times\"></i></div>\n");
      out.write("\t    </div>\n");
      out.write("\t</body>\n");
      out.write("\t \n");
      out.write("\t<script>\n");
      out.write("\t\t//헤더 상단 고정\n");
      out.write("\t\tvar headerTop = $(\"#header\").offset();\n");
      out.write("\t\tconsole.log(headerTop);\n");
      out.write("\t\t$(window).scroll(function(){\n");
      out.write("\t\t  if($(document).scrollTop() > headerTop.top){\n");
      out.write("\t\t    $(\"#header\").addClass(\"fixed\");\n");
      out.write("\t\t  }else{\n");
      out.write("\t\t    $(\"#header\").removeClass(\"fixed\");\n");
      out.write("\t\t  }\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 검색창 클릭 시\n");
      out.write("\t\t$(\".search-box\").click(function(){\n");
      out.write("\t\t    $(\".searchWrap\").show();\n");
      out.write("\t\t    $('html').css({'overflow': 'hidden', 'height': '100%'});\n");
      out.write("\t\t    $('#element').on('scroll touchmove mousewheel', function(event) {\n");
      out.write("\t\t      event.preventDefault();\n");
      out.write("\t\t      event.stopPropagation();\n");
      out.write("\t\t      return false;\n");
      out.write("\t\t    });\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 검색창 열렸을 때 닫기\n");
      out.write("\t\t$(\".searchWrap .close\").click(function(){\n");
      out.write("\t\t  $(\".searchWrap\").hide();\n");
      out.write("\t\t  $('html').css({'overflow': 'scroll', 'height': '100%'});\n");
      out.write("\t\t  $('#element').off('scroll touchmove mousewheel');\n");
      out.write("\t\t\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//nav menu\n");
      out.write("\t\t$(\"#nav > ul > li .sub-menu\").hide();\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#nav > ul > li\").hover(function(){\n");
      out.write("\t\t  $(this).children(\".sub-menu\").stop().slideDown();\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t  $(this).children(\".sub-menu\").stop().slideUp();\n");
      out.write("\t\t\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>myPage</title>\r\n");
      out.write("    <script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        a { text-decoration:none; color:#666; }\r\n");
      out.write("\r\n");
      out.write("        ul {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            margin-block-start: 0;\r\n");
      out.write("            margin-block-end: 0;\r\n");
      out.write("            margin-inline-start: 0px;\r\n");
      out.write("            margin-inline-end: 0px;\r\n");
      out.write("            padding-inline-start: 0px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1, h2, h3, h4, h5, h6 {\r\n");
      out.write("            padding:0;\r\n");
      out.write("            margin:0;\r\n");
      out.write("        }\r\n");
      out.write("        body{\r\n");
      out.write("        \tmargin:0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header-mypage{\r\n");
      out.write("            position: relative; \r\n");
      out.write("            background-color:#30586e;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 220px;\r\n");
      out.write("            margin-bottom: 0px;\r\n");
      out.write("            clear: both;\r\n");
      out.write("            text-align:center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header-mypage .area h2{\r\n");
      out.write("            display: block;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            letter-spacing: 2.9px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding-bottom: 20px;\r\n");
      out.write("            padding-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header-mypage .area h4{\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-weight: 200;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            padding: 0 20px 0 7px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #side{\r\n");
      out.write("           /* display: table-cell; */\r\n");
      out.write("           vertical-align: top;\r\n");
      out.write("           /* width: calc(100% *(288/1420)); */\r\n");
      out.write("           width:20%;\r\n");
      out.write("           padding-right: 0;\r\n");
      out.write("           float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul li{\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            line-height: 35px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #content { width:1460px; margin:0 auto; }\r\n");
      out.write("        #content:after { clear:both; content:\"\"; display:block; }\r\n");
      out.write("\r\n");
      out.write("        .mypage-lnb { \r\n");
      out.write("            margin: 60px 0 0; \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .mypage-lnb h2 { \r\n");
      out.write("            border-top:1px solid #bbb; \r\n");
      out.write("            border-bottom:1px solid #bbb; \r\n");
      out.write("            padding:20px 0; \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .mypage-lnb h3 { \r\n");
      out.write("            padding:20px 0; \r\n");
      out.write("            color:#0f4a7e; \r\n");
      out.write("            position:relative; \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .mypage-lnb h3:after { \r\n");
      out.write("            display:block; \r\n");
      out.write("            content:\"\"; \r\n");
      out.write("            clear:both; \r\n");
      out.write("            width:30px; \r\n");
      out.write("            height:1px; \r\n");
      out.write("            background:#0f4a7e;/* h3 밑에 있는 선 컬러 */ \r\n");
      out.write("            position:absolute; \r\n");
      out.write("            bottom:2px; \r\n");
      out.write("            left:0; \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .mypage-lnb ul { margin-bottom:20px; }\r\n");
      out.write("   \r\n");
      out.write("        \r\n");
      out.write("        #r-cont{\r\n");
      out.write("           float:left;\r\n");
      out.write("           width:76%;\r\n");
      out.write("            padding: 20px 0; \r\n");
      out.write("            margin-top: 60px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            margin-left:4%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- 마이페이지의 header 부분 (보류)-->\r\n");
      out.write("    <div class=\"header-mypage\"> \r\n");
      out.write("       <div class=\"area\">\r\n");
      out.write("            <h2>MY PAGE</h2>\r\n");
      out.write("            <br>\r\n");
      out.write("            <h4>Home - MyPage</h4>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<!-- 오른쪽 컨텐츠 영역 -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");

	Member loginUser2 = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"side\">\r\n");
      out.write("            <div class=\"lnb mypage-lnb\">\r\n");
      out.write("                <h2><a href=#\">MY PAGE</a></h2>\r\n");
      out.write("                <h3>쇼핑정보</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">주문목록/배송조회</a></li>\r\n");
      out.write("                    <li><a href=\"#\">취소내역</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>혜택관리</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">회원등급혜택안내</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/memberPointServlet?userNo=");
      out.print(loginUser2.getmNo());
      out.write("\">적립금</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>문의내역</h3>\r\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/PersonalQnA?userNo=");
      out.print(loginUser2.getmNo());
      out.write("\">1:1 문의</a></li>\r\n");
      out.write("                     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/productQnaList?mNo=");
      out.print(loginUser2.getmNo());
      out.write("\">나의 상품문의</a></li>\n");
      out.write("                    <li><a href=\"#\">나의 리뷰</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>회원정보</h3>\r\n");
      out.write("\n");
      out.write("                <ul>                          \r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/myPage.me?userId=");
      out.print(loginUser2.getmId());
      out.write("\">회원정보 변경</a></li>\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- side end -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<div id=\"r-cont\">\r\n");
      out.write("\t\t\t<!-- 오른쪽 컨텐츠 수정 영역  -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- 오른쪽 컨텐츠 헤더 영역-->\r\n");
      out.write("\t\t\t\t\t<div class=\"r-cont-header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"r-cont-header2\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>신희지님의</span> 회원등급은\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong style=\"color: #0f4a7e;\">HAGO VIP</strong> 등급 입니다.\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"r-cont-header-images\">\r\n");
      out.write("\t\t\t\t\t\t\t<img id=\"header-images\" src=\"../images/business.png\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>적립금</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 여기에 DB에서 회원 적립금 가져오기 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 오른쪽 컨텐츠 헤더 end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <!-- 주문 현황\r\n");
      out.write("\t\t\t\t\t<div class=\"order\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"order-cont\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 style=\"color: #0f4a7e;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t주문 현황 &nbsp; <span>최근 30일 이내에 진행중인 주문 정보 입니다.</span>\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"order-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t결제 아이콘 start\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"order-icon-pro\">\r\n");
      out.write("\t\t\t\t\t\t\t\t결제 순서 영역\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>입금대기</span> <span>결제완료</span> <span>상품준비중</span> <span>배송중</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>배송완료</span> <span>구매확정</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"order-cont-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t동그라미 부분\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t결제 아이콘 end\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t주문현황 end --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 최근 주문 내역 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"recent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"recent-cont\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 style=\"color: #0f4a7e;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t최근 주문 내역 &nbsp; <span>최근 30일 내에 주문하신 내역입니다.</span>\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table class=\"recent-tb\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"tb-first\">날짜/주문정보</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>상품명/옵션</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>상품금액/수량</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>주문상태</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th class=\"tb-last\">확인/리뷰</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 최근 주문 내역 end -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--오른쪽 컨텐츠 영역 end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<footer id=\"footer\">\n");
      out.write("\t        <div class=\"footer-wrap\">\n");
      out.write("\t            <div class=\"ft-top\">\n");
      out.write("\t                <ul>\n");
      out.write("\t                    <li><a href=\"#none\">고객센터</a></li>\n");
      out.write("\t                    <li><a href=\"#none\">서비스이용약관</a></li>\n");
      out.write("\t                    <li><a href=\"#none\"><b>개인정보취급방침</b></a></li>\n");
      out.write("\t                    <li><a href=\"#none\">이용안내</a></li>\n");
      out.write("\t                    <li><a href=\"#none\">광고/제휴문의</a></li>\n");
      out.write("\t                    <li><a href=\"#none\">사업자정보확인</a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t            </div>\n");
      out.write("\t            <div class=\"ft-bottom\">\n");
      out.write("\t                <p class=\"ft-logo\">FUN-THING</p>\n");
      out.write("\t                <div class=\"ft-cont\">\n");
      out.write("\t                    <span>(주)볼빨간조</span><span>대표 : 최상원</span><span>서울 강남구 테헤란로14길 6 남도빌딩 2층 B Class</span><span>통신판매업 신고번호 : 신고 준비중</span><br/>\n");
      out.write("\t                    <span>사업자번호 : 123-77-4567</span><span>개인정보관리책임자 : 조한솔</span><span>고객센터 대표전화 : 1234-5678</span><span>이메일 : rngus3698@naver.com</span>\n");
      out.write("\t                    <p class=\"copyright\">COPYRIGHTS 2020 FUNTHING. ALL RIGHTS RESERVED</p>\n");
      out.write("\t                </div>\n");
      out.write("\t\n");
      out.write("\t            </div>\n");
      out.write("\t        </div>\n");
      out.write("\t    </footer>\n");
      out.write("\t</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
