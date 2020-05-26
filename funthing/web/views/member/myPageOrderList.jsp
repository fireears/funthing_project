<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="payment.model.vo.OrderList, java.util.ArrayList, board.model.vo.*"%>
	
<%@ page import="java.text.DecimalFormat" %>

<%
	ArrayList<OrderList> list = (ArrayList<OrderList>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");	
	
	/* Member loginUser3 = (Member)session.getAttribute("loginUser");*/
	String userNo = (String)request.getAttribute("userNo");
	int currentPage = pi.getCurrentPage();
	int limit = pi.getLimit();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	DecimalFormat formatter = new DecimalFormat("###,###");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<style>
		.r-cont-header {
			width: 100%;
			padding: 20px 20px;
			border-top: 1px solid #bbb;
			border-bottom: 1px solid #bbb;
		}
		
		.r-cont-header:after {
			clear: both;
			content: "";
			display: block;
		}
		
		.r-cont-text {
			width: 30%;
			margin: 0 0 0 0;
			margin-right: 0;
			padding: 0 0 0 0;
			float: left;
		}
		
		.r-cont-button {
			float: right;
			border: 1px solid #bbb;
			background-color: #bbb;
		}
		
		.r-cont-button a {
			margin: 20px;
			font-size: 15px;
			color: white;
		}
		
		/* 날짜 조회 영역 */
		.point {
			padding-left: 20px;
			width: 100%;
			margin: 60px 0;
		}
		
		/* 날짜 영역 */
		.point-search {
			margin-top: 30px;
			height: 130px;
			border-top: 1px solid #0f4a7e;
			border-bottom: 1px solid #bbb;
			border-left: 1px solid #bbb;
			border-right: 1px solid #bbb;
		}
		
		.point-search ul {
			display: inline-block;
		}
		
		.point-search ul:after {
			display: block;
			content: "";
			clear: both;
		}
		
		.point-search ul li {
			float: left;
			margin-top: 45px;
			margin-left: 30px;
		}
		
		.point-search ul h3 {
			color: darkgray;
		}
		
		/* 날짜 조회 버튼 */
		#submit {
			width: 120px;
			height: 30px;
			background-color: #0f4a7e;
			color: white;
			border: none;
			font-size: 15px;
		}
		
		/* 1:1문의 조회 list 영역 */
		.search-list {
			padding-left: 20px;
			width: 100%;
		}
		
		.list-tb {
			margin-top: 30px;
			border-top: 2px solid #0f4a7e;
			width: 100%;
			border-bottom: 1px solid #0f4a7e;
			line-height: 50px;
			border-collapse: collapse;
		}
		
		.list-tb th {
			border-bottom: 1px solid #0f4a7e;
		}
		
		.list-tb tr {
			border: 0;
			padding: 0;
			border-bottom: 1px solid #bbb;
		}
		
		.list-tb td {
			text-align: center;
		}
		
		.list-tb .tb-zero {
			margin-left: 20px;
		}
		
		.list-tb .tb-first {
			width: 200px;
		}
		
		.list-tb .tb-last {
			width: 200px;
		}
		
		/* 페이징 처리 부분 */
		.pagingArea {
			margin: 0 auto;
			margin-top: 20px;
			margin-bottom: 20px;
		}
		
		.pagingArea button {
			border: 0;
			font-size: middle;
			background: white;
			cursor: pointer;
		}
		</style>
