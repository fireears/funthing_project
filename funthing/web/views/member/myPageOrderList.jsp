<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"
   import="payment.model.vo.OrderUpdate, java.util.ArrayList, board.model.vo.*"%>
   
<%@ page import="java.text.DecimalFormat" %>

<%
   ArrayList<OrderUpdate> list = (ArrayList<OrderUpdate>)request.getAttribute("list");
   PageInfo pi = (PageInfo)request.getAttribute("pi");   
   
   /* Member loginUser3 = (Member)session.getAttribute("loginUser");*/
   String userNo = (String)request.getAttribute("userNo");
   int currentPage = pi.getCurrentPage();
   int limit = pi.getLimit();
   int maxPage = pi.getMaxPage();
   int startPage = pi.getStartPage();
   int endPage = pi.getEndPage();
   DecimalFormat formatter = new DecimalFormat("###,###");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
      <style>
      .r-cont-header {
         width: 100%;
         padding: 10px 20px;
         border-top: 1px solid #bbb;
         border-bottom: 1px solid #bbb;
      }
      
      .r-cont-header:after {
         clear: both;
         content: "";
         display: block;
      }
      
      .r-cont-text {
         width: 30%;
         margin: 0 0 0 0;
         margin-right: 0;
         padding: 0 0 0 0;
         float: left;
      }
      
      .r-cont-button {
         float: right;
         border: 1px solid #bbb;
         background-color: #bbb;
      }
      
      .r-cont-button a {
         margin: 20px;
         font-size: 15px;
         color: white;
      }
      
      /* 날짜 조회 영역 */
      .point {
         padding-left: 20px;
         width: 100%;
         margin: 60px 0;
      }
      
      /* 날짜 영역 */
      .point-search {
         margin-top: 30px;
         height: 130px;
         border-top: 1px solid #0f4a7e;
         border-bottom: 1px solid #bbb;
         border-left: 1px solid #bbb;
         border-right: 1px solid #bbb;
      }
      
      .point-search ul {
         display: inline-block;
      }
      
      .point-search ul:after {
         display: block;
         content: "";
         clear: both;
      }
      
      .point-search ul li {
         float: left;
         margin-top: 45px;
         margin-left: 30px;
      }
      
      .point-search ul h3 {
         color: darkgray;
      }
      
      /* 날짜 조회 버튼 */
      .submit {
         width: 120px;
         height: 30px;
         background-color: #0f4a7e;
         color: white;
         border: none;
         font-size: 15px;
         cursor:pointer;
      }
      
      /* 1:1문의 조회 list 영역 */
      .search-list {
         padding-left: 20px;
         width: 100%;
      }
      
      .list-tb {
         margin-top: 30px;
         border-top: 2px solid #0f4a7e;
         width: 100%;
         border-bottom: 1px solid #0f4a7e;
         line-height: 50px;
         border-collapse: collapse;
      }
      
      .list-tb th {
         border-bottom: 1px solid #0f4a7e;
      }
      
      .list-tb tr {
         border: 0;
         padding: 0;
         border-bottom: 1px solid #bbb;
      }
      
      .list-tb td {
         text-align: center;
      }
      
      .list-tb .tb-zero {
         margin-left: 20px;
      }
      
      .list-tb .tb-first {
         width: 200px;
      }
      
      .list-tb .tb-last {
         width: 200px;
      }
      
      /* 페이징 처리 부분 */
      .pagingArea {
         margin: 0 auto;
         margin-top: 20px;
         margin-bottom: 20px;
      }
      
      .pagingArea button {
         border: 0;
         font-size: middle;
         background: white;
         cursor: pointer;
      }
      
      /* 배송지 수정 */
       body {
            font-family: sans-serif;
            color: rgb(67, 74, 82)
        }

        h2 {
            margin: 10px;

        }

        #c_h2 {
            border-bottom: solid 1.5px grey;
        }




        #info {
            margin: 20px;
            border-top: solid lightslategrey 0.5px;
            border-bottom: solid lightslategrey 0.5px;
            background: rgba(218, 219, 219, 0.479);
            /* height: 20%;
            width: 30%; */
            text-align: center;

        }


        #c_image {
            display: inline-block;

        }

        #c_img {
            margin-top: 10px;
            margin-bottom: 10px;
            height: 100px;
            width: 70px;
        }
        
         #orderImg {
            margin-top: 10px;
            margin-bottom: 10px;
            height: 60px;
            width: 40px;
        }

        #c_title {
            width: 50%;
            height: 100%;
            float: none;
            display: inline-block;
                       

        }

        #c_price {
            display: inline-block;
        }

        div {
            /* border: solid 1px; */

        }



        table {
            width:100%;
            border-bottom: 1px solid lightslategray;
            
        }


        .corr {
            border-top: 0.5px solid lightslategray;
            border-bottom: 0.5px solid lightslategray;
            font-size: small;
            height: 20px;
            line-height: 30px;
        }

        #corr_info td {
            padding-right:0;
            
            
        }

        #corr_info th {

            background: rgba(218, 219, 219, 0.479);
            padding-right: 50px;
        
        }
      
        #correction {
            margin: 20px;

        }

        #addressBtn{
            float: right;
            border:0;
            border-radius: 5px;
            height:25px;
            background: lightgrey;
        }
        
        #shipping{width:200px;}
        
        
        /* 모달창 */
        .modal {
          display:none;
        position:relative;
        width:100%;
        height:100%;
        z-index:1;
      }
      
       #modal h2 {
        margin:0;   
      }
      
      #modal button {
        display:inline-block;
        width:100px;
        margin-left:calc(100% - 100px - 10px);
      }
      
      .modal .modal_content {
        width:700px;
        margin:-350px auto;
        padding:20px 10px;
        background:#fff;
        border:2px solid #666;
      }
      
      .modal .modal_layer {
        position:fixed;
        top:0;
        left:0;
        width:100%;
        height:100%;
        background:rgba(0, 0, 0, 0.5);
        z-index:-1;
      }    
      
      .shippingTb{width:600px;}
      
      #shippingInfo tbody{background:rgba(218, 219, 219, 0.479); border-top:1px solid grey; border-bottom:1px solid grey;}
      
      .shippingTb input, textarea {border:0;}
      </style>
   </head>
   <body>
      <%@ include file="../common/header.jsp"%>
   
      <%@ include file="../common/myPageHeader.jsp"%>
      <div id="content">
         <!-- 오른쪽 컨텐츠 영역 -->
         <%@ include file="../common/myPageSide.jsp"%>
         <div id="r-cont">
            <!-- 오른쪽 컨텐츠 수정 영역  -->
   
            <!-- 오른쪽 컨텐츠 헤더 영역-->
            <div class="r-cont-header">
   
               <div class="r-cont-text">
                  <h2 style="text-align:left;">
                     <b style="color: #0f4a7e; font-size:20px;">주문목록</b>
                  </h2>
               </div>
            </div>
            <div class="point">
            <form method="get" action="<%=request.getContextPath()%>/member/myPageOrderList">
               <div class="point-search">
                  <ul>
                     <input type="hidden" name="userNo" value="<%=loginUser2.getmNo() %>">
                     <li><h3>조회기간</h3></li>
                     <li><input type="radio" name="searchDate" id="today"
                        value="today"> <label for="today">오늘</label></li>
                     <li><input type="radio" name="searchDate" id="week"
                        value="week"> <label for="week">7일</label></li>
                     <li><input type="radio" name="searchDate" id="month"
                        value="month"> <label for="month">1개월</label></li>
                     <li><input type="radio" name="searchDate" id="3months"
                        value="3months"> <label for="3months">3개월</label></li>
                     <li><input type="radio" name="searchDate" id="6months"
                        value="6months"> <label for="6months">6개월</label></li>
                     <li><input type="radio" name="searchDate" id="year"
                        value="year"> <label for="year">1년</label></li>
                     <li><input type="date" name="firstDate" value="09/01/01">
                     </li>
                     <li><input type="date" name="secondDate" value="09/01/01">
                     </li>
                     <li><input type="submit" class="submit" value="조회"></li>
   
                  </ul>
               </div>
               </div>
            </form>
            <!-- 주문목록 조회기간 end -->
   
            <br clear="both">
   
            <div class="search-list">
               <table class="list-tb" id = "list-table">
                  
                  <tr>
                     <!-- <th class="tb-zero">번호</th> -->
                     <th class="tb-first">날짜</th>
                     <th>주문번호</th>
                     <th>상품명/컬러/사이즈</th>
                     <th>상품금액/수량</th>
                     <th class="tb-last">주문상태</th>
                     <th>배송지수정/취소</th>
                  </tr>
                  <%if(!list.isEmpty()) {%>
                  
                  <%for(OrderUpdate ol : list){ %>
                  <tr align="center">
                     <%-- <input type="hidden" id="listNo" value=<%=ol.getListNo() %>> --%>
                     <input type="hidden" id="userNo" value=<%=loginUser.getmNo()%>>
                     <input type="hidden" id="oNo" value=<%=ol.getO_no()%>>
                     <%-- <td class="tb-zero"><%=ol.getrNum()%></td> --%>
                     <td class="tb-first"><%=ol.getO_date()%></td>
                     <td ><%=ol.getO_no() %></td>
                     <td><img id="orderImg" src="<%=request.getContextPath()+"/images/thumbnail/" + ol.getThumbnail() + ".jpg" %>"><a href="<%=request.getContextPath()%>/productDateil?pName=<%=ol.getpName() %>"><%=ol.getpName() %>/ <%=ol.getpColor()%> / <%=ol.getpSize() %></td>
                     <td><%=formatter.format(ol.getTotalPrice()) %> 원 / <%=ol.getoNum() %> 개</td>
                     <%if(ol.getCancelYn().equals("N")){%>
                     <td><%=ol.getPrcsStatus()%></td>
                     <%}else{ %>
                     <td>주문취소</td>
                     <%} %>
                     <th>
                     <input type = "button" value = "배송지수정" class="submit" id="shipBtn"  style="width:70px;font-size: 8px;"> 
                     <input type = "button" value="취소하기" class="submit" id="orderCan" style="width:70px;font-size: 12px;">
                     </th>
                  </tr>
                  
                  
                              
                  <%}}else{ %> <!-- if문 for문 end -->
               
                  <tr style="margin-top: 30px;">
                     <td colspan="9"><div style="text-align: center">검색결과가없습니다.</div></td>
                  </tr>
   
                  <%} %> <!-- if문 end  -->
               </table>
            </div>
            
                  <!-- 모달창 start-->
                  <div class="modal" id="shipModal">
                     
                      <div class="modal_content">
                          <h1 style="font-size:x-large;">배송지수정</h1>
                       		
                       		
                            <!-- 배송지 수정 start-->
                             <form method="get" action="<%=request.getContextPath() %>/shippingModify" id="shipForm">
                           <div id="shipping">
                               <div id="info">
                                   <table class="shippingTb" id="shippingInfo">
                               <%for(OrderUpdate ou : list){ %>
                                       <tr>
                                            <input type="hidden" id="userNo" name="userNo" value=<%=loginUser.getmNo()%>>
                                            <input type="hidden" id="oNoinfo" name="oNo" value=<%=ou.getO_no()%>>
                                           <td id="c_image" name="c_image">
                                           <img id="c_img" src="<%=request.getContextPath()+"/images/thumbnail/" + ou.getThumbnail() + ".jpg" %>">
                                           </td>
                                           <td id="c_title" name="c_title" ><%=ou.getpName() %></td>
                                           <td id="c_price" name="c_price" ><%=formatter.format(ou.getTotalPrice()) %> 원 </td>
                                       </tr>
                                 
                                   </table>
                                   
                               </div>
                               <div id="correction">
                                   <h3>배송지 정보</h3>
                                   <table id="corr_info" class="shippingTb">
                                       <tr>
                                           <th class="corr" align="left" >이름</th>
                                           <td class="corr" id="ship_name" ><input type="text" name="shipName" value="<%= ou.getRcv_name() %>"></td>
                                       
                                       </tr>
                                       <tr>
                                           <th class="corr" align="left">주소</th>
                                           <td class="corr" id="ship_address">
                                           <input type="text" id="postcode"><br>
                                           <input type="text"  name="shipAds" id="detailAddress" value="<%= ou.getRcv_adrs() %>">
                                           <input type="text" id="extraAddress">
                                           <button type="button" id="addressBtn" onclick="DaumPostcode();" name="addressBtn" align="right">주소검색</button></td>
                                         
                                       </tr>
                                       <tr>
                                           <th class="corr" align="left">전화번호</th>
                                           <td class="corr" id="ship_tel" ><input type="text"  name="shipTel" value="<%= ou.getRcv_phone() %>"></td>
                                          
                                       </tr>
                                       <tr>
                                           <th class="corr" align="left">남기실 말씀</th>
                                           <td class="corr"><textarea name="shipCom"><%=ou.getComment() %></textarea></td>
                                          
                                       </tr>
                                         <%} %><!-- for end -->
                                   </table>
                               </div>
                           </div>
                            <div align="center">
                           <button type="submit" id="updateModi" class="submit">배송지 수정</button>                   
                           <button type="button" id="modal_close_btn1" class="submit">취소</button>
                           </div>
                         </form>
                     </div>
                   <div class="modal_layer"></div>
               </div>
                 <!-- 배송지 수정 end-->      
                     
                 <!-- 주문취소 start -->
                  
                  <div class="modal" id="orderCanModal">
                     
                      <div class="modal_content">
                          <h1 style="font-size:x-large;">주문 취소</h1>
                         <form method="get" action="<%=request.getContextPath() %>/orderCancle" id="cancal_form">
                             <div id="info">
                                 <table>
                                  <%for(OrderUpdate ou : list){ %>
                                    <tr>
                                         <input type="hidden" id="userNo" name="userNo" value=<%=loginUser.getmNo()%>>
                                         <input type="hidden" id="oNo" name="oNo" value=<%=ou.getO_no()%>>
                                         <input type="hidden" id="cancleYn" name="cancleYn" value=<%=ou.getCancelYn()%>>
                                        <td id="c_image" name="c_image">
                                        <img id="c_img" src="<%=request.getContextPath()+"/images/thumbnail/" + ou.getThumbnail() + ".jpg" %>">
                                        </td>
                                        <td id="c_title" name="c_title" ><%=ou.getpName() %></td>
                                        <td id="c_price" name="c_price" ><%=formatter.format(ou.getTotalPrice()) %> 원 </td>
                                    </tr>
                                 
                                 </table>
                             </div>
                             <div id="cancle_reason" style="margin-left:20px;">
                                 <h3>취소 사유</h3>
                                 <div class="radio">
                                     <input type="radio" id="c_design" name="c_reason">
                                     <label for="design">디자인이 마음에 들지 않습니다.</label><br>
                                 </div>
                                 <div class="radio">
                                     <input type="radio" id="c_latedate" name="c_reason">
                                     <label for="c_latedate">배송출고 날짜가 늦습니다.</label><br>
                                 </div>
                                 <div class="radio">
                                     <input type="radio" id="misssize" name="c_reason">
                                     <label for="c_misssize">사이즈가 부적절합니다.</label><br>
                                 </div>
                                 <div class="radio">
                                     <input type="radio" id="c_etc" name="c_reason">
                                     <label for="c_etc">기타</label><br>
                                     <textarea id="c_textarea" name="c_reason" style="width:500px;  border:1px solid grey;"rows="3"  placeholder="기타 사유를 입력해주세요."></textarea>
                                 </div>
                             </div>
                          <%} %><!-- for end -->
                          <div align="center" style="margin-top:20px;">
                           <button type="submit" id="orderCan" class="submit"  >주문 취소</button>                        
                          <button type="button"  id="modal_close_btn2" class="submit">취소</button>
                          </div>
                         </form>
                         
                      </div>
                     
                      <div class="modal_layer"></div>
                  </div>
                  <!-- 주문취소 end -->
                  
                  
            <!-- 주문목록 조회 결과 영역 end -->
            <!-- <br> <br> -->
            <div class="pagingArea" align="center">
   
               <!-- 맨 처음으로 -->
               <button
                  onclick="location.href='<%=request.getContextPath() %>/OrderList?currntPage=1&userNo=<%=userNo%>'">
                  <<</button>
   
   
               <!-- 이전 페이지로 -->
               <%if(currentPage == 1){ %>
               <button disabled><</button>
   
               <%}else{ %>
               <button
                  onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=currentPage -1 %>&userNo=<%=userNo%>'">
                  <</button>
               <%} %>
   
   
               <!-- 10개의 페이지 목록 -->
               <%for(int p = startPage; p <= endPage; p++){ %>
               <%if(currentPage == p){ %>
               <button disabled><%=p %></button>
   
               <%}else{ %>
               <button
                  onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=p %>&userNo=<%=userNo%>'"><%=p %></button>
               <%} %>
               <%} %>
   
   
               <!-- 다음 페이지로 -->
               <%if(currentPage == maxPage){ %>
               <button disabled>></button>
               <%}else{ %>
               <button
                  onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=currentPage + 1 %>&userNo=<%=userNo%>'">
                  ></button>
               <%} %>
   
   
               <!-- 맨 뒷 페이지로  -->
               <button
                  onclick="location.href='<%=request.getContextPath() %>/OrderList?currentPage=<%=maxPage %>&userNo=<%=userNo%>'">
                  >></button>
   
            </div>
            
   
         </div>
      </div>
      <%@ include file="../common/footer.jsp"%>
   
   
      <script>
       
          $(function(){
             $("#list-table td").mouseenter(function(){
                 $(this).parent().css({"cursor" : "pointer"}); 
                /* $(this).parent().css({"background" : "grey"}); */
                
             }).click(function(){
                var oNo = $("#oNoinfo").val();
                var userNo = $("#userNo").val();
                
                 <%-- location.href = "<%=request.getContextPath()%>/orderListDetail?oNo="+oNo+"&userNo="+userNo; --%>
                 location.href="<%=request.getContextPath()%>/orderListDetail?userNo=<%=loginUser.getmNo()%>&oNo=" + oNo;  
                 
             })
             
             
          })
          
          $(function(){
             $("#shipBtn").click(function(){
                $("#shipModal").css("display","block");
             })
             $("#modal_close_btn1").click(function(){
                $("#shipModal").css("display","none");
             })
             
             $("#orderCan").click(function(){
                $("#orderCanModal").css("display","block");
             })
             $("#modal_close_btn2").click(function(){
                $("#orderCanModal").css("display","none");
             })
          })
          
       /*    function updateModi(){
             alert("배송지를 수정하였습니다.");
             $("#shipForm").submit();
          }
           */
     
          <%-- 
          
           function shippingModify(){
             var oNo = $("#oNo").val();
              location.href="<%=request.getContextPath()%>/shippingModify?mNo=<%=loginUser.getmNo()%>&oNo=" + oNo;  
                
          } --%>
          function DaumPostcode() {
              new daum.Postcode({
                  oncomplete: function(data) {
                      var addr = ''; // 주소 변수
                      var extraAddr = ''; // 참고항목 변수
                      if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                          addr = data.roadAddress;
                      } else { // 사용자가 지번 주소를 선택했을 경우(J)
                          addr = data.jibunAddress;
                      }
      

                      if(data.userSelectedType === 'R'){
                          // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                          // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                          if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                              extraAddr += data.bname;
                          }
                          // 건물명이 있고, 공동주택일 경우 추가한다.
                          if(data.buildingName !== '' && data.apartment === 'Y'){
                              extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                          }
                          // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                          if(extraAddr !== ''){
                              extraAddr = ' (' + extraAddr + ')';
                          }
                          // 조합된 참고항목을 해당 필드에 넣는다.
                          document.getElementById("extraAddress").value = extraAddr;
                      
                      } else {
                          document.getElementById("extraAddress").value = '';
                      }
      
                      // 우편번호와 주소 정보를 해당 필드에 넣는다.
                      document.getElementById('postcode').value = data.zonecode;
                      document.getElementById("detailAddress").value = addr;
                      /* document.getElementById("detailAddress").focus(); */
                      
                  }
              }).open();
          }
       </script>
       
   </body>
   </html>