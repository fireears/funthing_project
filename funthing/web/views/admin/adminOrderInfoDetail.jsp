<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="payment.model.vo.*, java.text.DecimalFormat"%>
      <% OrderInfoDetail od = (OrderInfoDetail)request.getAttribute("od"); 
      	 DecimalFormat formatter = new DecimalFormat("###,###");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OrderInfo Detail</title>
<style>
        #order_manage{margin:0 auto; width:1460px;}
        #order_table {
            border-top: 2px solid grey;
            border-collapse: collapse;
            border-botton:1px solid white;
            margin: 0 auto;
  			width: 1200px;
        }

        #order_table tr { border-bottom: 1px solid grey; line-height:2; }

        #order_table th { width:300px; padding:5px; padding-left:10px;text-align:left; }


        #order_table td { width:900px;padding:5px; padding-left:10px; text-align:left; }
    
    	#backBtn{
    	margin: 20px 130px 20px 0;
    	border:0;
    	background:grey;
    	height: 50px; 
    	border-radius: 10px; 
    	width:100px; 
    	font-size:large;
    	font-weight:600;
    	color:white;
    	cursor:pointer;
    	float:right;
    	 }
    	 #lastTr{border-botton:1px solid white;}
    </style>
</head>
<body>
	<%@ include file="../common/adminHeader.jsp"%>
	
	<h1 align="center">주문관리</h1>
    <div id="order_manage">
        <table id="order_table">
       		 <tr>
                <th>회원아이디</th>
                <td><%= od.getmId()%></td>
            </tr>
            <tr>
                <th>주문번호</th>
                <td><%= od.getoNo() %></td>
            </tr>
             <tr>
                <th>주문일자</th>
                <td><%= od.getoDate()%></td>
            </tr>
             <tr>
                <th>받을사람 성함</th>
                <td><%= od.getRcvName()%></td>
            </tr>
             <tr>
                <th>주소</th>
                <td><%= od.getRcvAdrs()%></td>
            </tr>
             <tr>
                <th>전화번호</th>
                <td><%= od.getRcvPhone()%></td>
            </tr>
             <tr>
                <th>남기실 말</th>
                <td><%= od.getCommentt()%></td>
            </tr>
             <tr>
                <th>상품번호</th>
                <td><%= od.getpNo()%></td>
            </tr>
             <tr>
                <th>수량</th>
                <td><%= od.getoNum()%></td>
            </tr>
             <tr>
                <th>상품 총 합계</th>
                <td><%=formatter.format(od.getTotalPrice())%>원</td>
            </tr>
             <tr>
                <th>적립금 사용금액</th>
                <td><%= formatter.format(od.getPointUse())%></td>
            </tr>
            <tr>
                <th>최종 결제 금액</th>
                <td><%= formatter.format(od.getPmntPrice())%>원</td>
            </tr>
        </table>
		<button id="backBtn" onclick="location.href='<%=request.getContextPath() %>/admin/orderInfo'">돌아가기</button>	
	</div>

</body>
</html>