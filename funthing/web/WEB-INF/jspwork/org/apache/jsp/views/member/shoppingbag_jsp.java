/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-24 12:28:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import member.model.vo.MemberShoppingBag;
import board.model.vo.PageInfo;
import member.model.vo.Member;

public final class shoppingbag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1590311174067L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1590069688278L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.MemberShoppingBag");
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
      out.write("<html lang=\"ko\">\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" ");

 ArrayList<MemberShoppingBag> list = (ArrayList<MemberShoppingBag>)request.getAttribute("list");
 
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("   <script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            p { margin:0; }\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap { width:70%; margin:0 auto; }\r\n");
      out.write("            #shippingWrap .s_title { border-top:2px solid #aaa; border-bottom:1px solid #aaa; color:#30586e; margin-bottom:80px; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap .s_table { border-collapse: collapse; width:100%; text-align:center; border-top:1px solid #aaa; border-bottom:1px solid #aaa; }\r\n");
      out.write("            #shippingWrap .s_table tr { border-bottom:1px solid #bbb; }\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap .s_table th { line-height:2.4; color:#30586e; }\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap .s_table tr th:nth-child(2) { width:60%; }\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap .s_table tr td { padding:6px 0; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(1) { width:5%; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(2) { width:20%; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(3) { width:40%; text-align: left; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(4) { width:5%; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(5) { width:12.5%; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(6) { width:5%; }\r\n");
      out.write("            #shippingWrap .s_table tr td:nth-child(7) { width:12.5%; }\r\n");
      out.write("            \r\n");
      out.write("            #shippingWrap .s_table tr img { width:50px; height:80px; border:1px solid #ddd; }\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap .s_table tr td .titArea { float:left; height:100%; }\r\n");
      out.write("\r\n");
      out.write("            #shippingWrap .s_btns { margin:20px 0; }\r\n");
      out.write("            #shippingWrap .s_btns:after { display:block; content:\"\"; clear:both; }\r\n");
      out.write("            #shippingWrap .s_btns button { width:100px; height:40px; border-radius:0; background:#30586e; color:#fff; border:0; box-sizing:border-box; }\r\n");
      out.write("            \r\n");
      out.write("            #shippingWrap .s_btns button:active { border:2px solid #fff; } /* 클릭시 보더 액션 */\r\n");
      out.write("            #shippingWrap .s_btns button.l_btn { background:#aaa; }\r\n");
      out.write("            #shippingWrap .s_btns button.r_btn { float:right; }\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("       ");
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
      out.write("/myPageMainServlet?userNoM=");
      out.print(loginUser.getmNo());
      out.write("\">MY PAGE</a></li>\n");
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
      out.write("    \r\n");
      out.write("        <div id=\"shippingWrap\">\r\n");
      out.write("            <div class=\"s_title\">\r\n");
      out.write("                <h3>결제 예정 상품</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form id=\"shoppingbagForm\" method=\"get\" action=\"#none\">\r\n");
      out.write("            <input type=\"hidden\" name=\"userNo\" value=\"");
      out.print(loginUser.getmNo() );
      out.write("\">\r\n");
      out.write("                <table class=\"s_table\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th><input type=\"checkbox\" id=\"checkall\"></th>\r\n");
      out.write("                        <th colspan=\"2\">결제 예정 상품</th>\r\n");
      out.write("                        <th>수량</th>\r\n");
      out.write("                        <th>금액</th>\r\n");
      out.write("                        <th>적립금</th>\r\n");
      out.write("                        <th>합계</th>\r\n");
      out.write("                    </tr> \r\n");
      out.write("                    <!-- for문 -->\r\n");
      out.write("                      ");

          int sum =0;
         if(list!=null){
            for(int i =0;i<list.size();i++){
               sum +=list.get(i).getShbag_price()*list.get(i).getShbag_num();
            }
                       
                for(int i =0;i<list.size();i++){
      out.write("\r\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"p_no\" value=\"");
      out.print(list.get(i).getP_no());
      out.write("\">\r\n");
      out.write("                    <tr>                   \t\r\n");
      out.write("\n");
      out.write("                \t");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("\n");
      out.write("                        <td><input type=\"checkbox\" name=\"check\" value=\"");
      out.print(list.get(i).getP_name());
      out.write("\"></td>\r\n");
      out.write("                        <td class=\"imgArea\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + list.get(i).getP_thumbnail() + ".jpg" );
      out.write("\" /></td>\r\n");
      out.write("                        <td>");
      out.print(list.get(i).getP_name());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(list.get(i).getShbag_num());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(list.get(i).getShbag_price()*list.get(i).getShbag_num());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(list.get(i).getP_point());
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(sum);
      out.write("</td>\r\n");
      out.write("                    </tr> \r\n");
      out.write("                ");
 
                
                }
                
               }
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                    <!-- for문 end -->\r\n");
      out.write("                </table> \r\n");
      out.write("              \r\n");
      out.write("                <div class=\"s_btns\">\r\n");
      out.write("                    <button type=\"button\" onclick=\"shoppingBag();\"   class=\"l_btn\">선택상품삭제</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"r_btn\">결제</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("  \r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("        <script>\r\n");
      out.write("       function shoppingBag(){         \r\n");
      out.write("            $(\"#shoppingbagForm\").attr(\"action\", \"");
      out.print(request.getContextPath() );
      out.write("/MemberShoppingDelete\");\r\n");
      out.write("                $(\"#shoppingbagForm\").submit();\r\n");
      out.write("          }\r\n");
      out.write("     \r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $(\"#checkall\").click(function(){\r\n");
      out.write("                if($(\"#checkall\").prop(\"checked\")){\r\n");
      out.write("                    $(\"input[name=check]\").prop(\"checked\",true);\r\n");
      out.write("                }else{\r\n");
      out.write("                    $(\"input[name=check]\").prop(\"checked\",false);\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        ");
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
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write(" </html>");
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