</head>
<body>
	<%@ include file="../common/header.jsp"%>

	<%@ include file="../common/myPageHeader.jsp"%>
	<div id="content">
		<!-- 오른쪽 컨텐츠 영역 -->
		<%@ include file="../common/myPageSide.jsp"%>
		<div id="r-cont">
			<!-- 오른쪽 컨텐츠 수정 영역  -->

			<!-- 오른쪽 컨텐츠 헤더 영역-->
			<div class="r-cont-header">

				<div class="r-cont-text">
					<h2>
						<b style="color: #0f4a7e;">주문목록</b>
					</h2>
				</div>
			</div>
			<div class="point">
			<form method="get" action="<%=request.getContextPath()%>/member/myPageOrderList">
				<div class="point-search">
					<ul>
						<input type="hidden" name="userNo" value="<%=loginUser2.getmNo() %>">
						<li><h3>조회기간</h3></li>
						<li><input type="radio" name="searchDate" id="today"
							value="today"> <label for="today">오늘</label></li>
						<li><input type="radio" name="searchDate" id="week"
							value="week"> <label for="week">7일</label></li>
						<li><input type="radio" name="searchDate" id="month"
							value="month"> <label for="month">1개월</label></li>
						<li><input type="radio" name="searchDate" id="3months"
							value="3months"> <label for="3months">3개월</label></li>
						<li><input type="radio" name="searchDate" id="6months"
							value="6months"> <label for="6months">6개월</label></li>
						<li><input type="radio" name="searchDate" id="year"
							value="year"> <label for="year">1년</label></li>
						<li><input type="date" name="firstDate" value="09/01/01">
						</li>
						<li><input type="date" name="secondDate" value="09/01/01">
						</li>
						<li><input type="submit" id="submit" value="조회"></li>

					</ul>
				</div>
				</div>
			</form>
			<!-- 주문목록 조회기간 end -->

			<br clear="both">

			<div class="search-list">
				<table class="list-tb" id = "list-table">
					
					<tr>
						<th class="tb-zero">번호</th>
						<th class="tb-first">날짜</th>
						<th>주문번호</th>
						<th>상품명/컬러/사이즈</th>
						<th>상품금액/수량</th>
						<th class="tb-last">주문상태</th>
						<th>배송지수정/취소</th>
					</tr>
					<%if(!list.isEmpty()) {%>
					<%for(OrderList ol : list){ %>
					<tr align="center">
						<input type="hidden" id="listNo" value=<%=ol.getListNo() %>>

						<input type="hidden" id="userNo" value=<%=loginUser.getmNo()%>>

						<input type="hidden" id="mNo" value=<%=loginUser.getmNo()%>>

						<td class="tb-zero"><%=ol.getrNum() %></td>
						<td class="tb-first"><%=ol.getoDate() %></td>
						<td><%=ol.getoNo() %></td>
						<td><%=ol.getpName() %>/ <%=ol.getpColor() %> / <%=ol.getpSize() %></td>
						<td><%=formatter.format(ol.getpPrice()) %> 원 / <%=ol.getoNum() %> 개</td>
						<td><%=ol.getPrcsStatus() %></td>
						<th>
						<input type = "button" value = "배송지수정" id="submit" style="width:70px;font-size: 12px;"> 
						<input type = "button" value="취소하기" id="submit" style="width:70px;font-size: 12px;">
						</th>
					</tr>
					
                                     
					<%}}else{ %>
				
					<tr style="margin-top: 30px;">
						<td colspan="9"><div style="text-align: center">검색결과가없습니다.</div></td>
					</tr>

					<%} %>
				</table>
			</div>
			<!-- 주문목록 조회 결과 영역 end -->
			<!-- <br> <br> -->
			<div class="pagingArea" align="center">

				<!-- 맨 처음으로 -->
				<button
					onclick="location.href='<%=request.getContextPath() %>/OrderList?currntPage=1&userNo=<%=userNo%>'">
					<<</button>


				<!-- 이전 페이지로 -->
				<%if(currentPage == 1){ %>
				<button disabled><</button>

				<%}else{ %>
				<button
					onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=currentPage -1 %>&userNo=<%=userNo%>'">
					<</button>
				<%} %>


				<!-- 10개의 페이지 목록 -->
				<%for(int p = startPage; p <= endPage; p++){ %>
				<%if(currentPage == p){ %>
				<button disabled><%=p %></button>

				<%}else{ %>
				<button
					onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=p %>&userNo=<%=userNo%>'"><%=p %></button>
				<%} %>
				<%} %>


				<!-- 다음 페이지로 -->
				<%if(currentPage == maxPage){ %>
				<button disabled>></button>
				<%}else{ %>
				<button
					onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=currentPage + 1 %>&userNo=<%=userNo%>'">
					></button>
				<%} %>


				<!-- 맨 뒷 페이지로  -->
				<button
					onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=maxPage %>&userNo=<%=userNo%>'">
					>></button>

			</div>
			

		</div>
	</div>
	<%@ include file="../common/footer.jsp"%>


 

</body>
</html>