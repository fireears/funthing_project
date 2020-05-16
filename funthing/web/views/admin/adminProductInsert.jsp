<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FUN-THING</title>
<style>
	#productInsert{margin: auto; width: 80%;}
	#productInsert table{width: 100%; border:1px solid rgb(165, 160, 160); border-collapse: collapse;}
	#productInsert table tr{height: 55px;}
	#productInsert table th{background-color: rgb(165, 160, 160);}
	#productInsert table td{border:1px solid rgb(165, 160, 160);}
	#productInsert table input{width: 50%; height: 20px; margin-left: 10px;}
	#productInsert table select{width: 30%; height: 20px; margin-left: 10px;}
	
	#productInsertBtn{margin:auto; width:30%; height:50px; background-color:gray; color:white; font-size:25px; font-weight:600;}
</style>
</head>
<body>
	<%@ include file="../common/adminHeader.jsp" %>
	<h2 align="center">상품 등록</h2>
	<section id="productInsert">
         <article align="center">
         	<form action="<%=request.getContextPath() %>/admin/productInsert" method="GET">
	             <table>
	                 <tr>
	                     <th>상품번호</th><td><input type="text" name="pNo" placeholder="M0101001BKS"></td><th>브랜드번호</th><td><input type="text" name="bNo" placeholder="01"></td>
	                 </tr>
	                 <tr>
	                     <th>Thumbnail</th><td><input type="file" name="thumbnail"></td><th>상품명</th><td><input type="text" name="pName"></td>
	                 </tr>
	                 <tr>
	                     <th>color</th>
	                     <td>
	                         <select name="color" id="color">
	                             <option value="BK">BLACK</option>
	                             <option value="RD">RED</option>
	                             <option value="BL">BLUE</option>
	                             <option value="YE">YELLOW</option>
	                             <option value="WH">WHITE</option>
	                             <option value="KH">KHAKI</option>
	                             <option value="GN">GREEN</option>
	                         </select></td><th>size</th>
	                     <td>
	                         <select name="pSize" id="pSize">
	                             <option value="S">S</option>
	                             <option value="M">M</option>
	                             <option value="L">L</option>
	                         </select>
	                     </td>
	                 </tr>
	                 <tr>
	                     <th>retail_price</th><td><input type="text" name="retailPrice"></td><th>dc_rate</th><td><input type="text" name="dcRate"></td>
	                 </tr>
	                 <tr>
	                     <th>price</th><td><input type="text" name="pPrice"></td><th>p_category</th><td><input type="text" name="pCategory"></td>
	                 </tr>
	                 <tr>
	                     <th>s_no</th><td><input type="text" name="sNo"></td><th>product_detail</th><td><input type="text" name="pDetail"></td>
	                 </tr>
	                 <tr>
	                     <th>img_router</th><td><input type="file" name="imgRouter"></td><th>point</th><td><input type="text" name="pPoint"></td>
	                 </tr>
	                 <tr>
	                     <th>ship_date</th><td><input type="date" name="shipDate"></td><th>f_start_date</th><td><input type="date" name="f_start_date"></td>
	                 </tr>
	                 <tr>
	                     <th>f_end_date</th><td><input type="date" name="f_end_date"></td><th>f_goal</th><td><input type="text" name="f_goal"></td>
	                 </tr>
	                 <tr>
	                     <th>f_sel_price</th><td><input type="text" name="f_sel_price"></td><th>펀딩 진행 유무</th><td><input type="text" name="f_yn"></td>
	                 </tr>
	                 <tr>
	                     <th>cal_no</th><td><input type="text" name="calNo"></td>
	                 </tr>
	             </table>
	             <br><br>
	             <input type="submit" id="productInsertBtn" value="상품등록">
	             <br><br>
             </form>
         </article>
     </section>
</body>
</html>