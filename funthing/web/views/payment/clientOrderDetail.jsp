<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import=" payment.model.vo.*, java.util.ArrayList"%>
<%@ page import="java.text.DecimalFormat" %>
<%
	ArrayList<OrderUpdate> list = (ArrayList<OrderUpdate>)request.getAttribute("list");
	DecimalFormat formatter = new DecimalFormat("###,###");
	
	 
%>    
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    <script src="https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit"
    async defer></script>
    <style>
        .qna11 .q1_title h2 { color:#0f4a7e; line-height:3; border-top:1px solid #aaa; border-bottom:1px solid #aaa; }
        .q1_wrap { margin-top:40px;  }
        .q1_wrap table { border-collapse: collapse; width:100%; border-top:2px solid #aaa; border-bottom:2px solid #aaa; }
        .q1_wrap table tr { border-bottom:1px solid #aaa; width:100%; }
        .q1_wrap table tr td:nth-child(1) { width:30%; box-sizing:border-box; padding-left:20px; line-height:3; font-weight:700; background:#eee; color:#0f4a7e; }   
        .q1_wrap table tr td:nth-child(2) { width:70%; box-sizing:border-box; padding:8px 14px 8px; }
        .q1_wrap table button { width:80px; height:26px; line-height:26px; background:#0f4a7e; border:1px solid #aaa; color:#fff; margin-left:10px; }

        .q1_wrap .q1_text { font-size:14px; color:#777; }
        .q1_wrap input { height:24px; width:100%; }
        .q1_wrap textarea { resize: none; width:100%; }

        .q1_wrap .q1_btnArea { width:100%; text-align:center; margin-top:20px; }
        .q1_wrap .q1_btnArea .btn { margin:0 3px; width:160px; height:60px; font-size:16px; border:1px solid #ddd; background:#eee; }
        .q1_wrap .q1_btnArea .btn.submit { background:#0f4a7e; border:1px solid #aaa; color:#fff; }
    </style>
</head>
<body>
	<%@ include file="../common/header.jsp" %>
	
	<%@ include file="../common/myPageHeader.jsp" %>

	<div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
	<div id="r-cont"> 
	
	
    <div class="qna11">
        <div class="q1_title">
            <h2>주문 상세 내용</h2>

            <div class="q1_wrap">
                    <input type="hidden" name="mNo" value="<%=loginUser.getmNo() %>"> <!-- loginUser2.getmNo()  -->
                    <table>
                    <%for(OrderUpdate ou : list){ %>
                        <tr>
                      		<td>주문번호</td>
                      		<td><%= ou.getO_no()%></td>
                        </tr>
                        <tr>
                      		<td>주문일자</td>
                      		<td><%= ou.getO_date()%></td>
                        </tr>
                        <tr>
                      		<td>상품명 / 상품색상 / 사이즈  / 수량  </td>
                      		<td><%= ou.getpName()%> / <%= ou.getpSize()%> / <%= ou.getpColor()%> / <%=ou.getoNum() %>개</td>
                        </tr>
                        <tr>
                      		<td>받으실 분 </td>
                      		<td><%= ou.getRcv_name()%></td>
                        </tr>
                        <tr>
                      		<td>받으실 분 주소</td>
                      		<td><%= ou.getRcv_adrs()%></td>
                        </tr>
                        <tr>
                      		<td>받으실 분 전화번호</td>
                      		<td><%= ou.getRcv_phone()%></td>
                        </tr>
                        <tr>
                      		<td>배송 메모</td>
                      		<td><%= ou.getComment()%></td>
                        </tr>
                        <tr>
                      		<td>상품 가격</td>
                      		<td><%= formatter.format(ou.getTotalPrice())%> 원</td>
                        </tr>
                        <tr>
                      		<td>적립금 사용</td>
                      		<td><%=formatter.format(ou.getPoint_use())%> 원</td>
                        </tr>
                        <%if(ou.getShip_price().equals("Y")){ %>
                        <tr>
                      		<td>배송비</td>
                      		<td>5,000 원</td>
                        </tr>
                         <tr>
                      		<td>총 결제 금액</td>
                      		<td><%= formatter.format(ou.getPmnt_price() + 5000 )%> 원</td>
                        </tr>
                        <%}else{ %>
                         <tr>
                      		<td>배송비</td>
                      		<td>0 원</td>
                        </tr>
                         <tr>
                      		<td>총 결제 금액</td>
                      		<td><%= ou.getPmnt_price()%></td>
                        </tr>
                        <%} %>
                      <%if(ou.getCancelYn().equals("Y")){ %>
                        <tr>
                      		<td>배송 상태</td>
                      		<td>주문 취소</td>
                        </tr>
                        <%}else{ %>
                         <tr>
                      		<td>배송 상태</td>
                      		<td><%= ou.getPrcsStatus() %></td>
                        </tr>
                      <%} %><!-- if문 end --> 
                      <%} %><!-- for문 end -->
                    </table>
                    <div class="q1_btnArea">
                    	<input type="button" class="btn submit" id="backPage" onclick="backPage();" value="돌아가기">
                        <!-- <button type="button" class="btn submit" onclick="backPage();">돌아가기</button -->
                       
                    </div>
	            </div>
	        </div>
	    </div>
	    </div>
	    </div>
    
    <%@ include file="../common/footer.jsp" %>
    <script>
    
    	$(function(){
    		$("#backPage").click(function(){
    			location.href="<%=request.getContextPath()%>/member/myPageOrderList?userNo=<%=loginUser.getmNo()%>";
    		})
    	})
    	
    </script>
</body>
</html>