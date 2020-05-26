<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.*"%>
<%
	String msg = (String)request.getAttribute("msg");
	Member memberPwd = (Member)request.getAttribute("memberPwd");
%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <title></title>
        <script src = "../../js/jquery-3.4.1.min.js"></script>
        <style>
            a{
                text-decoration:none;
                color: darkgrey;
            }
            #clear{
                width: 150px;
                height: 30px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
            }
            input::-webkit-input-placeholder { 
                color: lightgray; 
            }
            .cont{
            	width:1460px;
            	margin:0 auto;
            }
            .cont form{
             	width : 600px;
                margin: 0 auto;
                /* border: 1px solid black; */
                text-align: center;
            
            }
            
            
            
            
        </style>
    </head>
    <body>
    
    	<%@ include file="../common/header.jsp" %>
    
        <div style="padding: 20px; font-size: 25px; background: lightgray; margin: 0 auto; text-align: center;">
            비밀번호 변경
        </div>
         <br>
        <br>
        <br>
        
        <div class="cont">
        <form method="post" action="<%=request.getContextPath()%>/update.pwd?userId=<%=memberPwd.getmId() %>">
            <h2>비밀번호 찾기</h2>
            <hr style="height: 5px; background: black;">
           
                <h3>비밀번호 변경</h3>
                <div style="font-size: 12px; color: darkgray;">새로운 비밀번호를 등록해 주세요</div>
                <hr>
                <br>
                
                <input id="userpwd" type="password" name="userPwd" style="width: 300px; height: 25px; border-radius: 8px;" placeholder="새로운 비밀번호를 입력해주세요">
                <br>
                <br>
                <input id="pwd_check" type="password" name="pwd_check" style="width: 300px; height: 25px; border-radius: 8px;" placeholder="다시 한번 입력해주세요">
                <br>
                <br>
                <hr>
                <br>
                <input type="submit" value="확인" id="clear" style="font-size: 16px;">
            
        </form>
        </div>
        
        <%@ include file="../common/footer.jsp" %>

        <script>
        		// 비밀번호 
            	$("#userPwd").change(function(){
                    var value = $("#userPwd").val();
                    var reg = /^[a-z0-9]{6,18}$/;
                    if(!reg.test(value)){
                        alert("영문자와 숫자로 6글자 이상 12글자 이하여야 합니다.");
                        $("#userPwd").focus().val('');
                    }
                });
        		
        		// 비밀번호 체크
                $("#pwd_check").change(function(){
                    var pw1 = $("#userPwd").val();
                    var pw2 = $("#pwd_check").val();
                    
                    if(pw1 == pw2){
                        $("#pwd_check").val();
                    }else{
                        alert("비밀번호가 일치하지 않습니다.");
                        $("#pwd_check").focus().val('');
                    }
                });
        		
                // 인증 번호 성공 시
                $(function(){
                    <%if(msg != null){%>
           			alert("<%=msg%>");
           		 <%}%>
                   	 
                });
        </script>
        
        
    </body>
</html>