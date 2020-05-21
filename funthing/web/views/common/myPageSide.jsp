<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.model.vo.Member"%>
    
<%
	Member loginUser2 = (Member)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>


</head>
<body>

        <div id="side">
            <div class="lnb mypage-lnb">
                <h2><a href=#">MY PAGE</a></h2>
                <h3>쇼핑정보</h3>
                <ul>
                    <li><a href="#">주문목록/배송조회</a></li>
                    <li><a href="#">취소내역</a></li>
                </ul>
    
                <h3>혜택관리</h3>
                <ul>
                    <li><a href="#">회원등급혜택안내</a></li>
                    <li><a href="<%=request.getContextPath()%>/memberPointServlet?userNo=<%=loginUser2.getmNo()%>">적립금</a></li>
                </ul>
    
                <h3>문의내역</h3>
                <ul>
                    <li><a href="<%=request.getContextPath()%>/PersonalQnA?userNo=<%=loginUser2.getmNo()%>">1:1 문의</a></li>
                     <li><a href="<%=request.getContextPath()%>/productQnaList?mNo=<%=loginUser2.getmNo()%>">나의 상품문의</a></li>
                    <li><a href="#">나의 리뷰</a></li>
                </ul>
    
                <h3>회원정보</h3>

                <ul>                          
                    <li><a href="<%=request.getContextPath()%>/myPage.me?userId=<%=loginUser2.getmId()%>">회원정보 변경</a></li>
                </ul>
            </div>
        </div>
        <!-- side end -->
</body>
</html>