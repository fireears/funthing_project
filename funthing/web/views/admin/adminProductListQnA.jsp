<!-- 상품문의 페이지_혜린 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.PageInfo" %>    
<%@ page import="java.util.ArrayList" %>
<%@ page import="productQnA.model.vo.AdminProductQnA" %>
 <%
    	ArrayList<AdminProductQnA> list = (ArrayList<AdminProductQnA>)request.getAttribute("list");
    	PageInfo pi = (PageInfo)request.getAttribute("pi");
    	
    	int num = 0;
    	int currentPage = pi.getCurrentPage();
    	int listCount = pi.getListCount();
    	int limit = pi.getLimit();
    	int maxPage = pi.getMaxPage();
    	int startPage = pi.getStartPage();
    	int endPage = pi.getEndPage();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product QnA</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
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
		#nav_section ul li:last-child { float:right;}
		
		#area{margin: auto; width: 100%;}
		#area table{border-collapse: collapse; width: 100%; border: 1px solid;}
		#area table th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}
		#area table tr{cursor:pointer;border-bottom: 1px solid grey;}
		#area table tr button{width: 50%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255); }
		
		/* 상품계시판 밑에 버튼 */
		#pageBtn{margin:auto; width:50%;}
		#pageBtn>button{margin:auto; width:3%; height:30px; text-align: center;}
		
		table .cont { display:none; }
        table .cont.show { display:contents; transition:50;}
        table .cont td { padding:20px 0; }
        
        .pageBtn {border: 0; font-size: middle; background: white; cursor: pointer;}
	</style>
</head>
<body>
	<%@ include file="../common/adminHeader.jsp" %>
	<h2>상품문의</h2>
	<form action="<%=request.getContextPath() %>/admin/productSearch" method="GET">
		<div id="nav_section">
		    <ul>
		        <li>
		        <span>
					 <select id="search_kind" name="searchKind">
							<option value="m_Id">아이디</option>
							<option value="o_No">상품번호</option>
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
	    </div>
	</form>


	<br>
	<hr clear="both">
	<br>

	<section id=area>
            <table>

                <tr>
	                <th>번호</th> <th>아이디</th> <th>상품번호</th> <th>상품명</th> <th>내용</th> <th>작성날짜</th>  <th>답변여부</th>  
                </tr>
                
	            <%for(AdminProductQnA pq : list) {%>  
	            <tr align="center" class="line">
	            	<input type="hidden" value="<%=pq.getpNo() %>">
	            	<td><%=pq.getQnaNo() %></td> <td><%=pq.getmId() %></td> <td><%=pq.getpNo() %></td><td><%=pq.getpName()%></td> <td><%=pq.getQnaTitle() %></td> <td><%=pq.getQnaDate() %></td> <td><%=pq.getReYn()%></td> 
	            </tr>
	            <tr class="cont">
	            	<td colspan="7">
	            	asdfasdfasdf
	            	</td>
	            </tr>
                <%} %>
	        </table>
	        <br><br>
	        <script>
           		 $("table .line").click(function(){
           			 
                $(this).next().toggleClass("show");
           		 });
	        </script>
	        
	        
	        <!-- 페이징처리 -->
	        <div id="pageBtn" align="center">
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/productQnA?currentPage=<%=1 %>'"> << </button>
	        	
	        	<%if(currentPage <= 1) { %>
	        		<button class="pageBtn" disabled> < </button>
	        	<%} else {%>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/productQnA?currentPage=<%=currentPage-1%>'"> < </button>
	        	<%} %>
	        	<%for(int p = startPage; p<=endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button class="pageBtn" disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/productQnA?currentPage=<%=p%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	
	        	<%if(currentPage == maxPage) {%>
	        		<button class="pageBtn" disabled> > </button>
	        	<%} else { %>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/productQnA?currentPage=<%=currentPage+1 %>'"> > </button>
	        	<%} %>
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/productQnA?currentPage=<%=maxPage%>'"> >> </button>
	        	
	        	
	        </div>
	</section>
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