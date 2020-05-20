<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.model.vo.Member" %>
<%
	Member searchId = (Member)session.getAttribute("searchId");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<style>
            
            #h2{
                text-align: center;
            }
            #logintable{
                width: 600px;
                /* text-align: center; */
            }
           .p{
				    vertical-align: middle;
            }
            a{
                text-decoration:none;
                color:  lightgray;
            }
            input::-webkit-input-placeholder { 
                color: lightgray; 
            }
            #div1{
                padding: 20px; 
                font-size: 25px; 
                background: lightgray; 
                margin: 0 auto; 
                text-align: center;
            }
            .log1{
                height: 30px;
                width: 400px; 
                border-radius: 8px;
            }
            #btn{
                height: 100px; 
                width: 180px; 
                color: white; 
                font-size: 16px; 
                border-radius: 8px; 
                background: darkgrey;
            }
            #check1{
                float: left;
                
            }
            #idsave{
                color: lightgray;
                float:left
            }
            #memberJoin{
                background: darkgrey; 
                color: white; 
                width: 600px; 
                text-align: center; 
                height: 80px; 
                border-radius: 8px; 
                font-size: 16px;
            }
            
            .cont{
            	width:1460px;
            	margin:0 auto;            
            }
            
            #loginform{
				width: 600px;
				margin: 0 auto;
				/* border: 1px solid black; */
				text-align: center;
            }
            
            
            
    </style>
</head>
<body>

	<%@ include file="../common/header.jsp" %>
	<div id="div1">
            LOGIN
        </div>
        <br>
        <br>
        <br>
        <br>
        
        
        <form id="loginform" method="get" action="<%=request.getContextPath() %>/login.me">
            <h2 id="h2">회원 로그인</h2>
            <hr>
            <br>
            <table id="logintable">
                <tr class="p">
                    <td class = "p">
                        <input type="text" class="log1" name="userId" id="userId" placeholder="이름을 입력해주세요">
                    </td>
                    <td rowspan="2">
                        <input type="submit" id="btn" value="LOGIN">
                    </td>
                    
                </tr>
                <tr>
                    <td>
                        <input type="password" class="log1" name="userPwd" id="userPwd" placeholder="비밀번호를 입력해주세요">
                    </td>
                </tr>
            </table>
            <div>
                <input type="checkbox" id="check1">
                <label id="idsave">아이디 저장</label>
                
                <label style="float: right;"><a href="searchPwd1.jsp">비밀번호찾기</a></label>
                <label style="float: right; text-decoration: none"><a href="searchId.jsp">아이디찾기 /&nbsp;</a></laebel>
                
            </div>
            <br>
            <hr>
            <br>
            <input type="button" id="memberJoin" value="회원가입">
            <br>
            <br>
            <hr>
            <br>
            <div style="text-align: center;">
                <label>SNS 로그인</label>
                <br>
                <br>
                <br>
                <br>
                카카오 아이디 로그인
            </div>

        </form>
        <script>
            $(function(){
        			
            	// 아이디 찾은 결과
           		 <%if(searchId != null){%>
           			alert("아이디는 <%= searchId.getmId()%> 입니다.");
           		 <%}%>
           		
            	// 아이디
                $("#userId").change(function(){
                    var value = $("#userId").val();
                    var reg = /^[a-z0-9]{4,12}$/;
                    if(!reg.test(value)){
                        alert("영문자와 숫자로 4글자 이상 12글자 이하여야 합니다.");
                        $("#userId").focus().val('');
                    }
                });
            	
            	// 비밀번호
                $("#userPwd").change(function(){
                    var value = $("#userPwd").val();
                    var reg = /^[a-z0-9]{6,18}$/;
                    if(!reg.test(value)){
                        alert("영문자와 숫자로 6글자 이상 12글자 이하여야 합니다.");
                        $("#userPwd").focus().val('');
                    }
                });
                
            	// 회원가입 버튼
                $("#memberJoin").click(function(){
                	location.href="<%=request.getContextPath()%>/views/member/memberJoin.jsp";
                });
                
                // 아이디 저장 코드
                var key = getCookie("key");
                $("#userId").val(key); 
                 
                if($("#userId").val() != ""){ // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,
                    $("#check1").attr("checked", true); // ID 저장하기를 체크 상태로 두기.
                }
                 
                $("#check1").change(function(){ // 체크박스에 변화가 있다면,
                    if($("#check1").is(":checked")){ // ID 저장하기 체크했을 때,
                        setCookie("key", $("#userId").val(), 7); // 7일 동안 쿠키 보관
                    }else{ // ID 저장하기 체크 해제 시,
                        deleteCookie("key");
                    }
                });
                 
                // ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.
                $("#userId").keyup(function(){ // ID 입력 칸에 ID를 입력할 때,
                    if($("#check1").is(":checked")){ // ID 저장하기를 체크한 상태라면,
                        setCookie("key", $("#userId").val(), 7); // 7일 동안 쿠키 보관
                    }
                });
            });
            function setCookie(cookieName, value, exdays){
                var exdate = new Date();
                exdate.setDate(exdate.getDate() + exdays);
                var cookieValue = escape(value) + ((exdays==null) ? "" : "; expires=" + exdate.toGMTString());
                document.cookie = cookieName + "=" + cookieValue;
            }
             
            function deleteCookie(cookieName){
                var expireDate = new Date();
                expireDate.setDate(expireDate.getDate() - 1);
                document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString();
            }
             
            function getCookie(cookieName) {
                cookieName = cookieName + '=';
                var cookieData = document.cookie;
                var start = cookieData.indexOf(cookieName);
                var cookieValue = '';
                if(start != -1){
                    start += cookieName.length;
                    var end = cookieData.indexOf(';', start);
                    if(end == -1)end = cookieData.length;
                    cookieValue = cookieData.substring(start, end);
                }
                return unescape(cookieValue);
            }
            // 아이디 저장 코드 end
            
        </script>
        
        <%@ include file="../common/footer.jsp" %>
</body>
</html>