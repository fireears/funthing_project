<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="board.model.vo.PageInfo" %>
    <%@ page import="product.model.vo.Product" %>
    <%@ page import="java.util.ArrayList" %>
    <%
    	ArrayList<Product> list = (ArrayList<Product>)request.getAttribute("list");
    	ArrayList<Product> plist = (ArrayList<Product>)request.getAttribute("plist");
    	Product product = (Product)request.getAttribute("product");
    	
    	PageInfo pi = (PageInfo)request.getAttribute("pi");
    	String msg = (String)request.getAttribute("msg");
    	
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
	<style>
		h2{text-align:center;}
		form{height: 100px; background-color: rgb(199, 196, 196);}
		#nav_section{margin:auto; width: 90%;}
		#nav_section ul{height: 100px; margin: auto; width: 100%; padding: 0px;}
		#nav_section ul li{float: left; list-style-type: none; padding-left: 20px; padding-right: 10px; line-height: 50px;}
		#nav_section ul li .box{width: 150px;}
		#nav_section ul li:last-child { float:right;}
		
		#area{margin: auto; width: 100%;}
		#area table{width: 100%; border: 1px solid;}
		#area table th{background-color: rgb(199, 196, 196); color: rgb(53, 52, 52);}
		/* #area table tr button{width: 100%; height: 30px; background-color: gray; border: 1px solid; border-color: white; font-weight: 600; color: rgb(255, 255, 255);} */
		
		/* 상품계시판 밑에 버튼 */
		#pageBtn{margin:auto; width:50%;}
		#pageBtn>button{margin:auto; width:3%; height:30px; text-align: center; border: 0px; background-color:white;}
	</style>
	<meta charset="UTF-8">
	<title>FUN-THING ADMIN</title>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>

	<%@ include file="../common/adminHeader.jsp" %>
	<h2>상품관리</h2>
	<form action="<%=request.getContextPath() %>/admin/mainView?search=search" method="GET">
		<div id="nav_section">
			<%if(product == null) { %>
		    <ul>
		        <li><label>상품번호 : </label><input type="text" class="box" id="p_no" name="p_no"></li>
		        <li><label>브랜드 : </label><input type="text" class="box" id="b_no" name="b_no"></li>
		        <li><label>스타일 번호 : </label><input type="text" class="box" id="s_no" name="s_no" value="001"></li>
		        <li><label>상품명 : </label><input type="text" class="box" id="p_name" name="p_name"></li>
		        <li>
		        	<label>상품종류 : </label>
		        	<!-- <input type="text" class="box" id="p_category" name="p_category" placeholder="01"> -->
		        	<select name="pCategory">
		        		<option value="1">OUTER</option>
		        		<option value="2">TOP</option>
		        		<option value="3">BOTTOM</option>
		        		<option value="4">JEAN</option>
		        		<option value="5">ONEPICE</option>
		        	</select>
		        </li>
		        <li><label>상품가격 : </label><input type="text" class="box" id="p_price" name="p_price" value="0" ></li>
		        <li><label>펀딩 시작 날짜 : </label><input type="date" class="box" id="f_start_date" name="f_start_date" value="2000-01-01"></li>
		        <li><label>펀딩 종료 날짜 : </label><input type="date" class="box" id="f_end_date" name="f_end_date" value="2900-12-31"></li>
		        <li><label>펀딩 진행 유무 : </label>
	            <select name="f_yn" id="f_yn" style="height: 28px;">
	        		<option value="Y">진행중</option>
	        		<option value="N">종료</option>
	    		</select>
				</li>
				<li><input type="submit" value="조회하기" style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;"></li>
				<li><button type="button" id="productInsert" style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;">상품등록</button></li>
	        </ul>
	        <%} else { %>
	        	<ul>
			        <li><label>상품번호 : </label><input type="text" class="box" id="p_no" name="p_no" value="<%=product.getpNo()%>"></li>
			        <li><label>브랜드 : </label><input type="text" class="box" id="b_no" name="b_no" value="<%=product.getbNo()%>"></li>
			        <li><label>스타일 번호 : </label><input type="text" class="box" id="s_no" name="s_no" value="<%=product.getsNo()%>"></li>
			        <li><label>상품명 : </label><input type="text" class="box" id="p_name" name="p_name" value="<%=product.getpName()%>"></li>
			        <li>
			        	<label>상품종류 : </label>
			        	<!-- <input type="text" class="box" id="p_category" name="p_category" placeholder="01"> -->
			        	<select name="pCategory">
			        		<option value="1">OUTER</option>
			        		<option value="2">TOP</option>
			        		<option value="3">BOTTOM</option>
			        		<option value="4">JEAN</option>
			        		<option value="5">ONEPICE</option>
			        	</select>
			        </li>
			        <li><label>상품가격 : </label><input type="text" class="box" id="p_price" name="p_price" value="<%=product.getpPrice()%>" ></li>
			        <li><label>펀딩 시작 날짜 : </label><input type="date" class="box" id="f_start_date" name="f_start_date" value="<%=product.getfStartDate()%>"></li>
			        <li><label>펀딩 종료 날짜 : </label><input type="date" class="box" id="f_end_date" name="f_end_date" value="<%=product.getfEndDate()%>"></li>
			        <li><label>펀딩 진행 유무 : </label>
		            <select name="f_yn" id="f_yn" style="height: 28px;">
		        		<option value="Y">진행중</option>
		        		<option value="N">종료</option>
		    		</select>
					</li>
					<li><input type="submit" value="조회하기" style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;"></li>
					<li><button type="button" id="productInsert" style="background-color: gray; color: white; border-radius: 5px; border: 0px; width: 80px; height: 30px; font-size: 14px;">상품등록</button></li>
		        </ul>
	        <%} %>
	    </div>
	</form>


	<br>
	<hr clear="both">
	<br>

	<section id=area>
        <article>
            <table id="product_table">

                <tr>
	                <th>번호</th> <th>상품번호</th> <th>상품명</th> <th>상품종류</th> <th>정가</th> <th>할인율</th> <th>판매가</th> 
	                <th>펀딩 진행 유무</th> <th>펀딩 시작 날짜</th> <th>펀딩 종료 날짜</th>
                </tr>
                <%if(!list.isEmpty()) { %>
	            <%for(Product p : list) {
	            	
	            %>
	            <tr align="center">
	            	<input type="hidden" value="<%=p.getpNo() %>">
	            	<td><%=p.getrNum() %></td> <td><%=p.getpNo() %></td> <td><%=p.getpName() %></td> <td><%=p.getpCategory() %></td> <td><%=p.getRetailPrice() %></td> <td><%=p.getDcRate() %></td> <td><%=p.getpPrice() %></td> <td><%=p.getfYn() %></td> <td><%=p.getfStartDate() %></td> <td><%=p.getfEndDate() %></td>
	            	
	            </tr>
                <%} %>
                <%} else { %>
                <tr align="center">
	            	<input type="hidden"">
	            	<td colspan="10" align="center"><%=msg %></td> 
	            	
	            </tr>
                <%} %>
	        </table>
	        
	        
			<script>
			$(function() {
				$("#product_table td").mouseenter(function() {
					$(this).parent().css({"background" : "darkgrey","cursor" : "pointer"});
				}).mouseout(function() {
					$(this).parent().css({"background" : "white"});
				}).click(function() {
					var pNo = $(this).parent().children("input").val();

					location.href = "<%=request.getContextPath()%>/admin/productDetail?pNo="+ pNo

				})
				
				$("#productInsert").click(function(){
					location.href="<%=request.getContextPath()%>/views/admin/adminProductInsert.jsp";
				})
				
				$("#f_start_date").val(new Date().toDateInputValue());
				$("#f_end_date").val(new Date().toDateInputValue());
				
			})
			</script>
			
			
	        <br><br>
	        <%if(product == null) { %>
	        <div id="pageBtn" align="center">
	        	<button onclick="location.href='<%=request.getContextPath() %>/admin/mainView?currentPage=<%=1 %>'"> << </button>
	        	
	        	<%if(currentPage <= 1) { %>
	        		<button disabled> < </button>
	        	<%} else {%>
	        		<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=currentPage-1%>'"> < </button>
	        	<%} %>
	        	<%for(int p = startPage; p<=endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=p%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	
	        	<%if(currentPage == maxPage) {%>
	        		<button disabled> > </button>
	        	<%} else { %>
	        		<button onclick="location.href='<%=request.getContextPath() %>/admin/mainView?currentPage=<%=currentPage+1 %>'"> > </button>
	        	<%} %>
	        	<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=maxPage%>'"> >> </button>
	        	
	        	
	        </div>
	        <%} else { %>
	        
	        <div id="pageBtn" align="center">
	        	<button onclick="location.href='<%=request.getContextPath() %>/admin/mainView?currentPage=<%=1 %>&p_no=<%=product.getpNo()%>&b_no=<%=product.getbNo()%>&s_no=<%=product.getsNo()%>&p_name=<%=product.getpName()%>&pCategory=<%=product.getpCategory()%>&p_price=<%=product.getpPrice()%>&f_start_date=<%=product.getfStartDate()%>&f_end_date=<%=product.getfEndDate()%>&f_yn<%=product.getfYn()%>'"> << </button>
	        	
	        	<%if(currentPage <= 1) { %>
	        		<button disabled> < </button>
	        	<%} else {%>
	        		<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=currentPage-1%>&p_no=<%=product.getpNo()%>&b_no=<%=product.getbNo()%>&s_no=<%=product.getsNo()%>&p_name=<%=product.getpName()%>&pCategory=<%=product.getpCategory()%>&p_price=<%=product.getpPrice()%>&f_start_date=<%=product.getfStartDate()%>&f_end_date=<%=product.getfEndDate()%>&f_yn=<%=product.getfYn()%>'"> < </button>
	        	<%} %>
	        	<%for(int p = startPage; p<=endPage; p++) { %>
	        	<%	if(p == currentPage) { %>
	        			<button disabled><%=p %></button>
	        	
	        	<%	} else{ %>
	        			<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=p%>&p_no=<%=product.getpNo()%>&b_no=<%=product.getbNo()%>&s_no=<%=product.getsNo()%>&p_name=<%=product.getpName()%>&pCategory=<%=product.getpCategory()%>&p_price=<%=product.getpPrice()%>&f_start_date=<%=product.getfStartDate()%>&f_end_date=<%=product.getfEndDate()%>&f_yn=<%=product.getfYn()%>'"><%=p %></button>
	        	<%} %>	
	        	<%} %>
	        	
	        	<%if(currentPage == maxPage) {%>
	        		<button disabled> > </button>
	        	<%} else { %>
	        		<button onclick="location.href='<%=request.getContextPath() %>/admin/mainView?currentPage=<%=currentPage+1 %>&p_no=<%=product.getpNo()%>&b_no=<%=product.getbNo()%>&s_no=<%=product.getsNo()%>&p_name=<%=product.getpName()%>&pCategory=<%=product.getpCategory()%>&p_price=<%=product.getpPrice()%>&f_start_date=<%=product.getfStartDate()%>&f_end_date=<%=product.getfEndDate()%>&f_yn=<%=product.getfYn()%>'"> > </button>
	        	<%} %>
	        	<button onclick="location.href='<%=request.getContextPath()%>/admin/mainView?currentPage=<%=maxPage%>&p_no=<%=product.getpNo()%>&b_no<%=product.getbNo()%>&s_no<%=product.getsNo()%>&p_name<%=product.getpName()%>&pCategory<%=product.getpCategory()%>&p_price<%=product.getpPrice()%>&f_start_date<%=product.getfStartDate()%>&f_end_date<%=product.getfEndDate()%>&f_yn<%=product.getfYn()%>'"> >> </button>
	        	
	        	
	        </div>
	        <%} %>
	    </article>
	</section>
	<br><br>
</body>
<script>
	
</script>

</html>