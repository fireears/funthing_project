<!-- 일대일 문의 디테일 페이지(클라이언트)_희지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="personalQnA.model.vo.*" %>
<%@ page import="member.model.vo.*" %>
    
<%
	PersonalQnA pq = (PersonalQnA)request.getAttribute("pq");
%>   
 
<!DOCTYPE html>
<html lang="en">
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
        .q1_wrap table { border-collapse: collapse; width:100%; border-top:2px solid #aaa; border-bottom:2px solid #aaa; margin:30px;}
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
            <h2>1:1 문의</h2>

            <div class="q1_wrap">
               
                    <input type="hidden" name="mNo" value="<%=loginUser.getmNo() %>"> <!-- loginUser2.getmNo()  -->
                    <table>
                     	 <tr>
                            <td>작성날짜</td>
                            <td><span><%= pq.getPerDate() %></span></td>
                        </tr>
                  	    <tr>
                            <td>회원아이디</td>
                            <td><span><%= pq .getmId()%></span></td>
                        </tr>
                        <tr>
                            <td>이름</td>
                            <td><span><%= pq.getmName() %></span></td>
                        </tr>
                         <tr>
                         <%if(pq.getoNo() == null){ %>
                            <td>주문번호</td>
                            <td><span>선택하신 주문이 없습니다.</span></td>
                        <%}else{ %>
                       		 <td>주문번호</td>
                            <td><span><%= pq.getoNo()%></span></td>
                        <%} %>
                        </tr>
                        <tr>
                            <td>상품명</td>
                            <td><span><%= pq.getpName()%></span></td>
                        </tr>
                        <tr>
                            <td>제목</td>
                            <td><span><%= pq.getPerTitle() %></span></td>
                        </tr>
                        <tr>
                            <td>내용</td>
                            <td><span><%= pq.getPerContents() %></span>
                        </tr>
                        <tr>
                            <td>작성자</td>
                            <td><%=pq.getmName()%></td>
                        </tr>
                        <tr>
                            <td>본문</td>
                            <td>
                                <span><p><%= pq.getPerContents() %></p></span>
                           
                            </td>
                        </tr>
                        </table>
                     <table id="replyTb">
                     	<tr> <td rowspan ="2">답변</td><th style="width:50px;">관리자</th><th style="width:50px;">답변내용</th><th style="width:50px;">답변날짜</th></tr>
                     	
                        <tr>
                       
                       <%if(pq.getPqreId() == null && pq.getPqreContent() == null &&  pq.getPqreDate() == null) {%>
                        <td style="background:white; width:50px;" align="center"><span>답변 대기중 입니다.</span></td>
                        <td style="width:50px;" align="center"><span>답변 대기중 입니다.</span></td>
						<td style="width:50px;" align="center"><span>답변 대기중 입니다.</span></td>
                        <%}else{ %>
                     	<td style="background:white; width:50px;" align="center"><span><%=pq.getPqreId() %></span></td>
                        <td style="width:50px;" align="center"><span><%=pq.getPqreContent() %></span></td>
						<td style="width:50px;" align="center"><span><%=pq.getPqreDate() %></span></td>
                     
                     	<%} %>
                        </tr>
                        
                    </table>
                    
                    <div class="q1_btnArea">
                    	<input type = "button" class="btn submit" id="backPage" onclick="backPage();" value="돌아가기">
                    </div>
                  
               
            </div>
            
            <!-- 다시 확인하기 -->
           <%--  <div align="center">
				<button onclick="location.href='<%=request.getContextPath() %>/PersonalQnA'">돌아가기</button>
			</div> --%>
            
            
        </div>
    </div>
    </div>
    </div>
    
    <%@ include file="../common/footer.jsp" %>
    
    <script>
    	function backPage(){
    		location.href="<%=request.getContextPath()%>/PersonalQnA?userNo=<%=loginUser.getmNo()%>";	
    	}
    
    
    
    </script>
    
    
</body>
</html>