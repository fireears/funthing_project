<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="notice.model.vo.Notice" %>
<%@ page import="board.model.vo.PageInfo" %>
<%
ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
PageInfo pi =(PageInfo)request.getAttribute("pi");
int listCount =pi.getListCount();
int currentPage = pi.getCurrentPage();
int maxPage = pi.getMaxPage();
int startPage = pi.getStartPage();
int endPage = pi.getEndPage();



String search =(String)request.getAttribute("search");

%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <style>
            #noticeArea{margin: 60px auto 0; width: 1460px;}

            #noticeArea h3{font-weight:bold; font-size: 40px; color:#0f4a7e; text-align:center; margin:60px 0;}
			#noticeArea form { text-align:right; }
            #noticeArea #search{ margin:0; height:30px; border: 1px solid black; }
            #searchBtn{height: 33px; width: 80px; border: 0px; background-color: gray; color: white;}

            #noticelistArea {width: 100%; margin: 40px 0;  border-top:2px solid #0f4a7e; border-bottom:2px solid #0f4a7e; border-collapse: collapse; line-height: 3;}
            
            #noticelistArea tr{border-bottom: 1px solid #ddd; }
            #noticelistArea tr th:nth-child(1) { width:5%; }
            #noticelistArea tr th:nth-child(1) { width:70%; }
            #noticelistArea tr th:nth-child(1) { width:5%; }
            #noticelistArea tr th:nth-child(1) { width:20%; }
            
            #noticelistArea tr td{text-align: center;}
            
            #noticelistArea tr.cont td { padding:20px 10px; background:#f5f5f5; }
            
            
            #noticeArea .pageinArea { margin:40px 0 20px; }
            
            #noticeArea .pageinArea button{border: 0px; width: 30px; height: 30px; font-weight: 600; size: 10px; background:#fff;}
            .hansol{width: 100%; height: 150px; background-color:cornsilk; display: none;}
            #reviewcontents{float: left; margin-right: 50px;}
            .cont{ display:none;}
        </style>
        

    </head>
    <body>
       
       <%@ include file="../common/header.jsp" %>
       
    
       <div id="content">
      <!-- 오른쪽 컨텐츠 영역 -->

      <div id="r-cont">
         <!-- 오른쪽 컨텐츠 수정 영역  -->
    
    
        <section id="noticeArea">
            <h3>공지사항</h3>
            
            <table id="noticelistArea">
                <tbody>
                    <tr class="noticehead">
                        <th>글번호</th>
                        <th>제목</th>
						<th>작성자</th>
						<th>날짜</th>
						<!-- <th>RATE</th> -->
                    </tr>

                 
             <% 
             if(list!=null){
                for(int i =0;i<list.size();i++){
                   %> <tr class="noticelist">  
                           <td><%=list.get(i).getnNo()%></td>
                           <td><%=list.get(i).getnTitle()%></td>
                           <td>관리자</td>
                           <td><%=list.get(i).getnDaatee()%></td>
                           <%-- <td><%=list.get(i).getnDelYn()%></td> --%>
                       </tr>
                       <tr class="cont">
                          <td colspan="5">
                             <span>
                             <%=list.get(i).getnContents()%>
                             </span>
                          </td>
                       </tr>   
                  <%}
                   }else{
                      %>
                      <tr>
                            <td>값이 존재하지않습니다.</td>
                      </tr>
                      <%
                   }%>
                </tbody>
            </table>
            <form  method="GET" action="<%=request.getContextPath()%>/MainNoticeServlet">
           		 <input type="text" id="search" name="noticeSearch"  placeholder="검색어를 입력해주세요"> <input type="submit" id="searchBtn" value="SEARCH">
            </form>
            <script>
                  $("table .noticelist td").click(function(){
                $(this).parent().next().toggle();
                  });
           </script>
             <div class="pageinArea" align="center">
             <%
            if(search ==null){
            %>   
            
             <!-- search가 널일때  -->
             <!-- 맨 처음으로 -->
            
            <button class="search"  onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=1 %>'"> << </button>
       
            <!-- 이전 페이지 -->
            <%if(currentPage <= 1) {%>
               <button class="search"  disabled> < </button>
            <%}else {%>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=currentPage-1%>'"> < </button>
            <%} %>                                
            <!-- 10개의 페이지 목록 -->
            <%for(int p = startPage; p<=endPage; p++){
            %>
               <%if(currentPage == p) {%>
                  <button class="search"  disabled><%=p %></button>
                  <%} else{%>
                  
                  <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=p%>'"><%=p %></button>
                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->
               <%} %>
            <%}%>
            <!-- 다음 페이지로 -->
            <%if(currentPage >= maxPage) {%>
               <button class="search"  disabled> > </button>
            <%}else { %>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=currentPage + 1%>'"> > </button>
            <%} %>
            <!-- 맨 끝으로  -->
            <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=maxPage %>'"> >> </button>   
               
               
               
               
               
            <% }else{%>
               
                <!-- 맨 처음으로 -->
            <button class="search"  onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=1 %>&search=<%=search%>'"> << </button>
       
            <!-- 이전 페이지 -->
            <%if(currentPage <= 1) {%>
               <button class="search"  disabled> < </button>
            <%}else {%>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=1 %>&search=<%=search%>'"> < </button>
            <%} %>                                
            <!-- 10개의 페이지 목록 -->
            <%for(int p = startPage; p<=endPage; p++){
            %><%if(currentPage == p) {%>
                  <button class="search"  disabled><%=p %></button>
               <%} else{%>
                  <%-- <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage='+<%=p %>&noticeSearch=<%=csearch%>'"><%=p %></button> --%>
                  <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=p %>&search=<%=search%>'"><%=p %></button>
                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->
               <%} %>
            <%}%>
            <!-- 다음 페이지로 -->
            <%if(currentPage >= maxPage) {%>
               <button class="search"  disabled> > </button>
            <%}else { %>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=currentPage + 1%>&search=<%=search%>'"> > </button>
            <%} %>
            <!-- 맨 끝으로  -->
            <button class="search" onclick="location.href='<%=request.getContextPath() %>/MainNoticeServlet?currentPage=<%=maxPage %>&search=<%=search%>'"> >> </button>   
               
               
            <%}                  
            %>
          
            
            
           
         </div>
        </section>
    
        </div>
        </div>
        
        
        <%@ include file="../common/footer.jsp" %>
        
    </body>
</html>