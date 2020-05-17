<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    
            .header-mypage {
                position: relative;
                background-color: #30586e;
                width: 100%;
                height: 220px;
                margin-bottom: 0px;
                clear: both;
                text-align: center;
            }
    
            .header-mypage .area h2 {
                display: block;
                position: relative;
                font-size: 24px;
                font-weight: 400;
                letter-spacing: 2.9px;
                color: #fff;
                padding-bottom: 20px;
                padding-top: 50px;
            }
    
            .header-mypage .area h4 {
                display: inline-block;
                color: #fff;
                font-weight: 200;
                font-size: 12px;
                position: relative;
                padding: 0 20px 0 7px;
            }
    
            #side {
                /* display: table-cell; */
                vertical-align: top;
                /* width: calc(100% *(288/1420)); */
                width: 20%;
                padding-right: 0;
                float: left;
            }
    
            ul li {
                list-style: none;
                line-height: 35px;
            }
    
            #content {
                width: 1640px;
                margin: 0 auto;
            }
    
            #content:after {
                clear: both;
                content: "";
                display: block;
            }
    
            .mypage-lnb {
                margin: 60px 0 0;
            }
    
            .mypage-lnb h2 {
                border-top: 1px solid #bbb;
                border-bottom: 1px solid #bbb;
                padding: 20px 0;
            }
    
            .mypage-lnb h3 {
                padding: 20px 0;
                color: #0f4a7e;
                position: relative;
            }
    
            .mypage-lnb h3:after {
                display: block;
                content: "";
                clear: both;
                width: 30px;
                height: 1px;
                background: #0f4a7e;
                /* h3 밑에 있는 선 컬러 */
                position: absolute;
                bottom: 2px;
                left: 0;
            }
    
            .mypage-lnb ul {
                margin-bottom: 20px;
            }
    
    
    
    
    
          
            #order_outer{
                margin:50px 0 0;
                width:100%;
                float:left;

                box-sizing: border-box;
                padding-left:80px;
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
                width:100%;
                border-bottom: 1px solid #30586e;
                font-size: small;
                border-collapse: collapse;
                margin-bottom: 50px;
    
    
            }
            
            .product_info tr{
                border:0; padding:0; border-bottom:1px solid #30586e;
            }

            .product_info th {
                line-height:30px;
            }
    
            .product_info th:nth-child(1) { 
                width:15%;
             }
             
            .product_info th:nth-child(2) { 
                width:60%;
             }
             
            .product_info th:nth-child(3) { 
                width:12.5%;
             }
             
            .product_info th:nth-child(4) { 
                width:12.5%;
             }
             
            .product_info td{
                text-align: center;
                padding:10px 0;
                
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
            table{
                border-collapse:collapse;
            }
            td{
                text-align:center;
            }
            .wrap {
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.button {
  width: 140px;
  height: 45px;
  font-family: 'Roboto', sans-serif;
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 2.5px;
  font-weight: 500;
  color: #000;
  background-color: #fff;
  border: none;
  border-radius: 45px;
  box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease 0s;
  cursor: pointer;
  outline: none;
  }

.button:hover {
  background-color: #2EE59D;
  box-shadow: 0px 15px 20px rgba(46, 229, 157, 0.4);
  color: #fff;
  transform: translateY(-7px);
}

.order_btns button { width:80px;height:40px; border-radius: 0; background:#003148; border:1px solid #ddd; color:#fff; }
.order_btns input { height:34px; border:1px solid #ddd; }


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
               
                <div class="r-cont-header2">
			 		<div id="order_outer">
		                <div class="member_info">
		                    <span class="order_details">주문목록/배송조회</span>
		                </div>
		                <div border = "1">
		                    <p>조회기간</p>
		                    <div class="order_btns">
		                        <button id = "date" values = "today">오늘</button>
		                        <button id = "date" values = "week">7일</button>
		                        <button id = "date" values = "month">1개월</button>
		                        <button id = "date" values = "3month">3개월</button>
		                        <button id = "date" values = "year">1년</button>
		                        <input type="date" id="start" name="start"
		                        value="2020-01-01"
		                        min="2010-01-01" max="2021-12-31"> ~ 
		                        <input type="date" id="end" name="end"
		                        value="2020-01-01"
		                        min="2010-01-01" max="2021-12-31">
		                        <button>조회하기</button>
		                    </div>
		                </div>
		                <br>
		                <table class="product_info">
		                    <tr>
		                        <th>날짜/주문번호</th>
		                        <th>상품명</th>
		                        <th>상품금액/수량</th>
		                        <th>주문상태</th>
		                    </tr>
		                    <tr>
		                        <td>2020/05/12<br>
		                        2020051212458</td>
		                        <td>상품명</td>
		                        <td>상품금액/수량</td>
		                        <td>주문상태</td>
		                        
		                    </tr>
		                   
		
		                </table>
		                <hr width:1200px;>
		            </div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>