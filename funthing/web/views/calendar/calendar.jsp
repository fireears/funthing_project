<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="product.model.vo.*, java.util.ArrayList, java.util.Date,
    java.util.Calendar, java.text.DateFormat, java.text.SimpleDateFormat"%>
<%
	ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("list");
	
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href='<%=request.getContextPath() %>/css/core_main.css' rel='stylesheet' />
<link href='<%=request.getContextPath() %>/css/daygrid_main.css' rel='stylesheet' />
<script src='<%=request.getContextPath() %>/js/core_main.js'></script>
<script src='<%=request.getContextPath() %>/js/inter_main.js'></script>
<script src='<%=request.getContextPath() %>/js/daygrid_main.js'></script>
<style>
	/* calendar */
	#calendar tr .fc-event { background:#8b9cad; line-height:2; }
	#calendar tr:nth-child(2n) .fc-event { background:#9eb3c7; }
	
	body {
	    margin: 40px 10px;
	    padding: 0;
	    font-size: 14px;
	  }
	
	#calendar {
	    /* max-width: 900px; */
	    margin: 0 auto;
	  }
	  
	#content { width:1460px; margin:0 auto; }
	
	.calendarWrap:after { display:block; conetent:""; clear:both; }
	
	#content #calendar { width:60%; float:left; box-sizing:border-box; padding-right:40px; }
	#content ..fc-view-container * { height:20px; }
	
	
	#cal_conRbox { float:left; box-sizing:border-box; width:40%; height:676px; overflow-y:scroll; padding:20px; border:1px solid #ddd;  }
	
	#content .calendarWrap { width:100%; margin:60px 0 100px; box-sizing:border-box; }
	#content .calendarWrap h3 { text-align:center; font-size:34px; margin-bottom:60px; padding-bottom:60px; border-bottom:1px solid #ddd; }
	
	#content .cal_content { width:100%; margin:20px 0 40px; border-bottom:1px solid #ddd; }
	#content .cal_content .cal_pNo_hd { display:none; }
	#content .cal_content .cal_imgArea { width:100%; }
	#content .cal_content .cal_imgArea img { width:100%; border:1px solid #ddd; }
	#content .cal_content .cal_tit { font-size:34px; font-weight:700; margin:20px 0 10px; }
	#content .cal_content .cal_price { margin-bottom:10px; }
	#content .cal_content .cal_price .cal_op { color:#888; font-size:24px; text-decoration:line-through; }
	#content .cal_content .cal_price .cal_sp { color:#333; font-size:28px; color:#0f4a7e; font-weight:700; display: inline-block; margin-left: 20px;}
	#content .cal_content .cal_sd { font-size:24px; border-top:1px solid #ddd; margin-top:10px; line-height:2; }
	#content .cal_content .cal_ed { font-size:24px; border-bottom:1px solid #ddd; margin-bottom:10px; line-height:2; }
	#content .cal_content .cal_fdRate { font-size:28px; color:#0f4a7e; font-weight:700; margin:10px 0; }
</style>
</head>
<body>
	<%@ include file="/views/common/header.jsp" %>

<div id="container">
	<div id="content">
		<div class="calendarWrap">
		<h3>FUN-THING CALENDAR</h3>
		  <div id='calendar'></div>
		  <!-- calendar end -->
		  <div id="cal_conRbox">
		  <!-- right area 호출 -->
		 </div>
	  </div>
	</div>
</div>
  
  
    <%@include file="/views/common/footer.jsp" %>

</body>
</html>