<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="review.model.vo.*, java.util.ArrayList, board.model.vo.*"%>
 <%
 	ArrayList<Review> rvList = (ArrayList<Review>)request.getAttribute("rvList");

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
<title>Insert title here</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/css/reset.css">
    <style>
        #ad_reviewListWrap {  }
        #ad_reviewListWrap h2 { text-align:center; font-size:24px; margin:20px 0; }
        #ad_reviewListWrap .ad_rvSearchWrap { background:#c7c4c4; text-align:center; padding:20px 0; }
        #ad_reviewListWrap .ad_rvSearchWrap span { display:inline-block; padding:0 10px; }
        #ad_reviewListWrap .ad_rvSearchWrap button { background:#808080; border:1px solid transparent; border-radius:5px; color:#fff; }


        #ad_reviewListWrap .ad_rvTableWrap { width:100%; margin:20px 0; border:1px solid #333; line-height:2; }
        #ad_reviewListWrap .ad_rvTableWrap table { width:100%; text-align:center; }


        #ad_reviewListWrap .ad_rvTableWrap table tr:first-child { background:#c7c4c4; }
        #ad_reviewListWrap .ad_rvTableWrap table tr {  border-bottom:1px solid #aaa; }
        #ad_reviewListWrap .ad_rvTableWrap table tr:last-child { border:none; }
        #ad_reviewListWrap .ad_rvTableWrap table th { font-size:16px; }

        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(1) { width:5%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(2) { width:20%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(3) { width:20%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(4) { width:10%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(5) { width:10%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(6) { width:5%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(7) { width:5%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(8) { width:20%; }

        #ad_reviewListWrap .ad_rvTableWrap table td { vertical-align: middle;  font-size:16px;  padding:6px 0; }
        #ad_reviewListWrap .ad_rvTableWrap table td:nth-child(3) { text-align:left; }
        #ad_reviewListWrap .ad_rvTableWrap table td.rv_tbImg {  }
        #ad_reviewListWrap .ad_rvTableWrap table td.rv_tbImg img { width:50px; border:1px solid #ddd; box-sizing:border-box; }
    </style>
</head>
<body>
   	<%@ include file="../common/adminHeader.jsp" %>
    <div id="ad_reviewListWrap">
        <h2>리뷰 관리</h2>
        <div class="ad_rvSearchWrap">
            <form action="<%=request.getContextPath() %>/admin/AdminReviewSelect" method="GET">
                <span>
                    <label for="ad_rvId">아이디 : </label>
                    <input type="text" id="ad_rvId" name="ad_rvId" />
                </span>
                <span>
                    <label for="ad_rvPrdName">상품명 : </label>
                    <input type="text" id="ad_rvPrdName" name="ad_rvPrdName" />
                </span>
                <span class="ad_RvS_btnWrap">
                    <button type="submit">검색</button>
                </span>
            </form>
        </div>
        <!-- 상단 검색 영역 end -->
        <div class="ad_rvTableWrap">
            <!-- 인덱스 번호 / 상품 사진 / 상품 이름 / 제목 / 별점 / 회원 이름 / 조회수 / 리뷰 올린 날짜 -->
            <table>
                <tr>
                    <th>번호</th>
                    <th colspan="2">상품명</th>
                    <th>리뷰 제목</th>
                    <th>별점</th>
                    <th>회원명</th>
                    <th>조회수</th>
                    <th>리뷰 날짜</th>
                </tr>
                <% for(Review rv : rvList){ %>
                <tr>
                    <td><%=rv.getRevNo() %></td>
                    <td class="rv_tbImg"><img src="<%=request.getContextPath()%>/images/thumbnail/<%=rv.getRvThumb() %>.jpg"></td>
                    <td><%=rv.getpNo() %></td>
                    <td><%=rv.getRevTitle() %></td>
                    <td><%=rv.getRateStar() %></td>
                    <td><%=rv.getRvName() %></td>
                    <td><%=rv.getViewsNum() %></td>
                    <td><%=rv.getRevDate() %></td>
                </tr>
                <%} %>
            </table> 
        </div>
        <!-- 페이지네이션 -->	
        <div id="pageBtn" align="center">
        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/AdReviewSelect?currentPage=<%=1 %>'"> << </button>
        	
        	<%if(currentPage <= 1) { %>
        		<button class="pageBtn" disabled> < </button>
        	<%} else {%>
        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/AdReviewSelect?currentPage=<%=currentPage-1%>'"> < </button>
        	<%} %>
        	<%for(int p = startPage; p<=endPage; p++) { %>
        	<%	if(p == currentPage) { %>
        			<button class="pageBtn" disabled><%=p %></button>
        	
        	<%	} else{ %>
        			<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/AdReviewSelect?currentPage=<%=p%>'"><%=p %></button>
        	<%} %>	
        	<%} %>
        	
        	<%if(currentPage == maxPage) {%>
        		<button class="pageBtn" disabled> > </button>
        	<%} else { %>
        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/admin/AdReviewSelect?currentPage=<%=currentPage+1 %>'"> > </button>
        	<%} %>
        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/admin/AdReviewSelect?currentPage=<%=maxPage%>'"> >> </button>
        	
       
        </div>

    </div>

</body>
</html>