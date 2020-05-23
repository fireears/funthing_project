<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="member.model.vo.*, payment.model.vo.*, java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .qna11 .q1_title h2 { color:#0f4a7e; line-height:3; border-top:1px solid #aaa; border-bottom:1px solid #aaa; }
        .q1_wrap { margin-top:40px;  }
        .q1_wrap table { border-collapse: collapse; width:100%; border-top:2px solid #aaa; border-bottom:2px solid #aaa; position:relative; }
        .q1_wrap table tr { border-bottom:1px solid #aaa; width:100%; }
        .q1_wrap table tr td:nth-child(1) { width:30%; box-sizing:border-box; padding-left:20px; line-height:3; font-weight:700; background:#eee; color:#0f4a7e; }   
        .q1_wrap table tr td:nth-child(2) { width:70%; box-sizing:border-box; padding:8px 14px 8px; }
        .q1_wrap table span.button { display:inline-block; text-align:center; cursor:pointer; width:80px; height:26px; line-height:26px; background:#0f4a7e; border:1px solid #aaa; color:#fff; margin-left:10px; }

        .q1_wrap .q1_text { font-size:14px; color:#777; }
        .q1_wrap input { height:24px; width:100%; }
        .q1_wrap textarea { resize: none; width:100%; }

        .q1_wrap .q1_btnArea { width:100%; text-align:center; margin-top:20px; }
        .q1_wrap .q1_btnArea .btn { margin:0 3px; width:160px; height:60px; font-size:16px; border:1px solid #ddd; background:#eee; }
        .q1_wrap .q1_btnArea .btn.submit { background:#0f4a7e; border:1px solid #aaa; color:#fff; }
    
    	/* 팝업창 */
    	.q1_wrap .q1_orderList {  }
    	
    	#orderSelectWrap { display:none; overflow-y:scroll; position:absolute; width:700px; height:400px; padding:20px; box-sizing:border-box; background:#fff; border:1px solid #ddd; top:50px; left:50%; margin-left:-350px; }
        #orderSelectWrap:after { display:block; content:""; clear:both; }
        
        #orderSelectWrap h2 { text-align:center; margin:0 0 20px 0; font-size:24px; }
        #orderSelectWrap form { border:1px solid #ddd; }
        #orderSelectWrap .os_tb { border-collapse: collapse; }
        #orderSelectWrap .os_tb tr { border-bottom:1px solid #ddd; }
        #orderSelectWrap .os_tb tr:last-child { border-bottom:none; }
         
        #orderSelectWrap .os_tb td { height:0px; line-height:0px; box-sizing: border-box; padding:10px 0; text-align:center; }
        #orderSelectWrap .os_tb td.prd_img { text-align:left; }
        #orderSelectWrap .os_tb td [type="radio"] { height:16px; width:auto; vertical-align:-4px; display:inline; }
        #orderSelectWrap .os_tb td:nth-child(1){ width:25%; }
        #orderSelectWrap .os_tb td:nth-child(2){ width:15%; }
        #orderSelectWrap .os_tb td:nth-child(3){ width:35%; }
        #orderSelectWrap .os_tb td:nth-child(4){ width:25%; }
        
        #orderSelectWrap .os_tb img { width:50px; vertical-align: middle; border:1px solid #ddd; }

		#orderSelectWrap .oi_btns { float:right; margin-top:10px; }
		#orderSelectWrap .oi_btn { width:50px; height:30px; line-height:30px; text-align:center; border:1px solid #ddd; cursor:pointer; }
        #orderSelectWrap .submit { float:left; margin-right:6px; background:#0f4a7e; color:#fff; }
        #orderSelectWrap .close { float:left; background:#eee; }
        
    </style>
</head>
<body>

	<%@ include file="../common/header.jsp" %>
	
	<%@ include file="../common/myPageHeader.jsp" %>

	<div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
	<div id="r-cont"> 
	
	
    <div class="qna11">
        <div class="q1_title">
            <h2>1:1 문의</h2>

            <div class="q1_wrap">
                <form action="<%=request.getContextPath()%>/InsertPerQnA" enctype="multipart/form-data" method="post">
                    
                    <table>
                        <tr>
                            <td>제목</td>
                            <td><input type="text" id="q1_tit" name="q1_tit" placeholder="제목을 입력하세요" required/></td>
                        </tr>
                        <tr>
                            <td>주문내역</td>
                            <td class="q1_orderList">
	                            <span class="q1_selList">주문 번호</span>
	                            <span class="button" onclick="orderSelect();">주문내역</span>
	                            <!-- 주문내역 버튼 누르면 열리는 모달 -->
	                            <div id="orderSelectWrap">
							        <h2>주문 내역</h2>
							        <form>
							            <table class="os_tb">
							                <tr>
							                    <th>주문번호</th>
							                    <th colspan="2">상품명</th>
							                    <th>금액</th>
							                </tr>
							            </table>
							        </form>
							        <div class="oi_btns">
								        <p class="oi_btn submit">ok</p>
								        <p class="oi_btn close">close</p>
							        </div>
							    </div>
							    <!-- // 주문 내역 모달 end -->
                            </td>
                        </tr>
                        <tr>
                            <td>말머리</td>
                            <td>
                                <select name="q1_type" id="q1_type">
                                    <option value="배송문의">배송문의</option>
                                    <option value="기타문의">기타문의</option>
                                    <option value="계정문의">계정문의</option>
                                    <option value="건의">건의</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>작성자</td>
                            <td><%=loginUser.getmName() %></td>
                        </tr>
                        <tr>
                            <td>첨부파일</td>
                            <td><input type="file" id="q1_file" name="q1_file"/></td>
                        </tr>
                        <tr>
                            <td>본문</td>
                            <td>
                                <textarea id="q1_cont" name="q1_cont"  rows="10" required></textarea>
                                <p class="q1_text">해당글은 비밀글로만 작성이 됩니다.</p>
                            </td>
                        </tr>
                        <tr>
                            <td>자동등록방지</td>
                            <td>
                            	확인?
                            </td>
                        </tr>
                    </table>
                    <div class="q1_btnArea">
                        <button type="submit" class="btn submit">등록</button>
                        <button type="reset" class="btn cancel">취소</button>
                    </div>
				    <input type="hidden" id = "hd_oNo" name ="hd_oNo">
                </form>
            </div>
        </div>
    </div>
    </div>
    <script>
    	function orderSelect(){
    		var userId = "<%=loginUser.getmId()%>";
    		
    		//jQuery.ajaxSettings.traditional = true;
    		
    		$.ajax({
    			url : "<%=request.getContextPath()%>/SelectOrder",
    			type : "post",
    			data : {"userId" : userId },
    			success : function(data){
    				//alert("성공");
    				$("#orderSelectWrap").show();
    				// 닫는 버튼
    				$(".close").click(function(){
    					$("#orderSelectWrap").hide();
      		    	 	$(".oiCont").empty();	// 데이터가 쌓이지 않게 입력값 삭제해줌
    				});
    				
    				 $.each(data, function(index, value){
    					 //alert("!");
    					 var $img = $("<img>").attr("src", "/funthing/images/thumbnail/" + value.oiTnumbnail + ".jpg");
    					 var $radio = $("<input>").attr({"type" : "radio", "name" : "ioChk", "id" : "ioChk", "value" : value.oipNo});
    					 var $span = $("<span>").text(value.oipNo);
    					 
    					 var $tr = $("<tr>").attr("class", "oiCont");
    					 var $tdpNo = $("<td>");
    					 var $tdThumb = $("<td>");
    					 var $tdmName = $("<td>").text(value.oiPerName);
    					 var $tdTp = $("<td>").text(value.oiTotalPrice);
    					 
    					 $tdThumb.append($img);
    					 $tdpNo.append($radio).append($span);
    					 
    					 $tr.append($tdpNo);
    					 $tr.append($tdThumb);
    					 $tr.append($tdmName);
    					 $tr.append($tdTp);
    					 
    					 console.log(value.oipNo);
    					 
    					 $(".os_tb").children().append($tr);
    					 
    				 }); 
    			        $("input:radio").change(checkedChange);
    			        function checkedChange(){
    			            console.log($(this).prop("checked"));

						// 체크한 라디오 버튼의 value값 뽑아오기
	            		var selectVal = $("input:radio").val();
	            		console.log(selectVal);
	            		
    			            var bool = $(this).prop("checked");
			            	 $(".q1_selList").text(selectVal);	// 주문 번호 페이지로 넘겨줌 // 얘는 라디오 누르자마자
			            	 var sel = $(".q1_selList").text();
			            	 
			            	$("#hd_oNo").val(sel);
			            	
    			            if(bool){
    			            	// 체크 값이 있을 때
    			            	$(".oi_btns .submit").click(function(){
    				            	//$(".q1_selList").text(selectVal);	// 주문 번호 페이지로 넘겨줌 // 얘는 ok 눌러야
    			            		<%-- location.href="<%=request.getContextPath()%>/InsertPerQnA"; --%>
    			            		$("#orderSelectWrap").hide();
    		      		    	 	$(".oiCont").empty();	// 데이터가 쌓이지 않게 입력값 삭제해줌
    			            	});
    			            	
    			            }else{
    			            	// 체크 값이 없을 때
    			            	$(".oi_btns .submit").click(function(){
        			            	alert("주문 리스트를 선택해 주세요!");
    			            	});
    			            }
    			        }

    			},
    			error : function(data){
    				alert("실패");
    			}
    		});   		
    	}
    	// ajax end
    	
    	
    </script>
    </div>
    
    <%@ include file="../common/footer.jsp" %>
    
</body>
</html>