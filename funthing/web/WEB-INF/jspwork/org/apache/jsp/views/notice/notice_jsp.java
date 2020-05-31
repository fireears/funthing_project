/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-31 06:44:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import notice.model.vo.Notice;
import board.model.vo.PageInfo;
import member.model.vo.Member;

public final class notice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/notice/../common/header.jsp", Long.valueOf(1590648304157L));
    _jspx_dependants.put("/views/notice/../common/footer.jsp", Long.valueOf(1590648300082L));
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
    _jspx_imports_classes.add("member.model.vo.Member");
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
      out.write("            #noticeArea{margin: 60px auto 0; width: 1460px;}\r\n");
      out.write("\r\n");
      out.write("            #noticeArea h3{font-weight:bold; font-size: 40px; color:#0f4a7e; text-align:center; margin:60px 0;}\r\n");
      out.write("\t\t\t#noticeArea form { text-align:right; }\r\n");
      out.write("            #noticeArea #search{ margin:0; height:30px; border: 1px solid black; }\r\n");
      out.write("            #searchBtn{height: 33px; width: 80px; border: 0px; background-color: gray; color: white;}\r\n");
      out.write("\r\n");
      out.write("            #noticelistArea {width: 100%; margin: 40px 0;  border-top:2px solid #0f4a7e; border-bottom:2px solid #0f4a7e; border-collapse: collapse; line-height: 3;}\r\n");
      out.write("            \r\n");
      out.write("            #noticelistArea tr{border-bottom: 1px solid #ddd; }\r\n");
      out.write("            #noticelistArea tr th:nth-child(1) { width:5%; }\r\n");
      out.write("            #noticelistArea tr th:nth-child(1) { width:70%; }\r\n");
      out.write("            #noticelistArea tr th:nth-child(1) { width:5%; }\r\n");
      out.write("            #noticelistArea tr th:nth-child(1) { width:20%; }\r\n");
      out.write("            \r\n");
      out.write("            #noticelistArea tr td{text-align: center;}\r\n");
      out.write("            \r\n");
      out.write("            #noticelistArea tr.cont td { padding:20px 10px; background:#f5f5f5; }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            #noticeArea .pageinArea { margin:40px 0 20px; }\r\n");
      out.write("            \r\n");
      out.write("            #noticeArea .pageinArea button{border: 0px; width: 30px; height: 30px; font-weight: 600; size: 10px; background:#fff;}\r\n");
      out.write("            .hansol{width: 100%; height: 150px; background-color:cornsilk; display: none;}\r\n");
      out.write("            #reviewcontents{float: left; margin-right: 50px;}\r\n");
      out.write("            .cont{ display:none;}\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
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
      out.write("                       <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/PersonalQnA?userNo=");
      out.print(loginUser.getmNo());
      out.write("\">HELP</a></li>\n");
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
      out.write("                       <li><a href=\"");
      out.print(request.getContextPath());
      out.write("//MemberShoppingBagServlet?userNo=");
      out.print(loginUser.getmNo());
      out.write("\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
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
      out.write("                       <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberLogin.jsp\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
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
      out.write("       \r\n");
      out.write("    \r\n");
      out.write("       <div id=\"content\">\r\n");
      out.write("      <!-- 오른쪽 컨텐츠 영역 -->\r\n");
      out.write("\r\n");
      out.write("      <div id=\"r-cont\">\r\n");
      out.write("         <!-- 오른쪽 컨텐츠 수정 영역  -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        <section id=\"noticeArea\">\r\n");
      out.write("            <h3>공지사항</h3>\r\n");
      out.write("            \r\n");
      out.write("            <table id=\"noticelistArea\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr class=\"noticehead\">\r\n");
      out.write("                        <th>글번호</th>\r\n");
      out.write("                        <th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t<th>날짜</th>\r\n");
      out.write("\t\t\t\t\t\t<!-- <th>RATE</th> -->\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("             ");
 
             if(list!=null){
                for(int i =0;i<list.size();i++){
                   
      out.write(" <tr class=\"noticelist\">  \r\n");
      out.write("                           <td>");
      out.print(list.get(i).getnNo());
      out.write("</td>\r\n");
      out.write("                           <td>");
      out.print(list.get(i).getnTitle());
      out.write("</td>\r\n");
      out.write("                           <td>관리자</td>\r\n");
      out.write("                           <td>");
      out.print(list.get(i).getnDaatee());
      out.write("</td>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                       </tr>\r\n");
      out.write("                       <tr class=\"cont\">\r\n");
      out.write("                          <td colspan=\"5\">\r\n");
      out.write("                             <span>\r\n");
      out.write("                             ");
      out.print(list.get(i).getnContents());
      out.write("\r\n");
      out.write("                             </span>\r\n");
      out.write("                          </td>\r\n");
      out.write("                       </tr>   \r\n");
      out.write("                  ");
}
                   }else{
                      
      out.write("\r\n");
      out.write("                      <tr>\r\n");
      out.write("                            <td>값이 존재하지않습니다.</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      ");

                   }
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <form  method=\"GET\" action=\"");
      out.print(request.getContextPath());
      out.write("/MainNoticeServlet\">\r\n");
      out.write("           \t\t <input type=\"text\" id=\"search\" name=\"noticeSearch\"  placeholder=\"검색어를 입력해주세요\"> <input type=\"submit\" id=\"searchBtn\" value=\"SEARCH\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <script>\r\n");
      out.write("                  $(\"table .noticelist td\").click(function(){\r\n");
      out.write("                $(this).parent().next().toggle();\r\n");
      out.write("                  });\r\n");
      out.write("           </script>\r\n");
      out.write("             <div class=\"pageinArea\" align=\"center\">\r\n");
      out.write("             ");

            if(search ==null){
            
      out.write("   \r\n");
      out.write("            \r\n");
      out.write("             <!-- search가 널일때  -->\r\n");
      out.write("             <!-- 맨 처음으로 -->\r\n");
      out.write("            \r\n");
      out.write("            <button class=\"search\"  onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
      out.print(1 );
      out.write("'\"> << </button>\r\n");
      out.write("       \r\n");
      out.write("            <!-- 이전 페이지 -->\r\n");
      out.write("            ");
if(currentPage <= 1) {
      out.write("\r\n");
      out.write("               <button class=\"search\"  disabled> < </button>\r\n");
      out.write("            ");
}else {
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
      out.print(currentPage-1);
      out.write("'\"> < </button>\r\n");
      out.write("            ");
} 
      out.write("                                \r\n");
      out.write("            <!-- 10개의 페이지 목록 -->\r\n");
      out.write("            ");
for(int p = startPage; p<=endPage; p++){
            
      out.write("\r\n");
      out.write("               ");
if(currentPage == p) {
      out.write("\r\n");
      out.write("                  <button class=\"search\"  disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("                  ");
} else{
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                  <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
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
      out.write("            <!-- 다음 페이지로 -->\r\n");
      out.write("            ");
if(currentPage >= maxPage) {
      out.write("\r\n");
      out.write("               <button class=\"search\"  disabled> > </button>\r\n");
      out.write("            ");
}else { 
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
      out.print(currentPage + 1);
      out.write("'\"> > </button>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            <!-- 맨 끝으로  -->\r\n");
      out.write("            <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
      out.print(maxPage );
      out.write("'\"> >> </button>   \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("            ");
 }else{
      out.write("\r\n");
      out.write("               \r\n");
      out.write("                <!-- 맨 처음으로 -->\r\n");
      out.write("            <button class=\"search\"  onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
      out.print(1 );
      out.write("&search=");
      out.print(search);
      out.write("'\"> << </button>\r\n");
      out.write("       \r\n");
      out.write("            <!-- 이전 페이지 -->\r\n");
      out.write("            ");
if(currentPage <= 1) {
      out.write("\r\n");
      out.write("               <button class=\"search\"  disabled> < </button>\r\n");
      out.write("            ");
}else {
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
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
      out.write("                  <button class=\"search\"  disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("               ");
} else{
      out.write("\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("                  <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
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
      out.write("            <!-- 다음 페이지로 -->\r\n");
      out.write("            ");
if(currentPage >= maxPage) {
      out.write("\r\n");
      out.write("               <button class=\"search\"  disabled> > </button>\r\n");
      out.write("            ");
}else { 
      out.write("\r\n");
      out.write("               <button class=\"search\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/MainNoticeServlet?currentPage=");
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
      out.write("/MainNoticeServlet?currentPage=");
      out.print(maxPage );
      out.write("&search=");
      out.print(search);
      out.write("'\"> >> </button>   \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("            ");
}                  
            
      out.write("\r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("         </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
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
      out.write("\t    </footer>\n");
      out.write("\t</body>\n");
      out.write("</html>");
      out.write("\r\n");
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
