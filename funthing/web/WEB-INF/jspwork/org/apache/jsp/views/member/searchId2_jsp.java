/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-13 08:17:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchId2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<html lang=\"ko\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <script src = \"../../js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            form{\r\n");
      out.write("                width : 600px;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("                /* border: 1px solid black; */\r\n");
      out.write("            }\r\n");
      out.write("            h2{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            table{\r\n");
      out.write("                width: 600px;\r\n");
      out.write("                /* text-align: center; */\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("                color:  lightgray;\r\n");
      out.write("            }\r\n");
      out.write("            input::-webkit-input-placeholder { \r\n");
      out.write("                color: lightgray; \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div style=\"padding: 20px; background: lightgray; margin: 0 auto; text-align: center;\">\r\n");
      out.write("            아이디 찾기\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form>\r\n");
      out.write("            <h2>아이디 찾기</h2>\r\n");
      out.write("            <hr style=\"height: 5px; background: black;\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"radio\" name=\"idchk\" id=\"emailchk\" value=\"1\" style=\"zoom: 1.5;\" checked=\"checked\">\r\n");
      out.write("            <label>이메일</label>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type=\"radio\" name=\"idchk\" id=\"phonechk\" value=\"2\" style=\"zoom: 1.5;\">\r\n");
      out.write("            <label>휴대폰 번호</label>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" id=\"userName\" name=\"userName\" style=\" height: 30px; width: 400px; border-radius: 8px;\" placeholder=\"이름를 입력하세요.\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td rowspan=\"2\">\r\n");
      out.write("                            <input type=\"submit\" id=\"btn1\" value=\"아이디 찾기\" style=\"height: 100px; width: 180px; color: white; border-radius: 8px; background: darkgrey;\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr id=\"email\">\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"email\" id=\"email1\" name=\"email\" style=\" height: 30px; width: 210px; border-radius: 8px;\"  placeholder=\"이메일을 입력해주세요\">\r\n");
      out.write("                            <select name=\"email\" id=\"selectEmail\" style=\" height: 35px; width: 180px; border-radius: 8px;\">\r\n");
      out.write("                                <option >직접입력</option>\r\n");
      out.write("                                <option value=\"@naver.com\">@naver.com</option>\r\n");
      out.write("                                <option value=\"@gmail.com\">@gmail.com</option>\r\n");
      out.write("                                <option value=\"@hanmail.net\">@hanmail.net</option>\r\n");
      out.write("                                <option value=\"@daum.net\">@daum.net</option>\r\n");
      out.write("                                <option value=\"@nate.com\">@nate.com</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>       \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr id=\"phone\" style=\"display: none;\">\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"tel\" id=\"phone1\" name=\"phone\" style=\"width: 400px; height: 30px; border-radius: 8px;\" placeholder=\"-빼고 입력해주세요\">\r\n");
      out.write("                        </td>       \r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div style=\"text-align: center;\"> \r\n");
      out.write("                <input type=\"button\" id=\"pwd\" value=\"비밀번호 찾기\" style=\" width: 200px; height: 40px; border-radius: 8px; font-size: 16px; background: lightgray;\">\r\n");
      out.write("                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <input type=\"submit\" id=\"login\" value=\"로그인하기\" style=\" width: 200px; height: 40px; border-radius: 8px; background: darkgrey; font-size: 16px; color: white;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("             $('input[type=radio][name=idchk]').on('click',function(){\r\n");
      out.write("            var chkValue = $('input[type=radio][name=idchk]:checked').val();\r\n");
      out.write("\r\n");
      out.write("            if(chkValue == 1){\r\n");
      out.write("                $('#email').css('display','block');\r\n");
      out.write("\r\n");
      out.write("                $('#phone').css('display','none');\r\n");
      out.write("            }else if(chkValue == 2){\r\n");
      out.write("                $('#email').css('display','none');\r\n");
      out.write("\r\n");
      out.write("                $('#phone').css('display','block');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $(\"#userid\").change(function(){\r\n");
      out.write("                    var value = $(\"#userid\").val();\r\n");
      out.write("                    var reg = /^[a-z0-9]{4,12}$/;\r\n");
      out.write("                    if(!reg.test(value)){\r\n");
      out.write("                        alert(\"영문자와 숫자로 4글자 이상 12글자 이하여야 합니다.\");\r\n");
      out.write("                        $(\"#userid\").focus().val('');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#userid1\").change(function(){\r\n");
      out.write("                    var value = $(\"#userid1\").val();\r\n");
      out.write("                    var reg = /^[a-z0-9]{4,12}$/;\r\n");
      out.write("                    if(!reg.test(value)){\r\n");
      out.write("                        alert(\"영문자와 숫자로 4글자 이상 12글자 이하여야 합니다.\");\r\n");
      out.write("                        $(\"#userid1\").focus().val('');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#phone1\").change(function(){\r\n");
      out.write("                    var value = $(\"#phone1\").val();\r\n");
      out.write("                    var reg = /^[0-9]{11,11}$/;\r\n");
      out.write("                    \r\n");
      out.write("                    if(!reg.test(value)){\r\n");
      out.write("                        alert(\"-를 제외한 숫자만을 입력해 주세요.\");\r\n");
      out.write("                        $(\"#phone1\").focus().val('');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#selectEmail\").change(function(){\r\n");
      out.write("                \tvar sum = ($(\"#email1\").val()) + ($(\"#selectEmail\").val());\r\n");
      out.write("                \t$(\"#email1\").val(sum);\r\n");
      out.write("                \r\n");
      out.write("                });\r\n");
      out.write("        })\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        </script>\r\n");
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
