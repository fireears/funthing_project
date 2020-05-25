<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, member.model.vo.*, board.model.vo.*"%>
<%@ page import="java.text.DecimalFormat" %>

<%
	Member loginUser3 = (Member)session.getAttribute("loginUser");
	
	ArrayList<MemberPoint> list = (ArrayList<MemberPoint>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	String userNo = (String)request.getAttribute("userNo");
	MemberPoint mp2 = (MemberPoint)request.getAttribute("mp2");
	String searchDate =(String)request.getAttribute("searchDate");
	String firstDate = (String)request.getAttribute("firstDate");
	String secondDate = (String)request.getAttribute("secondDate");
	
	int currentPage= pi.getCurrentPage();
	/* int listCount = pi.getPListCount(); */
	int limit = pi.getLimit();
	int maxPage= pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage= pi.getEndPage();
	
	DecimalFormat formatter = new DecimalFormat("###,###");
	
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <title>myPage_Point_적립금</title>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <style>
        .r-cont-header{width: 100%; padding: 50px 20px;border-top: 7px solid #0f4a7e; border-bottom:1px solid #0f4a7e;}

        .r-cont-header:after {clear:both;content:"";display:block;}

        .r-cont-header2{ width: 30%;margin: 0 0 0 0;margin-right: 0;padding: 0 0 0 0;float:left;}
        
        .r-cont-header span{width: 500px;color:cadetblue;font-weight: 200;}

        .r-cont-header h2{font-size: 24px;font-weight: 200;color:#003148;}
   
        /* 적립금 아이콘 부분 div */
        .r-cont-header-images{width:70%;text-align:center;margin-right: 0;float: right;margin-top: 0;ext-align: center;}

        /* 적립금 아이콘 부분 div */
        .r-cont-header-images h4{margin: 0;padding-bottom: 10px;}

         /* 적립금 아이콘 */  
        #header-images{width: 60px;height: 60px;opacity: 0.5;}
        
        /* 적립금 */
        .point{padding-left: 20px;width: 100%;margin: 60px 0;}

        .point h2{color: #0f4a7e;font-size: 24px;}

        /* 적립금 날짜 영역 */
        .point-search{margin-top: 30px;height: 130px;border-top: 1px solid #0f4a7e;border-bottom: 1px solid #bbb;border-left: 1px solid #bbb;border-right: 1px solid #bbb;}

        .point-search ul{display: inline-block;}

        .point-search ul:after{display: block; content: ""; clear: both;}

        .point-search ul li{float: left; margin-top: 45px;margin-left: 30px;}
        .point-search ul h3{color: darkgray;}

         /* 날짜 조회 버튼 */
        #submit{width: 120px; height: 30px;background-color: #0f4a7e; color: white;border: none;font-size: 15px;}


        /* 적립금 조회 list 영역 */
        .search-list{padding-left: 20px;width: 100%;margin: 60px 0;}
        .list-tb{margin-top: 30px;border-top: 2px solid #0f4a7e;width: 100%;border-bottom: 1px solid #0f4a7e;line-height: 50px;border-collapse: collapse; }
        .list-tb th{border-bottom: 1px solid #0f4a7e;}
        .list-tb tr{border: 0; padding:0; border-bottom: 1px solid #bbb;}
        .list-tb td{text-align: center;}
        .list-tb .tb-first{width: 200px;}
        .list-tb .tb-last{width: 200px;}

		/* 페이징 처리 부분 */     
        .pagingArea{margin: 0 auto; margin-top:20px; margin-bottom:20px;}
        .pagingArea button{border:0; font-size:middle; background:white; cursor:pointer;}
	
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
               
                <div class="r-cont-header2">
                    <p>
                        <span style="font-size:30px"><%=mp2.getmName()%></span> 회원등급은
                    </p>

                    <h2>
                        <strong style="color: #0f4a7e; font-size:30px;"><%=mp2.getGradeName()%></strong>등급 입니다.
                    </h2>
                </div>

                <div class="r-cont-header-images">
                    <i class="fas fa-dollar-sign" style="font-size:70px"></i>
                    <h4>적립금</h4>
                    <div style="font-size:30px;"><%=formatter.format(mp2.getmPoint())%>p</div>

                </div>

            </div> <!-- 오른쪽 컨텐츠 헤더 end -->

            <!-- 적립금 날짜 조회 영역 -->
            <div class="point">
                <h2>적립금</h2>

                <form method="get" action="<%=request.getContextPath()%>/memberPointServlet">
                    <div class="point-search">
                       <ul>
                           	<input type="hidden" name="userNo" value="<%=loginUser3.getmNo() %>">
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
                                <label for="3month">3개월</label>
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
                                <input type="date" name="firstDate" value="09/01/01">
                            </li>
                            <li>
                                <input type="date" name="secondDate" value="09/01/01">
                            </li>
                            <li>
                                <input type="submit" id="submit" value="조회">
                            </li>
                        
                        </ul>

                    </div>
                </form><!-- 적립금 날짜 조회 영역 end -->

            </div><!-- 적립금 조회 영역 end -->

           <br clear="both">

            <!-- 적립금 조회 결과 영역 -->
            <div class="search-list">
                <!-- <div class="search-text">
                    <h4 style="color: #666;">
                        <b>2020-05-09 ~ 2020-05-09</b> 선택된 날짜가 들어가는 곳
                        까지의 적립금 사용 내역 총
                        <b>0</b>
                        건
                    </h4>
                </div> -->

                <table class="list-tb">
                
                
                <%if(!list.isEmpty()){%>
                    <tr>
                        <th>번호</th>
                        <th class="tb-first">날짜</th>
                        <th>유형</th>
                        <th>내용</th>
                        <th>적립금 내역</th>
                        <th class="tb-last">잔여 적립금</th>
                    </tr>
                    
                    <%for(MemberPoint mp : list){ %>
                    <tr>
                    	<input type="hidden" value="<%=mp.getPointNo()%>">
						<td><%=mp.getRnum() %></td>
						<td class="tb-first"><%=mp.getPointDate() %></td>
						<td><%=mp.getPointCate() %></td>
                    	<td><%=mp.getPointContent() %></td>
                    	<td><%=formatter.format(mp.getPointAmount()) %></td>
                    	<td class="tb-last"><%=formatter.format(mp.getMyPoint()) %></td>
                    </tr>
                    <%} %>
                 
                 <%}else{%>
                 	<tr>
                        <th>번호</th>
                        <th class="tb-first">날짜</th>
                        <th>유형</th>
                        <th>내용</th>
                        <th>적립금 내역</th>
                        <th class="tb-last">잔여 적립금</th>
                    </tr>
                 
                 	 <tr style="margin-top:30px;">
						<td colspan="9"><div style="text-align:center">검색 결과가 없습니다.</div></td>
					</tr> 
                  
                 <%} %>
                </table>

            </div><!-- 적립금 조회 결과 영역 end -->

		<br><br>
	<!-- 페이징 처리 시작 -->
		<div class="pagingArea" align="center">
		
			<%if(maxPage == 1){ %>
				<button disabled onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currntPage=1&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"> << </button>
			<%}else { %>
				<button onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currntPage=1&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"> << </button>
			<%} %>
			<!-- 맨 처음으로 -->
			
		
		
			<!-- 이전 페이지로 -->
			<%if(currentPage == 1){ %>
				<button disabled> < </button>
		
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currentPage=<%=currentPage -1 %>&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"> < </button>
			<%} %>
		
		
			<!-- 10개의 페이지 목록 -->
			<%for(int p = startPage; p <= endPage; p++){ %>
				<%if(currentPage == p){ %>
					<button disabled><%=p %></button>
					
				<%}else{ %>
					<button onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currentPage=<%=p %>&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"><%=p %></button>
				<%} %>
			<%} %>
			
			
			<!-- 다음 페이지로 -->
			<%if(currentPage == maxPage){ %>
				<button disabled> > </button>
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currentPage=<%=currentPage + 1 %>&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"> > </button>
			<%} %>
		
		
			<%if(maxPage == 1){ %>
				<button disabled onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currentPage=<%=maxPage %>&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"> >> </button>
			<%}else { %>
				<button onclick="location.href='<%=request.getContextPath() %>/memberPointServlet?currentPage=<%=maxPage %>&userNo=<%=userNo%>&searchDate1=<%=searchDate%>&firstDate1=<%=firstDate %>&secondeDate1=<%=secondDate%>'"> >> </button>
			<%} %>
			<!-- 맨 뒷 페이지로  -->
			
		
		</div><!-- 페이징 처리 end -->


        </div><!--오른쪽 컨텐츠 영역 end-->
    </div>

</body>

</html>