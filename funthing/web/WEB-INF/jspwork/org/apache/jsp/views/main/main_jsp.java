/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-21 16:20:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.model.vo.Product;
import productQnA.model.vo.ProductQnA;
import notice.model.vo.Notice;
import java.util.ArrayList;
import java.sql.Date;
import java.text.DecimalFormat;
import member.model.vo.Member;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1590069925355L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1590069923270L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
    _jspx_imports_classes.add("product.model.vo.Product");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("productQnA.model.vo.ProductQnA");
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

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!--  돈 , 표시 import -->\n");
      out.write("    \n");
      out.write("    ");

    	ArrayList<Product> arriProduct = (ArrayList<Product>)request.getAttribute("arriProduct");
    	ArrayList<Product> bestProduct = (ArrayList<Product>)request.getAttribute("bestProduct");
    	ArrayList<Product> closeProduct = (ArrayList<Product>)request.getAttribute("closeProduct");
    	ArrayList<ProductQnA> qnalist = (ArrayList<ProductQnA>)request.getAttribute("qnalist");
    	ArrayList<Notice> noticelist = (ArrayList<Notice>)request.getAttribute("noticelist");
    	
    	//돈 , 표시에 필요한 객체
    	DecimalFormat formatter = new DecimalFormat("###,###");
    
      out.write("\n");
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\t<title>FUN-THING</title>\n");
      out.write("\t\t\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/action.js\"></script>\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/swiper.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t\n");
      out.write("\t\t");
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
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t    <!-- search end -->\n");
      out.write("\t    <div id=\"container\">\n");
      out.write("\t        <div id=\"content\">\n");
      out.write("\t            <div class=\"main-img\">\n");
      out.write("\t                <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/main_img.jpg\" />\n");
      out.write("\t            </div>\n");
      out.write("\t            <div class=\"con-box discover\">\n");
      out.write("\t                <h2 id=\"title\">DISCOVER THE LATEST ARRIVALS</h2>\n");
      out.write("\t                <ul class=\"product\">\n");
      out.write("\t                \n");
      out.write("\t                \t");
