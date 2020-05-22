<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "member.model.vo.Member"%>
    
<%
	Member memberSend = (Member)request.getAttribute("memberSend");

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
                height: 30px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
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
            본인인증 인증번호 확인
        </div>
        <br>
        <br>
        <br>
        
        <div class="cont">
        <form method="post" action="<%=request.getContextPath()%>/success.msg?userId=<%=memberSend.getmId()%>">
            <h2>비밀번호 찾기</h2>
            <hr style="height: 5px; background: black;">
            <h3>인증번호 입력<h3>
            <div style="font-size: 12px; color: darkgray;">수시된 SMS의 인증번호를 입력해 주세요.</div>
            <hr>
            <br>
            <input type="text" name="message" style="width: 300px; height: 25px; border-radius: 8px;" placeholder="인증번호를 입력해주세요">
            <br>
            <br>
            <div style="font-size: 12px; color: darkgrey">인증번호가 도착하지 않았나요?
                <a href="#">인증번호 다시받기</a>
            </div>
            <br>
            <hr>
            <br>
            <div>
                <input type="button" value="이전" id="prebtn" style="font-size: 16px;">
                &nbsp;
                <input type="submit" value="확인" id="clear" style="font-size: 16px;">
            </div>
        </form>
        </div>
        
        
        <%@ include file="../common/footer.jsp" %>
        
    </body>
</html>