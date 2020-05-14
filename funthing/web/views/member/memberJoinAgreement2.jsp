<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <title></title>
        <style>
            .cont{
            	width:1460px;
            	margin:0 auto;
            
            }
            
        </style>
    </head>
    <body>
    
    <%@ include file="../common/header.jsp" %>
    
        <div style="padding: 20px; background: lightgray; margin: 0 auto; text-align: center;">
            서비스 이용약관
        </div>
        <br>

		<div class="cont">
        <form>
            <h3>개인정보 수집 및 이용</h3>
            <hr>
            <pre>
1. - 목적 : 이용자 식별 및 본인여부 확인
- 항목 : 이름, 아이디, 비밀번호
- 보유 및 이용기간 : 회원탈퇴 후 5일까지

2. - 목적 : 민원 등 고객 고충처리
- 항목 : 이메일, 휴대전화번호
- 보유 및 이용기간 : 회원탈퇴 후 5일까지

3. - 목적 : 만 14세 미만 아동 확인
- 항목 : 법정 생년월일
- 보유 및 이용기간 : 회원탈퇴 후 5일까지
            </pre>
        </form>
        </div>
        
     <%@ include file="../common/footer.jsp" %>
        
        
    </body>
</html>