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
			#productDetail_area>article form{width:100%}
			#productDetail_area>article table{margin:auto; width: 80%;}
			#productDetail_area>article table th{background-color:grey;}
			#productDetail_area>article table button{width:100%; height:50px; border:0px; background-color:rgb(165, 160, 160); color:white; font-size:20px; font-weigth:600;}
		
		</style>
	</head>
	<body>
		<%@ include file="../common/adminHeader.jsp" %>
		<h2 align="center">상품 상세</h2>
		<section id="productDetail_area">
            <article>
            	<form method="GET" action="<%=request.getContextPath() %>/admin/productUpdate">
	                <table border="1px">
            	<%if(p != null) { %>
	                    <tr>
	                        <th>product_no</th><td><input type="text" name="pNo" value="<%=p.getpNo() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                        <th>brand_no</th><td><input type="text" name="bNo" value="<%=p.getbNo() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                    </tr>
	                    <tr>
	                        <th colspan="4">대표이미지</th>
	                    </tr>
	                    <tr>
	                        <td colspan="4" align="center"><img src="<%=request.getContextPath()+"/images/thumbnail/" + p.getThumbnail() + ".jpg" %>"></td>
	                    </tr>
	                    <tr>
	                        <th>product_name</th><td><input type="text" name="pName" value="<%=p.getpName() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                        <th>style_no</th><td><input type="text" name="sNo" value="<%=p.getsNo() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                    </tr>
	                    <tr>
	                        <th>product_color</th><td><input type="text" name="color" value="<%=p.getP_color() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                        <!-- <th>product_color</th>
	                        <td>
	                        	<select name="color" >
	                        		<option value="BK">BLACK</option>
	                        		<option value="RD">RED</option>
	                        		<option value="BL">BLUE</option>
	                        		<option value="YL">YELLOW</option>
	                        		<option value="WH">WHITE</option>
	                        		<option value="KH">KHAKI</option>
	                        		<option value="GN">GREEN</option>
	                        	</select>
	                        </td> -->
	                        <th>product_size</th><td><input type="text" name="size" value="<%=p.getP_size() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                    </tr>
	                    <tr>
	                        <th>retail_price</th><td><input type="text" name="retail_price" value="<%=p.getRetailPrice() %>"></td>
	                        <th>dc_price</th><td><input type="text" name="dcRate" value="<%=p.getDcRate() %>" ></td>
	                    </tr>
	                    <tr>
	                        <th>p_price</th><td><input type="text" name="pPrice" value="<%=p.getpPrice() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                        <th>product_category</th><td><input type="text" name="pCategory" value="<%=p.getpCategory() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                    </tr>
	                    <tr>
	                        <th colspan="4" align="center">prodcut_detail</th>
	                    </tr>
	                    <tr>
	                        <td colspan="4"><input type="text" name="pDetail" value="<%=p.getpDetail() %>" style="margin:auto; width:100%; text-align:center;"></td>
	                    </tr>
	                    
	                    <tr>
	                        <th>product_point</th><td><input type="text" name="pPoint" value="<%=p.getpPoint() %>"></td>
	                        <th>ship_date</th><td><input type="date" name="shipDate" value="<%=p.getShipDate() %>"></td>
	                    </tr>
	                    <tr>
	                        <th>f_start_date</th><td><input type="date" name="fStartDate" value="<%=p.getfStartDate() %>"></td>
	                        <th>f_end_date</th><td><input type="date" name="fEndDate" value="<%=p.getfEndDate() %>"></td>
	                    </tr>
	                    <tr>
	                        <th>f_goal</th><td><input type="text" name="fGoal" value="<%=p.getfGoal() %>"></td>
	                        <th>f_sel_price</th><td><input type="text" name="fSelPrice" value="<%=p.getfSelPrice() %>"></td>
	                    </tr>
	                    <tr>
	                        <th>f_yn</th><td><input type="text" name="fYn" value="<%=p.getfYn() %>"></td>
	                        <th>cal_no</th><td><input type="text" name="calNo" value="<%=p.getCalNo() %>"></td>
	                    </tr>
	                    <tr>
	                        <th>f_prg_rate</th><td><input type="text" name="fPrgRate" value="<%=p.getfPrgRate() %>" style="background-color: rgb(207, 205, 205);" readonly></td>
	                    </tr>
	                    <tr>
	                        <th colspan="4" align="center">img_router</th>
	                    </tr>
	                    <tr>
	                        <td colspan="4"><img src="<%=request.getContextPath()+"/images/thumbnail/" + p.getImgRouter() + ".jpg" %>" style="width:100%"></td>
	                    </tr>
                <% } else if(p == null && msg != null){ %>
                		<tr><th><%=msg %></th></tr>
                <% } %>
	                    <tr>
	                    	<td colspan="2"><button type="submit">수정하기</button></td><td colspan="2"><button type="button" onclick="pDelete();">삭제하기</button></td>
	                    </tr>
	                </table>
                </form>
            </article>
        </section>
	</body>
	<script>
		
		
		function pDelete()
		{
			location.href="<%=request.getContextPath()%>/admin/productDelete?pNo="+'<%=p.getpNo()%>';
		}
	</script>
</html>