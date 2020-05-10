<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="board.model.vo.PageInfo" %>
    <%@ page import="product.model.vo.Product" %>
    <%@ page import="java.util.ArrayList" %>
    <%
    	ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("list");
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
</head>
<body>

	<%@ include file="/views/common/adminheader.jsp" %>
	
	<form action="" method="GET">
		<div id="nav_section">
		    <ul>
		        <li><label>상품번호 : </label><input type="text" class="box" id="p_no" name="p_no"></li>
		        <li><label>스타일 번호 : </label><input type="text" class="box" id="s_no" name="s_no"></li>
		        <li><label>상품명 : </label><input type="text" class="box" id="p_name" name="p_name"></li>
		        <li><label>상품종류 : </label><input type="text" class="box" id="p_category" name="p_category" placeholder="category"></li>
		        <li><label>상품가격 : </label><input type="number" class="box" id="p_price" name="p_price" min="0"></li>
		        <li><label>펀딩 시작 날짜 : </label><input type="date" class="box" id="f_start_date" name="f_start_date"></li>
		        <li><label>펀딩 종료 날짜 : </label><input type="date" class="box" id="f_end_date" name="f_end_date"></li>
		        <li><label>펀딩 진행 유무 : </label>
	            <select name="f_yn" id="f_yn" style="height: 28px;">
	        		<option value="y">진행중</option>
	        		<option value="n">종료</option>
	    		</select>
				</li>
				<li><input type="submit" value="조회하기" style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;"></li>
				<li><button style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;">상품등록</button></li>
	        </ul>
	    </div>
	</form>


	<br>
	<hr clear="both">
	<br>

	<section id=area>
        <article>
            <table>

                <tr><th>번호</th> <th>상품번호</th> <th>상품명</th> <th>상품종류</th> <th>정가</th> <th>할인율</th> <th>판매가</th> <th>펀딩 진행 유무</th> <th>펀딩 시작 날짜</th> <th>펀딩 종료 날짜</th> <th>변경</th></tr>
	            <%for(Product p : list) {
	            	num++;
	            %>
	            <tr align="center">
	            	<input type="hidden" value="<%=p.getpNo() %>">
	            	<td><%=num %></td> <td><%=p.getpNo() %></td> <td><%=p.getpName() %></td> <td><%=p.getpCategory() %></td> <td><%=p.getRetailPrice() %></td> <td><%=p.getDcRate() %></td> <td><%=p.getpPrice() %></td> <td><%=p.getfYn() %></td> <td><%=p.getfStartDate() %></td> <td><%=p.getfEndDate() %></td> <td><button>수정</button><button>삭제</button></td>
	            </tr>
                <%} %>
	        </table>
	        <div id="pageBtn">
	        	<button onclick="location.href='<%=request.getContextPath() %>/admin/mainView?currentPage=<%=1 %>'"> << </button>
	        	
	        	<button> < </button>
	        	
	        	<%for(int p = startPage; p<endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=p%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	<button> > </button>
	        	
	        	<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=maxPage%>'"> >> </button>
	        	
	        	
	        </div>
	    </article>
	</section>
</body>
</html>