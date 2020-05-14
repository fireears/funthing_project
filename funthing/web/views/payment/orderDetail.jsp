<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <title></title>
    <script src="../js/jQuery-3.4.1.min.js"></script>
    <style>
        a {
            text-decoration: none;
            color: #666;
        }

        ul {
            list-style-type: none;
            margin-block-start: 0;
            margin-block-end: 0;
            margin-inline-start: 0px;
            margin-inline-end: 0px;
            padding-inline-start: 0px;

        }

        h1,
        h2,
        h3,
        h4,
        h5,
        h6 {
            padding: 0;
            margin: 0;
        }

      
        #order_outer{
           /*  margin:50px; */
            width:1000px;
            float:left;
        }

        .member_info {
            margin-top:15px;
            margin-bottom: 15px;
        }

        .order_details {


            color: #30586e;
            font-size: 20px;
        }

        .order_num {
            color: grey;
            font-size: 13px;
        }

        .product_info {
            border-top: 2px solid #30586e;
            width:90%;
            border-bottom: 1px solid #30586e;
            font-size: small;
            line-height: 30px;
            border-collapse: collapse;
            margin-bottom: 50px;


        }
        
        .product_info tr{
            border:0; padding:0; border-bottom:1px solid #30586e;
        }

        .product_info td{
            text-align: center;
            
        }
       
        .order_info tr th:nth-child(1){
           background:rgba(228, 226, 226, 0.767);
           color:rgb(65, 64, 64);
           width:15%;
        }
        .order_info tr td:nth-child(1){
            background:rgba(228, 226, 226, 0.767);
           
        }
        .order_info tr td{
            padding:5px;
            text-align: inherit;
        }
        .order_info tr th{
            padding:5px;
            text-align: inherit;
        }
    </style>
</head>

<body>

	<%@ include file="../common/header.jsp" %>

	<%@ include file="../common/myPageHeader.jsp" %>
	
    <div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
	<div id="r-cont"> 
	<!-- 오른쪽 컨텐츠 수정 영역  -->

        <div id="order_outer">
        <div class="member_info">
            <span class="order_details">주문/배송상세</span><span class="order_num">(주문번호 : )</span>
        </div>
        <table class="product_info">
            <tr>
                <th>날짜/주문번호</th>
                <th>상품명/옵션</th>
                <th>상품금액/수량</th>
                <th>주문상태</th>
            </tr>
            <tr>
                <td>날짜/주문번호</td>
                <td>날짜/주문번호</td>
                <td>날짜/주문번호</td>
                <td>날짜/주문번호</td>
                
            </tr>
        </table>

        <div class="member_info">
            <span class="order_details">주문자 정보</span>
        </div>
        <table class="product_info order_info">
            <tr>
                <th>주문자정보</th>
                <td>김영수</td>
               
            </tr>
            <tr>
                <th>주소</th>
                <td>경기도 고양시</td>
            </tr>
            <tr>
                <th>전화번호</th>
                <td>010-4567-8901</td>
            </tr>
            <tr>
                <th>이메일</th>
                <td>lovegrandma@gmail.com</td> 
            </tr>
        </table>
        <div class="member_info">
            <span class="order_details">배송지 정보</span>
        </div>
        <table class="product_info order_info">
            <tr>
                <th>배송자정보</th>
                <td>김영수</td>
               
            </tr>
            <tr>
                <th>주소</th>
                <td>경기도 고양시</td>
            </tr>
            <tr>
                <th>전화번호</th>
                <td>010-4567-8901</td>
            </tr>
            <tr>
                <th>남기실 말씀</th>
                <td>경비실에 놓아주세여</td> 
            </tr>
        </table>
        <div class="member_info">
            <span class="order_details">결제 정보</span>
        </div>
        <table class="product_info order_info">
            <tr>
                <th>상품합계금액</th>
                <td>180,000 원</td>
               
            </tr>
            <tr>
                <th>배송비</th>
                <td>2500</td>
            </tr>
            <tr>
                <th>사용적립금</th>
                <td>10,000 원</td>
            </tr>
            <tr>
                <th>총 결제 금액</th>
                <td style="font-size: larger;"><strong>170,000 원</strong></td> 
            </tr>
            <tr>
                <th>예정 적립금</th>
                <td>1,800</td> 
            </tr>
            <tr>
                <th>남기실 말씀</th>
                <td>경비실에 놓아주세여</td> 
            </tr>
    
        </table>
    </div>
      
    </div>
   
    </div>

</div>
</div>
    
	<%@ include file="../common/footer.jsp" %>

</body>

</html>