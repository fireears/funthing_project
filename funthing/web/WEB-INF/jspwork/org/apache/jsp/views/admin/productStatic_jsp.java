/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
<<<<<<< HEAD
<<<<<<< HEAD
 * Generated at: 2020-05-26 10:33:56 UTC
=======
<<<<<<< HEAD
 * Generated at: 2020-05-26 10:37:22 UTC
=======
 * Generated at: 2020-05-26 10:47:33 UTC
>>>>>>> refs/remotes/origin/dev902
>>>>>>> refs/remotes/origin/master
=======
 * Generated at: 2020-05-27 07:32:54 UTC
>>>>>>> refs/remotes/origin/dev42
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import admin.model.vo.ProductStatic;

public final class productStatic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< HEAD
<<<<<<< HEAD
    _jspx_dependants.put("/views/common/adminHeader.jsp", Long.valueOf(1590489040673L));
=======
<<<<<<< HEAD
    _jspx_dependants.put("/views/common/adminHeader.jsp", Long.valueOf(1590489234932L));
=======
    _jspx_dependants.put("/views/common/adminHeader.jsp", Long.valueOf(1590489911532L));
>>>>>>> refs/remotes/origin/dev902
>>>>>>> refs/remotes/origin/master
=======
    _jspx_dependants.put("/views/common/adminHeader.jsp", Long.valueOf(1590556808706L));
