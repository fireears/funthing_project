/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-26 02:27:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.calendar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.model.vo.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import member.model.vo.Member;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1590406450748L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1590384234759L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("product.model.vo");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.text.DateFormat");
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

      out.write('\r');
      out.write('\n');

	ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("list");
	
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href='");
      out.print(request.getContextPath() );
      out.write("/css/core_main.css' rel='stylesheet' />\r\n");
      out.write("<link href='");
      out.print(request.getContextPath() );
      out.write("/css/daygrid_main.css' rel='stylesheet' />\r\n");
      out.write("<script src='");
      out.print(request.getContextPath() );
      out.write("/js/core_main.js'></script>\r\n");
      out.write("<script src='");
      out.print(request.getContextPath() );
      out.write("/js/inter_main.js'></script>\r\n");
      out.write("<script src='");
      out.print(request.getContextPath() );
      out.write("/js/daygrid_main.js'></script>\r\n");
      out.write("<style>\r\n");
      out.write("\t/* calendar */\r\n");
      out.write("\t#calendar tr .fc-event { background:#8b9cad; line-height:2; }\r\n");
      out.write("\t#calendar tr:nth-child(2n) .fc-event { background:#9eb3c7; }\r\n");
      out.write("\t\r\n");
      out.write("\tbody {\r\n");
      out.write("\t    margin: 40px 10px;\r\n");
      out.write("\t    padding: 0;\r\n");
      out.write("\t    font-size: 14px;\r\n");
      out.write("\t  }\r\n");
      out.write("\t\r\n");
      out.write("\t#calendar {\r\n");
      out.write("\t    /* max-width: 900px; */\r\n");
      out.write("\t    margin: 0 auto;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t#content { width:1460px; margin:0 auto; }\r\n");
      out.write("\t\r\n");
      out.write("\t.calendarWrap:after { display:block; conetent:\"\"; clear:both; }\r\n");
      out.write("\t\r\n");
      out.write("\t#content #calendar { width:60%; float:left; box-sizing:border-box; padding-right:40px; }\r\n");
      out.write("\t#content ..fc-view-container * { height:20px; }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#cal_conRbox { float:left; box-sizing:border-box; width:40%; height:676px; overflow-y:scroll; padding:20px; border:1px solid #ddd;  }\r\n");
      out.write("\t\r\n");
      out.write("\t#content .calendarWrap { width:100%; margin:60px 0 100px; box-sizing:border-box; }\r\n");
      out.write("\t#content .calendarWrap h3 { text-align:center; font-size:34px; margin-bottom:60px; padding-bottom:60px; border-bottom:1px solid #ddd; }\r\n");
      out.write("\t\r\n");
      out.write("\t#content .cal_content { width:100%; margin:20px 0 40px; border-bottom:1px solid #ddd; }\r\n");
      out.write("\t#content .cal_content .cal_pNo_hd { display:none; }\r\n");
      out.write("\t#content .cal_content .cal_imgArea { width:100%; }\r\n");
      out.write("\t#content .cal_content .cal_imgArea img { width:100%; border:1px solid #ddd; }\r\n");
      out.write("\t#content .cal_content .cal_tit a{ font-size:34px; font-weight:700; margin:20px 0 10px; }\r\n");
      out.write("\t#content .cal_content .cal_price { margin-bottom:10px; }\r\n");
      out.write("\t#content .cal_content .cal_price .cal_op { color:#888; font-size:24px; text-decoration:line-through; }\r\n");
      out.write("\t#content .cal_content .cal_price .cal_sp { color:#333; font-size:28px; color:#0f4a7e; font-weight:700; display: inline-block; margin-left: 20px;}\r\n");
      out.write("\t#content .cal_content .cal_sd { font-size:24px; border-top:1px solid #ddd; margin-top:10px; line-height:2; }\r\n");
      out.write("\t#content .cal_content .cal_ed { font-size:24px; border-bottom:1px solid #ddd; margin-bottom:10px; line-height:2; }\r\n");
      out.write("\t#content .cal_content .cal_fdRate { font-size:28px; color:#0f4a7e; font-weight:700; margin:10px 0; }\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("  document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("\t  var calendarEl = document.getElementById('calendar');    \r\n");
      out.write("    var calendar = new FullCalendar.Calendar(calendarEl, {\r\n");
      out.write("    \t\r\n");
      out.write("      \t");

      	Calendar cal = Calendar.getInstance();
      	int index = 0;
		
      	
      	String datestr = format.format(Calendar.getInstance().getTime());
      	System.out.println(datestr);
      	
      out.write("\r\n");
      out.write("  \t \r\n");
      out.write("      plugins: [ 'interaction', 'dayGrid' ],\r\n");
      out.write("      dateClick : function(info){\r\n");
      out.write("    \t  var thisDate = info.dateStr;\r\n");
      out.write("    \t  console.log(thisDate);\r\n");
      out.write("    \t  // ajax 작성\r\n");
      out.write("    \t  $.ajax({\r\n");
      out.write("    \t\t  url : \"");
      out.print(request.getContextPath());
      out.write("/dateClick\",\r\n");
      out.write("    \t\t  type : \"post\",\r\n");
      out.write("    \t\t  data : {\"thisDate\" : thisDate},\r\n");
      out.write("    \t\t  success : function(data){\r\n");
      out.write("    \t\t\t  // console.log(thisDate);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\t $.each(data, function(index, value){\r\n");
      out.write("    \t\t\t\t   //console.log(value.thumbnail+\", \" + value.prodName +\", \"+value.prodRetailPrice+\", \"+value.fPrgRate + \", \" + value.fStartdate + \", \" + value.fEnddate + \", \" + value.fPrgRate);\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t   var $calCont = $(\"<ul>\").attr(\"class\", \"cal_content\");\r\n");
      out.write("\t\t    \t\t   $(\"#cal_conRbox\").append($calCont);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   var $cal_pNo = $(\"<li>\").attr(\"class\", \"cal_pNo_hd\").text(value.prodNo);\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t   var $cal_img = $(\"<li>\").attr(\"class\", \"cal_imgArea\");\r\n");
      out.write("    \t\t\t\t   var $aImg = $(\"<a>\").attr(\"href\", \"");
      out.print(request.getContextPath());
      out.write("/productDateil?pName=\" + value.prodName);\r\n");
      out.write("    \t\t\t\t   var $img = $(\"<img>\").attr(\"src\", \"/funthing/images/thumbnail/\"+value.thumbnail+\".jpg\");\r\n");
      out.write("    \t\t\t\t   var $a = $(\"<a>\").attr(\"href\", \"");
      out.print(request.getContextPath());
      out.write("/productDateil?pName=\" + value.prodName).text(value.prodName);\r\n");
      out.write("    \t\t\t\t   var $cal_tit = $(\"<li>\").attr(\"class\", \"cal_tit\");\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   var $cal_price = $(\"<li>\").attr(\"class\", \"cal_price\");\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t   var $cal_op = $(\"<span>\").attr(\"class\", \"cal_op\").text(value.prodRetailPrice);\r\n");
      out.write("    \t\t\t\t   var $cal_sp = $(\"<span>\").attr(\"class\", \"cal_sp\").text(value.prodPPrice);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   var $cal_sd = $(\"<li>\").attr(\"class\", \"cal_sd\").text(\"펀딩 시작 : \" + value.fStartdate);\r\n");
      out.write("    \t\t\t\t   var $cal_ed = $(\"<li>\").attr(\"class\", \"cal_ed\").text(\"펀딩 종료 : \" + value.fEnddate);\r\n");
      out.write("    \t\t\t\t   // var $cal_frt = $(\"<li>\").attr(\"class\", \"cal_fdRate\").text(value.fPrgRate + \"% 달성!\");\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t   // 펀딩률 계산\r\n");
      out.write("    \t\t\t\t   var $fund = Math.round((value.fSelPrice / value.fGoal) * 100);\r\n");
      out.write("    \t\t\t\t   var $cal_frt = $(\"<li>\").attr(\"class\", \"cal_fdRate\").text($fund + \"% 달성!\");\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   console.log($fund);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   $cal_img.append($aImg);\r\n");
      out.write("    \t\t\t\t   $aImg.append($img);\t\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   $cal_price.append($cal_op);\r\n");
      out.write("    \t\t\t\t   $cal_price.append($cal_sp);    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_pNo);\r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_img);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t  \r\n");
      out.write("    \t\t\t\t   $cal_tit.append($a);\r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_tit);\r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_price);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_sd);\r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_ed);\r\n");
      out.write("    \t\t\t\t   $calCont.append($cal_frt);\r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t\t   \r\n");
      out.write("    \t\t\t  });  \r\n");
      out.write("\t    \t\t\t  \r\n");
      out.write("    \t\t  },\r\n");
      out.write("    \t\t  error : function(request,status,error){\r\n");
      out.write("    \t\t\t /*  alert(\"실패\"); */\r\n");
      out.write("    \t\t\t alert(\"error:\"+error);\r\n");
      out.write("\r\n");
      out.write("    \t\t  }\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("    \t  });\r\n");
      out.write("    \t  \r\n");
      out.write("    \t  $(\".cal_content\").detach();\r\n");
      out.write("      },\r\n");
      out.write("      header: {\r\n");
      out.write("        left: 'prevYear,prev,next,nextYear',\r\n");
      out.write("        center: 'title',\r\n");
      out.write("        right: 'dayGridMonth today'\t\t//,dayGridWeek,dayGridDay\r\n");
      out.write("      },\r\n");
      out.write("      defaultDate: '");
      out.print(datestr);
      out.write("',\t// 지정 날짜 기준\r\n");
      out.write("      navLinks: true, // can click day/week names to navigate views\r\n");
      out.write("      editable: false,\r\n");
      out.write("      eventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write(" \t \r\n");
      out.write("      events: [\r\n");
      out.write("      ");
for(Product prd : list) { 
      out.write("\r\n");
      out.write("      ");
	String title = prd.getpName();
      		Date sDate = prd.getfStartDate();
      		Date eDate = prd.getfEndDate();
      		String pNo = prd.getpNo();
      		index++;
 	  
      out.write("\r\n");
      out.write("\t        {\r\n");
      out.write("\t          title: '");
      out.print(title);
      out.write("',\r\n");
      out.write("\t          start: '");
      out.print(sDate);
      out.write("',\r\n");
      out.write("\t          end: '");
      out.print(eDate);
      out.write("'\r\n");
      out.write("\t        }\r\n");
      out.write("\t        \r\n");
      out.write("\t        ");

	        if(index == list.size()){
	        	
      out.write("\r\n");
      out.write("\t        \t\r\n");
      out.write("\t        \t");

	        	
	        }else {
	        	
      out.write("\t        \t\r\n");
      out.write("\t        \t,\r\n");
      out.write("\t        \t");

	        }	        
	        
      out.write("\r\n");
      out.write(" \t ");
} 
      out.write("\r\n");
      out.write("     ]\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    calendar.render();\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
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
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<div class=\"calendarWrap\">\r\n");
      out.write("\t\t<h3>FUN-THING CALENDAR</h3>\r\n");
      out.write("\t\t  <div id='calendar'></div>\r\n");
      out.write("\t\t  <!-- calendar end -->\r\n");
      out.write("\t\t  <div id=\"cal_conRbox\">\r\n");
      out.write("\t\t  <!-- right area 호출 -->\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    ");
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
