<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, review.model.vo.*"%>
<%
	ArrayList<Review> rvList = (ArrayList<Review>)request.getAttribute("rvList");

	String mNo = (String)request.getAttribute("mNo");
	
	String rvMsg = (String)request.getAttribute("rvMsg");
%>
<!DOCTYPE html>
<html lang="ko">
    <head>
    	<title>My page - My Review</title>
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


        /* 1:1문의 조회 list 영역 */
        
	
		#pageBtn {padding:30px;}
		.pageBtn {color:grey; background:white; border:0;}
		
		.rv_table { width:100%; border-collapse:collapse; border-top:2px solid #0f4a7e; border-bottom:2px solid #0f4a7e; margin:40px 0 0; line-height:50px; }
		.rv_table tr:first-child { border-bottom:1px solid #0f4a7e; }
		.rv_table tr th:nth-child(1) { width:7.5%; }
		.rv_table tr th:nth-child(2) { width:10%; }
		.rv_table tr th:nth-child(3) { width:50%; }
		.rv_table tr th:nth-child(4) { width:10%; }
		.rv_table tr th:nth-child(5) { width:7.5%; }
		.rv_table tr th:nth-child(6) { width:15%; }
		
		.rv_table .tb_line { text-align:center; border-bottom:1px solid #ddd; }
		.rv_table .tb_cont { display:none; }
		.rv_table .tb_cont.show { display:table-row; }
		.rv_table .tb_cont td { padding:20px 10px; }
		.rv_table .tb_cont td img { width:300px; }
	</style>
    </head>
    <body>
    	
    	<%@ include file="../common/header.jsp" %>
    	
    	<%@ include file="../common/myPageHeader.jsp" %>
    
    	<div id="content">
		<!-- 오른쪽 컨텐츠 영역 -->
		<%@ include file="../common/myPageSide.jsp"%>
		<div id="r-cont">
			<!-- 오른쪽 컨텐츠 수정 영역  -->
    
    
            <!-- 오른쪽 컨텐츠 헤더 영역-->
            <div class="r-cont-header">
               
                <div class="r-cont-text">
                    <h1>
                        <b style="color:#0f4a7e;">나의 리뷰</b>
                    </h1>
                </div>
            </div> <!-- 오른쪽 컨텐츠 헤더 end -->
            
                <table class="rv_table">
                    <tr>
                    	<th>no</th>
                    	<th>품번</th>
                    	<th>제목</th>
                    	<th>별점</th>
                    	<th>조회수</th>
                    	<th>날짜</th>
                    </tr>
                   	<input type="hidden" id="mNo" value=<%= loginUser2.getmNo()%>>
                    <%if(!rvList.isEmpty()) {%>
	                   	<%for(Review rv : rvList) {%>
	                    <tr class="tb_line">
							<td><%=rv.getRowNum() %></td>
							<td><%=rv.getpNo() %></td>
							<td><%=rv.getRevTitle() %></td>
							<td><%=rv.getRateStar() %></td>
							<td><%=rv.getViewsNum() %></td>
							<td><%=rv.getRevDate() %></td>
	                    </tr>
	                    <tr class="tb_cont">
	                    	<td colspan = "6">
	                    	<%if(rv.getRevPic() != null){ %>
	                   			<div class="cont_img"><%=rv.getRevPic() %></div>
	                   		<%} %>
	                    		<div class="cont_text"><%=rv.getRevContents() %></div>
	                    	</td>
	                    </tr>
						<%} %>
					<%}else { %>
						<tr class="tb_line">
							<td colspan="6"><%=rvMsg %></td>
						</tr>
					<%} %>
			<!-- 상품문의 디테일 -->
                </table>
                <script>
                	$(".tb_line").click(function(){
                        $(this).next().toggleClass("show");
                	});
                </script>
		
		<!-- 이 위까지만 수정하세요 -->
		
        </div><!--오른쪽 컨텐츠 수정 영역 end-->

            
    </div><!--content 영역 end-->
    
    <%@ include file="../common/footer.jsp" %>
	
	
        
    </body>
</html>