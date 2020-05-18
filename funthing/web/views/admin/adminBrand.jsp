<!-- 브랜드 관리자 페이지_희지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, brand.model.vo.*, board.model.vo.*" %>

<%
	ArrayList<Brand> list = (ArrayList<Brand>)request.getAttribute("list");
	ArrayList<Brand> searchList = (ArrayList<Brand>)request.getAttribute("searchList");

	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	
	// PageIngo값 뽑아내기
	int currentPage = pi.getCurrentPage();
	/* int listCount = pi.getBrandListCount(); */
	int limit = pi.getLimit();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	
	String updateMsg = (String)request.getAttribute("updateMsg");
	String deleteMsg = (String)request.getAttribute("deleteMsg");
	String insertMsg = (String)request.getAttribute("insertMsg");

	
%>



<!DOCTYPE html>
<html lang="ko">
<head>
    <title>admin_brand</title>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <style>
        a {text-decoration:none; color:#666;} 

        ul {
            list-style-type: none;
            margin-block-start: 0;
            margin-block-end: 0;
            margin-inline-start: 0px;
            margin-inline-end: 0px;
            padding-inline-start: 0px;
        }

        h1, h2, h3, h4, h5, h6 {
            padding:0;
            margin:0;
        }
       
        /* 브랜드 관리 */
        form{height:100px; background-color:rgb(199,196,196);}
        
        #nav_section{margin: 0 auto; width:90%;}
   
   		#search_area{margin:0 auto; text-align:center; padding-top:30px;}
        #searchKind{width:100px; height:40px}
        #searchVal{width:230px; height:35px}
		#searchBtn{background: grey; color:white; border:0; width:100px; height:40px; font-weight:600; border-radius:5px}

        
        /* #nav_section ul{heigth:100px; margin:0 auto; width:100%; padding:0px;}
        #nav_section ul li{float:left; padding-left:20px; padding-right:10px; line-height:50px;}
		#nav_section ul li .box{width:150px;}
 */		

        /* 브랜드 조회 내역 list 영역 */
        .area{margin:0 auto; width:100%;}
        .area table{margin:0 auto; width:98%; border:1px solid;}
        .area table th{background-color: rgb(199,196,196); color:rgb(53,52,52);}
        /* 수정 삭제 버튼 */
        .area table tr button{width:48%; height:30px; background-color:gray; border:1px solid; border-color:white; font-weight:600; color:rgb(255,255,255);}
       
        /* 조회 & 등록 하기 버튼 */
        #search{background-color:gray; color:white; border-radius:5px; border:0px; width:150px; heigth: 30px; font-size:15px; padding:10px;}
        #insert{background-color:gray; color:white; border-radius:5px; border:0px; width:150px; heigth: 30px; font-size:15px; padding:10px;}
        
        
		/* 페이징 처리 부분 */     
        .pagingArea{margin: 0 auto; margin-top:20px; margin-bottom:20px;}
        .pagingArea button{border:0; font-size:middle; background:white; cursor:pointer;}
        
    </style>
</head>
<body>
	
	<%@ include file="../common/adminHeader.jsp" %>

    	<br>
        <h2 style="text-align: center;">브랜드 관리</h2>
        <br>
        <form method="post" action="<%=request.getContextPath()%>/admin/brandServlet">
            <div id="nav_section">
                <div id="search_area">
	                <span>
	                	<select id="searchKind" name="searchKind">
	                		<option value="B_NO">브랜드 코드</option>	
	                		<option value="B_NAME">브랜드 명</option>
	                	</select>
	                </span>
	                
	                <span>
	                	<input type="text" id="searchVal" name="searchVal">
	                </span>
	                
	                <span>
	                	<button type="submit" value="검색" id="searchBtn">검색</button>
	                </span>
	                
               </div> 
            </div>
        </form>

       	<br>
		<br>
		
        <div class="area">
        
            <table class="list-tb">
            
            <!-- 브랜드 관리자 첫 페이지 브랜드 리스트 -->
          <%if(!list.isEmpty()){ %>
                <tr style="background-color: lightgray;">
                    <th>브랜드 코드</th>
                    <th>브랜드 명</th>
                    <th>대표 명</th>
                    <th>연락처</th>
                    <th>회사 주소</th>
                    <th>이메일</th>
                    <th>입점 날짜</th>
                    <th>입점 유무</th>
                    <th>변경</th>
                </tr>

		
                <%for(Brand b : list){ %>
                <tr align="center">
                	<input type="hidden" value="<%=b.getbNo() %>">
                	<td><%=b.getbNo() %></td>
                	<td><%=b.getbName() %></td>
					<td><%=b.getbCeo() %></td>
					<td><%=b.getbPhone() %></td>
					<td><%=b.getbAddress() %></td>
					<td><%=b.getbEmail() %></td>
					<td><%=b.getbLchDate() %></td>
					<td><%=b.getbLchYn() %></td>
					<td>
						<button type="button" id="modifyBrand">수정</button>
						<button type="button" id="deleteBrand">삭제</button>
					</td>
				</tr>
				<%} %><!-- for문 end -->
			
			
			<!-- 검색기능 후 검색 결과가 있을 시  -->
			<%-- <%}else if(!searchList.isEmpty()){ %>
				 <tr style="background-color: lightgray;">
                    <th>브랜드 코드</th>
                    <th>브랜드 명</th>
                    <th>대표 명</th>
                    <th>연락처</th>
                    <th>회사 주소</th>
                    <th>이메일</th>
                    <th>입점 날짜</th>
                    <th>입점 유무</th>
                    <th>변경</th>
                </tr>

                <%for(Brand b : searchList){ %>
                <tr align="center">
                	<input type="hidden" value="<%=b.getbNo() %>">
                	<td><%=b.getbNo() %></td>
                	<td><%=b.getbName() %></td>
					<td><%=b.getbCeo() %></td>
					<td><%=b.getbPhone() %></td>
					<td><%=b.getbAddress() %></td>
					<td><%=b.getbEmail() %></td>
					<td><%=b.getbLchDate() %></td>
					<td><%=b.getbLchYn() %></td>
					<td>
						<button type="button" id="modifyBrand">수정</button>
						<button type="button" id="deleteBrand">삭제</button>
					</td>
				</tr>
				<%} %><!-- for문 end --> --%>
				 
				 
				
				<%}else{ %>
				 <tr style="background-color: lightgray;">
                    <th>브랜드 코드</th>
                    <th>브랜드 명</th>
                    <th>대표 명</th>
                    <th>연락처</th>
                    <th>회사 주소</th>
                    <th>이메일</th>
                    <th>입점 날짜</th>
                    <th>입점 유무</th>
                    <th>변경</th>
                </tr>
				
				<tr style="margin-top:30px;">
					<td colspan="9"><div style="text-aling:center">검색 결과가 없습니다. 다시 검색해주세요.</div></td>
				
				</tr> 
				
		<%} %>
				
			
            </table>
       </div>
       
        <br><br>


		<!-- 페이징 처리 시작 -->
		<div class="pagingArea" align="center">
		
			<!-- 맨 처음으로 -->
			<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currntPage=1'"> << </button>
		
		
			<!-- 이전 페이지로 -->
			<%if(currentPage == 1){ %>
				<button disabled> < </button>
		
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currentPage=<%=currentPage -1 %>'"> < </button>
			<%} %>
		
		
			<!-- 10개의 페이지 목록 -->
			<%for(int p = startPage; p <= endPage; p++){ %>
				<%if(currentPage == p){ %>
					<button disabled><%=p %></button>
					
				<%}else{ %>
					<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currentPage=<%=p %>'"><%=p %></button>
				<%} %>
			<%} %>
			
			
			<!-- 다음 페이지로 -->
			<%if(currentPage == maxPage){ %>
				<button disabled> > </button>
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currentPage=<%=currentPage + 1 %>'"> > </button>
			<%} %>
		
		
			<!-- 맨 뒷 페이지로  -->
			<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currentPage=<%=maxPage %>'"> >> </button>
		
	</div>
	
    
    <script>
    	// 리스트 한줄 한줄 효과 주는 것
    	$(".area td").mouseenter(function(){
    		$(this).parent().css({"background" : "darkgray","cursor" : "pointer"});
    	}).mouseout(function(){
    		$(this).parent().css({"background" : "white"});
    	}).click(function(){		// 브랜드 상세 정보로 이동해서 수정 삭제 진행
    		var bNo = $(this).parent().children("input").val();
    		
    		location.href="<%=request.getContextPath()%>/admin/brandDetail?bNo=" + bNo;
    	
    	});
    	
    	
    	// 새로운 브랜드 등록 함수
    	function insertBrand(){
    		location.href="<%=request.getContextPath()%>/views/admin/insertBrand.jsp";
    	}
    	
    	$(function(){
    		// 기능 성공시 alert
    		<%if(updateMsg != null){%>
    			alert("<%=updateMsg%>");
    			
    		<%}else if(deleteMsg != null){%>
    			alert("<%=deleteMsg%>");
    			
    		<%}else if(insertMsg != null){%>
    			alert("<%=insertMsg%>");
    		
    		<%} %>
    		
    		
    		
    	})
    	
    	
    	
    	
    	
    	
    </script>
    
    
    
    
    
    
    
    
    
    
    
    
    
    

</body>
</html>