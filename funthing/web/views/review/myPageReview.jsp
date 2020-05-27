<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="member.model.vo.MemberReview" %>
<%@ page import="board.model.vo.PageInfo" %>
<%
ArrayList<MemberReview> list = (ArrayList<MemberReview>)request.getAttribute("list");
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
        <script src = "../js/jquery-3.4.1.min.js"></script>
        <style>
        /* 0f4a7e */
            #noticeArea{ margin: 0 auto; width: 100%; }
            #noticeArea h3 { border-top:1px solid #ddd; border-bottom:1px solid #ddd; padding-left:20px; box-sizing:border-box; line-height:96px; color:#0f4a7e; margin-bottom:60px; }
            #noticeArea table { border-bottom:2px solid #0f4a7e; border-top:2px solid #0f4a7e; line-height:3; text-align:center; }
            #noticeArea table tr { border-bottom:1px solid #ddd; } 
            #noticeArea table tr:first-child { border-bottom:1px solid #0f4a7e; }
            #noticeArea table tr:last-child { border-bottom:0; }
            
            #noticeArea form  { margin:20px 0; text-align:right; }
            #noticeArea form input { margin:0; height:28px; }
            #searchBtn { height:30px; background:#ddd; border:1px solid #aaa; }
            #noticeArea .pageinArea button { background:#fff; border:0; }
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
    
    
        <section id="noticeArea">
            <h3>REVIEW Search</h3>
            
            <table id="noticelistArea">
                <tbody>
                    <tr class="noticehead">
                        <th>회원번호</th>
                        <th>제목</th>
                        <th>상품번호</th>
                        <th>날짜</th>
                        <th>RATE</th>
                    </tr>

                 
             <% 
             if(list!=null){
                for(int i =0;i<list.size();i++){
                   %> <tr class="noticelist">  
                           <td class="noticelists"><%=list.get(i).getM_no()%></td>
                           <td class="noticelists"><%=list.get(i).getRev_title()%></td>
                           <td class="noticelists"><%=list.get(i).getP_no()%></td>
                           <td class="noticelists"><%=list.get(i).getRev_date()%></td>
                           <td class="noticelists"><%=list.get(i).getRate()%></td>
                         
                       </tr>
                       <tr class="cont">
                          <td colspan="5">
                             <span id="reviewcontents">
                             <%=list.get(i).getRev_contents()%>
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
            <script>
                  $("table .noticelist .noticelists").click(function(){
                $(this).parent().next().toggle();
                  });
           </script>
           
           
            <form  method="GET" action="<%=request.getContextPath()%>/admin/NoticeView">
            	<input type="text" id="search" name="noticeSearch"  placeholder="검색어를 입력해주세요"> <input type="submit" id="searchBtn" value="SEARCH">
            
            </form>
           
             <div class="pageinArea" align="center">
            <%
            if(search ==null){
            %>   
            
             <!-- search가 널일때  -->
             <!-- 맨 처음으로 -->
            
            <button class="search"  onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=1 %>'"> << </button>
       
            <!-- 이전 페이지 -->
            <%if(currentPage <= 1) {%>
               <button class="search"  disabled> < </button>
            <%}else {%>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=currentPage-1%>'"> < </button>
            <%} %>                                
            <!-- 10개의 페이지 목록 -->
            <%for(int p = startPage; p<=endPage; p++){
            %>
               <%if(currentPage == p) {%>
                  <button class="search"  disabled><%=p %></button>
                  <%} else{%>
                  
                  <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=p%>'"><%=p %></button>
                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->
               <%} %>
            <%}%>
            <!-- 다음 페이지로 -->
            <%if(currentPage >= maxPage) {%>
               <button class="search"  disabled> > </button>
            <%}else { %>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=currentPage + 1%>'"> > </button>
            <%} %>
            <!-- 맨 끝으로  -->
            <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=maxPage %>'"> >> </button>   
               
               
               
               
               
            <% }else{%>
               
                <!-- 맨 처음으로 -->
            <button class="search"  onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=1 %>&search=<%=search%>'"> << </button>
       
            <!-- 이전 페이지 -->
            <%if(currentPage <= 1) {%>
               <button class="search"  disabled> < </button>
            <%}else {%>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=1 %>&search=<%=search%>'"> < </button>
            <%} %>                                
            <!-- 10개의 페이지 목록 -->
            <%for(int p = startPage; p<=endPage; p++){
            %><%if(currentPage == p) {%>
                  <button class="search"  disabled><%=p %></button>
               <%} else{%>
                  <%-- <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage='+<%=p %>&noticeSearch=<%=csearch%>'"><%=p %></button> --%>
                  <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=p %>&search=<%=search%>'"><%=p %></button>
                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->
               <%} %>
            <%}%>
            <!-- 다음 페이지로 -->
            <%if(currentPage >= maxPage) {%>
               <button class="search"  disabled> > </button>
            <%}else { %>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=currentPage + 1%>&search=<%=search%>'"> > </button>
            <%} %>
            <!-- 맨 끝으로  -->
            <button class="search" onclick="location.href='<%=request.getContextPath() %>/MemberReviewSelect?currentPage=<%=maxPage %>&search=<%=search%>'"> >> </button>   
               
               
            <%}                  
            %>
          
            
            
           
         </div>
        </section>
    
        </div>
        </div>
        
        
        <%@ include file="../common/footer.jsp" %>
        
    </body>
</html>