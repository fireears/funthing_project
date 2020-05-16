<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="product.model.vo.Product" %>
<%@ page import="java.sql.Date" %>
<%
	Product p = (Product)request.getAttribute("product");
	String msg = (String)request.getAttribute("msg");
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>FUN-THING ADMIN</title>
		<style>
			#productDetail_area{margin: auto; width: 90%; padding-bottom:100px;}
			#productDetail_area>article>table{width: 100%;}
			#productDetail_area>article>table th{background-color:grey;}
			#productDetail_area>article>table button{width:100%; height:50px; border:0px; background-color:rgb(165, 160, 160); color:white; font-size:20px; font-weigth:600;}
		
		</style>
	</head>
	<body>
		<%@ include file="../common/adminHeader.jsp" %>
		<h2 align="center">상품 상세</h2>
		<section id="productDetail_area">
            <article>
            	<%if(p != null) { %>
                <table border="1px">
                    <tr>
                        <th>product_no</th><td><%=p.getpNo() %></td><th>brand_no</th><td><%=p.getbNo() %></td>
                    </tr>
                    <tr>
                        <th colspan="4">대표이미지</th>
                    </tr>
                    <tr>
                        <td colspan="4" align="center"><img src="<%=request.getContextPath()+"/images/thumbnail/" + p.getThumbnail() + ".jpg" %>"></td>
                    </tr>
                    <tr>
                        <th>product_name</th><td><%=p.getpName() %></td><th>style_no</th><td><%=p.getsNo() %></td>
                    </tr>
                    <tr>
                        <th>product_color</th><td><%=p.getP_color() %></td><th>product_size</th><td><%=p.getP_size() %></td>
                    </tr>
                    <tr>
                        <th>retail_price</th><td><%=p.getRetailPrice() %></td><th>dc_price</th><td><%=p.getDcRate() %></td>
                    </tr>
                    <tr>
                        <th>p_price</th><td><%=p.getpPrice() %></td><th>product_category</th><td><%=p.getpCategory() %></td>
                    </tr>
                    <tr>
                        <th colspan="4" align="center">prodcut_detail</th>
                    </tr>
                    <tr>
                        <td colspan="4"><%=p.getpDetail() %></td>
                    </tr>
                    <tr>
                        <th colspan="4" align="center">img_router</th>
                    </tr>
                    <tr>
                        <td colspan="4"><img src="<%=request.getContextPath()+"/images/thumbnail/" + p.getImgRouter() + ".jpg" %>"></td>
                    </tr>
                    <tr>
                        <th>product_point</th><td><%=p.getpPoint() %></td><th>ship_date</th><td><%=p.getShipDate() %></td>
                    </tr>
                    <tr>
                        <th>f_start_date</th><td><%=p.getfStartDate() %></td><th>f_end_date</th><td><%=p.getfEndDate() %></td>
                    </tr>
                    <tr>
                        <th>f_goal</th><td><%=p.getfGoal() %></td><th>f_sel_price</th><td><%=p.getfSelPrice() %></td>
                    </tr>
                    <tr>
                        <th>f_yn</th><td><%=p.getfYn() %></td><th>cal_no</th><td><%=p.getCalNo() %></td>
                    </tr>
                    <tr>
                        <th>f_prg_rate</th><td><%=p.getfPrgRate() %></td>
                    </tr>
                    <tr>
                    	<td></td><td><button onclick="pChange();">수정하기</button></td><td><button onclick="pDelete();">삭제하기</button></td><td></td>
                    </tr>
                </table>
                <% } else { %>
                	<%=msg %>
                <%} %>
            </article>
        </section>
	</body>
	<script>
		<%-- function pChange()
		{
			location.href="<%=request.getContextPath()%>/admin/productUpdate?method=" + <%=p.getpNo()%>;
		} --%>
		
		function pDelete()
		{
			location.href="<%=request.getContextPath()%>/admin/productUpdate?pNo="+'<%=p.getpNo()%>';
		}
	</script>
</html>