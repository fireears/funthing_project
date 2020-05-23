<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="product.model.vo.Product" %>
<%@page import="java.util.ArrayList" %>
<%@ page import="java.sql.Date" %>

<%@ page import="java.text.DecimalFormat" %>
<%
	ArrayList<Product> plist = (ArrayList<Product>)request.getAttribute("plist");
	ArrayList<Product> blist = (ArrayList<Product>)request.getAttribute("blist");
	String search = (String)request.getAttribute("search");
	String msg = (String)request.getAttribute("msg");
	
	DecimalFormat formatter = new DecimalFormat("###,###");
%>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>FUN-THING</title>

</head>
<body>
	<%@ include file="/views/common/header.jsp" %>
	<div id="container">
	        <div id="content">
	            <div class="main-img">
	                <img src="<%=request.getContextPath()%>/images/main_img.jpg" />
	            </div>
	            <div class="con-box discover">
	                <h2 id="title"><%=search %> 검색 결과</h2>
	                <ul class="product">
	                
	                
	                	<%if(!plist.isEmpty() && blist.isEmpty()) { %>
	                	<%	for(Product p : plist) { %>
	                	<%		
	                			String pNo = p.getpNo();
	                			String thumbnail = p.getThumbnail();
	                			String pName = p.getpName();
	                			int pPrice = p.getpPrice();
	                			Date fStartDate = p.getfStartDate();
	                			Date fEndDate = p.getfEndDate();
	                			
	                			String thumbnailUrl = "web/images/thumbnail/" + thumbnail + ".jsp";
	                	%>
		                    <li>
		                        <div class="prod-img">
		                            <%-- <a href="#none"><img src=<%=thumbnailUrl %>></a> --%>
		                            <%-- ex) <a href="<%=requset.getContextPath()%>/서블릿 앱핑?pNo="+<%=pNo%> + > --%>

		                             <a href="<%=request.getContextPath()%>/productDateil?pName=<%=pName %>"><img src="<%=request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" %>"></a> 

		                            <%-- <img src="<%=request.getContextPath()+"/images/book/"+b.getBookImage() %> --%>
		                            
		                       
		                        </div>
		                        <ul class="prod-cont">
		                            <!-- <li class="prod-brand">brand</li> -->
		                            <li class="prod-tit"><a href="<%=request.getContextPath()%>/productDateil?pName=<%=p.getpName() %>"><%=pName %></a></li>
		                            <li class="prod-tit"><a href="<%=request.getContextPath()%>/productDateil?pName=<%=p.getpName() %>"><%=formatter.format(pPrice) %>원</a></li>
		                            <li class="fun-sdate"><%=fStartDate %>~<%=fEndDate %></li>
		                        </ul>
		                    </li>
	                    <%} 
	                	}else if(plist.isEmpty() && !blist.isEmpty()) { %>
	                	<%	for(Product p : blist) { %>
	                	<%	
		                	String thumbnail = p.getThumbnail();
	            			String pName = p.getpName();
	            			int pPrice = p.getpPrice();
	            			Date fStartDate = p.getfStartDate();
	            			Date fEndDate = p.getfEndDate();
	            			
	            			String thumbnailUrl = "web/images/thumbnail/" + thumbnail + ".jsp";
	                	%>
		                    <li>
		                        <div class="prod-img">
		                            <%-- <a href="#none"><img src=<%=thumbnailUrl %>></a> --%>
		                            <a href="<%=request.getContextPath()%>/productDateil?pName=<%=p.getpName() %>"><img src="<%=request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" %>"></a>
		                            <%-- <img src="<%=request.getContextPath()+"/images/book/"+b.getBookImage() %> --%>
		                        </div>
		                        <ul class="prod-cont">
		                            <!-- <li class="prod-brand">brand</li> -->
		                            <li class="prod-tit"><a href="<%=request.getContextPath()%>/productDateil?pName=<%=p.getpName() %>"><%=pName %></a></li>
		                            <li class="prod-tit"><a href="<%=request.getContextPath()%>/productDateil?pName=<%=p.getpName() %>"><%=formatter.format(pPrice) %>원</a></li>
		                            <li class="fun-sdate"><%=fStartDate %>~<%=fEndDate %></li>
		                        </ul>
		                    </li>
		                    <%} %>
	                    
	                </ul>
	                    <%} else if(plist.isEmpty() && blist.isEmpty()){ %>
	                    	<h2><%=msg %></h2>
	                    	<br>
	                    <%} %>
	            </div>
            </div>
       	</div>
       	<%@include file="/views/common/footer.jsp" %>
</body>
</html>