if(arriProduct != null) { 
      out.write("\n");
      out.write("\t                \t");
	for(int i = 0; i<8; i++) { 
      out.write("\n");
      out.write("\t                \t");
		Product p = arriProduct.get(i);
	                	
	                			String thumbnail = p.getThumbnail();
	                			String pName = p.getpName();
	                			int pPrice = p.getpPrice();
	                			Date fStartDate = p.getfStartDate();
	                			Date fEndDate = p.getfEndDate();
	                			
	                			String thumbnailUrl = "web/images/thumbnail/" + thumbnail + ".jsp";
	                	
      out.write("\n");
      out.write("\t\t                    <li>\n");
      out.write("\t\t                        <div class=\"prod-img\">\n");
      out.write("\t\t                            ");
      out.write("\n");
      out.write("\t\t                            <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" );
      out.write("\"></a>\n");
      out.write("\t\t                            ");
      out.write("\n");
      out.write("\t\t                        </div>\n");
      out.write("\t\t                        <ul class=\"prod-cont\">\n");
      out.write("\t\t                            <!-- <li class=\"prod-brand\">brand</li> -->\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(pName );
      out.write("</a></li>\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(formatter.format(pPrice) );
      out.write("원</a></li>\n");
      out.write("\t\t                            <li class=\"fun-sdate\">");
      out.print(fStartDate );
      out.write('~');
      out.print(fEndDate );
      out.write("</li>\n");
      out.write("\t\t                        </ul>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t                    ");
} 
	                	}else { 
      out.write("\n");
      out.write("\t\t                    <li>\n");
      out.write("\t\t                        <div class=\"prod-img\">\n");
      out.write("\t\t                            <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/thumbnail/thumb001.jpg\"></a>\n");
      out.write("\t\t                        </div>\n");
      out.write("\t\t                        <ul class=\"prod-cont\">\n");
      out.write("\t\t                            <li class=\"prod-brand\">brand</li>\n");
      out.write("\t\t                            <li class=\"prod-tit\"><a href=\"#none\">product title</a></li>\n");
      out.write("\t\t                            <li class=\"fun-sdate\">2020/05/30~</li>\n");
      out.write("\t\t                        </ul>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t                    ");
} 
      out.write("\n");
      out.write("\t                    \n");
      out.write("\t                </ul>\n");
      out.write("\t            </div>\n");
      out.write("\t            <!-- discover end -->\n");
      out.write("\t\n");
      out.write("            <div class=\"best-sell\">\n");
      out.write("                <h2 id=\"title\">BEST SELLING</h2>\n");
      out.write("                <section id=\"features\" class=\"blue\">\n");
      out.write("                    <div class=\"slider center\">\n");
      out.write("                    \t");
if(bestProduct != null) { 
      out.write("\n");
      out.write("                    \t");
	for(int i=0; i<6;i++) { 
      out.write("\n");
      out.write("                    \t");
		 Product p = bestProduct.get(i);
	                			
								 String thumbnail = p.getThumbnail();
								 String pName = p.getpName();
						
      out.write("\n");
      out.write("\t\t                        <div>\n");
      out.write("\t\t                            <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" );
      out.write("\"></a>\n");
      out.write("\t\t                        </div>\n");
      out.write("\t                   ");
	} 
      out.write("\n");
      out.write("                       ");
}else { 
      out.write("\n");
      out.write("                       \n");
      out.write("                       ");
} 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\t            <div class=\"con-box completion\">\n");
      out.write("\t                <h2 id=\"title\">CLOSE TO COMPLETION</h2>\n");
      out.write("\t                <ul class=\"product\">\n");
      out.write("\t                \t");
if(closeProduct != null) { 
      out.write("\n");
      out.write("\t                \t");
	for(int i = 0; i<8; i++) { 
      out.write("\n");
      out.write("\t                \t");
		Product p = closeProduct.get(i);
	                			
			                	String thumbnail = p.getThumbnail();
		            			String pName = p.getpName();
		            			int pPrice = p.getpPrice();
		            			Date fStartDate = p.getfStartDate();
		            			Date fEndDate = p.getfEndDate();
	                	
      out.write("\n");
      out.write("\t                    <li>\n");
      out.write("\t                        <div class=\"prod-img\">\n");
      out.write("\t                            <a href=\"#none\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" );
      out.write("\"></a>\n");
      out.write("\t                        </div>\n");
      out.write("\t                        <ul class=\"prod-cont\">\n");
      out.write("\t                            <!-- <li class=\"prod-brand\">brand</li> -->\n");
      out.write("\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(pName );
      out.write("</a></li>\n");
      out.write("\t                            <li class=\"prod-tit\"><a href=\"#none\">");
      out.print(formatter.format(pPrice) );
      out.write("원</a></li>\n");
      out.write("\t                            <li class=\"fun-sdate\">");
      out.print(fStartDate );
      out.write('~');
      out.print(fEndDate );
      out.write("</li>\n");
      out.write("\t                        </ul>\n");
      out.write("\t                    </li>\n");
      out.write("\t                    \n");
      out.write("\t                    ");
	} 
      out.write("\n");
      out.write("\t                    ");
}else{ 
      out.write("\n");
      out.write("\t                    \n");
      out.write("\t                    ");
} 
      out.write("\n");
      out.write("\t                </ul>\n");
      out.write("\t            </div>\n");
      out.write("\t            </div>\n");
      out.write("\t            <!-- completion end -->\n");
      out.write("\t\n");
      out.write("\t        <!-- sell content end -->\n");
      out.write("\t        <div class=\"bt-wrap\">\n");
      out.write("\t            <div class=\"bt-sec left\">\n");
      out.write("\t                <h3>QNA</h3>\n");
      out.write("\t                <ul>\n");
      out.write("\t                \t");
if(qnalist != null) { 
      out.write("\n");
      out.write("\t                \t");
	for(int i =0; i<4; i++) { 
      out.write("\n");
      out.write("\t                \t");
		ProductQnA q = qnalist.get(i);
	                			
	                			int qnaNo = q.getQnaNo();
	                			String title = q.getQnaTitle();
	                			Date qnaDate = q.getQnaDate();
	                	
      out.write("\n");
      out.write("\t                    \t\t<li><a href=\"#none\">");
      out.print(title );
      out.write("</a><span>");
      out.print(qnaDate );
      out.write("</span></li>\n");
      out.write("\t                    ");
	} 
      out.write("\n");
      out.write("\t                    ");
}else{} 
      out.write("\n");
      out.write("\t                </ul>\n");
      out.write("\t            </div><!-- left end -->\n");
      out.write("\t            \n");
      out.write("\t            <div class=\"bt-sec bcenter\">\n");
      out.write("\t                <h3>NOTICE</h3>\n");
      out.write("\t                <ul>\n");
      out.write("\t                \t");
if(noticelist != null) { 
      out.write("\n");
      out.write("\t                \t");
	for(int i=0;i<4;i++) { 
      out.write("\n");
      out.write("\t                \t");
		Notice n = noticelist.get(i);
	                			
	                			int nNo = n.getnNo();
	                			String title = n.getnTitle();
	                			Date date = n.getnDate();
	                	
      out.write("\n");
      out.write("\t                    \t<li><a href=\"#none\">");
      out.print(title );
      out.write("</a><span>");
      out.print(date );
      out.write("</span></li>\n");
      out.write("\t                    \n");
      out.write("\t                    ");
	} 
      out.write("\n");
      out.write("\t                    ");
} else {} 
      out.write("\n");
      out.write("\t                </ul>\n");
      out.write("\t            </div><!-- center end -->\n");
      out.write("\t            \n");
      out.write("\t            <div class=\"bt-sec right\">\n");
      out.write("\t                <h3>CUSTEMER CENTER</h3>\n");
      out.write("\t                <ul>\n");
      out.write("\t                    <li class=\"tel\">1234-5678</li>\n");
      out.write("\t                    <li>운영시간 : 10:00 ~ 17:00</li>\n");
      out.write("\t                    <li>점심시간 : 11:30 ~ 13:30</li>\n");
      out.write("\t                    <li>주말 및 공휴일은 휴무입니다.</li>\n");
      out.write("\t                </ul>\n");
      out.write("\t            </div><!-- right end -->\n");
      out.write("\t        </div>\n");
      out.write("\t\n");
      out.write("\t        </div><!-- content end -->\n");
      out.write("\t    </div><!-- container end -->\n");
      out.write("\t    \n");
      out.write("\t    ");
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
      out.write("\n");
      out.write("\t</body>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t    $('.center').slick({\n");
      out.write("\t    centerMode: true,\n");
      out.write("\t    centerPadding: '200px',\n");
      out.write("\t    infinite : true, \t//무한 반복 옵션\t \n");
      out.write("\t    slidesToShow : 3,\t\t// 한 화면에 보여질 컨텐츠 개수\n");
      out.write("\t    slidesToScroll : 1,\t\t//스크롤 한번에 움직일 컨텐츠 개수\n");
      out.write("\t    speed : 100,\t // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)\n");
      out.write("\t    arrows : true, \t\t// 옆으로 이동하는 화살표 표시 여부\n");
      out.write("\t    dots : true, \t\t// 스크롤바 아래 점으로 페이지네이션 여부\n");
      out.write("\t    autoplay : true,\t\t\t// 자동 스크롤 사용 여부\n");
      out.write("\t    autoplaySpeed : 5000, \t\t// 자동 스크롤 시 다음으로 넘어가는데 걸리는 시간 (ms)\n");
      out.write("\t    pauseOnHover : true,\t\t// 슬라이드 이동\t시 마우스 호버하면 슬라이더 멈추게 설정\n");
      out.write("\t    // prevArrow : \"<button type='button' class='slick-prev'>Previous</button>\",\t\t// 이전 화살표 모양 설정\n");
      out.write("\t    // nextArrow : \"<button type='button' class='slick-next'>Next</button>\",\t\t// 다음 화살표 모양 설정\n");
      out.write("\t    dotsClass : \"slick-dots\", \t//아래 나오는 페이지네이션(점) css class 지정\n");
      out.write("\t    draggable : true, \t//드래그 가능 여부 \n");
      out.write("\t    responsive: [\n");
      out.write("\t        {\n");
      out.write("\t        breakpoint: 768,\n");
      out.write("\t        settings: {\n");
      out.write("\t            arrows: false,\n");
      out.write("\t            centerMode: true,\n");
      out.write("\t            centerPadding: '40px',\n");
      out.write("\t            slidesToShow: 3\n");
      out.write("\t        }\n");
      out.write("\t        },\n");
      out.write("\t        {\n");
      out.write("\t        breakpoint: 480,\n");
      out.write("\t        settings: {\n");
      out.write("\t            arrows: false,\n");
      out.write("\t            centerMode: true,\n");
      out.write("\t            centerPadding: '40px',\n");
      out.write("\t            slidesToShow: 1\n");
      out.write("\t        }\n");
      out.write("\t        }\n");
      out.write("\t    ]\n");
      out.write("\t    });\n");
      out.write("\t    \n");
      out.write("\t</script>\n");
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
