/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
<<<<<<< HEAD
 * Generated at: 2020-05-19 09:20:48 UTC
=======
<<<<<<< HEAD
 * Generated at: 2020-05-19 06:12:52 UTC
=======
 * Generated at: 2020-05-20 05:58:16 UTC
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminProductInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< HEAD
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589854047549L));
=======
<<<<<<< HEAD
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589851751047L));
=======
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589897606729L));
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>FUN-THING</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#productInsert{margin: auto; width: 80%;}\r\n");
      out.write("\t#productInsert table{width: 100%; border:1px solid rgb(165, 160, 160); border-collapse: collapse;}\r\n");
      out.write("\t#productInsert table tr{height: 55px;}\r\n");
      out.write("\t#productInsert table th{background-color: rgb(165, 160, 160);}\r\n");
      out.write("\t#productInsert table td{border:1px solid rgb(165, 160, 160);}\r\n");
      out.write("\t#productInsert table input{width: 50%; height: 20px; margin-left: 10px;}\r\n");
      out.write("\t#productInsert table select{width: 30%; height: 20px; margin-left: 10px;}\r\n");
      out.write("\t\r\n");
      out.write("\t#productInsertBtn{margin:auto; width:30%; height:50px; background-color:gray; color:white; font-size:25px; font-weight:600;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
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
      out.write("                        <li><button type=\"button\" onclick=\"\">매출관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"\">상품통계</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"memberManage();\">회원 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"brandManage();\">브랜드 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"reviewManage\">리뷰관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"qnaManage();\">1:1문의 관리</button></li>\n");
      out.write("                        <li><button type=\"button\" onclick=\"pointManage();\">포인트</button></li>\n");
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
      out.write("/memberList.me\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction brandManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/brandServlet\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction reviewManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction qnaManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/personalQna\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction pointManage()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t\n");
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
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<h2 align=\"center\">상품 등록</h2>\r\n");
      out.write("\t<section id=\"productInsert\">\r\n");
      out.write("         <article align=\"center\">\r\n");
      out.write("         \t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/admin/productInsert\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t             <table>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>product_no</th><td><input type=\"text\" name=\"pNo\" placeholder=\"M0101001BKS\"></td><th>*brand_no</th><td><input type=\"text\" name=\"bNo\" placeholder=\"01\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th colspan=\"4\">*Thumbnail</th>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                 \t<td colspan=\"4\" align=\"center\"><input type=\"file\" name=\"thumbnail\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                 \t<th>*product_name</th><td><input type=\"text\" name=\"pName\"></td>\r\n");
      out.write("\t                 \t<th>*Gender</th>\r\n");
      out.write("\t                 \t<td>\r\n");
      out.write("\t                 \t\t<select name=\"gender\">\r\n");
      out.write("\t                 \t\t\t<option value=\"M\">MAN</option>\r\n");
      out.write("\t                 \t\t\t<option value=\"W\">WOMAN</option>\r\n");
      out.write("\t                 \t\t</select>\r\n");
      out.write("\t                 \t</td>\r\n");
      out.write("\t                 \t\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>*color</th>\r\n");
      out.write("\t                     <td>\r\n");
      out.write("\t                         <select name=\"color\" id=\"color\">\r\n");
      out.write("\t                             <option value=\"BK\">BLACK</option>\r\n");
      out.write("\t                             <option value=\"RD\">RED</option>\r\n");
      out.write("\t                             <option value=\"BL\">BLUE</option>\r\n");
      out.write("\t                             <option value=\"YE\">YELLOW</option>\r\n");
      out.write("\t                             <option value=\"WH\">WHITE</option>\r\n");
      out.write("\t                             <option value=\"KH\">KHAKI</option>\r\n");
      out.write("\t                             <option value=\"GN\">GREEN</option>\r\n");
      out.write("\t                         </select>\r\n");
      out.write("                       \t </td>\r\n");
      out.write("                         <th>*size</th>\r\n");
      out.write("\t                     <td>\r\n");
      out.write("\t                         <select name=\"pSize\" id=\"pSize\">\r\n");
      out.write("\t                             <option value=\"S\">S</option>\r\n");
      out.write("\t                             <option value=\"M\">M</option>\r\n");
      out.write("\t                             <option value=\"L\">L</option>\r\n");
      out.write("\t                         </select>\r\n");
      out.write("\t                     </td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>*retail_price</th><td><input type=\"text\" id=\"retailPrice\" name=\"retailPrice\"></td><th>*dc_rate</th><td><input type=\"text\" id=\"dcRate\" name=\"dcRate\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>price</th><td><input type=\"text\" id=\"pPrice\" name=\"pPrice\" style=\"background-color: rgb(165, 160, 160);\" readonly></td><th>*point</th><td><input type=\"text\" name=\"pPoint\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>*s_no</th><td><input type=\"text\" name=\"sNo\" value=\"1\"></td>\r\n");
      out.write("\t                     <th>*p_category</th>\r\n");
      out.write("\t                 \t<td>\r\n");
      out.write("\t                 \t\t<!-- <input type=\"text\" name=\"pCategory\"> -->\r\n");
      out.write("\t                 \t\t<select name=\"pCategory\" id=\"pCategory\">\r\n");
      out.write("\t                 \t\t\t<option value=\"01\">OUTER</option>\r\n");
      out.write("\t                 \t\t\t<option value=\"02\">TOP</option>\r\n");
      out.write("\t                 \t\t\t<option value=\"03\">BOTTOM</option>\r\n");
      out.write("\t                 \t\t\t<option value=\"04\">JEAN</option>\r\n");
      out.write("\t                 \t\t\t<option value=\"05\">ONPICE</option>\r\n");
      out.write("\t                 \t\t</select>\r\n");
      out.write("\t                 \t</td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                 \t<th colspan=\"4\">*product_detail</th>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                 \t<td colspan=\"4\"><textarea name=\"pDetail\" cols=\"200\" rows=\"15\" ></textarea></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th colspan=\"4\">img_router</th>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                 \t<td colspan=\"4\"><input type=\"file\" name=\"imgRouter\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>*ship_date</th><td><input type=\"date\" name=\"shipDate\"></td><th>*f_start_date</th><td><input type=\"date\" name=\"fStartDate\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     <th>*f_end_date</th><td><input type=\"date\" name=\"fEndDate\"></td><th>*f_goal</th><td><input type=\"text\" name=\"fGoal\" value=\"1000000\"></td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <tr>\r\n");
      out.write("\t                     \r\n");
      out.write("\t                     <th>*funding_YN</th>\r\n");
      out.write("\t                     <td>\r\n");
      out.write("\t                     \t<!-- <input type=\"text\" name=\"fYn\"> -->\r\n");
      out.write("\t                     \t<select name=\"fYn\">\r\n");
      out.write("\t                     \t\t<option value=\"Y\">Y</option>\r\n");
      out.write("\t                     \t\t<option value=\"N\">N</option>\r\n");
      out.write("\t                     \t</select>\r\n");
      out.write("                   \t\t </td>\r\n");
      out.write("\t                 </tr>\r\n");
      out.write("\t                 <!-- <tr>\r\n");
      out.write("\t                     <th>cal_no</th><td><input type=\"text\" name=\"calNo\"></td>\r\n");
      out.write("\t                 </tr> -->\r\n");
      out.write("\t             </table>\r\n");
      out.write("\t             <br><br>\r\n");
      out.write("\t             <input type=\"submit\" id=\"productInsertBtn\" value=\"상품등록\">\r\n");
      out.write("\t             <br><br>\r\n");
      out.write("             </form>\r\n");
      out.write("         </article>\r\n");
      out.write("     </section>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#dcRate\").blur(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#pPrice\").val(parseInt($(\"#retailPrice\").val()) -  (parseFloat($(\"#retailPrice\").val()) * (parseFloat($(this).val())*0.01)));\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#retailPrice\").blur(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#pPrice\").val(parseInt($(\"#retailPrice\").val()) -  (parseFloat($(\"#retailPrice\").val()) * (parseFloat($(this).val())*0.01)));\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
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
