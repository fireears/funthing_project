<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member"%>
    
<%
	Member searchId = (Member)session.getAttribute("searchId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		alert("아이디는 <%= searchId.getmId()%> 입니다.");
		location.href="<%=request.getContextPath()%>/views/member/memberLogin.jsp";
	</script>
</body>
</html>