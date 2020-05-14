<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>


        <style>

            p { margin:0; }

            #shippingWrap { width:70%; margin:0 auto; }
            #shippingWrap .s_title { border-top:2px solid #aaa; border-bottom:1px solid #aaa; color:#30586e; margin-bottom:80px; }



            #shippingWrap .s_table { border-collapse: collapse; width:100%; text-align:center; border-top:1px solid #aaa; border-bottom:1px solid #aaa; }
            #shippingWrap .s_table tr { border-bottom:1px solid #bbb; }

            #shippingWrap .s_table th { line-height:2.4; color:#30586e; }

            #shippingWrap .s_table tr th:nth-child(2) { width:60%; }

            #shippingWrap .s_table tr td { padding:6px 0; }
            #shippingWrap .s_table tr td:nth-child(1) { width:5%; }
            #shippingWrap .s_table tr td:nth-child(2) { width:20%; }
            #shippingWrap .s_table tr td:nth-child(3) { width:40%; text-align: left; }
            #shippingWrap .s_table tr td:nth-child(4) { width:5%; }
            #shippingWrap .s_table tr td:nth-child(5) { width:12.5%; }
            #shippingWrap .s_table tr td:nth-child(6) { width:5%; }
            #shippingWrap .s_table tr td:nth-child(7) { width:12.5%; }
            
            #shippingWrap .s_table tr img { width:50px; height:80px; border:1px solid #ddd; }

            #shippingWrap .s_table tr td .titArea { float:left; height:100%; }

            #shippingWrap .s_btns { margin:20px 0; }
            #shippingWrap .s_btns:after { display:block; content:""; clear:both; }
            #shippingWrap .s_btns button { width:100px; height:40px; border-radius:0; background:#30586e; color:#fff; border:0; box-sizing:border-box; }
            
            #shippingWrap .s_btns button:active { border:2px solid #fff; } /* 클릭시 보더 액션 */
            #shippingWrap .s_btns button.l_btn { background:#aaa; }
            #shippingWrap .s_btns button.r_btn { float:right; }
        </style>
        
        
    </head>
    <body>
    
    	<%@ include file="../common/header.jsp" %>
    
        <div id="shippingWrap">
            <div class="s_title">
                <h3>결제 예정 상품</h3>
            </div>
            <form>
                <table class="s_table">
                    <tr>
                        <th><input type="checkbox"></th>
                        <th colspan="2">결제 예정 상품</th>
                        <th>수량</th>
                        <th>금액</th>
                        <th>적립금</th>
                        <th>합계</th>
                    </tr> 
                    <!-- for문 -->
                    <tr>
                        <td><input type="checkbox"></td>
                        <td class="imgArea"><img src="C://Users/violi/Desktop/sdfes.PNG" /></td>
                        <td>상품명</td>
                        <td>1</td>
                        <td>298,000</td>
                        <td>29</td>
                        <td>298,000</td>
                    </tr> 
                    <!-- for문 end -->
                </table> 
                <div class="s_btns">
                    <button type="button" class="l_btn">선택상품삭제</button>
                    <button type="submit" class="r_btn">결제</button>
                </div>
            </form>
        </div>
        
        <%@ include file="../common/footer.jsp"%>
        
    </body>
 </html>