>>>>>>> refs/remotes/origin/dev42
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("admin.model.vo.ProductStatic");
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    	ArrayList<ProductStatic> list = (ArrayList<ProductStatic>)request.getAttribute("list");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("        \r\n");
      out.write(" \t\t<script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/jquery/latest/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/momentjs/latest/moment.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css\" />\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("            #chartContainer{height: 600px; margin: auto; width: 50%;}\r\n");
      out.write("            table{\r\n");
      out.write("                border-collapse:collapse;\r\n");
      out.write("            }\r\n");
      out.write("            th{\r\n");
      out.write("                background-color:rgb(219, 216, 216);\r\n");
      out.write("            }\r\n");
      out.write("            td{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            label {\r\n");
      out.write("                display: block;\r\n");
      out.write("                font: 1rem 'Fira Sans', sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input,\r\n");
      out.write("            label {\r\n");
      out.write("                margin: .4rem 0;\r\n");
      out.write("            }\r\n");
      out.write("            h2{\r\n");
      out.write("            \ttext-align:center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* 추가 css */\r\n");
      out.write("            #graphWrap { width:70%; margin:0 auto; }\r\n");
      out.write("            #g_button_area { width:100%; border:1px solid #aaa; line-height:3; }\r\n");
      out.write("            #g_button_area table { border-collapse: collapse; width:100%; }\r\n");
      out.write("            #g_button_area tr:first-child td { border-bottom:1px solid #aaa; }\r\n");
      out.write("            #g_button_area tr:first-child td:last-child { border-bottom:none; border-left:1px solid #aaa; width:20%;  }\r\n");
      out.write("\r\n");
      out.write("            #g_button_area tr:last-child td:nth-of-type(2) { width:20%; }\r\n");
      out.write("            #g_button_area tr:last-child td:nth-of-type(4) { width:40%; }\r\n");
      out.write("            /* #g_button_area tr:first-child button { width:100px; height:36px; }\r\n");
      out.write("            #g_button_area tr:first-child input {  height:46px; width:140px; } */\r\n");
      out.write("            #g_button_area tr:first-child button { width:100px; height:36px; }\r\n");
      out.write("            #submit {  height:46px; width:140px; }\r\n");
      out.write("            #searchDate { width : 10%;}\r\n");
      out.write("            #graphWrap #g_button_area tr.g_title, #graphWrap #g_button_area td.g_title { background:#ddd; width:10%; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<title>FUN-THING</title>\n");
      out.write("\t\t<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{margin: auto; width: 100%;}\n");
      out.write("            /* #nav{margin: auto; width: 50%;} */\n");
      out.write("            #nav{background-color: rgb(199, 196, 196);}\n");
      out.write("            #nav_header{margin:auto; width:100%; height: 90px;}\n");
      out.write("            #nav_header ul li{float: left; width:6%; list-style-type: none; padding-right: 15px; padding-left: 15px; padding-top: 20px; line-height: auto;}\n");
      out.write("            #nav_header ul li button{width: 100%; height: 50px; background-color: gray; border-radius: 10px; border: 0px; font-size: 13px; font-weight: 400; color: white;}\n");
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
      out.write("            <div id=\"nav\" align=\"center\">\n");
      out.write("                <div id=\"nav_header\" align=\"center\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><button type=\"button\" onclick=\"productManage();\">상품관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"productQnA();\">상품문의</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"orderManage();\">주문관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"salesManage();\">매출관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"productStatic();\">상품통계</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"memberManage();\">회원 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"brandManage();\">브랜드 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"reviewManage();\">리뷰관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"qnaManage();\">1:1문의 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"pointManage();\">적립금</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"notice();\">공지사항 게시판</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"client();\">클라이언트</button></li>\n");
      out.write("                        \n");
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
      out.write("\t\t//상품 문의\n");
      out.write("\t\tfunction productQnA()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/productQnA\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction orderManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/orderInfo\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction memberManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction brandManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/brandServlet\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction reviewManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/AdminReviewSelect\";\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction qnaManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/personalQna\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction pointManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/point\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction notice()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/admin/NoticeView\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction client()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/main/mainView\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction salesManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/views/admin/salesManage.jsp\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction productStatic()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/views/admin/productStatic.jsp\";\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t \n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<h2>상품통계</h2>\r\n");
      out.write("  <div id=\"graphWrap\">\r\n");
      out.write("            <form method=\"get\" action=\"");
      out.print(request.getContextPath() );
      out.write("/admin/productStatic\">\r\n");
      out.write("            <script src=\"https://canvasjs.com/assets/script/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        \t<script src=\"https://canvasjs.com/assets/script/jquery.canvasjs.min.js\"></script>\r\n");
      out.write("                <div id=\"g_button_area\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"g_title\">기간별</td>\r\n");
      out.write("                            <td colspan=\"3\">\r\n");
      out.write("                                <input type = \"radio\" id = \"searchDate\" name = \"searchDate\" value=\"0\">일간\r\n");
      out.write("                                <input type = \"radio\" id = \"searchDate\" name = \"searchDate\"value=\"7\">주간\r\n");
      out.write("                                <input type = \"radio\" id = \"searchDate\" name = \"searchDate\"value=\"30\">월간\r\n");
      out.write("                                <input type = \"radio\" id = \"searchDate\" name = \"searchDate\"value=\"90\">분기별\r\n");
      out.write("                                <input type=\"date\" id=\"start\" name=\"firstDate\"\r\n");
      out.write("                                value=\"2000-01-01\"\r\n");
      out.write("                                > ~ \r\n");
      out.write("                                <input type=\"date\" id=\"end\" name=\"secondDate\"\r\n");
      out.write("                                value=\"2200-01-01\"\r\n");
      out.write("                                >\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td rowspan=\"2\" colspan=\"2\" class=\"g_btn_submit\">\r\n");
      out.write("                                <input type=\"submit\" id = \"submit\" value=\"조회\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                 \t<tr>\r\n");
      out.write("                        <td class=\"g_title\">성별</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type = \"radio\" value=\"\"  id=\"gender\" name = \"gender\" checked=\"checked\">전체\r\n");
      out.write("                            <input type = \"radio\" value=\"M\" id=\"gender\" name = \"gender\">남자\r\n");
      out.write("                            <input type = \"radio\" value=\"W\" id=\"gender\" name = \"gender\">여자\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td class=\"g_title\">카테고리별</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type = \"radio\" id = \"category\" name = \"category\" value=\"\"  checked=\"checked\">전체\r\n");
      out.write("                            <input type = \"radio\" id = \"category\" name = \"category\" value=\"1\">겉옷\r\n");
      out.write("                            <input type = \"radio\" id = \"category\" name = \"category\" value=\"2\">상의\r\n");
      out.write("                            <input type = \"radio\" id = \"category\" name = \"category\" value=\"3\">하의\r\n");
      out.write("                            <input type = \"radio\" id = \"category\" name = \"category\" value=\"4\">데님\r\n");
      out.write("                            <input type = \"radio\" id = \"category\" name = \"category\" value=\"5\">원피스\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"chartContainer\" style=\"height: 500px; width: 100%; \"></div>     <!-- 그래프 js 호출 -->       \r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                window.onload = function () {\r\n");
      out.write("\r\n");
      out.write("                    var options = {\r\n");
      out.write("                    \r\n");
      out.write("                        data: [{\r\n");
      out.write("                            type: \"column\",\r\n");
      out.write("                            yValueFormatString: \"#,###\",\r\n");
      out.write("                            indexLabel: \"{y}\",\r\n");
      out.write("                                color: \"#546BC1\",\r\n");
      out.write("                            dataPoints: [\r\n");
      out.write("                            \t");
if(!(list==null)) {
      out.write("\r\n");
      out.write("                            \t");
for(ProductStatic p : list) {
      out.write("\r\n");
      out.write("                                { label: \"");
      out.print(p.getbName());
      out.write("\", y: ");
      out.print(p.getoNum());
      out.write("},\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                                ");
} else {
      out.write("\r\n");
      out.write("                                { label: \"ACOC\", y: 0},\r\n");
      out.write("                                { label: \"elito\", y: 0},\r\n");
      out.write("                                { label: \"Kye\", y: 0},\r\n");
      out.write("                                { label: \"Clet\", y: 0},\r\n");
      out.write("                                { label: \"Bouton\", y: 0},\r\n");
      out.write("                                { label: \"Hier\", y: 0},\r\n");
      out.write("                                { label: \"Dube\", y: 0}\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                            ]\r\n");
      out.write("                        }]\r\n");
      out.write("                    };\r\n");
      out.write("                    $(\"#chartContainer\").CanvasJSChart(options);\r\n");
      out.write("                    \r\n");
      out.write("                    function updateChart() {\r\n");
      out.write("                        var performance, deltaY, yVal;\r\n");
      out.write("                        var dps = options.data[0].dataPoints;\r\n");
      out.write("                        for (var i = 0; i < dps.length; i++) {\r\n");
      out.write("                            deltaY = Math.round(0 );\r\n");
      out.write("                            yVal = deltaY + dps[i].y > 0 ? dps[i].y + deltaY : 0;\r\n");
      out.write("                            dps[i].y = yVal;\r\n");
      out.write("                        }\r\n");
      out.write("                        options.data[0].dataPoints = dps;\r\n");
      out.write("                        $(\"#chartContainer\").CanvasJSChart().render();\r\n");
      out.write("                    };\r\n");
      out.write("                    updateChart();\r\n");
      out.write("                    \r\n");
      out.write("                    setInterval(function () { updateChart() }, 500);\r\n");
      out.write("                    \r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
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
