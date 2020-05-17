<!-- 주문관리페이지_혜린 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="payment.model.vo.*, java.util.ArrayList, board.model.vo.*"%>
<%
	
	ArrayList<OrderInfo> searchList = (ArrayList<OrderInfo>) request.getAttribute("searchList");
	PageInfo pi = (PageInfo) request.getAttribute("pi");

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
<title>order Info</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
 
<style>

#order_table {
	border-top: 2px solid grey;
	border-bottom: 1px solid grey;
	border-collapse: collapse;
	margin: 0 auto;
	width: 100%;
}

#order_table tr {
	border-bottom: 1px solid grey;
}

#order_table th {
	padding: 5px;
	padding-left: 10px;
	text-align: center;
}

#order_table td {
	padding: 5px;
	padding-left: 10px;
	text-align: center;
}

.pagingArea {
	margin: 0 auto;
	margin-top: 20px;
	margin-bottom: 20px;
}

.pageBtn {
	border: 0;
	font-size: middle;
	background: white;
	cursor: pointer;
}

#searchArea {
	margin: 0 auto;
	text-align: center;
}

#searchForm {
	background: white;
}

#search_kind {
	width: 100px;
	height: 40px;
}

#seachText {
	width: 230px;
	height: 35px;
}

#seachBtn {
	background: grey;
	color: white;
	border: 0;
	width: 100px;
	height: 40px;
	font-weight: 600;
	border-radius: 5px;
}

ul {
	list-style: none;
}

ul li {
	padding: 30px;
}

#searchForm {
	height: 100px;
	background-color: rgb(199, 196, 196);
}

#nav_section {
	margin: auto;
	width: 90%;
}

#nav_section ul {
	height: 100px;
	margin: auto;
	width: 100%;
	padding: 0px;
	list-style: none;
}

#nav_section ul li {
	float: left;
	list-style-type: none;
	padding-left: 20px;
	padding-right: 10px;
	line-height: 50px;
}

#nav_section ul li .box {
	width: 150px;
}

#nav_section ul li:last-child {
	float: right;
}


#area table{width: 100%; border: 1px solid;}
#area table th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}
#area table tr button{width: 50%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255);}
</style>

</head>
<body>
	<%@ include file="../common/adminHeader.jsp"%>
	
	<!-- 검색창 -->
	<h2 align="center">주문관리</h2>
	<div id="searchArea">
		<form id="searchForm"action="<%=request.getContextPath()%>/admin/orderInfo" method="post">
			<ul>
				<li>
				<span>
					 <select id="search_kind" name="searchKind">
							<option value="m_Id">아이디</option>
							<option value="o_No">주문번호</option>
				     </select>
				</span>
				<span> 
					<input type="text" id="seachText" name="searchText">
				</span>
				<span>
					<button type="submit" value="검색버튼" id="seachBtn">검색</button>
				</span>
				</li>
			</ul>
		</form>
	</div>
	

	<br>
	<hr clear="both">
	<br>

	<!-- 게시판 -->
	<section id=area>
		<article>
			<div id="order_manage">
				<table id="order_table">
				<% if(!searchList.isEmpty()){ %>
					<tr>
						<th>번호</th>
						<th>주문번호</th>
						<th>회원아이디</th>
						<th>결제방법</th>
						<th>결제유무</th>
						<th>배송단계</th>
						<th>총 합계</th>
						<th>취소여부</th>
					</tr>
					
						<%for (OrderInfo om : searchList) {%>
							<tr>
								<input type="hidden" value="<%=om.getmId()%>">
								<td><%=om.getRnum()%></td>
								<td><%=om.getoNo()%></td>
								<td><%=om.getmId()%></td>
								<td><%=om.getPmntMthd()%></td>
								<td><%=om.getPainYn()%></td>
								<td><%=om.getPrcsStatus()%></td>
								<td><%=om.getPmntPrice()%></td>
								<td><%=om.getCancelYn()%></td>
							</tr>
						
					<%}%>
					<%}else{ %>
					<tr>
						<th>번호</th>
						<th>주문번호</th>
						<th>회원아이디</th>
						<th>결제방법</th>
						<th>결제유무</th>
						<th>배송단계</th>
						<th>총 합계</th>
						<th>취소여부</th>
					</tr>			
					<tr style="margin-top:30px;">
                	<td colspan="8"><div style="text-align:center">검색 결과가 없습니다. 다시 검색해주세요.</div></td>
               		 </tr>	
					
				   <%} %>
				</table>
			</div>
			
			
			<!--페이징 처리 시작  -->
			<div class="pagingArea" align="center">
				<!-- 맨 처음으로 -->
				<button class="pageBtn"	onclick="location.href='<%=request.getContextPath()%>/admin/orderInfo?currentPage=1'"> << </button>

				<!-- 이전 페이지로 -->
				<%if (currentPage == 1) {%>
					<button class="pageBtn" disabled> < </button>
				<%} else {%>
					<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/orderInfo?currentPage-1'"> < </button>
				<%}%>

				<!-- 10개의 페이지 목록 -->
				<%for (int p = startPage; p <= endPage; p++) {%>
					<%if (currentPage == p) {%>
						<button class="pageBtn" disabled><%=p%></button>
					<%} else {%>
						<button class="pageBtn"	onclick="location.href='<%=request.getContextPath()%>/admin/orderInfo?currentPage=<%=p%>'"><%=p%></button>
					<%}%>
				<%}%>	

				<!-- 다음페이지로  -->
				<%if (maxPage == 1) {%>
					<button disabled class="pageBtn"> > </button>
				<%} else {%>
					<button class="pageBtn"	onclick="location.href='<%=request.getContextPath()%>/admin/orderInfo?currentPage+1'"> > </button>
				<%}%>	

				<!-- 맨 끝으로 -->
				<button class="pageBtn"	onclick="location.href='<%=request.getContextPath()%>/admin/orderInfo?currentPage=<%=maxPage%>'"> >> </button>
			</div>

			<script>
				$(function() {
					$("#order_table td").mouseenter(function() {
								$(this).parent().css({"background" : "darkgrey","cursor" : "pointer"});
							}).mouseout(function() {
								$(this).parent().css({"background" : "white"});
							}).click(
									function() {
										var mid = $(this).parent().children(
												"input").val();

										/* 아이디별 상세내역 출력 */
										location.href = "<%=request.getContextPath()%>/admin/orderInfoDetail?mid="+ mid

									})
				})
			</script>
		</article>
	</section>
</body>
</html>