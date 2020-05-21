<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title></title>
	<script src="../../js/jquery-3.4.1.min.js"></script>
	<style>
		a {
			text-decoration: none;
			color: darkgrey;
		}
		
		#nextbtn {
			width: 200px;
			height: 30px;
			border-radius: 8px;
			color: white;
			background: darkgrey;
		}
		
		input::-webkit-input-placeholder {
			color: lightgray;
		}
		
		.cont {
			width: 1460px;
			margin: 0 auto;
		}
		
		.cont form {
			width: 600px;
			margin: 0 auto;
			/* border: 1px solid black; */
			text-align: center;
		}
	</style>
</head>
<body>

	<%@ include file="../common/header.jsp"%>


	<div style="padding: 20px; background: lightgray; margin: 0 auto; text-align: center; font-size: 25px;">
		비밀번호 찾기</div>
	 <br>
     <br>
     <br>

	<div class="cont">
		<form method="get" action="<%=request.getContextPath()%>/searchPwd.me">
            <h2>비밀번호 찾기</h2>
            <hr style="height: 5px; background: black;">
            <br>
            <div>아이디 입력</div>
            <div style="font-size: 12px; color: darkgray;">비밀번호를 찾고자 하는 아이디를 입력해 주세요.</div>
            <br>
            <input type="text" id="userId" name="userId" style="width: 600px; height: 30px; border-radius: 8px; " placeholder="아이디를 입력해주세요">
            <br>
            <br>
            <div style="font-size: 12px; color: darkgrey">
            	아이디를 모르시나요?
            <a href="<%=request.getContextPath()%>/views/member/searchId.jsp">아이디 찾기</a>
            </div>
            <br>
            <hr>
            <br>
                <input type="submit" value="다음" id="nextbtn" style="font-size: 16px;">
        </form>
	</div>


	<script>
         $("#userid").change(function(){
                    var value = $("#userid").val();
                    var reg = /^[a-z0-9]{4,12}$/;
                    if(!reg.test(value)){
                        alert("영문자와 숫자로 4글자 이상 12글자 이하여야 합니다.");
                        $("#userid").focus().val('');
                    }
         });
         $(function(){
         <%if(msg != null){%>
			alert("<%=msg%>");
		 <%}%>
        	 
         });
		
    </script>


	<%@ include file="../common/footer.jsp" %>


	
</body>
</html>