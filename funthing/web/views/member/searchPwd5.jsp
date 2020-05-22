<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.*"%>
<%
	String msg = (String)request.getAttribute("msg");
	
%>

<!DOCTYPE html>
<html lang="ko">
    <head>
        <title></title>
        <script src = "../js/jquery-3.4.1.min.js"></script>
        <style>
            a{
                text-decoration:none;
                color: darkgrey;
            }
            #homeBtn{
                width: 150px;
                height: 40px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
            }

            #loginBtn{
                width: 150px;
                height: 40px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
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
    
        <div style="padding: 20px; background: lightgray; margin: 0 auto; text-align: center; font-size: 25px;">
            비밀번호 변경
        </div>
         <br>
        <br>
        <br>
       
       
       	<div class="cont">
        <form>
            <h2>비밀번호 변경 완료</h2>
            <hr style="height: 5px; background: black;">
            <br>
            <h3>비밀번호 변경이 완료 되었습니다.</h3>
            <br>
            <div style="font-size: 12px; color: darkgray;">비밀번호 변경을 축하합니다.<br>
            지금 로그인 하시면 FUN-THING만의 다양한 서비스를 이용 할 수 있습니다.
            </div>
            <br>
            <br>
            <hr>
            <br>
            
            <div>
                <input type="button" value="메인페이지" id="homeBtn" onclick="goHome();">
                &nbsp;
                <input type="button" value="로그인하기" id="loginBtn" onclick="goLogin();">
            </div>
        </form>
        </div>
        
        
        <%@ include file="../common/footer.jsp" %>
        
        
    </body>
    <script>
       	
         $(function(){
             <%if(msg != null){%>
    			alert("<%=msg%>");
    		 <%}%>
            	 
             });
         
         function goHome(){
        	 location.href="<%=request.getContextPath()%>/main/mainView";
         }
         function goLogin(){
        	 location.href="<%=request.getContextPath()%>/views/member/memberLogin.jsp";
         }
    </script>
</html>