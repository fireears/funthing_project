/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-25 02:48:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.personalQnA;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import personalQnA.model.vo.*;
import member.model.vo.*;
import member.model.vo.Member;
import member.model.vo.Member;
import member.model.vo.Member;

public final class myPagePersonalDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/views/personalQnA/../common/header.jsp", Long.valueOf(1590366890804L));
    _jspx_dependants.put("/views/personalQnA/../common/myPageHeader.jsp", Long.valueOf(1590307513404L));
    _jspx_dependants.put("/views/personalQnA/../common/myPageSide.jsp", Long.valueOf(1590307597875L));
    _jspx_dependants.put("/views/personalQnA/../common/footer.jsp", Long.valueOf(1589628484051L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("personalQnA.model.vo");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("member.model.vo");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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

      out.write("<!-- 일대일 문의 디테일 페이지(클라이언트)_희지 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	PersonalQnA pq = (PersonalQnA)request.getAttribute("pq");


      out.write("   \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\r\n");
      out.write("    <script src=\"https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit\"\r\n");
      out.write("    async defer></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .qna11 .q1_title h2 { color:#0f4a7e; line-height:3; border-top:1px solid #aaa; border-bottom:1px solid #aaa; }\r\n");
      out.write("        .q1_wrap { margin-top:40px;  }\r\n");
      out.write("        .q1_wrap table { border-collapse: collapse; width:100%; border-top:2px solid #aaa; border-bottom:2px solid #aaa; margin:30px;}\r\n");
      out.write("        .q1_wrap table tr { border-bottom:1px solid #aaa; width:100%; }\r\n");
      out.write("        .q1_wrap table tr td:nth-child(1) { width:30%; box-sizing:border-box; padding-left:20px; line-height:3; font-weight:700; background:#eee; color:#0f4a7e; }   \r\n");
      out.write("        .q1_wrap table tr td:nth-child(2) { width:70%; box-sizing:border-box; padding:8px 14px 8px; }\r\n");
      out.write("        .q1_wrap table button { width:80px; height:26px; line-height:26px; background:#0f4a7e; border:1px solid #aaa; color:#fff; margin-left:10px; }\r\n");
      out.write("\r\n");
      out.write("        .q1_wrap .q1_text { font-size:14px; color:#777; }\r\n");
      out.write("        .q1_wrap input { height:24px; width:100%; }\r\n");
      out.write("        .q1_wrap textarea { resize: none; width:100%; }\r\n");
      out.write("\r\n");
      out.write("        .q1_wrap .q1_btnArea { width:100%; text-align:center; margin-top:20px; }\r\n");
      out.write("        .q1_wrap .q1_btnArea .btn { margin:0 3px; width:160px; height:60px; font-size:16px; border:1px solid #ddd; background:#eee; }\r\n");
      out.write("        .q1_wrap .q1_btnArea .btn.submit { background:#0f4a7e; border:1px solid #aaa; color:#fff; }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t \r\n");
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
      out.write("\t       <div class=\"menu-wrap\">\n");
      out.write("               <div class=\"log-menu\">\n");
      out.write("               \n");
      out.write("               ");
 if(loginUser != null){ 
      out.write("\n");
      out.write("                   <ul class=\"log-sec login\">\n");
      out.write("                   ");
if(loginUser.getmId().equals("master")){ 
      out.write("\n");
      out.write("                      <li class=\"master\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/mainView\">MASTER</a></li>\n");
      out.write("                      ");
} 
      out.write("\n");
      out.write("                       <li><a href=\"#none\">HELP</a></li>\n");
      out.write("                       <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/logout.me\">LOGOUT</a></li>\n");
      out.write("                       ");
if(loginUser.getmId().equals("master")){ 
      out.write("\n");
      out.write("                       \t\t<li><a style=\"display:none;\" href=\"");
      out.print(request.getContextPath());
      out.write("/myPageMainServlet?userNoM=");
      out.print(loginUser.getmNo());
      out.write("\">MY PAGE</a></li>\n");
      out.write("                       ");
}else{ 
      out.write("\n");
      out.write("                        \t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/myPageMainServlet?userNoM=");
      out.print(loginUser.getmNo());
      out.write("\">MY PAGE</a></li>\n");
      out.write("                       ");
} 
      out.write("\n");
      out.write("                       <li><a href=\"#none\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("                   </ul>\n");
      out.write("                   ");
 }else{ 
      out.write("\n");
      out.write("                   <ul class=\"log-sec logout\">\n");
      out.write("                       <li><a href=\"#none\">HELP</a></li>\n");
      out.write("                       <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberJoin.jsp\">JOIN</a></li>\n");
      out.write("                       <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberLogin.jsp\">LOGIN</a></li>\n");
      out.write("                       <li><a href=\"#none\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("                   </ul>\n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("           </div>\n");
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
      out.write("/WomenServlet\">WOMAN</a>\n");
      out.write("\t                        <ul class=\"sub-menu\">\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/WomenOuterServlet\">OUTER</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/WomenTopServlet\">TOP</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/WomenBottomServlet\">BOTTOM</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/WomenJeanServlet\">JEAN</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/WomenOnepieceServlet\">ONEPIECE</a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </li>\n");
      out.write("\t                    <li>\n");
      out.write("\t                    \n");
      out.write("\t                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/ManServlet\">MAN</a>\n");
      out.write("\t                        <ul class=\"sub-menu\">\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/ManOuterServlet\">OUTER</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/ManTopServlet\">TOP</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/ManBottomServlet\">BOTTOM</a></li>\n");
      out.write("\t                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/ManJeanServlet\">JEAN</a></li>\n");
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
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

	Member loginUser4 = (Member)session.getAttribute("loginUser");

      out.write("\r\n");
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
      out.write("       <div class=\"area\" onclick=\"goMyPageMain();\">\r\n");
      out.write("            <h2>MY PAGE</h2>\r\n");
      out.write("            <br>\r\n");
      out.write("            <h4>Home - MyPage</h4>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction goMyPageMain(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/myPageMainServlet?userNoM=");
      out.print(loginUser4.getmNo());
      out.write("\";\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\".area\").mouseenter(function(){\r\n");
      out.write("\t\t\t\t$(this).css({\"cursor\" : \"pointer\"});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
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
      out.write("        <!-- 오른쪽 컨텐츠 영역 -->\r\n");
      out.write("\t");
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
      out.write("                <h2><a href=\"");
      out.print(request.getContextPath() );
      out.write("/myPageMainServlet?userNoM=");
      out.print(loginUser2.getmNo());
      out.write("\">MY PAGE</a></h2>\r\n");
      out.write("                <h3>쇼핑정보</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/member/myPageOrderList?userNo=");
      out.print(loginUser2.getmNo());
      out.write("\">주문목록/배송조회</a></li> <!-- 동곤이형 서블릿 -->\r\n");
      out.write("                    <li><a href=\"#\">취소내역</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>혜택관리</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/memberPointServlet?userNo=");
      out.print(loginUser2.getmNo());
      out.write("\">회원등급혜택안내</a></li>\r\n");
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
      out.write("\t<div id=\"r-cont\"> \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"qna11\">\r\n");
      out.write("        <div class=\"q1_title\">\r\n");
      out.write("            <h2>1:1 문의</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"q1_wrap\">\r\n");
      out.write("               \r\n");
      out.write("                    <input type=\"hidden\" name=\"mNo\" value=\"");
      out.print(loginUser.getmNo() );
      out.write("\"> <!-- loginUser2.getmNo()  -->\r\n");
      out.write("                    <table>\r\n");
      out.write("                     \t <tr>\r\n");
      out.write("                            <td>작성날짜</td>\r\n");
      out.write("                            <td><span>");
      out.print( pq.getPerDate() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                  \t    <tr>\r\n");
      out.write("                            <td>회원아이디</td>\r\n");
      out.write("                            <td><span>");
      out.print( pq .getmId());
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>이름</td>\r\n");
      out.write("                            <td><span>");
      out.print( pq.getmName() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                         <tr>\r\n");
      out.write("                            <td>상품번호</td>\r\n");
      out.write("                            <td><span>");
      out.print( pq.getpNo());
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>상품명</td>\r\n");
      out.write("                            <td><span>");
      out.print( pq.getpName());
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>제목</td>\r\n");
      out.write("                            <td><span>");
      out.print( pq.getPerTitle() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>내용</td>\r\n");
      out.write("                            <td><span>상품명 ");
      out.print( pq.getPerContents() );
      out.write("</span>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>작성자</td>\r\n");
      out.write("                            <td>");
      out.print(pq.getmName());
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>본문</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <span><p>");
      out.print( pq.getPerContents() );
      out.write("</p></span>\r\n");
      out.write("                           \r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                     <table id=\"replyTb\">\r\n");
      out.write("                     \t<tr> <td rowspan =\"2\">답변</td><th style=\"width:50px;\">관리자</th><th style=\"width:50px;\">답변내용</th><th style=\"width:50px;\">답변날짜</th></tr>\r\n");
      out.write("                     \t\r\n");
      out.write("                        <tr>\r\n");
      out.write("                       \r\n");
      out.write("                        <td style=\"background:white; width:50px;\" align=\"center\"><span>");
      out.print(pq.getPqreId() );
      out.write("</span></td>\r\n");
      out.write("                        <td style=\"width:50px;\" align=\"center\"><span>");
      out.print(pq.getPqreContent() );
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width:50px;\" align=\"center\"><span>");
      out.print(pq.getPqreDate() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                  \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- 다시 확인하기 -->\r\n");
      out.write("           ");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
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
      out.write("    \r\n");
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
