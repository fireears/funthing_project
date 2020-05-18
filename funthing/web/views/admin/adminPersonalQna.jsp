<!-- 1:1문의 페이지_혜린  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.PageInfo" %>    
<%@ page import="java.util.ArrayList" %>
<%@ page import="personalQnA.model.vo.AdmimPersonalQna" %>
<%
    	ArrayList<AdmimPersonalQna> list = (ArrayList<AdmimPersonalQna>)request.getAttribute("list");
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
<title>personal Qna</title>
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
		
		 .cont { display:none; }
         .cont.show { display:contents; transition:50;}
         .cont td { padding:20px 0; background:lightgrey;}

        .pageBtn {border: 0; font-size: middle; background: white; cursor: pointer;}
        
        #contDiv .info, h3 {margin:0; margin-left:20px; font-weight:600;}
		
		#replyBtn {background:grey; border:0; width:100px; hieght: 40px; font-weight: 600;	border-radius: 5px; color:white;}
		
		#replyTable {margin:0;margin-left:20px;}
		
		#replyTable td {margin-right:20px; padding:10px;}
		
	</style>
</head>
<body>
<%@ include file="../common/adminHeader.jsp" %>
	<h2>1:1문의 관리</h2>
	<form action="<%=request.getContextPath() %>/admin/personalQna" method="post">
		<div id="nav_section">
			<div id="searchArea">
			  
			        <span>
						 <select id="search_kind" name="searchKind">
						 		<option value="PER_CATE">문의유형</option>
								<option value="m_Id">아이디</option>
								<option value="o_No">주문번호</option>
								<option value="PER_RE_YN">답변여부</option>
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
 				<% if(!list.isEmpty()){ %>
                <tr>
	                <th>번호</th> <th>문의유형</th><th>아이디</th> <th>문의제목</th><th>주문번호</th><th>답변유무</th> 
                </tr>
               
	            <%for(AdmimPersonalQna pq : list) {%>  
	            <tr align="center" class="line">
	            	<input type="hidden" value="<%=pq.getPerQnaNo() %>">
	            	<td><%=pq.getPerQnaNo() %></td> <td><%=pq.getPerCate() %></td><td><%=pq.getmId() %></td> <td><%=pq.getPerTitle() %></td>
	            	 <td><%=pq.getoNo() %></td><td><%=pq.getPerReYn()%></td> 
	            </tr>
	            <tr class="cont">
	            	<td colspan="7">
	            	<div id="contDiv">

	            		<span class="info">문의유형 : </span><span><%=pq.getPerCate() %></span><br><br>
	            		<span class="info">회원아이디 : </span><span><%=pq.getmId() %></span><br><br>
	            		<span class="info">회원이름 : </span><span><%=pq.getmName() %></span><br><br>
	            		<span class="info">주문번호 : </span><span><%=pq.getoNo() %></span><br><br>
	            		<span class="info">상품번호 : </span><span><%=pq.getpNo() %></span><br><br>
	            		<span class="info">상품이름 : </span><span><%=pq.getpName() %></span><br><br>
	            		<span class="info">문의 제목 : </span><span><%=pq.getPerTitle() %></span><br><br>
	            		<span class="info">문의 내용 : </span><span><%=pq.getPerContents() %></span><br><br>
	            		<span class="info">첨부파일 : </span><div style="text-align:center"><img src="<%=request.getContextPath()+"/images/detail/" + pq.getAddFile() + ".jpg" %>" style="width:50%"></div><br><br>
	           	
	            		 <!-- 댓글 -->
	            		<h3>관리자 답변</h3>
	            		<br>
	            		<div id="reply">
	            		<form id="replyForm" action="<%=request.getContextPath() %>/admin/personalRe" method="post">
	            			<table align="center" id="replyTable">
	            				<tr>
	            					<input type="hidden" name="rownum" value="<%=pq.getRownum() %>">
	            					<input type="hidden" name="perQnaNo" value="<%=pq.getPerQnaNo() %>">
	            					<input type="hidden" name="tossmId" value="<%=pq.getmId() %>">
	            					<td width=220px;  ><textArea rows="4" cols="220" id="replyContent" name="replyContent"></textArea></td>
	            					<td><button type="submit" id="seachBtn" >답변등록</button></td>
	            				</tr>
	            			</table>
	            			</form>
	            			</section>
	            		</div><!-- 댓글등록창 끝 -->
	            	</div><!-- 정보창 및 댓글등록창 끝 -->
	            	</td>
	            </tr>
	            <%} %>
                <%}else{ %>
                
                <tr>
	                <th>번호</th> <th>문의유형</th><th>아이디</th> <th>문의제목</th><th>주문번호</th><th>답변유무</th> 
                </tr>
                <tr style="margin-top:30px;">
                	<td colspan="6"><div style="text-align:center">검색 결과가 없습니다. 다시 검색해주세요.</div></td>
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
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/personalQna?currentPage=<%=1 %>'"> << </button>
	        	
	        	<%if(currentPage <= 1) { %>
	        		<button class="pageBtn" disabled> < </button>
	        	<%} else {%>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/personalQna?currentPage=<%=currentPage-1%>'"> < </button>
	        	<%} %>
	        	<%for(int p = startPage; p<=endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button class="pageBtn" disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/personalQna?currentPage=<%=p%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	
	        	<%if(currentPage == maxPage) {%>
	        		<button class="pageBtn" disabled> > </button>
	        	<%} else { %>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/personalQna?currentPage=<%=currentPage+1 %>'"> > </button>
	        	<%} %>
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/personalQna?currentPage=<%=maxPage%>'"> >> </button>
	        	
	        	
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