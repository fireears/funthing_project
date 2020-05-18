<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

</head>
<body>
	<%

		response.sendRedirect(request.getContextPath()+"/main/mainView");  
		/*  response.sendRedirect(request.getContextPath()+"/admin/mainView");  */

		
		/* response.sendRedirect(request.getContextPath()+"/views/payment/paymentInfo.jsp"); */
		/* response.sendRedirect(request.getContextPath()+"/views/payment/orderDetail.jsp"); */
		

	%>
</body>
</html>