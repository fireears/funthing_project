/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
<<<<<<< HEAD
<<<<<<< HEAD
 * Generated at: 2020-05-21 00:26:28 UTC
=======
 * Generated at: 2020-05-21 12:42:21 UTC
>>>>>>> refs/remotes/origin/master
=======
 * Generated at: 2020-05-21 15:59:11 UTC
>>>>>>> refs/remotes/origin/master
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import man.model.vo.ManVo;
import board.model.vo.PageInfo;
import member.model.vo.Member;

public final class man_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< HEAD
<<<<<<< HEAD
    _jspx_dependants.put("/views/main/../common/header.jsp", Long.valueOf(1590016093836L));
=======
    _jspx_dependants.put("/views/main/../common/header.jsp", Long.valueOf(1590063620834L));
>>>>>>> refs/remotes/origin/master
=======
    _jspx_dependants.put("/views/main/../common/header.jsp", Long.valueOf(1590023309456L));
>>>>>>> refs/remotes/origin/master
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("man.model.vo.ManVo");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.PageInfo");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang='ko'>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    ");

    	ArrayList<ManVo> list = (ArrayList<ManVo>)request.getAttribute("list");
    	PageInfo pi = (PageInfo)request.getAttribute("pi");
    	
    	int listCount = pi.getListCount();
    	int currentPage = pi.getCurrentPage();
    	int maxPage = pi.getMaxPage();
    	int startPage = pi.getStartPage();
    	int endPage = pi.getEndPage();
    
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("   <title></title>\r\n");
      out.write("   <script src=\"../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("   <style>\r\n");
      out.write("      \r\n");
      out.write("       /* #main{\r\n");
      out.write("         width: 70%;\r\n");
      out.write("         border: 1 black solid;\r\n");
      out.write("      }\r\n");
      out.write("      #header_main{\r\n");
      out.write("         width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      #main >#header_main> img{\r\n");
      out.write("         width: 100%;\r\n");
      out.write("         height: 180px;\r\n");
      out.write("         margin-bottom: 30px;\r\n");
      out.write("      }\r\n");
      out.write("    #select_main{\r\n");
      out.write("       height: 30px;\r\n");
      out.write("       border: 1px black solid;\r\n");
      out.write("       border-collapse:collapse;\r\n");
      out.write("       border-right: none;\r\n");
      out.write("       border-left: none;\r\n");
      out.write("    }\r\n");
      out.write("    #select_main_left{\r\n");
      out.write("       float : left;\r\n");
      out.write("     \r\n");
      out.write("       height: 100%;\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("    #select_main_right{\r\n");
      out.write("      float: right;\r\n");
      out.write("      border-left: 1px black solid;\r\n");
      out.write("      width: 15%;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    #select_main_right >select{\r\n");
      out.write("       float : right;\r\n");
      out.write("       height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    #content_main{\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      border-bottom: black 1px solid;\r\n");
      out.write("    }\r\n");
      out.write("    #content_main >ul{\r\n");
      out.write("       width: 100%;\r\n");
      out.write("       height: 150px;\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("    #content_main >ul >li{\r\n");
      out.write("       width: 25%;\r\n");
      out.write("       float: left;\r\n");
      out.write("      margin-right: 0px;\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("    #content_main >ul >li >ul>li >img{\r\n");
      out.write("       width: 100%;\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("    ul{\r\n");
      out.write("       list-style: none;\r\n");
      out.write("       display: block;\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    margin-block-start: 0em;\r\n");
      out.write("    margin-block-end: 0em;\r\n");
      out.write("    margin-inline-start: 0px;\r\n");
      out.write("    margin-inline-end: 0px;\r\n");
      out.write("    padding-inline-start: 0px;\r\n");
      out.write("}\r\n");
      out.write("   #discont{\r\n");
      out.write("      color: chocolate;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("     */\r\n");
      out.write("\r\n");
      out.write("    /* 추가 */\r\n");
      out.write("\r\n");
      out.write("    a { color:#333; text-decoration:none; }\r\n");
      out.write("    ul, li, p { margin:0; padding:0; list-style: none; }\r\n");
      out.write("\r\n");
      out.write("    #productWrap { width:1460px; margin:0 auto; }\r\n");
      out.write("\r\n");
      out.write("    #productWrap .prod_top { width:100%; }\r\n");
      out.write("    #productWrap .prod_top img { width:100%; }\r\n");
      out.write("\r\n");
      out.write("    #productWrap .product { width:100%; }\r\n");
      out.write("    #productWrap .product:after { display:block; content:\"\"; clear:both; }\r\n");
      out.write("    #productWrap .product > li { float:left; width:25%; box-sizing:border-box; padding:0 20px; margin-bottom:60px; }\r\n");
      out.write("    #productWrap .product li a img { width:100%; border:1px solid #666; }\r\n");
      out.write("\r\n");
      out.write("    #productWrap .product li .prod-cont { margin-top:10px; }\r\n");
      out.write("    #productWrap .product li .prod-cont .prod-brand { color:#0f4a7e; }\r\n");
      out.write("    #productWrap .product li .prod-cont .prod-tit {  }\r\n");
      out.write("    #productWrap .product li .prod-cont .prod_price { margin-top:8px; font-size:18px; font-weight:700;  }\r\n");
      out.write("    #productWrap .product li .prod-cont .prod_price span { display:inline-block;  }\r\n");
      out.write("   /* .product li .prod-cont .prod_price:after { display:block; content:\"\"; clear:both; } */\r\n");
      out.write("   \r\n");
      out.write("    #productWrap .product li .prod-cont .prod_price .origin_p { color:#666; font-size:16px; text-decoration: line-through; margin-right:6px; font-weight: normal; }\r\n");
      out.write("    #productWrap .product li .prod-cont .prod_price .new_p { color:#333; }\r\n");
      out.write("    #productWrap .product li .prod-cont .prod_price .discount { color:#0f4a7e; font-weight:700; margin-left:14px; }\r\n");
      out.write("   \r\n");
      out.write("    #productWrap .prod_cont { width:100%; border-top:1px solid #aaa; border-bottom:1px solid #aaa; padding:14px 10px; box-sizing: border-box; margin:20px 0 40px; }\r\n");
      out.write("    #productWrap .prod_cont:after { display:block; content:\"\"; clear:both; } \r\n");
      out.write("    #productWrap .prod_cont .prod_count { float:left; color:#666; }\r\n");
      out.write("    #productWrap .prod_cont .prod_sort { float:right; }\r\n");
      out.write("    #productWrap .prod_cont .prod_sort:after { display:block; content:\"\"; clear:both; } \r\n");
      out.write("    #productWrap .prod_cont .prod_sort li { float:left; margin-left:16px; position: relative; }\r\n");
      out.write("    #productWrap .prod_cont .prod_sort li:after { position: absolute; right:-8px; top:5px; background:#888; height:16px; width:1px; display:block; content:\"\"; clear:both; }\r\n");
      out.write("    #productWrap .prod_cont .prod_sort li:last-child:after { background:transparent; }\r\n");
      out.write("    #productWrap .prod_cont .prod_sort li a { color:#666; }\r\n");
      out.write("    #productWrap .prod_cont .prod_sort li a:hover { color:#aaa; }\r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("  <div id=\"productWrap\">\r\n");
      out.write("   <div class=\"prod_top\">\r\n");
      out.write("      <img src=\"C://Users/violi/Desktop/image01.jpg\">\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"prod_cont\">\r\n");
      out.write("      <p class=\"prod_count\">");
      out.print(listCount );
      out.write("style</p>\r\n");
      out.write("      <ul class=\"prod_sort\">\r\n");
      out.write("         <li><a href='");
      out.print(request.getContextPath());
      out.write("/ManHighPrice'>high price</a></li>\r\n");
      out.write("         <li><a href='");
      out.print(request.getContextPath());
      out.write("/ManLowPrice'>low price</a></li>\r\n");
      out.write("         <li><a href='");
      out.print(request.getContextPath());
      out.write("/ManCloseToCompletion'>close to completion</a></li>\r\n");
      out.write("         <li><a href='");
      out.print(request.getContextPath());
      out.write("/ManNewProduct'>new product</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </div>\r\n");
      out.write("      <div class=\"prod_area\">\r\n");
      out.write("         <ul class=\"product\">\r\n");
      out.write("           ");
 
         if(list!=null){
                for(int i =0;i<list.size();i++){
                	
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("               <div class=\"prod-img\">\r\n");
      out.write("                     <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + list.get(i).getTumbnail() + ".jpg" );
      out.write("\"></a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <ul class=\"prod-cont\">\r\n");
      out.write("                     <li class=\"prod-brand\"><a href=\"#none\">");
      out.print(list.get(i).getP_name());
      out.write("</a></li>\r\n");
      out.write("                     <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(list.get(i).getP_type());
      out.write("</a></li>\r\n");
      out.write("                     <li class=\"prod_price\"><span class=\"origin_p\">");
      out.print(list.get(i).getO_price());
      out.write("원</span><span class=\"new_p\">");
      out.print(list.get(i).getP_price());
      out.write("원</span><span class=\"discount\">");
      out.print(list.get(i).getDc_rate());
      out.write("%</span></li>\r\n");
      out.write("                     <li class=\"fun-sdate\">");
      out.print(list.get(i).getStart_date().substring(0,10) );
      out.write('~');
      out.print(list.get(i).getEnd_date().substring(0,10) );
      out.write("</li>\r\n");
      out.write("               </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
} 
          }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write(" \r\n");
      out.write("         \r\n");
      out.write("         </ul>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div class=\"pageinArea\" align=\"center\">\r\n");
      out.write("\t\t\t\t<!-- 맨 처음으로 -->\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/ManServlet?currentPage=");
      out.print(1);
      out.write("'\"> << </button>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 이전 페이지 -->\r\n");
      out.write("\t\t\t\t");
if(currentPage <= 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<button disabled> < </button>\r\n");
      out.write("\t\t\t\t");
}else {
      out.write("\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/ManServlet?currentPage=");
      out.print(currentPage -1);
      out.write("'\"> < </button>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 10개의 페이지 목록 -->\r\n");
      out.write("\t\t\t\t");
for(int p = startPage; p<=endPage; p++){
				
if(currentPage == p) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t");
} else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/ManServlet?currentPage=");
      out.print(p);
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t\t<!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 다음 페이지로 -->\r\n");
      out.write("\t\t\t\t");
if(currentPage >= maxPage) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<button disabled> > </button>\r\n");
      out.write("\t\t\t\t");
}else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/ManServlet?currentPage=");
      out.print(currentPage + 1);
      out.write("'\"> > </button>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 맨 끝으로  -->\r\n");
      out.write("\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/ManServlet?currentPage=");
      out.print(maxPage);
      out.write("'\"> >> </button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("         \r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <br><br><br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
