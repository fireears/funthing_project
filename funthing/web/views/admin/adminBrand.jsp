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
        a { text-decoration:none; color:#666; } 

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
        .brand-select{
            margin-top: 30px;
            background-color: #bbb;
            width: 100%;
            height: 100px;
            text-align:center;
        }
        .brand-select ul{
            display:inline-block;
        }
        .brand-select ul:after {
            clear:both;
            content:"";
            display:block;
        }

        .brand-select ul li{
            float: left;
            margin: 40px;
        }

        /* 브랜드 조회 내역 list 영역 */
        .brand-list{
            padding-left: 20px;
            width: 100%;
        }
        .list-tb{
            margin-top: 30px;
            border-top: 2px solid #bbb;
            width: 100%;
            border-bottom: 1px solid #bbb;
            list-style: 50px;
            border-collapse: collapse;
            line-height: 40px;
        }
        .list-tb th{
            border-bottom: 1px solid #bbb;
        }
        .list-tb tr{
            border: 0; padding:0; border-bottom: 1px solid #bbb;
        }
        .list-tb td{
            text-align: center;
        }
        .list-tb .tb-last{
            border-left: 1px solid #bbb;
            border-bottom: 0px;
        }
        
        .pagingArea{
        	margin: 0 auto;
        	margin-top:20px;
        	margin-bottom:20px
        }
        
        .pagingArea button{
        	border:0; 
        	font-size:middle;
        	background:white;
        	cursor:pointer;
        }
        
        
        
    </style>
</head>
<body>
	
	<%@ include file="../common/adminHeader.jsp" %>

    <section id="area">
        <h2 style="text-align: center;">브랜드 관리</h2>
        <form method="post" action="#">
            <div class="brand-select">
                <ul>
                    <li><label>브랜드 코드 : </label><input type="text" name="b_no" id="b_no"></li>
                    <li><label>브랜드 명 : </label><input type="text" name="b_name" id="b_name"></li>
                    <li>
                        <input type="submit" value="조회하기">
                        <button type="botton">상품 등록</button>
                    </li>
                </ul>
            </div>
        </form>
       
       	<br>
        <hr clear="both">
		<br>
		
        <div class="brand-List">
            <table class="list-tb">
                <tr style="background-color: lightgray;">
                    <th>브랜드 코드</th>
                    <th>브랜드 명</th>
                    <th>대표 명</th>
                    <th>연락처</th>
                    <th>회사 주소</th>
                    <th>이메일</th>
                    <th>입점 날짜</th>
                    <th>입점 유무</th>
                    <th class="tb-last">변경</th>
                </tr>


                <%for(Brand b : list){ %>
                <tr>
                	<input type="hidden" value="<%=b.getbNo() %>">
                	<td><%=b.getbNo() %></td>
                	<td><%=b.getbName() %></td>
					<td><%=b.getbCeo() %></td>
					<td><%=b.getbPhone() %></td>
					<td><%=b.getbAddress() %></td>
					<td><%=b.getbEmail() %></td>
					<td><%=b.getbLchDate() %></td>
					<td><%=b.getbLchYn() %></td>
					<td class="tb-last">
						<button type="button" id="modifyBrand" onclick="modifyBrand();">수정</button>
						<button type="button" id="deleteBrand" onclick="deleteBrand();">삭제</button>
					</td>
				</tr>
				<%} %>
				
            </table>
        </div>


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
				<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currntPage=<%=currentPage + 1 %>'"> > </button>
			<%} %>
		
		
			<!-- 맨 뒷 페이지로  -->
			<button onclick="location.href='<%=request.getContextPath() %>/admin/brandServlet?currentPage=<%=maxPage %>'"> >> </button>
		</div>

    </section>
    
    <script>
    	// 리스트 한줄 한줄 효과 주는 것
    	$(".list-tb td").mouseenter(function(){
    		$(this).parent().css({"background" : "darkgray","cursor" : "pointer"});
    	}).mouseout(function(){
    		$(this).parent().css({"background" : "white"});
    	});
    	
    	
    	// 수정 삭제 버튼 이동 함수
    	function modifyBrand(){
    		
    	};
    	
    	
    	function deleteBrand(){
    		
    	};
    	
    	
    	
    </script>
    
    
    
    
    
    
    
    
    
    
    
    
    
    

</body>
</html>