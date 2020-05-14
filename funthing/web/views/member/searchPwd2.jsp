<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            #nextbtn{
                width: 200px;
                height: 30px;
                border-radius: 8px;
                color: white;
                background: darkgrey;
               
            }
            .cont{
            	width: 1460px;
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
            본인인증 수단 선택
        </div>
         <br>
        <br>
        <br>
        
        
        <div class="cont">
        <form>
            <h2>비밀번호 찾기</h2>
            <hr style="height: 5px; background: black;">
            
            <h3>인증수단 선택<h3>
            <div style="font-size: 12px; color: darkgray;">본인인증 방법을 선택해 주세요.</div>
            <hr>
            <br>
            <input type="radio" id="email" name="radio" style="zoom: 1.5;">
            <label>이메일 인증</label>
            <br>
            <label id="emailcheck"></label>
            <br>
            <div style="font-size: 12px; color: darkgray;">가입시 등록한 이메일로 인증번홀가 발송됩니다.</div>
            <br>
            <input type="radio" id="email" name="radio" style="zoom: 1.5;">
            <label>SMS 인증</label>
            <br>
            <label id="phonecheck"></label>
            <br>
            <br>
            <hr>
            <br>
                <input type="button" value="다음" id="nextbtn" style="font-size: 16px;">

        </form>
        </div>
        
        <%@ include file="../common/footer.jsp" %>
    </body>
</html>