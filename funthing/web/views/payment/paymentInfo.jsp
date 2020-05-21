<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>주문결제</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
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
			
			
			
			
			#resultPayArea{position: fixed; top: 25%; left: 75%; width: 350px; height: 450px; border: 4px solid #0f4a7e; text-align: center;}
			#resultPayArea>div{margin: auto; width: 90%;}
			#resultPayArea>div>table{width: 100%;}
			#resultPayArea>div>table th{text-align: left;}
			#resultPayArea>div>table td{text-align: right;}
			#resultprice{font-size: 30px; font-weight: 600;}
			
			#product>tbody>tr>td>div{font-size:18px; line-height:100%;}
			#product>tbody>tr>th{font-size:20px;}
		</style>
		<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
		<script type="text/javascript" src="https://cdn.iamport.kr/js/iamprot.payment-1.1.5.js"></script>
	</head>
	<body>
		<%@ include file = "../common/header.jsp" %>
		<section>
            
            <article id="area">
                <form action="" method="GET">
                    <p id="title">주문자 정보</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <tr>
                                    <th class="ta-1" aria-required="true">주문하시는 분</th>
                                    <td><div class="txt-field"><input type="text" name="m_name" maxlength="20"></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">휴대폰 번호</th>
                                    <td><div class="txt-field"><input type="text" name="m_tell" maxlength="20" placeholder="'-'없이 입력해주세요."></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">이메일</th>
                                    <td><div class="txt-field"><input type="text" name="m_email">&nbsp;<select name=""><option value="naver.com">naver.com</option></select></div></td>
                                </tr>
                                
                            </tbody>
                        </table>
                    </div>
                    
                    <p id="title">배송정보</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <!-- <tr>
                                    <th class="ta-1" aria-required="true">배송지 확인</th>
                                    <td><div class="txt-field1"><input type="radio" name="dstn_chk" id="default" value="기본배송지"><label for="default">기본 배송지</label>
                                            <input type="radio" name="dstn_chk" id="input" value="직접입력" checked><label for="input">직접 입력</label>
                                        </div></td>
                                </tr> -->
                                <tr>
                                    <th class="ta-1" aria-required="true">받으실분</th>
                                    <td><div class="txt-field"><input type="text" name="rcv_name" maxlength="20"></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">받으실 곳</th>
                                    <td>
                                        <div class="txt-field">
                                            <input type="text" id="postcode" placeholder="우편번호">
											<input type="button" onclick="DaumPostcode()" value="우편번호 찾기" style="height:25px; width:100px"><br>
											<input type="text" id="detailAddress" name="rcv_adrs" placeholder="상세주소">
											<input type="text" id="extraAddress" placeholder="참고항목">
											
											<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
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
                                    <th>상품/옵션 정보</th><th>수량</th><th>상품금액</th><th>할인/적립</th><th>합계금액</th><th>배송비</th>
                                </tr>
                                <tr style="line-heigth:150px;">
                                    <td align="left"><img src="<%=request.getContextPath()+"/images/thumbnail/thumb001.jpg" %>" alt="상품사진" id="productImg" style="width:100px; height:150px;"><span>상품명</span></td>
                                    <td style="text-align: center; "><div id="num">1</div></td>
                                    <td style="text-align: center;"><div id="retail_price">정가</div></td>
                                    <td style="text-align: center;"><div id="dc_point">할인/적립</div></td>
                                    <td style="text-align: center;"><div id="result_price">합계금액</div></td>
                                    <td style="text-align: center;"><div id="ship_price">배송비</div></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
					<!--            -->
					
					
                    <p id="title">결제정보</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <tr>
                                    <th class="ta-1" aria-required="true">상품 합계 금액</th>
                                    <td><div class="txt-field"><div id="product_sum_price"></div>원</div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">적립</th>
                                    <td><div class="txt-field">총 적립금 : <div id="totalPoint"></div></div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">적립금 사용</th>
                                    <td><div class="txt-field"><input type="text" name="point_user" style="width: 100px;">P</div></td>
                                </tr>
                                <tr>
                                    <th class="ta-1" aria-required="true">최종 결제 금액</th>
                                    <td><div class="txt-field"><div id="result_price"></div></div></td>
                                </tr>
                                
                            </tbody>
                        </table>
                    </div>


                    <p id="title">결제수단 결제 / 결제</p>
                    <div class="table1">
                        <table>
                            <tbody>
                                <tr>
                                    <th class="ta-1" aria-required="true">일반결제</th>
                                    <td>
                                        <div class="txt-field1">
                                            <input type="radio" name="pmnt_mthd" id="pmnt1" value="무통장 입금"><label for="pmnt1">무통장 입금</label>
                                            <!-- <input type="radio" name="pmnt_mthd" id="pmnt2" value="신용카드"><label for="pmnt2">신용카드</label> -->
                                            <input type="radio" name="pmnt_mthd" id="pmnt3" value="카카오페이"><label for="pmnt3">카카오페이</label>
                                        </div>
                                        <div>
                                        	무통장 입력 area
                                        </div>
                                    </td>
                                </tr>
                                
                            </tbody>
                        </table>
                    </div>
					
					<br><br><br><br>
                    <!-- 오른쪽 사이드 결제하기 구역-->
                    <div id="resultPayArea">
                        <div>
                            <p style="font-size:20px; font-weight:600; margin-top:10px;">주문금액<p>
                            <hr>
    
                            <table>
                                <tr><th>상품 합계 금액</th><td style="text-align: right;">65,600원</td></tr>
                                <tr><th>배송비</th><td  style="text-align: right;">0원</td></tr>
                            </table>
    
                            <hr>
    
                            <table>
                                <tr><th>최종 결제 금액</th><td id="resultprice">65,600원</td></tr>
                                <tr><th>총 적립예정 적립금</th><td>0p</td></tr>
                            </table>
    
                            <hr>
                            <br clear="both">
                            <div style="text-align: left;">
                                <input type="checkbox" name="" id="">전체 동의합니다.<br>
                                <input type="checkbox" name="" id="">구매하실 상품의 결제정보를 확인하였으며, 구매진행에 동의합니다.(필수)<br>
                                <input type="checkbox" name="" id="">상품 공급사 개인정보 제공 동의에 대한 내용을 확인 하였으며 이에 동의 합니다.(필수)<br>
                            </div>
                            <br><br>
                            <input type="submit" value="결제하기" style="width: 70%; height: 55px; border: 0px; background-color: rgb(3, 3, 87); color: white; font-size: 20px;">
                        </div>
                    </div>
                    <!---->

                </form>
                
            </article>
        </section>
	</body>
	
	<script>
		$(function(){
			var IMP=window.IMP;
			IMP.init('imp33962000');			
		})
		
		IMP.request_pay({
		    pg : 'inicis', // version 1.1.0부터 지원.
		    pay_method : 'card',
		    merchant_uid : 'merchant_' + new Date().getTime(),
		    name : '주문명:결제테스트',
		    amount : 14000,
		    buyer_email : 'iamport@siot.do',
		    buyer_name : '구매자이름',
		    buyer_tel : '010-1234-5678',
		    buyer_addr : '서울특별시 강남구 삼성동',
		    buyer_postcode : '123-456',
		    m_redirect_url : 'https://www.yourdomain.com/payments/complete'
		}, function(rsp) {
		    if ( rsp.success ) {
		        var msg = '결제가 완료되었습니다.';
		        msg += '고유ID : ' + rsp.imp_uid;
		        msg += '상점 거래ID : ' + rsp.merchant_uid;
		        msg += '결제 금액 : ' + rsp.paid_amount;
		        msg += '카드 승인번호 : ' + rsp.apply_num;
		    } else {
		        var msg = '결제에 실패하였습니다.';
		        msg += '에러내용 : ' + rsp.error_msg;
		    }
		    alert(msg);
		});
	</script>
</html>