<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="board.model.vo.PageInfo" %>    
<%@ page import="java.util.ArrayList" %>
<%@ page import="personalQnA.model.vo.AdmimPersonalQna" %>
<%@ page import="member.model.vo.*" %>
<%@ page import="java.text.DecimalFormat" %>

<%
	ArrayList<MemberPoint> list = (ArrayList<MemberPoint>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	String searchKind = (String)request.getAttribute("searchKind");
	String searchText = (String)request.getAttribute("searchText");
	int num = 0;
	int currentPage = pi.getCurrentPage();
	int listCount = pi.getListCount();
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
<title>admin point</title>
<style>
	#searchArea {margin: 0 auto;text-align: center;}
		#searchForm {background: white;	}
		#search_kind {width: 100px;height: 40px;}
		#seachText {width: 230px;height: 35px;}
		#seachBtn {	background: grey;color: white;	border: 0;	width: 100px;	height: 40px;	font-weight: 600;	border-radius: 5px;}

		h2{text-align:center;}
		form{height: 100px; background-color: rgb(199, 196, 196);}
		#nav_section{margin:auto; width: 90%;}
		#nav_section ul{height: 100px; margin: auto; width: 100%; padding: 0px;}
		#nav_section ul li{float: left; list-style-type: none; padding-left: 20px; padding-right: 10px; line-height: 50px;}
		#nav_section ul li .box{width: 150px;}
		#nav_section ul li:last-child { float:right; width:1050px;margin-top:25px;}
		
		#searchArea{text-align:center;padding-top: 30px; }
		
		#areaTable{margin: auto; width: 100%;}
		#areaTable {border-collapse: collapse; width: 100%; border: 1px solid;}
		#areaTable th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}
		#areaTable tr{cursor:pointer;border-bottom: 1px solid grey;}
		/*#areaTable tr button{width: 50%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255); }*/
		
		/* 상품계시판 밑에 버튼 */
		#pageBtn{margin:auto; width:50%;}
		#pageBtn>button{margin:auto; width:3%; height:30px; text-align: center;}
		.pageBtn {border: 0; font-size: middle; background: white; cursor: pointer;}

</style>



</head>
<body>
	<%@ include file="../common/adminHeader.jsp" %>
	<h2>회원 적립금 관리</h2>
	<form action="<%=request.getContextPath() %>/admin/point" method="post">
		<div id="nav_section">
			<div id="searchArea">
			  
			        <span>
						 <select id="search_kind" name="searchKind">
						 		<option value="M_NO">회원 번호</option>
								<option value="M_ID">회원 아이디</option>
								<option value="M_NAME">회원 이름</option>
								<option value="POINT_CATE">적립금 유형</option>
					     </select>
					</span>
					<span> 
						<input type="text" id="seachText" name="searchText">
					</span>
					<span>
						<button type="submit" value="검색버튼" id="seachBtn">검색</button>
					</span>
					
	        </div>
	    </div>
	</form>


	<br>
	<hr clear="both">
	<br>

			 <section id=area> 
            <table id="areaTable">
 				
                <tr>
	                <th>번호</th> 
	                <th>회원번호</th>
	                <th>회원 아이디</th> 
	                <th>회원 이름</th>
	                <th>회원 등급 코드</th>
	                <th>등급 이름</th>
	                <th>적립율</th>
	                <th>적립금 번호</th>
	                <th>적립금 유형</th>
	                <th>주문 번호</th>
	                <th>적립금 내용</th>
	                <th>적립금 금액</th>
	                <th>회원 누적 적립금</th>
	                 
                </tr>
               
               
               <% if(!list.isEmpty()){ %>
	            <%for(MemberPoint mp : list) {%>  
	            <tr align="center" class="line">
	            	<input type="hidden" value="<%=mp.getPointNo() %>">
	            	<td><%=mp.getRnum() %></td>
	            	<td><%=mp.getmNo() %></td>
	            	<td><%=mp.getmId() %></td>
	            	<td><%=mp.getmName() %></td>
	            	<td><%=mp.getGrade_code()%></td>
	            	<td><%=mp.getGradeName() %></td>
	            	<td><%=mp.getPoint_rate() %></td>
	            	<td><%=mp.getPointNo() %></td>
	            	<td><%=mp.getPointCate() %></td>
	            	<td><%=mp.getPointCate() %></td>
	            	<td><%=mp.getPointContent() %></td>
	            	<td><%=formatter.format(mp.getPointAmount()) %></td>
	            	<td><%=formatter.format(mp.getMyPoint()) %></td>
	            </tr>
	            
	            <%} %>
                <%}else{ %>
                
                <tr style="margin-top:30px;">
                	<td colspan="13"><div style="text-align:center">검색 결과가 없습니다. 다시 검색해주세요.</div></td>
                </tr>	
                
                <%} %>
	        </table>
	        <br><br>
	        
	        <!-- 페이징처리 -->
	        <div id="pageBtn" align="center">
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/point?currentPage=<%=1 %>&searchText=<%=searchText %>&searchKind=<%=searchKind%>'"> << </button>
	        	
	        	<%if(currentPage <= 1) { %>
	        		<button class="pageBtn" disabled> < </button>
	        	<%} else {%>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/point?currentPage=<%=currentPage-1%>&searchText=<%=searchText %>&searchKind=<%=searchKind%>'"> < </button>
	        	<%} %>
	        	<%for(int p = startPage; p<=endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button class="pageBtn" disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/point?currentPage=<%=p%>&searchText=<%=searchText %>&searchKind=<%=searchKind%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	
	        	<%if(currentPage == maxPage) {%>
	        		<button class="pageBtn" disabled> > </button>
	        	<%} else { %>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/point?currentPage=<%=currentPage+1 %>&searchText=<%=searchText %>&searchKind=<%=searchKind%>'"> > </button>
	        	<%} %>
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/point?currentPage=<%=maxPage%>&searchText=<%=searchText %>&searchKind=<%=searchKind%>'"> >> </button>
	        	
	        	
	        </div>

	<br><br>
	<script>
		$(function() {
			$("table td").mouseenter(function() {
						$(this).parent().css({"background" : "darkgrey","cursor" : "pointer"});
					}).mouseout(function() {
						$(this).parent().css({"background" : "white"});
					}).click(
						function() {
							var pNo = $(this).parent().children("input").val();
							
							/* 번호별 상세내역 출력 */
							

						})
					})
		</script>
</body>



</html>	            	