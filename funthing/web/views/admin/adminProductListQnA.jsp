<!-- 상품문의 페이지_혜린 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.PageInfo" %>    
<%@ page import="java.util.ArrayList" %>
<%@ page import="productQnA.model.vo.AdminProductQnA" %>
<%@ page import="productQnA.model.vo.ProductQnAReply" %>
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
    	
    	ArrayList<ProductQnAReply> rlist = (ArrayList<ProductQnAReply>)request.getAttribute("rlist");
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
	<h2>상품문의</h2>
	<form action="<%=request.getContextPath() %>/admin/productQnA" method="GET">
		<div id="nav_section">
			<div id="searchArea">
			  
			        <span>
						 <select id="search_kind" name="searchKind">
								<option value="m_Id">아이디</option>
								<option value="p_No2">상품번호</option>
								<option value="RE_YN">답변여부</option>
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
	                <th>번호</th> <th>아이디</th> <th>상품번호</th> <th>상품명</th> <th>내용</th> <th>작성날짜</th>  <th>답변여부</th>  
                </tr>
                
	            <%for(AdminProductQnA pq : list) {%>  
	            <tr align="center" class="line">
	            	<input type="hidden" value="<%=pq.getQnaNo() %>">
	            	<td><%=pq.getQnaNo() %></td> <td><%=pq.getmId() %></td> <td><%=pq.getpNo() %></td><td><%=pq.getpName()%></td> <td><%=pq.getQnaTitle() %></td> <td><%=pq.getQnaDate() %></td> <td><%=pq.getReYn()%></td> 
	            </tr>
	            <tr class="cont">
	            	<td colspan="7">
	            	<div id="contDiv">
	            		<span class="info">번호 : </span><span><%=pq.getQnaNo() %></span><br><br>
	            		<span class="info">회원번호 : </span><span><%=pq.getmId() %></span><br><br>
	            		<span class="info">회원아이디 : </span><span><%=pq.getpNo() %></span><br><br>
	            		<span class="info">회원이름 : </span><span><%=pq.getpName() %></span><br><br>
	            		<span class="info">제목 : </span><span><%=pq.getQnaTitle() %></span><br><br>
	            		<span class="info">내용 : </span><span><%=pq.getQnaDate() %></span><br><br>
	           	
	            		 <!-- 댓글 -->
	            		<h3>관리자 답변</h3>
	            		<br>
	            		<div id="reply">
	            			<table align="center" id="replyTable">
	            				<tr>
	            					<td width=220px; ><textArea rows="4" cols="220" id="replyContent"></textArea></td>
	            					<td><button id="seachBtn">답변등록</button></td>
	            				</tr>
	            			</table>
	            	
	            		<%--<!-- 작성한 답변 보기  -->
	            		<div id="replySelect">
	            			<table id="replySelectTable">
	            				<%if(rlist.isEmpty()) {%>
	            					<tr><td>답변이 없습니다.</td></tr>
	            			
	            				<% }else { %>
								<% for(int i=0; i<rlist.size(); i++){ %>
								<tr>
									<td width="100px"><%= rlist.get(i).getQnareId() %></td>
									<td width="400px"><%= rlist.get(i).getQnareContent() %></td>
									<td width="200px"><%= rlist.get(i).getQnareDate() %></td>
								</tr>
								
									<% } %>
								<% } %>
							</table> --%>	
							</section>
	            		</div><!-- 댓글등록창 끝 -->
	            	</div><!-- 정보창 및 댓글등록창 끝 -->
	            	</td>
	            </tr>
	             <%} %>
	           <%}else{ %>
	            <tr>
	                <th>번호</th> <th>아이디</th> <th>상품번호</th> <th>상품명</th> <th>내용</th> <th>작성날짜</th>  <th>답변여부</th>  
                </tr>
                 <tr style="margin-top:30px;">
                	<td colspan="7"><div style="text-align:center">검색 결과가 없습니다. 다시 검색해주세요.</div></td>
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
		<%-- <script>
		$(function(){
			// 2_2. addReply 버튼 클릭 시 댓글 달기 기능을 실행했을 때 비동기적으로 새로 갱신된 리스트들을 테이블에 적용시키는 ajax
			$("#addReply").click(function(){
				   <%for(AdminProductQnA pq : list) {%>  
				var writer = <%=pq.getmId() %>
				var bid =  <%=pq.getQnaNo() %>;
				var content = $("#replyContent").val();
				<%}%>
				$.ajax({
					url:"admin/insertQnaRe",
					type:"post",
					data:{writer:writer, content:content, bid:bid},
					// InsertReplyServlet 만들러 가자!!!
					success:function(data){	// replySelectTable에 data writer, content, bid가 들어오면
						$replyTable = $("#replySelectTable");
						$replyTable.html(""); // 기존 테이블 정보 초기화
						
						// 새로 받아온 갱신된 댓글리스트들을 for문을 통해 다시 table에 추가
						for(var key in data){
							/* var $는 jquery뿐만 아니라 javascript에서 쓸 수 있는 변수이다. */
							var $tr = $("<tr>");
							var $writerTd = $("<td>").text(data[key].rWriter).css("width", "100px");
							var $contentTd = $("<td>").text(data[key].rContent).css("width", "400px");
							var $dateTd = $("<td>").text(data[key].createDate).css("width", "200px");
					
							$tr.append($writerTd);
							$tr.append($contentTd);
							$tr.append($dateTd);
							$replyTable.append($tr);
						}
						
						// 댓글 작성 부분 리셋
						$("#replyContent").val("");
					},
					error:function(request,status,error){
					    alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
					   }
				});
			});
		});
	</script> --%>
</body>
</html>