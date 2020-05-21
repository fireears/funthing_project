<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>myPage</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<style>
		.r-cont-header {width: 100%;padding: 50px 20px;border-top: 7px solid #0f4a7e;border-bottom: 1px solid #0f4a7e;}
		
		.r-cont-header:after {clear: both;content: "";display: block;}
		
		.r-cont-header2 {width: 30%;margin: 0 0 0 0;margin-right: 0;padding: 0 0 0 0;float: left;}
		
		.r-cont-header span {width: 500px;color: cadetblue;font-weight: 200;}
		
		.r-cont-header h2 {font-size: 24px;font-weight: 200;color: #003148;}
		
		/* 적립금 아이콘 부분 div */
		.r-cont-header-images {width: 70%;text-align: center;margin-right: 0;float: right;margin-top: 0;text-align: center;}
		
		/* 적립금 아이콘 부분 div */
		.r-cont-header-images h4 {margin: 0;padding-bottom: 10px;}
		
		/* 적립금 아이콘 */
		#header-images {width: 60px;height: 60px;opacity: 0.5;}
		
		
		 /* 주문 현황 부분 */
		.order {padding-left: 20px;width: 100%;margin: 60px 0;}
		.order-cont {padding-bottom: 30px;}
		.order-cont span {font-size: 13px;font-weight: 100;}
		/* 주문 현황의 아이콘 있는 영역 */
		.order-icon {height: 200px;border-left: 0.5px solid lightgray;border-right: 0.5px solid lightgray;border-top: 1px solid #0f4a7e;border-bottom: 0.5px solid lightgray;}
		/* 주문 현황의 주문 진행과정 */
		.order-icon span {line-height: 20px;margin: 67px;color: #666;font-weight: bold;}
		.order-icon-pro {margin-top: 40px;} 
		
		
		
		/* 최근 주문 정보 */
		.recent {padding-left: 20px;width: 100%;margin: 60px 0;}
		
		.recent span {font-size: 13px;font-weight: 100;}
		
		.recent-tb {margin-top: 30px;border-top: 2px solid #0f4a7e;width: 100%;border-bottom: 1px solid #0f4a7e;line-height: 50px;border-collapse: collapse;}
		
		.recent-tb th {border-bottom: 1px solid #0f4a7e;}
		
		.recent-tb tr {border: 0;padding: 0;border-bottom: 1px solid #bbb;}
		
		.recent-tb td {text-align: center;}
		
		.recent-tb .tb-first {width: 200px;}
		
		.recent-tb .tb-last {width: 200px;}
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
							<p>
								<span>신희지님의</span> 회원등급은
							</p>

							<h2>
								<strong style="color: #0f4a7e;">HAGO VIP</strong> 등급 입니다.
							</h2>
						</div>

						<div class="r-cont-header-images">
							<img id="header-images" src="../images/business.png">
							<h4>적립금</h4>
							<input type="text">
							<!-- 여기에 DB에서 회원 적립금 가져오기 -->

						</div>

					</div>
					<!-- 오른쪽 컨텐츠 헤더 end -->



					<!-- <!-- 주문 현황
					<div class="order">
						<div class="order-cont">
							<h2 style="color: #0f4a7e;">
								주문 현황 &nbsp; <span>최근 30일 이내에 진행중인 주문 정보 입니다.</span>
							</h2>
						</div>

						<div class="order-icon">
							결제 아이콘 start

							<div class="order-icon-pro">
								결제 순서 영역
								<span>입금대기</span> <span>결제완료</span> <span>상품준비중</span> <span>배송중</span>
								<span>배송완료</span> <span>구매확정</span>
							</div>


							<div class="order-cont-icon">
								동그라미 부분
								

							</div>

						</div>
						결제 아이콘 end

					</div>
					주문현황 end --> 


					<!-- 최근 주문 내역 -->
					<div class="recent">
						<div class="recent-cont">
							<h2 style="color: #0f4a7e;">
								최근 주문 내역 &nbsp; <span>최근 30일 내에 주문하신 내역입니다.</span>
							</h2>
						</div>

						<table class="recent-tb">
							<tr>
								<th class="tb-first">날짜/주문정보</th>
								<th>상품명/옵션</th>
								<th>상품금액/수량</th>
								<th>주문상태</th>
								<th class="tb-last">확인/리뷰</th>
							</tr>

							
						</table>
					</div>
					<!-- 최근 주문 내역 end -->
				</div>
				<!--오른쪽 컨텐츠 영역 end-->

			</div>
	

	<%@ include file="../common/footer.jsp"%>


</body>

</html>