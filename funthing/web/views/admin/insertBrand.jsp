<!-- 브랜드 등록 페이지_희지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String iErrorMsg = (String)request.getAttribute("iErrorMsg");
%>
    
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>admin_brand_insert</title>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <style>
       	#brandInsert{margin: auto; width: 80%;}
		#brandInsert table{width: 100%; border:1px solid rgb(165, 160, 160); border-collapse: collapse;}
		#brandInsert table tr{height: 55px;}
		#brandInsert table th{background-color: rgb(165, 160, 160);}
		#brandInsert table td{border:1px solid rgb(165, 160, 160);}
		#brandInsert table input{width: 50%; height: 20px; margin-left: 10px;}
		#brandInsert table select{width: 30%; height: 20px; margin-left: 10px;}
		
		#brandInsertBtn{margin:auto; width:30%; height:50px; background-color:gray; color:white; font-size:25px; font-weight:600;}
	       
    </style>

</head>
<body>
    
    <%@ include file="../common/adminHeader.jsp" %>
	<h1 style="text-align: center;">신규 브랜드 등록</h1>
    <section id="brandInsert">
		<article id="center">
			<form action="<%=request.getContextPath() %>/admin/brandInsert" method="post">
				<table>
					<!-- <tr>
						<th>브랜드 코드</th><td><input type="text" id="bNo" name="bNo"></td>
					</tr> -->
					
					<tr>
						<th>브랜드 명</th><td><input type="text" id="bName" name="bName"></td>
					</tr>
					
					<tr>
						<th>대표 명</th><td><input type="text" id="bCeo" name="bCeo"></td> 
					</tr>
					
					<tr>
						<th>연락처</th><td><input type="tel" id="bPhone" name="bPhone"></td>
					</tr>
					
					<tr>
						<th>이메일</th><td><input type="email" id="bEmail" name="bEmail"></td>
					</tr>
					
					<tr>
						<th>회사주소</th><td><input type="text" id="bAddress" name="bAddress"></td>
					</tr>
					
					<tr>
						<th>입점날짜</th><td><input type="date" id="bLchDate" name="bLchDate"></td>
					</tr>
					
					<tr>
						<th>입점유무</th>
						<td>
							<select id="bLchYn" name="bLchYn" style="height: 28px;">
		                		<option value="Y">입점</option>
		                		<option value="N">퇴점</option>
	                		</select>
	                	</td>
					</tr>
				</table>
			
			 <br><br>
             <input type="submit" id="brandInsertBtn" value="브랜드 등록">
             <br><br>
			
			</form>
	
		</article>
	</section>



    
    
    <script>
    	// 정보 등록 실패 시 alert
    	$(function(){
    		<%if(iErrorMsg != null){%>
    			alert("<%=iErrorMsg%>");
    			
    		
    		<%}%>
    		
    	})
    
    
    
    
    
    
    
    </script>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

</body>


</html>