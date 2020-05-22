<!-- 상품문의 리스트 페이지_혜린 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.PageInfo" %>    
<%@ page import="java.util.ArrayList" %>
<%@ page import="productQnA.model.vo.ProductQnaIn" %>
<%
		ArrayList<ProductQnaIn> list = (ArrayList<ProductQnaIn>)request.getAttribute("list");
		PageInfo pi = (PageInfo)request.getAttribute("pi");
		String mNo = (String)request.getAttribute("mNo");
		
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
	<style>
	.r-cont-header{
            width: 100%;
            padding: 20px 20px;
            border-top: 1px solid #bbb; 
            border-bottom:1px solid #bbb;
        }

        .r-cont-header:after {
            clear:both;
            content:"";
            display:block;
        }

        .r-cont-text{
            width: 30%;
            margin: 0 0 0 0;
            margin-right: 0;
            padding: 0 0 0 0;
            float:left;
        }
        .r-cont-button{
            float: right;
            border: 1px solid #bbb;
            background-color: #bbb;
        }

        .r-cont-button a{
           margin:20px;
           font-size: 15px;
           color: white;
        }


         /* 날짜 조회 영역 */
         .point{
            padding-left: 20px;
            width: 100%;
            margin: 60px 0;
        }

        /* 날짜 영역 */
        .point-search{
            margin-top: 30px;
            height: 130px;
            border-top: 1px solid #0f4a7e;
            border-bottom: 1px solid #bbb;
            border-left: 1px solid #bbb;
            border-right: 1px solid #bbb;
        }

        .point-search ul{
            display: inline-block;
        }

        .point-search ul:after{
            display: block;
            content: "";
            clear: both;
        }

        .point-search ul li{
            float: left;
            margin-top: 45px;
            margin-left: 30px;
        }
        .point-search ul h3{
            color: darkgray;
        }

        
        #submit{ /* 날짜 조회 버튼 */
            width: 120px;
            height: 30px;
            background-color: #0f4a7e;
            color: white;
            border: none;
            font-size: 15px;
        }

        /* 1:1문의 조회 list 영역 */
        .search-list{
            padding-left: 20px;
            width: 100%;
        }
        .list-tb{
            margin-top: 30px;
            border-top: 2px solid #0f4a7e;
            width: 100%;
            border-bottom: 1px solid #0f4a7e;
            line-height: 50px;
            border-collapse: collapse;
        }
        .list-tb th{
            border-bottom: 1px solid #0f4a7e;
        }
        .list-tb tr{
            border: 0; padding:0; border-bottom: 1px solid #bbb; cursor:pointer;
        }
        .list-tb td{
            text-align: center;	 
        }
        .list-tb .tb-first{
            width: 200px;
        }
        .list-tb .tb-last{
            width: 200px;
        }
	
		#pageBtn {padding:30px;}
		.pageBtn {color:grey; background:white; border:0;}
		
		
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
                    <h1>
                        <b style="color:#0f4a7e;">상품 문의</b>
                    </h1>
                </div>

          <!--       1:1 문의하기 버튼
                <div class="r-cont-button">
                    <a href="#">삼품문의하기</a>
                </div> -->
            
            </div> <!-- 오른쪽 컨텐츠 헤더 end -->


            <!-- 1:1 문의 날짜 조회 영역 -->
            <div class="point">
                <form method="post" action="<%=request.getContextPath()%>/productQnaList">
                    <div class="point-search">
                        <ul>
                         	<input type="hidden" name="mNo" value="<%=loginUser2.getmNo() %>">
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
                </form><!-- 1:1 문의 날짜 조회기간 end -->
            </div><!-- 1:1 문의 조회 영역 end -->

            <br clear="both">
 			<a href="<%=request.getContextPath()%>/views/productQnA/productQnAInsert.jsp" >Insert</a>
            <!-- 1:1 문의 조회 결과 영역 -->
            <div class="search-list">
                <table class="list-tb" id="list-tb">
                    <tr>
                        <th class="tb-first">문의날짜</th>
                        <th>상품번호</th>
                        <th>제목</th>
                        <th class="tb-last">문의상태</th>
                    </tr>
                    <%if(!list.isEmpty()){ %>
				<%for(ProductQnaIn pq : list) {%> 
                    <tr>
                    	<input type="hidden" id="QnaNo" value=<%= pq.getQnaNo()%>>
                    	<input type="hidden" id="mNo" value=<%= loginUser2.getmNo()%>>
                        <td class="tb-first"><%=pq.getQnaDate() %></td>
                        <td><%=pq.getpNo() %></td>
                        <td><%=pq.getQnaTitle() %></td>
                        <%if(pq.getQnaDate().equals("Y")) {%>
                        <td class="tb-last">답변완료</td>
                        <%}else{ %>
                        <td class="tb-last">답변대기</td>
                         <%} %>
                          </tr>
			<!-- 상품문의 디테일 -->
                     
                   
				 <%} %>
			
			
				  <%}else{ %>
				  <tr><td colspan="4">검색 결과가 없습니다.</td></tr>
				   <%} %>
                </table>
			
            </div><!-- 1:1 문의 조회 결과 영역 end -->
	
			 <!-- 페이징처리 -->
	         <div id="pageBtn" align="center">
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/productQnaList?currentPage=1&mNo=<%=mNo%>'"> << </button>
	        	
	        	<%if(currentPage == 1) { %>
	        		<button class="pageBtn" disabled> < </button>
	        	<%} else {%>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/productQnaList?currentPage=<%=currentPage-1%>&mNo=<%=mNo%>'"> < </button>
	        	<%} %>
	        	<%for(int p = startPage; p<=endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button class="pageBtn" disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/productQnaList?currentPage=<%=p%>&mNo=<%=mNo%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	
	        	<%if(currentPage == maxPage) {%>
	        		<button class="pageBtn" disabled> > </button>
	        	<%} else { %>
	        		<button class="pageBtn" onclick="location.href='<%=request.getContextPath() %>/productQnaList?currentPage=<%=currentPage+1 %>&mNo=<%=mNo%>'"> > </button>
	        	<%} %>
	        	<button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/productQnaList?currentPage=<%=maxPage%>&mNo=<%=mNo%>'"> >> </button>
	        	
	        	
	        </div> 

			

<!-- 이 위까지만 수정하세요 -->
        </div><!--오른쪽 컨텐츠 수정 영역 end-->

            
    </div><!--content 영역 end-->
    
    <%@ include file="../common/footer.jsp" %>
	
	
	<script>
	
	$(function(){
		$("#list-tb td").click(function(){
			/* var mNo = $("#mNo").val(); */
			var qnaNo = $(this).parent().children("input").val();
			 <%-- var mNo = <%=loginUser2.getmNo()%>; --%> 
			<%-- location.href="<%=request.getContextPath()%>/productQnaDetail?mNo=" + mNo + "&QnaNo=" + QnaNo; --%>
			  location.href="<%=request.getContextPath()%>/productQnaDetail?mNo=<%=loginUser2.getmNo()%>&qnaNo=" + qnaNo;  
			<%--   location.href="<%=request.getContextPath()%>/productQnaList?mNo=<%=loginUser2.getmNo()%> --%>
			
		
	 	
		})
		console.log(qnaNo);
	})
	
	</script>


</body>
</html>