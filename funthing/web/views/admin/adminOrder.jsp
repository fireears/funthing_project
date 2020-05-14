<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%
        /* ArrayList<OrderManage> list = (ArrayList<OrderManage>)request.getAttribute("list");   */
       
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order_manager</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>


 <style>
        #order_manage{margin-left:200px; width:1200px;}
        #order_table {
            border-top: 2px solid grey;
            border-bottom: 1px solid grey;
            border-collapse: collapse;
            margin: 0 auto;
           width: 1200px;
        }

        #order_table tr { border-bottom: 1px solid grey; }

        #order_table th { padding:5px; padding-left:10px; text-align: center;}


        #order_table td { padding:5px; padding-left:10px; text-align: center;}
   
         .pagingArea {margin:0 auto; margin-top:20px; margin-bottom:20px;}

      .pageBtn {border:0; font-size:middle; background:white; cursor:pointer;}   
         
         #searchArea {margin:0 auto; text-align:center;}
         
         #searchForm {background:white;}
         
         #search_kind {width:100px; height:40px;}
    </style>
</head>
<body>

   <%@ include file="../common/adminHeader.jsp" %>
   
   <h2 align="center">주문관리</h2>
    <div id="order_manage">
        <table id="order_table">
            <tr>
               <th>번호</th>
                <th>주문번호</th>
                <th>회원아이디</th>
                <th>결제방법</th>
                <th>결제유무</th>
                <th>배송단계</th>
                <th>총 합계</th>
                <th>취소여부</th>
                
            </tr>
            
            <tr>
            
            <input type="hidden" value="<%=om.getmId() %>">
            <td><%= om.getRnum() %></td>
                <td><%= om.getoNo() %></td>
                <td><%= om.getmId() %></td>
                <td><%= om.getPmntMthd() %></td>
                <td><%= om.getPainYn() %></td>
                <td><%= om.getPrcsStatus() %></td>
                <td><%= om.getPmntPrice() %></td>
                <td><%= om.getCancelYn() %></td>
            
             
            </tr>
            <% } %>
            
            <%} %>
        </table>
    </div>
   <!--페이징 처리 시작  -->
   <div class="pagingArea" align="center">
      <!-- 맨 처음으로 -->
      <button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/orderInfo.or?currentPage=1'"> << </button>
   
      <!-- 이전 페이지로 -->
      
      <button class="pageBtn"  disabled> < </button>
     
      <button class="pageBtn"  onclick="location.href='<%=request.getContextPath()%>/orderInfo.or?currentPage-1'"> < </button>
     
      
      <!-- 10개의 페이지 목록 -->
     
            <button class="pageBtn" disabled></button>
        
            <button class="pageBtn" onclick="location.href='<%=request.getContextPath()%>/orderInfo.or?currentPage=<%=p%>'"> </button>
        
      
      <!-- 다음페이지로  -->
     
         <button disabled class="pageBtn"> > </button>
   
         <button class="pageBtn"  onclick="location.href='<%=request.getContextPath()%>/orderInfo.or?currentPage+1'"> > </button>
    
      
      <!-- 맨 끝으로 -->
      <button class="pageBtn"  onclick="location.href='<%=request.getContextPath()%>/orderInfo.or?currentPage=<%= maxPage %>'"> >> </button>
   </div>
   <div id="searchArea">
      <form id="searchForm" action="<%=request.getContextPath()%>/orderInfo.or" method="post">
      <span>
      <select id="search_kind" name="searchKind">
         <option value="m_Id">아이디</option>
         <option value="o_No">주문번호</option>
      </select>
      </span>
      <span>
         <input type="text" id="seachText" name="searchText">
      </span>
      <span>
         <button type="submit" value="검색버튼" id="seachBtn">검색</button>
       </span>
      </form>
   </div>
   
   
   
   
   <script>
      $(function(){
         $("#order_table td").mouseenter(function(){
            $(this).parent().css({"background":"darkgrey","cursor":"pointer"});
         }).mouseout(function(){
            $(this).parent().css({"background":"white"});
         }).click(function(){
            var mid = $(this).parent().children("input").val();
            
            /* 아이디별 상세내역 출력 */
            location.href="<%=request.getContextPath()%>/detail.or?mid="+mid
            
            
            
         })
      })
   </script>
   
</body>
</html>