/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-15 03:26:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589512408993L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("    ");

        /* ArrayList<OrderManage> list = (ArrayList<OrderManage>)request.getAttribute("list");   */
       
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>order_manager</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <style>\r\n");
      out.write("        #order_manage{margin-left:200px; width:1200px;}\r\n");
      out.write("        #order_table {\r\n");
      out.write("            border-top: 2px solid grey;\r\n");
      out.write("            border-bottom: 1px solid grey;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("           width: 1200px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #order_table tr { border-bottom: 1px solid grey; }\r\n");
      out.write("\r\n");
      out.write("        #order_table th { padding:5px; padding-left:10px; text-align: center;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        #order_table td { padding:5px; padding-left:10px; text-align: center;}\r\n");
      out.write("   \r\n");
      out.write("         .pagingArea {margin:0 auto; margin-top:20px; margin-bottom:20px;}\r\n");
      out.write("\r\n");
      out.write("      .pageBtn {border:0; font-size:middle; background:white; cursor:pointer;}   \r\n");
      out.write("         \r\n");
      out.write("         #searchArea {margin:0 auto; text-align:center;}\r\n");
      out.write("         \r\n");
      out.write("         #searchForm {background:white;}\r\n");
      out.write("         \r\n");
      out.write("         #search_kind {width:100px; height:40px;}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   ");
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
      out.write("                        <li><button type=\"button\" onclick=\"brandManage\">브랜드 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"reviewManage\">리뷰관리</button></li>\n");
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
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/orderInfo\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction memberManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction brandManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
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
      out.write("   \r\n");
      out.write("   <h2 align=\"center\">주문관리</h2>\r\n");
      out.write("    <div id=\"order_manage\">\r\n");
      out.write("        <table id=\"order_table\">\r\n");
      out.write("            <tr>\r\n");
      out.write("               <th>번호</th>\r\n");
      out.write("                <th>주문번호</th>\r\n");
      out.write("                <th>회원아이디</th>\r\n");
      out.write("                <th>결제방법</th>\r\n");
      out.write("                <th>결제유무</th>\r\n");
      out.write("                <th>배송단계</th>\r\n");
      out.write("                <th>총 합계</th>\r\n");
      out.write("                <th>취소여부</th>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(om.getmId() );
      out.write("\">\r\n");
      out.write("            <td>");
      out.print( om.getRnum() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getoNo() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getmId() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getPmntMthd() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getPainYn() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getPrcsStatus() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getPmntPrice() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( om.getCancelYn() );
      out.write("</td>\r\n");
      out.write("            \r\n");
      out.write("             \r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("   <!--페이징 처리 시작  -->\r\n");
      out.write("   <div class=\"pagingArea\" align=\"center\">\r\n");
      out.write("      <!-- 맨 처음으로 -->\r\n");
      out.write("      <button class=\"pageBtn\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/orderInfo.or?currentPage=1'\"> << </button>\r\n");
      out.write("   \r\n");
      out.write("      <!-- 이전 페이지로 -->\r\n");
      out.write("      \r\n");
      out.write("      <button class=\"pageBtn\"  disabled> < </button>\r\n");
      out.write("     \r\n");
      out.write("      <button class=\"pageBtn\"  onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/orderInfo.or?currentPage-1'\"> < </button>\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("      <!-- 10개의 페이지 목록 -->\r\n");
      out.write("     \r\n");
      out.write("            <button class=\"pageBtn\" disabled></button>\r\n");
      out.write("        \r\n");
      out.write("            <button class=\"pageBtn\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/orderInfo.or?currentPage=");
      out.print(p);
      out.write("'\"> </button>\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("      <!-- 다음페이지로  -->\r\n");
      out.write("     \r\n");
      out.write("         <button disabled class=\"pageBtn\"> > </button>\r\n");
      out.write("   \r\n");
      out.write("         <button class=\"pageBtn\"  onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/orderInfo.or?currentPage+1'\"> > </button>\r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("      <!-- 맨 끝으로 -->\r\n");
      out.write("      <button class=\"pageBtn\"  onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/orderInfo.or?currentPage=");
      out.print( maxPage );
      out.write("'\"> >> </button>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div id=\"searchArea\">\r\n");
      out.write("      <form id=\"searchForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/orderInfo.or\" method=\"post\">\r\n");
      out.write("      <span>\r\n");
      out.write("      <select id=\"search_kind\" name=\"searchKind\">\r\n");
      out.write("         <option value=\"m_Id\">아이디</option>\r\n");
      out.write("         <option value=\"o_No\">주문번호</option>\r\n");
      out.write("      </select>\r\n");
      out.write("      </span>\r\n");
      out.write("      <span>\r\n");
      out.write("         <input type=\"text\" id=\"seachText\" name=\"searchText\">\r\n");
      out.write("      </span>\r\n");
      out.write("      <span>\r\n");
      out.write("         <button type=\"submit\" value=\"검색버튼\" id=\"seachBtn\">검색</button>\r\n");
      out.write("       </span>\r\n");
      out.write("      </form>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <script>\r\n");
      out.write("      $(function(){\r\n");
      out.write("         $(\"#order_table td\").mouseenter(function(){\r\n");
      out.write("            $(this).parent().css({\"background\":\"darkgrey\",\"cursor\":\"pointer\"});\r\n");
      out.write("         }).mouseout(function(){\r\n");
      out.write("            $(this).parent().css({\"background\":\"white\"});\r\n");
      out.write("         }).click(function(){\r\n");
      out.write("            var mid = $(this).parent().children(\"input\").val();\r\n");
      out.write("            \r\n");
      out.write("            /* 아이디별 상세내역 출력 */\r\n");
      out.write("            location.href=\"");
      out.print(request.getContextPath());
      out.write("/detail.or?mid=\"+mid\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("         })\r\n");
      out.write("      })\r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
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