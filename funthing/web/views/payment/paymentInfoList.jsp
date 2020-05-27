<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.model.vo.MemberPoint" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="payment.model.vo.ShoppingPayment" %>
<%@ page import="java.text.DecimalFormat" %>
<%
   DecimalFormat formatter = new DecimalFormat("###,###");
   MemberPoint mp = (MemberPoint)request.getAttribute("m");
   ArrayList<ShoppingPayment> resultList = (ArrayList<ShoppingPayment>)request.getAttribute("resultList");

   String mNo = mp.getmNo();
   int mPoint = mp.getmPoint();
   double point_rate = mp.getPoint_rate();
   
   int p_point = 0;
   int totalPrice = 0;
   try
   {
      
      if(!resultList.isEmpty())
      {
         for(ShoppingPayment sp : resultList)
         {
            totalPrice += sp.getP_price() * Integer.valueOf(sp.getNumber());
         }
      }
   }
   catch(NumberFormatException e)
   {
      e.printStackTrace();
   }
   
%>

<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>주문결제</title>
      <!-- <script  src="http://code.jquery.com/jquery-latest.min.js"></script> -->
      <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
      <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
      <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
      <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
      <link rel="stylesheet" href="<%=request.getContextPath() %>/css/paymentInfo.css">
      <style>
         #area{margin-top: 2.5%;}
         #title{font-size:20px; font-weight: 600;}
         
         #area{margin-left: 30px; width: 70%; border-top: 3px solid #0f4a7e;}
         
         .table1{border-top: 2px solid black; border-bottom: 1px solid gray;}
         .table1 > table{width: 100%;}
         .ta-1{width: 20%; height: 40px; line-height: 40px; font-size: 14px; font-weight: 800; color: rgb(104, 103, 103); background-color: rgb(207, 205, 205);}
         .txt-field{padding-left: 30px; width: 100%; height: 100%;}
         .txt-field>input{ height: 20px; width: 200px;}
         
         
         .txt-field1{padding-left: 30px;}
         .txt-field2{padding-left: 30px; height: 100%;}
         .txt-field2>input{width: 600px; height: 20px;}
         
         #title{font-size:20px; font-weight: 600; margin-top:20px; margin-bottom:20px}
         
         
         
         
         #resultPayArea{position: fixed; top: 25%; left: 75%; width: 350px; height: 480px; border: 4px solid #0f4a7e; text-align: center;}
         #resultPayArea>div{margin: auto; width: 90%;}
         #resultPayArea>div>table{width: 100%;}
         #resultPayArea>div>table th{text-align: left;}
         #resultPayArea>div>table td{text-align: right;}
         #resultprice{font-size: 30px; font-weight: 600;}
         
         #product>tbody>tr>td>div{font-size:18px; line-height:100%;}
         #product>tbody>tr>th{font-size:20px;}
      </style>
      
   </head>
   <body>
      <%@ include file = "../common/header.jsp" %>
      <section>
            
            <article id="area">
                <form action="<%=request.getContextPath() %>/Payment" id="payment" method="GET">
                   <input type="hidden" name="mNo" value="<%=mNo %>">
                    <p id="title">주문자 정보</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <tr>
                                    <th class="ta-1" aria-required="true">주문하시는 분</th>
                                    <td><div class="txt-field"><input type="text" name="m_name" maxlength="20" value="<%=loginUser.getmName()%>"></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">휴대폰 번호</th>
                                    <td><div class="txt-field"><input type="text" name="m_tell" maxlength="20" placeholder="'-'없이 입력해주세요." value="<%=loginUser.getmTell()%>"></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">이메일</th>
                                    <td>
                                       <div class="txt-field"><input type="text" id="email"name="m_email" value="<%=loginUser.getmEmail()%>">&nbsp;
                                       </div>
                                    </td>
                                </tr>
                                
                            </tbody>
                        </table>
                    </div>
                    
                    <p id="title">배송정보</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <tr>
                                    <th class="ta-1" aria-required="true">받으실분</th>
                                    <td><div class="txt-field"><input type="text" id="rcv_name" name="rcv_name" maxlength="20"></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">받으실 곳</th>
                                    <td>
                                        <div class="txt-field">
                                            <input type="text" id="postcode" placeholder="우편번호">
                                 <input type="button" onclick="DaumPostcode()" value="우편번호 찾기" style="height:25px; width:100px"><br>
                                 <input type="text" id="detailAddress" name="rcv_adrs" placeholder="상세주소">
                                 <input type="text" id="extraAddress" placeholder="참고항목">
                                 
                                 
                                 <script>
                                     function DaumPostcode() {
                                         new daum.Postcode({
                                             oncomplete: function(data) {
                                                 // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
                                 
                                                 // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                                                 // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                                                 var addr = ''; // 주소 변수
                                                 var extraAddr = ''; // 참고항목 변수
                                 
                                                 //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                                                 if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                                                     addr = data.roadAddress;
                                                 } else { // 사용자가 지번 주소를 선택했을 경우(J)
                                                     addr = data.jibunAddress;
                                                 }
                                 
                                                 // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
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
                                                 document.getElementById("detailAddress").focus();
                                                 alert("주소란에 상세 주소를 입력해주세요.");
                                             }
                                         }).open();
                                     }
                                 </script>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">전화번호</th>
                                    <td><div class="txt-field"><input type="text" name="rcv_phone" maxlength="20" placeholder="'-'없이 입력해주세요."></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">남기실 말씀</th>
                                    <td><div class="txt-field2"><input type="text" name="comment"></div></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>



                    <!-- 화면에 뿌려주기만 -->
                    <p id="title">결제 예정 상품</p>
                    <div class="table1">
                        <table id="product">
                            <tbody>
                                <tr>
                                    <th>상품/옵션 정보(color/size)</th><th>수량</th><th>상품금액</th><th>할인/적립</th><th>합계금액</th><th>배송비</th>
                                </tr>
                                <%if(!resultList.isEmpty()) { %>
                                <%for(ShoppingPayment sp : resultList) {%>
                                <tr style="line-heigth:150px;">
                                	<input type="hidden" name="pName" value="<%=sp.getP_name() %>">
                                	<input type="hidden" name="pNo" value="<%=sp.getP_no() %>">
                                	<input type="hidden" name="result_price" value="<%=sp.getP_price() * Integer.valueOf(sp.getNumber()) %>">
                                	<input type="hidden" name="o_num" value="<%=sp.getNumber() %>">
                                    <td align="left"><img src="<%=request.getContextPath()+"/images/thumbnail/" + sp.getThumbnail() + ".jpg" %>" alt="상품사진" id="productImg" style="width:80px; height:100px;"><span><%=sp.getP_name() %>/<%=sp.getP_color() %>/<%=sp.getP_size() %></span></td>
                                    <td style="text-align: center; "><div id="num"><%=sp.getNumber() %></div></td>
                                    <td style="text-align: center;"><div id="retail_price"><%=formatter.format(sp.getRetail_price() * Integer.valueOf(sp.getNumber())) %></div></td>
                                    <td style="text-align: center;"><div id="dc_point"><%=sp.getDc_rate() %>%/<%=sp.getP_point() %>p</div></td>
                                    <td style="text-align: center;"><div id="result_price"><%=formatter.format(sp.getP_price() * Integer.valueOf(sp.getNumber())) %></div></td>
                                    <%if(sp.getP_price() * Integer.valueOf(sp.getNumber()) > 50000) { %>
                                    <td style="text-align: center;"><div id="ship_price">0</div></td>
                                    <%} else { %>
                                    <td style="text-align: center;"><div id="ship_price">5,000</div></td>
                                    <%} %>
                                </tr>
                                <%p_point += sp.getP_point();} %>
                                <%} %>
                            </tbody>
                        </table>
                    </div>
               
               
                    <p id="title">결제정보</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <tr>
                                    <th class="ta-1" aria-required="true">상품 합계 금액</th>
                                    <%if(totalPrice > 50000) { %>
                                    <td><div class="txt-field"><div id="product_sum_price"></div><%=formatter.format(totalPrice) %></div></td>
                                    <%} else { %>
                                    <td><div class="txt-field"><div id="product_sum_price"></div><%=formatter.format(totalPrice +5000) %></div></td>
                                    <%} %>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">보유 적립금</th>
                                    <td><div class="txt-field"><input type="hidden" name="m_point" value="<%=mPoint%>">총 보유 적립금 : <%=mPoint %>p<div id="totalPoint"></div></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">적립금 사용</th>
                                    <td><div class="txt-field"><input type="text" id="point_user" name="point_use" value="0" style="width: 100px;">P</div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">최종 결제 금액</th>
                                    <td><div class="txt-field"><div id="result_price1"></div></div></td>
                                </tr>
                                
                            </tbody>
                        </table>
                    </div>
               
               <br><br>
                    <!-- 오른쪽 사이드 결제하기 구역-->
                    <div id="resultPayArea">
                        <div>
                            <p style="font-size:20px; font-weight:600; margin-top:10px;">주문금액<p>
                            <hr>
    
                            <table>
                               <%if(totalPrice > 50000) { %>
                                <tr><th>상품 합계 금액</th><td id="totalPrice" style="text-align: right;"><input type="hidden" name="total_price" value="<%=totalPrice%>"><%=formatter.format(totalPrice) %>원</td></tr>
                                <%} else { %>
                                <tr><th>상품 합계 금액</th><td id="totalPrice" style="text-align: right;"><input type="hidden" name="total_price" value="<%=totalPrice + 5000%>"><%=formatter.format(totalPrice +5000) %>원</td></tr>
                                <%} %>
                                <%if(totalPrice > 50000) {%>
                                <tr><th>배송비</th><td  style="text-align: right;"><input type="hidden" name="ship_price" value="0">0원</td></tr>
                                <%} else { %>
                                <tr><th>배송비</th><td  style="text-align: right;"><input type="hidden" name="ship_price" value="5000">5000원</td></tr>
                                <%} %>
                            </table>
    
                            <hr>
    
                            <table>
                                <tr><th>최종 결제 금액</th><td id="resultprice"><input type="hidden" id="expt_price" name="expt_price"><%=formatter.format(totalPrice) %>원</td></tr>
                                <tr><th>회원 등급별 적립금</th><td><%=(int)(totalPrice * point_rate) %>p</td></tr>
                                <tr><th>상품별 적립금</th><td><%=p_point %>p</td></tr>
                                <tr><th>총 적립예정 적립금</th><td><input type="hidden" name="expt_point" value="<%=(int)((totalPrice * point_rate) + p_point) %>"><%=(int)((totalPrice * point_rate) + p_point) %>p</td></tr>
                            </table>
    
                            <hr>
                            <br clear="both">
                            <div class="checkArea" style="text-align: left;">
                                <input type="checkbox" name="" id="">전체 동의합니다.<br>
                                <input type="checkbox" name="" id="">구매하실 상품의 결제정보를 확인하였으며, 구매진행에 동의합니다.(필수)<br>
                                <input type="checkbox" name="" id="">상품 공급사 개인정보 제공 동의에 대한 내용을 확인 하였으며 이에 동의 합니다.(필수)<br>
                            </div>
                            <br><br>

                     <button type="button" id="pay" style="width: 70%; height: 55px; border: 0px; background-color: rgb(3, 3, 87); color: white; font-size: 20px;">결제하기</button>
                        </div>
                    </div>

                </form>

                
            </article>
        </section>
        <%@include file="/views/common/footer.jsp" %>
   </body>
   
   <script>
      $(function(){
    	  // 전체 동의시 나머지  체크박스 체크
    	  $(".checkArea input:eq(0)").click(function(){
    		  if($(".checkArea input:eq(0)").is(":checked")){
    			  $(".checkArea input").prop("checked", true);
    		  }else{
    			  $(".checkArea input").prop("checked", false);
    		  }
    		  
    	  });
         
         var IMP=window.IMP;
         IMP.init('imp33962000');   
         $("#rcv_name").focus();
         <%if(totalPrice > 50000) { %>
               var tp = <%=totalPrice %>;
            <%} else { %>
               var tp = <%=totalPrice +5000 %>;
            <%} %>
         
         $("#resultprice").text(tp+"원");
         $("#expt_price").val(tp);
         $("#result_price1").text(tp+"원");
         var result;
         
         $("#point_user").blur(function(){
            if($(this).val() > <%=mPoint%>)
            {
               alert("사용가능한 적립금을 초과하였습니다.");
            }
            else if($(this).val() <= <%=mPoint%>)
            {
               
               var pu = $("#point_user").val();
               result = tp-pu;
               $("#resultprice").text(result+"원");
               $("#expt_price").val(result);
               $("#result_price1").text(result+"원");
            }
            
         })
         $(this).focus();
      })
   </script>
   
   <!-- 카카오페이 -->
   <script>
      $("#pay").click(function(){
         <%if(totalPrice > 50000) { %>
              var tp = <%=totalPrice %>;
           <%} else { %>
              var tp = <%=totalPrice +5000 %>;
           <%} %>
         var pu = $("#point_user").val();
         
         var result1 = tp - Number(pu);
         
         IMP.request_pay({
             pg : 'inicis', // version 1.1.0부터 지원.
             pay_method : 'card',
             merchant_uid : 'merchant_' + new Date().getTime(),
             name : 'FUN-THING 결제 테스트',
             amount : result1,
             buyer_email : '<%=loginUser.getmEmail()%>',
             buyer_name : '<%=loginUser.getmName()%>',
             buyer_tel : '<%=loginUser.getmTell()%>',
             buyer_addr : $("#detailAddress").val(),
             buyer_postcode : $("#postcode").val(),
             m_redirect_url : 'https://www.yourdomain.com/payments/complete'
         }, function(rsp) {
             if ( rsp.success ) {
                 var msg = '결제가 완료되었습니다.';
                 
             } else {
                 var msg = '결제에 실패하였습니다.';
                 msg += '에러내용 : ' + rsp.error_msg;
             }
             alert(msg);
             $("#payment").submit();
         });
      })
   </script>
   
</html>