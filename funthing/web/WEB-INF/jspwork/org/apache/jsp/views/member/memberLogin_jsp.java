/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
<<<<<<< HEAD
 * Generated at: 2020-05-26 03:11:37 UTC
=======
 * Generated at: 2020-05-26 02:58:56 UTC
>>>>>>> refs/remotes/origin/master
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

public final class memberLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1590456101538L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1590394386211L));
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
      out.write("\r\n");

	Member searchId = (Member)request.getAttribute("searchId");	
	String msg = (String)request.getAttribute("msg");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\t<style>\r\n");
      out.write("            \r\n");
      out.write("            #h2{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            #logintable{\r\n");
      out.write("                width: 600px;\r\n");
      out.write("                /* text-align: center; */\r\n");
      out.write("            }\r\n");
      out.write("           .p{\r\n");
      out.write("\t\t\t\t    vertical-align: middle;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("                color:  lightgray;\r\n");
      out.write("            }\r\n");
      out.write("            input::-webkit-input-placeholder { \r\n");
      out.write("                color: lightgray; \r\n");
      out.write("            }\r\n");
      out.write("            #div1{\r\n");
      out.write("                padding: 20px; \r\n");
      out.write("                font-size: 25px; \r\n");
      out.write("                background: lightgray; \r\n");
      out.write("                margin: 0 auto; \r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .log1{\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                width: 400px; \r\n");
      out.write("                border-radius: 8px;\r\n");
      out.write("            }\r\n");
      out.write("            #btn{\r\n");
      out.write("                height: 100px; \r\n");
      out.write("                width: 180px; \r\n");
      out.write("                color: white; \r\n");
      out.write("                font-size: 16px; \r\n");
      out.write("                border-radius: 8px; \r\n");
      out.write("                background: darkgrey;\r\n");
      out.write("            }\r\n");
      out.write("            #check1{\r\n");
      out.write("                float: left;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            #idsave{\r\n");
      out.write("                color: lightgray;\r\n");
      out.write("                float:left\r\n");
      out.write("            }\r\n");
      out.write("            #memberJoin{\r\n");
      out.write("                background: darkgrey; \r\n");
      out.write("                color: white; \r\n");
      out.write("                width: 600px; \r\n");
      out.write("                text-align: center; \r\n");
      out.write("                height: 80px; \r\n");
      out.write("                border-radius: 8px; \r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .cont{\r\n");
      out.write("            \twidth:1460px;\r\n");
      out.write("            \tmargin:0 auto;            \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            #loginform{\r\n");
      out.write("\t\t\t\twidth: 600px;\r\n");
      out.write("\t\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t\t/* border: 1px solid black; */\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("    </style>\r\n");
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
      out.write("\t<div id=\"div1\">\r\n");
      out.write("            LOGIN\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <form id=\"loginform\" method=\"get\" action=\"");
      out.print(request.getContextPath() );
      out.write("/login.me\">\r\n");
      out.write("            <h2 id=\"h2\">회원 로그인</h2>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <br>\r\n");
      out.write("            <table id=\"logintable\">\r\n");
      out.write("                <tr class=\"p\">\r\n");
      out.write("                    <td class = \"p\">\r\n");
      out.write("                        <input type=\"text\" class=\"log1\" name=\"userId\" id=\"userId\" placeholder=\"이름을 입력해주세요\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td rowspan=\"2\">\r\n");
      out.write("                        <input type=\"submit\" id=\"btn\" value=\"LOGIN\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"password\" class=\"log1\" name=\"userPwd\" id=\"userPwd\" placeholder=\"비밀번호를 입력해주세요\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div>\r\n");
      out.write("                <input type=\"checkbox\" id=\"check1\">\r\n");
      out.write("                <label id=\"idsave\">아이디 저장</label>\r\n");
      out.write("                \r\n");
      out.write("                <label style=\"float: right;\"><a href=\"searchPwd1.jsp\">비밀번호찾기</a></label>\r\n");
      out.write("                <label style=\"float: right; text-decoration: none\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/views/member/searchId.jsp\">아이디찾기 /&nbsp;</a></laebel>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"button\" id=\"memberJoin\" value=\"회원가입\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div style=\"text-align: center;\">\r\n");
      out.write("            \t<label style=\"color:lightgray;\">준비중 입니당</label><br>\r\n");
      out.write("                <label style=\"color:lightgray;\">SNS 로그인</label>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <label style=\"color:lightgray;\">카카오 아이디 로그인</label>\r\n");
      out.write("                \t\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <script>\r\n");
      out.write("      \r\n");
      out.write("            $(function(){\r\n");
      out.write("            \t// 로그인 실패\r\n");
      out.write("            \t ");
if(msg != null){
      out.write("\r\n");
      out.write("        \t\t\talert(\"");
      out.print(msg);
      out.write("\");\r\n");
      out.write("        \t\t ");
}
      out.write("\r\n");
      out.write("        \t\t \r\n");
      out.write("            \t// 아이디 찾은 결과\r\n");
      out.write("           \t\t ");
if(searchId != null){
      out.write("\r\n");
      out.write("           \t\t\talert(\"아이디는 ");
      out.print( searchId.getmId());
      out.write(" 입니다.\");\r\n");
      out.write("           \t\t ");
}
      out.write("\r\n");
      out.write("           \t\t \r\n");
      out.write("           \t\t\r\n");
      out.write("            \t// 아이디\r\n");
      out.write("                $(\"#userId\").change(function(){\r\n");
      out.write("                    var value = $(\"#userId\").val();\r\n");
      out.write("                    var reg = /^[a-z0-9]{4,12}$/;\r\n");
      out.write("                    if(!reg.test(value)){\r\n");
      out.write("                        alert(\"영문자와 숫자로 4글자 이상 12글자 이하여야 합니다.\");\r\n");
      out.write("                        $(\"#userId\").focus().val('');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            \t\r\n");
      out.write("            \t// 비밀번호\r\n");
      out.write("                $(\"#userPwd\").change(function(){\r\n");
      out.write("                    var value = $(\"#userPwd\").val();\r\n");
      out.write("                    var reg = /^[a-z0-9]{6,18}$/;\r\n");
      out.write("                    if(!reg.test(value)){\r\n");
      out.write("                        alert(\"영문자와 숫자로 6글자 이상 12글자 이하여야 합니다.\");\r\n");
      out.write("                        $(\"#userPwd\").focus().val('');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            \t// 회원가입 버튼\r\n");
      out.write("                $(\"#memberJoin\").click(function(){\r\n");
      out.write("                \tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberJoin.jsp\";\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                // 아이디 저장 코드\r\n");
      out.write("                var key = getCookie(\"key\");\r\n");
      out.write("                $(\"#userId\").val(key); \r\n");
      out.write("                 \r\n");
      out.write("                if($(\"#userId\").val() != \"\"){ // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,\r\n");
      out.write("                    $(\"#check1\").attr(\"checked\", true); // ID 저장하기를 체크 상태로 두기.\r\n");
      out.write("                }\r\n");
      out.write("                 \r\n");
      out.write("                $(\"#check1\").change(function(){ // 체크박스에 변화가 있다면,\r\n");
      out.write("                    if($(\"#check1\").is(\":checked\")){ // ID 저장하기 체크했을 때,\r\n");
      out.write("                        setCookie(\"key\", $(\"#userId\").val(), 7); // 7일 동안 쿠키 보관\r\n");
      out.write("                    }else{ // ID 저장하기 체크 해제 시,\r\n");
      out.write("                        deleteCookie(\"key\");\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                 \r\n");
      out.write("                // ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.\r\n");
      out.write("                $(\"#userId\").keyup(function(){ // ID 입력 칸에 ID를 입력할 때,\r\n");
      out.write("                    if($(\"#check1\").is(\":checked\")){ // ID 저장하기를 체크한 상태라면,\r\n");
      out.write("                        setCookie(\"key\", $(\"#userId\").val(), 7); // 7일 동안 쿠키 보관\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("            function setCookie(cookieName, value, exdays){\r\n");
      out.write("                var exdate = new Date();\r\n");
      out.write("                exdate.setDate(exdate.getDate() + exdays);\r\n");
      out.write("                var cookieValue = escape(value) + ((exdays==null) ? \"\" : \"; expires=\" + exdate.toGMTString());\r\n");
      out.write("                document.cookie = cookieName + \"=\" + cookieValue;\r\n");
      out.write("            }\r\n");
      out.write("             \r\n");
      out.write("            function deleteCookie(cookieName){\r\n");
      out.write("                var expireDate = new Date();\r\n");
      out.write("                expireDate.setDate(expireDate.getDate() - 1);\r\n");
      out.write("                document.cookie = cookieName + \"= \" + \"; expires=\" + expireDate.toGMTString();\r\n");
      out.write("            }\r\n");
      out.write("             \r\n");
      out.write("            function getCookie(cookieName) {\r\n");
      out.write("                cookieName = cookieName + '=';\r\n");
      out.write("                var cookieData = document.cookie;\r\n");
      out.write("                var start = cookieData.indexOf(cookieName);\r\n");
      out.write("                var cookieValue = '';\r\n");
      out.write("                if(start != -1){\r\n");
      out.write("                    start += cookieName.length;\r\n");
      out.write("                    var end = cookieData.indexOf(';', start);\r\n");
      out.write("                    if(end == -1)end = cookieData.length;\r\n");
      out.write("                    cookieValue = cookieData.substring(start, end);\r\n");
      out.write("                }\r\n");
      out.write("                return unescape(cookieValue);\r\n");
      out.write("            }\r\n");
      out.write("            // 아이디 저장 코드 end\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
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
      out.write("\t        <!-- footer wrap end -->\n");
      out.write("\t        <div class=\"sc-btns\">\n");
      out.write("\t            <p class=\"up\"><i class=\"fas fa-arrow-up\"></i></p>\n");
      out.write("\t            <p class=\"down\"><i class=\"fas fa-arrow-down\"></i></p>\n");
      out.write("\t        </div>\n");
      out.write("\t    </footer>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
