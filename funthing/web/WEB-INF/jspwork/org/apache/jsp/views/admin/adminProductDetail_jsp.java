/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
<<<<<<< HEAD
 * Generated at: 2020-05-17 13:40:06 UTC
=======
 * Generated at: 2020-05-18 04:14:36 UTC
>>>>>>> refs/remotes/origin/dev900
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.model.vo.Product;
import java.sql.Date;

public final class adminProductDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
<<<<<<< HEAD
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589698373753L));
=======
    _jspx_dependants.put("/views/admin/../common/adminHeader.jsp", Long.valueOf(1589773302815L));
>>>>>>> refs/remotes/origin/dev900
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

	Product p = (Product)request.getAttribute("product");
	String msg = (String)request.getAttribute("msg");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>FUN-THING ADMIN</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t#productDetail_area{margin: auto; width: 90%; padding-bottom:100px;}\r\n");
      out.write("\t\t\t#productDetail_area>article form{width:100%}\r\n");
      out.write("\t\t\t#productDetail_area>article table{margin:auto; width: 80%;}\r\n");
      out.write("\t\t\t#productDetail_area>article table th{background-color:grey;}\r\n");
      out.write("\t\t\t#productDetail_area>article table button{width:100%; height:50px; border:0px; background-color:rgb(165, 160, 160); color:white; font-size:20px; font-weigth:600;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
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
      out.write("                        <li><button type=\"button\" onclick=\"\">상품문의</button></li>\n");
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
      out.write("\t\t\n");
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
      out.write("\t\t<h2 align=\"center\">상품 상세</h2>\r\n");
      out.write("\t\t<section id=\"productDetail_area\">\r\n");
      out.write("            <article>\r\n");
      out.write("            \t<form method=\"GET\" action=\"");
      out.print(request.getContextPath() );
      out.write("/admin/productUpdate\">\r\n");
      out.write("\t                <table border=\"1px\">\r\n");
      out.write("            \t");
if(p != null) { 
      out.write("\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>product_no</th><td><input type=\"text\" name=\"pNo\" value=\"");
      out.print(p.getpNo() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                        <th>brand_no</th><td><input type=\"text\" name=\"bNo\" value=\"");
      out.print(p.getbNo() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th colspan=\"4\">대표이미지</th>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <td colspan=\"4\" align=\"center\"><img src=\"");
      out.print(request.getContextPath()+"/images/thumbnail/" + p.getThumbnail() + ".jpg" );
      out.write("\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>product_name</th><td><input type=\"text\" name=\"pName\" value=\"");
      out.print(p.getpName() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                        <th>style_no</th><td><input type=\"text\" name=\"sNo\" value=\"");
      out.print(p.getsNo() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>product_color</th><td><input type=\"text\" name=\"color\" value=\"");
      out.print(p.getP_color() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                        <!-- <th>product_color</th>\r\n");
      out.write("\t                        <td>\r\n");
      out.write("\t                        \t<select name=\"color\" >\r\n");
      out.write("\t                        \t\t<option value=\"BK\">BLACK</option>\r\n");
      out.write("\t                        \t\t<option value=\"RD\">RED</option>\r\n");
      out.write("\t                        \t\t<option value=\"BL\">BLUE</option>\r\n");
      out.write("\t                        \t\t<option value=\"YL\">YELLOW</option>\r\n");
      out.write("\t                        \t\t<option value=\"WH\">WHITE</option>\r\n");
      out.write("\t                        \t\t<option value=\"KH\">KHAKI</option>\r\n");
      out.write("\t                        \t\t<option value=\"GN\">GREEN</option>\r\n");
      out.write("\t                        \t</select>\r\n");
      out.write("\t                        </td> -->\r\n");
      out.write("\t                        <th>product_size</th><td><input type=\"text\" name=\"size\" value=\"");
      out.print(p.getP_size() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>retail_price</th><td><input type=\"text\" name=\"retail_price\" value=\"");
      out.print(p.getRetailPrice() );
      out.write("\"></td>\r\n");
      out.write("\t                        <th>dc_price</th><td><input type=\"text\" name=\"dcRate\" value=\"");
      out.print(p.getDcRate() );
      out.write("\" ></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>p_price</th><td><input type=\"text\" name=\"pPrice\" value=\"");
      out.print(p.getpPrice() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                        <th>product_category</th><td><input type=\"text\" name=\"pCategory\" value=\"");
      out.print(p.getpCategory() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th colspan=\"4\" align=\"center\">prodcut_detail</th>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <td colspan=\"4\"><input type=\"text\" name=\"pDetail\" value=\"");
      out.print(p.getpDetail() );
      out.write("\" style=\"margin:auto; width:100%; text-align:center;\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    \r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>product_point</th><td><input type=\"text\" name=\"pPoint\" value=\"");
      out.print(p.getpPoint() );
      out.write("\"></td>\r\n");
      out.write("\t                        <th>ship_date</th><td><input type=\"date\" name=\"shipDate\" value=\"");
      out.print(p.getShipDate() );
      out.write("\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>f_start_date</th><td><input type=\"date\" name=\"fStartDate\" value=\"");
      out.print(p.getfStartDate() );
      out.write("\"></td>\r\n");
      out.write("\t                        <th>f_end_date</th><td><input type=\"date\" name=\"fEndDate\" value=\"");
      out.print(p.getfEndDate() );
      out.write("\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>f_goal</th><td><input type=\"text\" name=\"fGoal\" value=\"");
      out.print(p.getfGoal() );
      out.write("\"></td>\r\n");
      out.write("\t                        <th>f_sel_price</th><td><input type=\"text\" name=\"fSelPrice\" value=\"");
      out.print(p.getfSelPrice() );
      out.write("\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>f_yn</th><td><input type=\"text\" name=\"fYn\" value=\"");
      out.print(p.getfYn() );
      out.write("\"></td>\r\n");
      out.write("\t                        <th>cal_no</th><td><input type=\"text\" name=\"calNo\" value=\"");
      out.print(p.getCalNo() );
      out.write("\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th>f_prg_rate</th><td><input type=\"text\" name=\"fPrgRate\" value=\"");
      out.print(p.getfPrgRate() );
      out.write("\" style=\"background-color: rgb(207, 205, 205);\" readonly></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <th colspan=\"4\" align=\"center\">img_router</th>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                        <td colspan=\"4\"><img src=\"");
      out.print(request.getContextPath()+"/images/detail/" + p.getImgRouter() + ".jpg" );
      out.write("\" style=\"width:100%\"></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("                ");
 } else if(p == null && msg != null){ 
      out.write("\r\n");
      out.write("                \t\t<tr><th>");
      out.print(msg );
      out.write("</th></tr>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("\t                    <tr>\r\n");
      out.write("\t                    \t<td colspan=\"2\"><button type=\"submit\">수정하기</button></td><td colspan=\"2\"><button type=\"button\" onclick=\"pDelete();\">삭제하기</button></td>\r\n");
      out.write("\t                    </tr>\r\n");
      out.write("\t                </table>\r\n");
      out.write("                </form>\r\n");
      out.write("            </article>\r\n");
      out.write("        </section>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction pDelete()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/admin/productDelete?pNo=\"+'");
      out.print(p.getpNo());
      out.write("';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
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
