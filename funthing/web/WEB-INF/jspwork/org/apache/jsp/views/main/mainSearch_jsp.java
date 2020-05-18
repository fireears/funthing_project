/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-18 00:27:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.model.vo.Product;
import java.util.ArrayList;
import java.sql.Date;
import java.text.DecimalFormat;
import member.model.vo.Member;

public final class mainSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1589701533943L));
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
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Product> plist = (ArrayList<Product>)request.getAttribute("plist");
	ArrayList<Product> blist = (ArrayList<Product>)request.getAttribute("blist");
	String search = (String)request.getAttribute("search");
	String msg = (String)request.getAttribute("msg");
	
	DecimalFormat formatter = new DecimalFormat("###,###");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>FUN-THING</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/action.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/swiper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t        <div id=\"content\">\r\n");
      out.write("\t            <div class=\"main-img\">\r\n");
      out.write("\t                <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_img.jpg\" />\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div class=\"con-box discover\">\r\n");
      out.write("\t                <h2 id=\"title\">");
      out.print(search );
      out.write(" 검색 결과</h2>\r\n");
      out.write("\t                <ul class=\"product\">\r\n");
      out.write("\t                \r\n");
      out.write("\t                \r\n");
      out.write("\t                \t");
if(!plist.isEmpty() && blist.isEmpty()) { 
      out.write("\r\n");
      out.write("\t                \t");
	for(Product p : plist) { 
      out.write("\r\n");
      out.write("\t                \t");
		
	                			String pNo = p.getpNo();
	                			String thumbnail = p.getThumbnail();
	                			String pName = p.getpName();
	                			int pPrice = p.getpPrice();
	                			Date fStartDate = p.getfStartDate();
	                			Date fEndDate = p.getfEndDate();
	                			
	                			String thumbnailUrl = "web/images/thumbnail/" + thumbnail + ".jsp";
	                	
      out.write("\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("\t\t                        <div class=\"prod-img\">\r\n");
      out.write("\t\t                            ");
      out.write("\r\n");
      out.write("\t\t                            ");
      out.write("\r\n");
      out.write("\t\t                            <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" );
      out.write("\"></a>\r\n");
      out.write("\t\t                            ");
      out.write("\r\n");
      out.write("\t\t                        </div>\r\n");
      out.write("\t\t                        <ul class=\"prod-cont\">\r\n");
      out.write("\t\t                            <!-- <li class=\"prod-brand\">brand</li> -->\r\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(pName );
      out.write("</a></li>\r\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(formatter.format(pPrice) );
      out.write("원</a></li>\r\n");
      out.write("\t\t                            <li class=\"fun-sdate\">");
      out.print(fStartDate );
      out.write('~');
      out.print(fEndDate );
      out.write("</li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t                    ");
} 
	                	}else if(plist.isEmpty() && !blist.isEmpty()) { 
      out.write("\r\n");
      out.write("\t                \t");
	for(Product p : blist) { 
      out.write("\r\n");
      out.write("\t                \t");
	
		                	String thumbnail = p.getThumbnail();
	            			String pName = p.getpName();
	            			int pPrice = p.getpPrice();
	            			Date fStartDate = p.getfStartDate();
	            			Date fEndDate = p.getfEndDate();
	            			
	            			String thumbnailUrl = "web/images/thumbnail/" + thumbnail + ".jsp";
	                	
      out.write("\r\n");
      out.write("\t\t                    <li>\r\n");
      out.write("\t\t                        <div class=\"prod-img\">\r\n");
      out.write("\t\t                            ");
      out.write("\r\n");
      out.write("\t\t                            <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" );
      out.write("\"></a>\r\n");
      out.write("\t\t                            ");
      out.write("\r\n");
      out.write("\t\t                        </div>\r\n");
      out.write("\t\t                        <ul class=\"prod-cont\">\r\n");
      out.write("\t\t                            <!-- <li class=\"prod-brand\">brand</li> -->\r\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(pName );
      out.write("</a></li>\r\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(formatter.format(pPrice) );
      out.write("원</a></li>\r\n");
      out.write("\t\t                            <li class=\"fun-sdate\">");
      out.print(fStartDate );
      out.write('~');
      out.print(fEndDate );
      out.write("</li>\r\n");
      out.write("\t\t                        </ul>\r\n");
      out.write("\t\t                    </li>\r\n");
      out.write("\t\t                    ");
} 
      out.write("\r\n");
      out.write("\t                    \r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t                    ");
} else if(plist.isEmpty() && blist.isEmpty()){ 
      out.write("\r\n");
      out.write("\t                    \t<h2>");
      out.print(msg );
      out.write("</h2>\r\n");
      out.write("\t                    \t<br>\r\n");
      out.write("\t                    ");
} 
      out.write("\r\n");
      out.write("\t            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("       \t</div>\r\n");
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
