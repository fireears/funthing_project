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
         	<form action="<%=request.getContextPath() %>/admin/productInsert" method="POST" enctype="multipart/form-data">
	             <table>
	                 <tr>
	                     <th>product_no</th><td><input type="text" name="pNo" placeholder="M0101001BKS"></td><th>*brand_no</th><td><input type="text" name="bNo" value="01"></td>
	                 </tr>
	                 <tr>
	                     <th colspan="4">*Thumbnail</th>
	                 </tr>
	                 <tr>
	                 	<td colspan="4" align="center"><input type="file" name="thumbnail"></td>
	                 </tr>
	                 <tr>
	                 	<th>*product_name</th><td><input type="text" name="pName"></td>
	                 	<th>*Gender</th>
	                 	<td>
	                 		<select name="gender">
	                 			<option value="M">MAN</option>
	                 			<option value="W">WOMAN</option>
	                 		</select>
	                 	</td>
	                 	
	                 </tr>
	                 <tr>
	                     <th>*color</th>
	                     <td>
	                         <select name="color" id="color">
	                             <option value="BK">BLACK</option>
	                             <option value="RD">RED</option>
	                             <option value="BL">BLUE</option>
	                             <option value="YE">YELLOW</option>
	                             <option value="WH">WHITE</option>
	                             <option value="KH">KHAKI</option>
	                             <option value="GN">GREEN</option>
	                         </select>
                       	 </td>
                         <th>*size</th>
	                     <td>
	                         <select name="pSize" id="pSize">
	                             <option value="S">S</option>
	                             <option value="M">M</option>
	                             <option value="L">L</option>
	                         </select>
	                     </td>
	                 </tr>
	                 <tr>
	                     <th>*retail_price</th><td><input type="text" id="retailPrice" name="retailPrice"></td><th>*dc_rate</th><td><input type="text" id="dcRate" name="dcRate"></td>
	                 </tr>
	                 <tr>
	                     <th>price</th><td><input type="text" id="pPrice" name="pPrice" style="background-color: rgb(165, 160, 160);" readonly></td><th>*point</th><td><input type="text" name="pPoint"></td>
	                 </tr>
	                 <tr>
	                     <th>*s_no</th><td><input type="text" name="sNo" value="1"></td>
	                     <th>*p_category</th>
	                 	<td>
	                 		<select name="pCategory" id="pCategory">
	                 			<option value="01">OUTER</option>
	                 			<option value="02">TOP</option>
	                 			<option value="03">BOTTOM</option>
	                 			<option value="04">JEAN</option>
	                 			<option value="05">ONPICE</option>
	                 		</select>
	                 	</td>
	                 </tr>
	                 <tr>
	                 	<th colspan="4">*product_detail</th>
	                 </tr>
	                 <tr>
	                 	<td colspan="4"><textarea name="pDetail" cols="200" rows="15" ></textarea></td>
	                 </tr>
	                 <tr>
	                     <th colspan="4">img_router</th>
	                 </tr>
	                 <tr>
	                 	<td colspan="4"><input type="file" name="imgRouter"></td>
	                 </tr>
	                 <tr>
	                     <th>*ship_date</th><td><input type="date" name="shipDate"></td><th>*f_start_date</th><td><input type="date" name="fStartDate"></td>
	                 </tr>
	                 <tr>
	                     <th>*f_end_date</th><td><input type="date" name="fEndDate"></td><th>*f_goal</th><td><input type="text" name="fGoal" value="1000000"></td>
	                 </tr>
	                 <tr>
	                     
	                     <th>*funding_YN</th>
	                     <td>
	                     	<select name="fYn">
	                     		<option value="Y">Y</option>
	                     		<option value="N">N</option>
	                     	</select>
                   		 </td>
	                 </tr>
	             </table>
	             <br><br>
	             <input type="submit" id="productInsertBtn" value="상품등록">
	             <br><br>
             </form>
         </article>
     </section>
</body>
<script>
	$(function(){
		$("#dcRate").blur(function(){
			
			$("#pPrice").val(parseInt($("#retailPrice").val()) -  (parseFloat($("#retailPrice").val()) * (parseFloat($(this).val())*0.01)));
		})
		
		$("#retailPrice").blur(function(){
			
			$("#pPrice").val(parseInt($("#retailPrice").val()) -  (parseFloat($("#retailPrice").val()) * (parseFloat($(this).val())*0.01)));
		})
	})
</script>
</html>