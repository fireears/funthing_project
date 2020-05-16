<!-- 브랜드 관리자 페이지_희지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, brand.model.vo.*, board.model.vo.*" %>

<%
	ArrayList<Brand> list = (ArrayList<Brand>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");

	// PageIngo값 뽑아내기
	int currentPage = pi.getCurrentPage();
	/* int listCount = pi.getBrandListCount(); */
	int limit = pi.getLimit();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
	
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
        #nav_section ul{heigth:100px; margin:0 auto; width:100%; padding:0px;}
        #nav_section ul li{float:left; padding-left:20px; padding-right:10px; line-height:50px;}
      /*   .nav_section ul:after {clear:both; content:""; display:block;} */
		#nav_section ul li .box{width:150px;}
		

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

    
        <h2 style="text-align: center;">브랜드 관리</h2>
        <form method="post" action="#">
            <div id="nav_section">
                <ul>
                    <li><label>브랜드 코드 : </label><input type="text" name="b_no" class="box" id="b_no"></li>
                    <li><label>브랜드 명 : </label><input type="text" name="b_name" class="box" id="b_name"></li>
                    <li><button type="submit" value="조회하기" id="search">조회하기</button></li>
                    <li><button id="insert" type="button" onclick="insertBrand();">브랜드 등록</button></li>
                </ul>
            </div>
        </form>
       
       	<br>
        <hr clear="both">
		<br>
		
        <div class="area">
            <table>
                <tr>
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
						<button type="button" id="modifyBrand" onclick="modifyBrand();">수정</button>
						<button type="button" id="deleteBrand" onclick="deleteBrand();">삭제</button>
					</td>
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
    	});
    	
    	
    	// 새로운 브랜드 등록 함수
    	function insertBrand(){
    		location.href="<%=request.getContextPath()%>/views/admin/insertBrand.jsp";
    	}
    	
    	// 기존 브랜드 정보 수정 함수
    	function modifyBrand(){
    		
    	}
    	
    	// 브랜드 정보 삭제 함수
    	function deleteBrand(){
    		
    	}
    	
    	
    	
    </script>
    
    
    
    
    
    
    
    
    
    
    
    
    
    

</body>
</html>