/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-16 07:23:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class orderConfirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1589610324149L));
    _jspx_dependants.put("/views/member/../common/myPageSide.jsp", Long.valueOf(1589610326702L));
    _jspx_dependants.put("/views/member/../common/myPageHeader.jsp", Long.valueOf(1589610321638L));
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <style>\r\n");
      out.write(" \r\n");
      out.write(" \t\t\t\r\n");
      out.write("            a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: #666;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            ul {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                margin-block-start: 0;\r\n");
      out.write("                margin-block-end: 0;\r\n");
      out.write("                margin-inline-start: 0px;\r\n");
      out.write("                margin-inline-end: 0px;\r\n");
      out.write("                padding-inline-start: 0px;\r\n");
      out.write("    \r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            h1,\r\n");
      out.write("            h2,\r\n");
      out.write("            h3,\r\n");
      out.write("            h4,\r\n");
      out.write("            h5,\r\n");
      out.write("            h6 {\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .header-mypage {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                background-color: #30586e;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 220px;\r\n");
      out.write("                margin-bottom: 0px;\r\n");
      out.write("                clear: both;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .header-mypage .area h2 {\r\n");
      out.write("                display: block;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                letter-spacing: 2.9px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                padding-bottom: 20px;\r\n");
      out.write("                padding-top: 50px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .header-mypage .area h4 {\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-weight: 200;\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                padding: 0 20px 0 7px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            #side {\r\n");
      out.write("                /* display: table-cell; */\r\n");
      out.write("                vertical-align: top;\r\n");
      out.write("                /* width: calc(100% *(288/1420)); */\r\n");
      out.write("                width: 20%;\r\n");
      out.write("                padding-right: 0;\r\n");
      out.write("                float: left;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            ul li {\r\n");
      out.write("                list-style: none;\r\n");
      out.write("                line-height: 35px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            #content {\r\n");
      out.write("                width: 1640px;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            #content:after {\r\n");
      out.write("                clear: both;\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .mypage-lnb {\r\n");
      out.write("                margin: 60px 0 0;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .mypage-lnb h2 {\r\n");
      out.write("                border-top: 1px solid #bbb;\r\n");
      out.write("                border-bottom: 1px solid #bbb;\r\n");
      out.write("                padding: 20px 0;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .mypage-lnb h3 {\r\n");
      out.write("                padding: 20px 0;\r\n");
      out.write("                color: #0f4a7e;\r\n");
      out.write("                position: relative;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .mypage-lnb h3:after {\r\n");
      out.write("                display: block;\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                clear: both;\r\n");
      out.write("                width: 30px;\r\n");
      out.write("                height: 1px;\r\n");
      out.write("                background: #0f4a7e;\r\n");
      out.write("                /* h3 밑에 있는 선 컬러 */\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                bottom: 2px;\r\n");
      out.write("                left: 0;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .mypage-lnb ul {\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("          \r\n");
      out.write("            #order_outer{\r\n");
      out.write("                margin:50px 0 0;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                float:left;\r\n");
      out.write("\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                padding-left:80px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .member_info {\r\n");
      out.write("                margin-top:15px;\r\n");
      out.write("                margin-bottom: 15px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .order_details {\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("                color: #30586e;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .order_num {\r\n");
      out.write("                color: grey;\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .product_info {\r\n");
      out.write("                border-top: 2px solid #30586e;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                border-bottom: 1px solid #30586e;\r\n");
      out.write("                font-size: small;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                margin-bottom: 50px;\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .product_info tr{\r\n");
      out.write("                border:0; padding:0; border-bottom:1px solid #30586e;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .product_info th {\r\n");
      out.write("                line-height:30px;\r\n");
      out.write("            }\r\n");
      out.write("    \r\n");
      out.write("            .product_info th:nth-child(1) { \r\n");
      out.write("                width:15%;\r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("            .product_info th:nth-child(2) { \r\n");
      out.write("                width:60%;\r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("            .product_info th:nth-child(3) { \r\n");
      out.write("                width:12.5%;\r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("            .product_info th:nth-child(4) { \r\n");
      out.write("                width:12.5%;\r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("            .product_info td{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                padding:10px 0;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("            .order_info tr th:nth-child(1){\r\n");
      out.write("               background:rgba(228, 226, 226, 0.767);\r\n");
      out.write("               color:rgb(65, 64, 64);\r\n");
      out.write("               width:15%;\r\n");
      out.write("            }\r\n");
      out.write("            .order_info tr td:nth-child(1){\r\n");
      out.write("                background:rgba(228, 226, 226, 0.767);\r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("            .order_info tr td{\r\n");
      out.write("                padding:5px;\r\n");
      out.write("                text-align: inherit;\r\n");
      out.write("            }\r\n");
      out.write("            .order_info tr th{\r\n");
      out.write("                padding:5px;\r\n");
      out.write("                text-align: inherit;\r\n");
      out.write("            }\r\n");
      out.write("            table{\r\n");
      out.write("                border-collapse:collapse;\r\n");
      out.write("            }\r\n");
      out.write("            td{\r\n");
      out.write("                text-align:center;\r\n");
      out.write("            }\r\n");
      out.write("            .wrap {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("  width: 140px;\r\n");
      out.write("  height: 45px;\r\n");
      out.write("  font-family: 'Roboto', sans-serif;\r\n");
      out.write("  font-size: 11px;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  letter-spacing: 2.5px;\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("  color: #000;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 45px;\r\n");
      out.write("  box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  transition: all 0.3s ease 0s;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".button:hover {\r\n");
      out.write("  background-color: #2EE59D;\r\n");
      out.write("  box-shadow: 0px 15px 20px rgba(46, 229, 157, 0.4);\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  transform: translateY(-7px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_btns button { width:80px;height:40px; border-radius: 0; background:#003148; border:1px solid #ddd; color:#fff; }\r\n");
      out.write(".order_btns input { height:34px; border:1px solid #ddd; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

    	Member loginUser = (Member)session.getAttribute("loginUser");
    
      out.write("\n");
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
      out.write("\t\t<!--script src=\"");
      out.print(request.getContextPath());
      out.write("/js/swiper.min.js\"></script-->\n");
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
      out.write("\t                    <li><a href=\"#none\">HELF</a></li>\n");
      out.write("\t                    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/logout.me\">LOGOUT</a></li>\n");
      out.write("\t                    <li><a href=\"#none\">MY PAGE</a></li>\n");
      out.write("\t                    <li><a href=\"#none\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("\t                </ul>\n");
      out.write("\t                ");
 }else{ 
      out.write("\n");
      out.write("\t                <ul class=\"log-sec logout\">\n");
      out.write("\t                    <li><a href=\"#none\">HELF</a></li>\n");
      out.write("\t                    <li><a href=\"#none\">JOIN</a></li>\n");
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
      out.write("\t                <h1 class=\"logo\"><a href=\"index.jsp\">FUN-THING</a></h1>\n");
      out.write("\t                \n");
      out.write("\t                <div class=\"search-box\"><span><i class=\"fas fa-search\"></i></span></div>\n");
      out.write("\t                \n");
      out.write("\t            </div>\n");
      out.write("\t            <nav id=\"nav\">\n");
      out.write("\t                <ul>\n");
      out.write("\t                    <li>\n");
      out.write("\t                        <a href=\"#none\">WOMAN</a>\n");
      out.write("\t                        <ul class=\"sub-menu\">\n");
      out.write("\t                            <li><a href=\"#none\">OUTER</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">TOP</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">BOTTOM</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">JEAN</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">ONEPIECE</a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </li>\n");
      out.write("\t                    <li>\n");
      out.write("\t                        <a href=\"#none\">MAN</a>\n");
      out.write("\t                        <ul class=\"sub-menu\">\n");
      out.write("\t                            <li><a href=\"#none\">OUTER</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">TOP</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">BOTTOM</a></li>\n");
      out.write("\t                            <li><a href=\"#none\">JEAN</a></li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </li>\n");
      out.write("\t                    <li><a href=\"#none\">CALENDAR</a></li>\n");
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
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<!-- 오른쪽 컨텐츠 영역 -->\r\n");
      out.write("\t\t");
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
      out.write("                <h2>MY PAGE</h2>\r\n");
      out.write("                <h3>쇼핑정보</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">주문목록/배송조회</a></li>\r\n");
      out.write("                    <li><a href=\"#\">취소내역</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>혜택관리</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">회원등급혜택안내</a></li>\r\n");
      out.write("                    <li><a href=\"#\">적립금</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>문의내역</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">1:1 문의</a></li>\r\n");
      out.write("                    <li><a href=\"#\">나의 상품문의</a></li>\r\n");
      out.write("                    <li><a href=\"#\">나의 리뷰</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("    \r\n");
      out.write("                <h3>회원정보</h3>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">회원정보 변경</a></li>\r\n");
      out.write("                    <li><a href=\"#\">배송지 관리</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- side end -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<div id=\"r-cont\">\r\n");
      out.write("\t\t\t<!-- 오른쪽 컨텐츠 수정 영역  -->\r\n");
      out.write("\r\n");
      out.write("            <!-- 오른쪽 컨텐츠 헤더 영역-->\r\n");
      out.write("            <div class=\"r-cont-header\">\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"r-cont-header2\">\r\n");
      out.write("\t\t\t \t\t<div id=\"order_outer\">\r\n");
      out.write("\t\t                <div class=\"member_info\">\r\n");
      out.write("\t\t                    <span class=\"order_details\">주문목록/배송조회</span>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div border = \"1\">\r\n");
      out.write("\t\t                    <p>조회기간</p>\r\n");
      out.write("\t\t                    <div class=\"order_btns\">\r\n");
      out.write("\t\t                        <button id = \"date\" values = \"today\">오늘</button>\r\n");
      out.write("\t\t                        <button id = \"date\" values = \"week\">7일</button>\r\n");
      out.write("\t\t                        <button id = \"date\" values = \"month\">1개월</button>\r\n");
      out.write("\t\t                        <button id = \"date\" values = \"3month\">3개월</button>\r\n");
      out.write("\t\t                        <button id = \"date\" values = \"year\">1년</button>\r\n");
      out.write("\t\t                        <input type=\"date\" id=\"start\" name=\"start\"\r\n");
      out.write("\t\t                        value=\"2020-01-01\"\r\n");
      out.write("\t\t                        min=\"2010-01-01\" max=\"2021-12-31\"> ~ \r\n");
      out.write("\t\t                        <input type=\"date\" id=\"end\" name=\"end\"\r\n");
      out.write("\t\t                        value=\"2020-01-01\"\r\n");
      out.write("\t\t                        min=\"2010-01-01\" max=\"2021-12-31\">\r\n");
      out.write("\t\t                        <button>조회하기</button>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <br>\r\n");
      out.write("\t\t                <table class=\"product_info\">\r\n");
      out.write("\t\t                    <tr>\r\n");
      out.write("\t\t                        <th>날짜/주문번호</th>\r\n");
      out.write("\t\t                        <th>상품명</th>\r\n");
      out.write("\t\t                        <th>상품금액/수량</th>\r\n");
      out.write("\t\t                        <th>주문상태</th>\r\n");
      out.write("\t\t                    </tr>\r\n");
      out.write("\t\t                    <tr>\r\n");
      out.write("\t\t                        <td>2020/05/12<br>\r\n");
      out.write("\t\t                        2020051212458</td>\r\n");
      out.write("\t\t                        <td>상품명</td>\r\n");
      out.write("\t\t                        <td>상품금액/수량</td>\r\n");
      out.write("\t\t                        <td>주문상태</td>\r\n");
      out.write("\t\t                        \r\n");
      out.write("\t\t                    </tr>\r\n");
      out.write("\t\t                   \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t                </table>\r\n");
      out.write("\t\t                <hr width:1200px;>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
