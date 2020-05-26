<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.model.vo.Member" %>

<%
	Member member = (Member)request.getAttribute("member");

	String userName = member.getmName();
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
            #prebtn{
                width: 150px;
                height: 40px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
            }

            #clear{
                width: 150px;
                height: 40px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
            }
            #div1{
                padding: 20px; 
                background: lightgray; 
                margin: 0 auto; 
                text-align: center; 
                font-size: 25px;
            }
            #div2{
                font-size: 12px; 
                color: darkgray;
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
        <%@ include file="../common/header.jsp" %>

        <div id="div1">
            	회원가입
        </div>
        <br>
        <br>
        <br>
        
        <div class="cont">
        <form>
            <h2>회원가입</h2>
            <hr style="height: 5px; background: black;">
            <br>
            <h3>회원가입이 완료 되었습니다.<h3>
            <br>
            <div id="div2"><%=member.getmName()%>님 회원가입을 축하합니다.<br>
            지금 로그인 하시면 FUN-THING만의 다양한 서비스를 이용 할 수 있습니다.
            </div>
            <br>
            <br>
            <hr>
            <br>
            
            <div>
                <input type="button" value="홈으로" id="prebtn" onclick="goHome();">
                &nbsp;
                <input type="button" value="로그인" id="clear" onclick="goLogin();">
            </div>
        </form>
        </div>
        
        <%@ include file="../common/footer.jsp" %>
        
        
    </body>
    <script>
    	// 홈버튼
        function goHome(){
        	location.href="<%=request.getContextPath()%>/main/mainView";
        }
        
    	// 로그인 버튼
        function goLogin(){
        	location.href="<%=request.getContextPath()%>/views/member/memberLogin.jsp";
        }
    </script>
</html>