<!-- 일대일 문의 페이지_희지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, personalQnA.model.vo.*, board.model.vo.*"%>
    
<%
	ArrayList<PersonalQnA> list = (ArrayList<PersonalQnA>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");	
	
	Member loginUser3 = (Member)session.getAttribute("loginUser");
	String userNo = (String)request.getAttribute("userNo");
 	String searchDate = (String)request.getAttribute("searchDate");
 	String firstDate = (String)request.getAttribute("firstDate");
 	String secondDate = (String)request.getAttribute("secondDate");
	
	
	
	// insert 성공 시 메세지 받기
	String InMsg = (String)request.getAttribute("InMsg");
	String q1_num = (String)request.getAttribute("q1_num");
	
	
	
	// PageIngo값 뽑아내기
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
	<title>Insert title here</title>
	<style>
		.r-cont-header{width: 100%; padding: 10px 20px; border-top: 1px solid #bbb;  border-bottom:1px solid #bbb;}

        .r-cont-header:after {clear:both; content:""; display:block;}

        .r-cont-text{width: 30%; margin: 0 0 0 0; margin-right: 0; padding: 0 0 0 0; float:left;}
        .r-cont-button{float: right;border: 1px solid #bbb; background-color: #bbb;height:30px;margin-top:13px;}

        .r-cont-button a{margin:20px; font-size: 15px; color: white;}


         /* 날짜 조회 영역 */
         .point{padding-left: 20px; width: 100%; margin: 60px 0;}

        /* 날짜 영역 */
        .point-search{margin-top: 30px; height: 130px; border-top: 1px solid #0f4a7e; border-bottom: 1px solid #bbb;border-left: 1px solid #bbb; border-right: 1px solid #bbb;}

        .point-search ul{display: inline-block;}

        .point-search ul:after{display: block; content: ""; clear: both;}

        .point-search ul li{float: left; margin-top: 45px; margin-left: 30px;}
        .point-search ul h3{ color: darkgray;}

         /* 날짜 조회 버튼 */
        #submit{width: 120px; height: 30px; background-color: #0f4a7e; color: white; border: none; font-size: 15px;}

        /* 1:1문의 조회 list 영역 */
        .search-list{padding-left: 20px; width: 100%;}
        .list-tb{margin-top: 30px; border-top: 2px solid #0f4a7e; width: 100%; border-bottom: 1px solid #0f4a7e; line-height: 50px;border-collapse: collapse;}
        .list-tb th{border-bottom: 1px solid #0f4a7e;}
        .list-tb tr{border: 0; padding:0; border-bottom: 1px solid #bbb;}
        .list-tb td{text-align: center; }
        .list-tb .tb-zero{margin-left: 20px;}
        
        .list-tb .tb-first{width: 200px;}
        .list-tb .tb-last{width: 200px;}
	
		/* 페이징 처리 부분 */     
        .pagingArea{margin: 0 auto; margin-top:20px; margin-bottom:20px;}
        .pagingArea button{border:0; font-size:middle; background:white; cursor:pointer;}
	
	</style>
	
	
</head>
<body>
	
	<%@ include file="../common/header.jsp" %>
	
	<%@ include file="../common/myPageHeader.jsp" %>
	
    <div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
	<div id="r-cont"> 
	<!-- 오른쪽 컨텐츠 수정 영역  -->
            <!-- 오른쪽 컨텐츠 헤더 영역-->
            <div class="r-cont-header">
               
                <div class="r-cont-text">
                    <h2 style=" text-align:left;">
                        <b style="color:#0f4a7e; font-size:20px;">1:1 문의</b>
                    </h2>
                </div>

                <!-- 1:1 문의하기 버튼 -->
                <div class="r-cont-button">
                    <a href="<%=request.getContextPath()%>/views/personalQnA/myPagePerQnA.jsp">1:1 문의하기</a>
                </div>
            
            </div> <!-- 오른쪽 컨텐츠 헤더 end -->


            <!-- 1:1 문의 날짜 조회 영역 -->
            <div class="point">
                <form method="get" action="<%=request.getContextPath()%>/PersonalQnA">
                    <div class="point-search">
                        <ul>
                           	<input type="hidden" name="userNo" value="<%=loginUser2.getmNo() %>">
                            <li><h3>조회기간</h3></li>
                            <li>
                                <input type="radio" name="searchDate" id="today" value="today">
                                <label for="today">오늘</label>
                            </li>
                            <li>
                                <input type="radio" name="searchDate" id="week" value="week">
                                <label for="week">7일</label>
                            </li>
                            <li>
                                <input type="radio" name="searchDate" id="month" value="month">
                                <label for="month">1개월</label>
                            </li>
                            <li>
                                <input type="radio" name="searchDate" id="3months" value="3months">
                                <label for="3months">3개월</label>
                            </li>
                            <li>
                                <input type="radio" name="searchDate" id="6months" value="6months">
                                <label for="6months">6개월</label>
                            </li>
                            <li>
                                <input type="radio" name="searchDate" id="year" value="year">
                                <label for="year">1년</label>
                            </li>
                            <li>
                                <input type="date" name="firstDate" value="2009/01/01">
                            </li>
                            <li>
                                <input type="date" name="secondDate" value="2009/01/01">
                            </li>
                            <li>
                                <input type="submit" id="submit" value="조회">
                            </li>
                        
                        </ul>

                    </div>
                </form><!-- 1:1 문의 날짜 조회기간 end -->
            </div><!-- 1:1 문의 조회 영역 end -->

            <br clear="both">

            <!-- 1:1 문의 조회 결과 영역 -->
            <div class="search-list">
                <table class="list-tb" id="list-table">
                
                <%if(!list.isEmpty()){ %>
                    <tr>
                    	<th class="tb-zero">번호</th>
                        <th class="tb-first">문의날짜</th>
                        <th>카테고리</th>
                        <th>제목</th>
                        <th class="tb-last">문의상태</th>
                    </tr>

					<%for(PersonalQnA pq : list){ %>
                    <tr align="center">
                    	<input type="hidden" id="perNo" value=<%=pq.getPerNo()%>>
                    	<input type="hidden"  id="mNo" value=<%=loginUser3.getmNo()%>>
                    	<td class="tb-zero"><%=pq.getRnum() %></td>
                        <td class="tb-first"><%=pq.getPerDate() %></td>
                        <td><%=pq.getPerCate() %></td>
                        <td><%=pq.getPerTitle() %></td>
                    
                        <%if(pq.getPerReYn().equals("Y")) {%>
                        	<td class="tb-last">답변완료</td>
                    	
                    	<%}else{ %>
                    		<td class="tb-last">답변대기</td>
                    	<%}%>
                    
                    </tr>
					
					<%}%> <!-- for문 end -->

                 <%}else{%><!-- if문 end --> 
                  	<tr>
                    	<th class="tb-zero">번호</th>
                        <th class="tb-first">문의날짜</th>
                        <th>카테고리</th>
                        <th>제목</th>
                        <th class="tb-last">문의상태</th>
                    </tr>
                    
                    <tr style="margin-top:30px;">
						<td colspan="9"><div style="text-align:center">검색 결과가 없습니다.</div></td>
					</tr> 
                  
               
                  <%} %>
                </table>

			
            </div><!-- 1:1 문의 조회 결과 영역 end -->


	<br><br>
	<!-- 페이징 처리 시작 -->
		<div class="pagingArea" align="center">
		
			<%if(maxPage == 1){ %>
				<button disabled onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currntPage=1&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"> << </button>
			
			<%}else { %>
				<button onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currntPage=1&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"> << </button>
			<%} %>
			<!-- 맨 처음으로 -->
			
		
		
			<!-- 이전 페이지로 -->
			<%if(currentPage == 1){ %>
				<button disabled> < </button>
		
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currentPage=<%=currentPage -1 %>&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"> < </button>
			<%} %>
		
		
			<!-- 10개의 페이지 목록 -->
			<%for(int p = startPage; p <= endPage; p++){ %>
				<%if(currentPage == p){ %>
					<button disabled><%=p %></button>
					
				<%}else{ %>
					<button onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currentPage=<%=p %>&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"><%=p %></button>
				<%} %>
			<%} %>
			
			
			<!-- 다음 페이지로 -->
			<%if(currentPage == maxPage){ %>
				<button disabled> > </button>
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currentPage=<%=currentPage + 1 %>&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"> > </button>
			<%} %>
		
			<%if(maxPage == 1){ %>
				<button disabled onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currentPage=<%=maxPage %>&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"> >> </button>
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/PersonalQnA?currentPage=<%=maxPage %>&userNo=<%=userNo%>&searchDate1=<%=searchDate %>&firstDate1=<%=firstDate %>&secondDate1=<%=secondDate%>'"> >> </button>
			<%} %>
			<!-- 맨 뒷 페이지로  -->
			
		
	</div>



<!-- 이 위까지만 수정하세요 -->
        </div><!--오른쪽 컨텐츠 수정 영역 end-->

            
    </div><!--content 영역 end-->
    
    <%@ include file="../common/footer.jsp" %>
    
    
    <script>
   
    	$(function(){
    		$("#list-table td").mouseenter(function(){
    			$(this).parent().css({"cursor" : "pointer"});
    			
    		}).click(function(){
        		var perNo = $(this).parent().children("input").val();
        		
        		<%-- location.href="<%=request.getContextPath()%>/personalQnADetail?mNo=<%=loginUser3.getmNo()%>&perNo=" + perNo; --%>
        		location.href="<%=request.getContextPath()%>/personalQnADetail?mNo=<%=loginUser3.getmNo()%>&perNo=" + perNo;
        		
    		});
    		
    		// insert 성공시 alert
    		<%if(InMsg != null){ %>
    			alert("<%=InMsg%>");
    		
    		<%}else{%>

    		
    		<%}%>
    		
    		
    		
    	})
    	
    </script>
    
    
	
	


</body>
</html>