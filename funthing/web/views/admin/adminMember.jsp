<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.*, java.util.ArrayList, board.model.vo.*"%>
    
<%
	String msg = (String)request.getAttribute("msg");
	String msg1 = (String)request.getAttribute("msg1");	
	ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list");
	String userName = (String)request.getAttribute("userName");
	String userId = (String)request.getAttribute("userId");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<style>
      h2{text-align:center;}
      form{height: 100px; background-color: rgb(199, 196, 196);}
      #nav_section{margin:auto; width: 60%;}
      #nav_section ul{height: 100px; margin: auto; width: 100%; padding: 0px;}
      #nav_section ul li{float: left; list-style-type: none; padding-left: 50px; padding-right: 50px; font-size:18px; line-height: 100px; }
      #nav_section ul li .box{width: 300px; height:30px;}
      #nav_section ul li:last-child { float:right;}
      
      #area{margin: auto; width: 100%;}
      #area table{width: 100%; border: 1px solid;}
      #area table th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}
      #area table tr button{width: 80%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255);}
      
      /* 상품계시판 밑에 버튼 */
      #pageBtn{margin:auto; width:48%;}
      #pageBtn>button{margin:auto; width:4.2%; height:30px; text-align: center;}
      .pageBtn {border: 0; font-size: middle; background: white; cursor: pointer;}
      
   </style>
</head>
<body>
<%@ include file="../common/adminHeader.jsp" %>
	<h2>회원관리</h2>
	<form action="<%=request.getContextPath() %>/admin/memberList" method="GET">
		<div id="nav_section">
			<ul>
				<li><lable>회원 이름 : </lable><input type="text" class="box" id="userName" name="userName"></li>
				<li><lable>회원 아이디 : </lable><input type="text" class="box" id="userId" name="userId"></li>
				<li><input id="btn" type="submit" value="조회하기" style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;"></li>
			</ul>
		</div>
	</form>
	<br>
	<hr clear="both">
	<br>
	
	<section id=area>
		<article>
			<table>
		<% if(!list.isEmpty()){ %>
				<tr>
					<th>회원번호</th>
                    <th>아이디</th>
                    <th>성명</th>
                    <th>생년월일</th>
                    <th>이메일</th>
                    <th>휴대폰번호</th>
                    <th>회원가입날짜</th>
                    <th>추천인</th>
                    <th>알람수신동의여부</th>
                    <th>등급코드</th>
                    <th>적립금</th>
                    <th>누적결제금액</th>
                    <th>회원탈퇴유무</th>
                    <th>변경</th>
				</tr>
                <% for(Member b : list){ %>
                <tr align="center">
                	<input type="hidden" value="<%= b.getRnum()%>">
                    <td><%=b.getmNo() %></td>
                    <td><%=b.getmId() %></td>
                    <td><%=b.getmName() %></td>
                    <td><%=b.getbDay() %></td>
                    <td><%=b.getmEmail() %></td>
                    <td><%=b.getmTell() %></td>
                    <td><%=b.getJoinDate() %></td>
                    <td><%=b.getReference() %></td>
                    <td><%=b.getAlarm_YN() %></td>
                    <td><%=b.getGradeCode() %></td>
                    <td><%=b.getmPoint() %></td>
                    <td><%=b.gethPoint() %></td>
                    <td><%=b.getStatus_YN() %></td>
                    <td><button onclick="location.href='<%=request.getContextPath() %>/admin/modify?userId=<%= b.getmId()%>';">수정</button></td>
                </tr>
                <%} %>
                <%}else{ %>
                <tr>
	                <th>회원번호</th>
                    <th>아이디</th>
                    <th>성명</th>
                    <th>생년월일</th>
                    <th>이메일</th>
                    <th>휴대폰번호</th>
                    <th>회원가입날짜</th>
                    <th>추천인</th>
                    <th>알람수신동의여부</th>
                    <th>등급코드</th>
                    <th>적립금</th>
                    <th>누적결제금액</th>
                    <th>회원탈퇴유무</th>
                    <th>변경</th>
                </tr>
                <tr style="margin-top:30px;">
                	<td colspan="6"><div style="text-align:center">검색 결과가 없습니다. 다시 검색해주세요.</div></td>
                </tr>	
               	
                <%} %>
       		</table>
       		<br><br>
	
        	<div id="pageBtn" align="center">
        	<!--  페이징 처리 -->
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>//admin/memberList?currentPage=<%=1%>&userName=<%=userName%>&userId=<%=userId%>'"> << </button>
	        	
	        	<%if(currentPage <= 1){ %>
	        	<button class="pageBtn" disabled> < </button>
	        	<%}else{ %>
	        	<button class="pageBtn" onclick="location.href=;<%=request.getContextPath() %>/admin/memberList?currentPage=<%=currentPage-1 %>&userName=<%=userName%>&userId=<%=userId%>'"> < </button>
	        	<%} %>
	        	
	        	<%for(int p = startPage; p <= endPage; p++){ %>
	        		<%if(p == currentPage){ %>
	        			<button class="pageBtn" disabled><%=p %></button>
	        		<%}else{ %>
	        			<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/memberList?currentPage=<%=p %>&userName=<%=userName%>&userId=<%=userId%>'"><%=p %></button>
	        		<%} %>
	        	<%} %>	
	        	
	        	<%if(currentPage == maxPage) { %>
	        		<button class="pageBtn" disabled> > </button>
	        	<%}else{ %>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/memberList?currentPage=<%=currentPage+1 %>&userName=<%=userName%>&userId=<%=userId%>'"> > </button>
	        	<%} %>
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/memberList?currentPage=<%=maxPage %>&userName=<%=userName%>&userId=<%=userId%>'"> >> </button>
       		</div>
    	</article>
	</section>
	<script>

	$(function(){
		
	 <%if(msg != null){%>
		alert("<%=msg%>");
	 <%}%>
	});

	$(function(){
		
	 <%if(msg1 != null){%>
		alert("<%=msg1%>");
	 <%}%>
	});
	</script>
</body>
</html>