<%@ page language="java" contentType="text/html; charset=UTF-8"

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
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <style>
            #noticeArea{margin: auto; width: 90%;}

            h3{font-weight:bold; font-size: 40px;}
         
            #search{width: 500px; height: 30px; border: 1px solid black; border-radius: 7px; margin-right: 30px;}
            #searchBtn{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}
            #WriteBtn{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}
            #deleteNote{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}
            #noticelistArea{width: 100%; margin-top: 40px; border: 1px solid rgb(208, 206, 206); border-collapse: collapse;}
            #noticelistArea>tbody>tr{border-bottom: 2px solid black; height: 30px;}
            #noticelistArea>tbody>tr>td{text-align: center;}
            #noticelistArea>tbody:first-child{height: 80px;}
            .noticehead{background-color: gray}   
            .search{border: 0; font-size: middle; background: white; cursor: pointer;}
            
            
         .cont{ display:none;}
        </style>
        

    </head>
    <body>
    
       <%@ include file="../common/adminHeader.jsp" %>
       
         <section id="noticeArea">
            <h3>NOTICE AREA</h3>
            <form  id="shoppingbagForm" method="GET"   action="<%=request.getContextPath()%>/admin/NoticeView">
            <input type="text" id="search" name="noticeSearch"  placeholder="검색어를 입력해주세요"> 
            <button id="searchBtn" onclick="SUMIT();"> SEARCH</button>
            <input type="Button" onclick="location.href='<%=request.getContextPath() %>/views/admin/insertNotice.jsp'"  id="WriteBtn" value="글쓰기">
            <button type="button" id="deleteNote"  onclick="deleteNotice();"   class="l_btn">선택삭제</button>
            <table id="noticelistArea">
                <tbody>
                    <tr class="noticehead">
                       <th><input type="checkbox" id="checkall"></th> <th>NO</th> <th>제목</th> <th>작성자</th> <th>날짜</th> <th>삭제여부</th>
                    </tr>

                 
             <% 
             if(list!=null){
                for(int i =0;i<list.size();i++){
                   %>
                  
                    <tr class="noticelist">
                          <td><input type="checkbox" name="nNo" value="<%=list.get(i).getnNo()%>"></td>  
                           <td class="clk"><%=list.get(i).getnNo()%></td>
                           <td class="clk"><%=list.get(i).getnTitle()%></td>
                           <td class="clk">관리자</td>
                           <td class="clk"><%=list.get(i).getnDaatee()%></td>
                           <td class="clk"><%=list.get(i).getnDelYn()%></td>
                       </tr>
                       <tr class="cont">
                          <td colspan="6">
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
            </form>
            <script>
                  $("table .noticelist .clk").click(function(){
                $(this).parent().next().toggle();
                  });
                  
                  function deleteNotice(){         
                      $("#shoppingbagForm").attr("action", "<%=request.getContextPath()%>/admin/NoticeDelete");
                          $("#shoppingbagForm").submit();
                    }
                  function SUMIT(){         
                      $("#shoppingbagForm").attr("action", "<%=request.getContextPath()%>/admin/NoticeView");
                          $("#shoppingbagForm").submit();
                    }
           </script>
             <div class="pageinArea" align="center">
            <%
            if(search ==null){
            %>   
            
             <!-- search가 널일때  -->
             <!-- 맨 처음으로 -->
            
            <button class="search"  onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=1 %>'"> << </button>
       
            <!-- 이전 페이지 -->
            <%if(currentPage <= 1) {%>
               <button class="search"  disabled> < </button>
            <%}else {%>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=currentPage-1%>'"> < </button>
            <%} %>                                
            <!-- 10개의 페이지 목록 -->
            <%for(int p = startPage; p<=endPage; p++){
            %>
               <%if(currentPage == p) {%>
                  <button class="search"  disabled><%=p %></button>
                  <%} else{%>
                  
                  <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=p%>'"><%=p %></button>
                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->
               <%} %>
            <%}%>
            <!-- 다음 페이지로 -->
            <%if(currentPage >= maxPage) {%>
               <button class="search"  disabled> > </button>
            <%}else { %>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=currentPage + 1%>'"> > </button>
            <%} %>
            <!-- 맨 끝으로  -->
            <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=maxPage %>'"> >> </button>   
               
               
               
               
               
            <% }else{%>
               
                <!-- 맨 처음으로 -->
            <button class="search"  onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=1 %>&search=<%=search%>'"> << </button>
       
            <!-- 이전 페이지 -->
            <%if(currentPage <= 1) {%>
               <button class="search"  disabled> < </button>
            <%}else {%>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=1 %>&search=<%=search%>'"> < </button>
            <%} %>                                
            <!-- 10개의 페이지 목록 -->
            <%for(int p = startPage; p<=endPage; p++){
            %><%if(currentPage == p) {%>
                  <button class="search"  disabled><%=p %></button>
               <%} else{%>
                  <%-- <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage='+<%=p %>&noticeSearch=<%=csearch%>'"><%=p %></button> --%>
                  <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=p %>&search=<%=search%>'"><%=p %></button>
                  <!-- url에 값을 넣어서 보내는 방식 쿼리 스트링방식 -->
               <%} %>
            <%}%>
            <!-- 다음 페이지로 -->
            <%if(currentPage >= maxPage) {%>
               <button class="search"  disabled> > </button>
            <%}else { %>
               <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=currentPage + 1%>&search=<%=search%>'"> > </button>
            <%} %>
            <!-- 맨 끝으로  -->
            <button class="search" onclick="location.href='<%=request.getContextPath() %>/admin/NoticeView?currentPage=<%=maxPage %>&search=<%=search%>'"> >> </button>   
               
               
            <%}                  
            %>
          
            
            
           
         </div>
        </section>
        
    </body>
</html>