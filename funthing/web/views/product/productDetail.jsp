<!-- 제품 상세 페이지 _혜린,서윤  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="product.model.vo.ProductDetail" %>
<%@ page import="productQnA.model.vo.AdminProductQnA" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="review.model.vo.*" %>
<%
	/* ProductDetail pd = (ProductDetail)request.getAttribute("pd"); */
	DecimalFormat formatter = new DecimalFormat("###,###");
	ArrayList<ProductDetail> list = (ArrayList<ProductDetail>)request.getAttribute("list");
	ArrayList<ProductDetail> sizeList = (ArrayList<ProductDetail>)request.getAttribute("sizeList");
	ArrayList<ProductDetail> colorList = (ArrayList<ProductDetail>)request.getAttribute("colorList");
	ArrayList<AdminProductQnA> qnaList = (ArrayList<AdminProductQnA>)request.getAttribute("qnaList");
	ProductDetail pd = list.get(0);
	int ratePrice = pd.getRetailPrice() * pd.getDcRate() / 100;
	
	// review
	ArrayList<Review> rvList = (ArrayList<Review>)request.getAttribute("rvList");
	String rvMsg = (String)request.getAttribute("rvMsg");
%>    
<!DOCTYPE html>
<html lang="ko">

<head>
    <title></title>
    <!-- <script src="../js/jQuery-3.4.1.min.js"></script> -->

    <script src="https://kit.fontawesome.com/39b470622c.js" crossorigin="anonymous"></script>
<style>
        body {
            width: 100%;
            font-family:  'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif; 
        }

        ul {
            padding: 0;
        }

        li {
            list-style: none;
            padding:5px;
        }

        #brand{
            font-weight: 800;
            color:#30586e;
            font-size: initial;
        }
        #name{
            padding-bottom: 5px;
             border-bottom: 1.5px solid #30586e;
             font-size: large;
        }
        #product_description{
            font-size:small;
            margin-top: 5px;
        }
        #prod-detail {
            width: 1200px;
            margin: 0 auto;
        }

        #prod-detail:after {
            content: "";
            clear: both;
            display: block;
        }

        #photo {
            width: 100%;
            height: 30%;

        }

        #photo_area {
            float: left;
            width: 30%;
        }

        #p_detalis {
            float: left;
            width: 50%;
            box-sizing: border-box;
            padding: 0 0 0 40px;
        }

        #right_wrap {margin-top: 15px;}

        #right_wrap:after {
            content: "";
            clear: both;
            display: block;
        }

        #right_wrap ul {}

        #right_wrap ul li {padding:1px;}

        #right_wrap ul li:after {
            content: "";
            clear: both;
            display: block;
        }

        #right_wrap ul li .price_left {
            float: left;
            font-style: normal;
            font-weight: 600;
        }

        #right_wrap ul li .price_right {
            float: right;
            font-weight: 400;
        }

        .price {
            float: left;
            width: 40%;
            box-sizing: border-box;
            padding-right: 5%;
        }

        .buy_information {
            float: right;
            width: 50%;
        }
		
		
		
        .price_dis{
            color:red;
        }

        .sizeColor{
            width: 265px;
            height: 40px;
        }

        #num{
            width: 260px;
            height: 40px;
        }

        #by_now, #shopping_bag{
            background:#9fa5a8;
            color:white;
            border:0;
            width:130px;
            height: 40px;
        }

        /* 내비게이션 시작 */
        #section{margin: auto; width: 80%; height: 100%;}
        .sec_nav{margin: 0; width: 100%; height: 80px; background-color: rgb(223, 220, 220); text-align:center;}

        .sec_nav ul {height: 100%; line-height: 80px; margin:0 auto; display:inline-block; }
        .sec_nav ul:after { clear:both; content:""; display:block; }
        .sec_nav ul li {list-style: none; float: left; box-sizing:border-box; padding:0;}
        .sec_nav ul li a{text-decoration: none; margin-left: 100px; margin-right: 100px; color: black;}

        .sec_nav .sel_point { background:#0f4a7e; }
        .sec_nav .sel_point a { display:inline-block; color:#fff; }

        #details_area{margin: auto; width: 100%; text-align:center; }

        #review_area{height: auto; width: 100%; /*border: 1px solid gray;*/ padding-bottom:40px; }
        #review_area .rev_rate  { width:100%; margin:20px 0 0; }
        #review_area .rev_rate select { width:100%; font-size:24px; height:50px; }
        #review_area .rev_textArea { box-sizing:border-box; margin: 20px 0 20px;  }
        #review_area .rev_textArea #rev_tit { width:100%; height:40px; margin-bottom:6px; box-sizing:border-box; font-size:18px; }
        #review_area .rev_textArea textarea { width:100%; resize: none; padding:10px; box-sizing:border-box; }
        #review_area .rev_textArea textarea::placeholder { color:#666; }
        #review_area .rev_btns { width:100%; }
        #review_area .rev_btns:after { display:block; content:""; clear:both; }
        #review_area .rev_btns .rev_submit { float:right; width:160px; border-radius:0; height:60px; background:#30586e; color:#fff; font-size:16px; border:none; }
        #review_area .rev_btns .fileWrap { float:left; margin:0; width:60px; height:60px; overflow:hidden; position:relative; }
        #review_area .rev_btns .fileWrap input { font-size:40px; opacity:0; position:relative; z-index:2; }
        #review_area .rev_btns .fileWrap span { position:absolute; top:0; left:0; }
        #review_area .rev_btns .fileWrap span i { color:#30586e; font-size:60px; }

        #QnA_area h3{float: left; font-size:x-large; color:#0f4a7e;}
        #QnA_area button{float: right; background-color: #30586e; border: 0px; height: 60px; color: white; font-size: 100%;}
        #QnA_area table{border-top: 2px solid rgb(223, 220, 220); border-bottom: 1px solid rgb(223, 220, 220); width: 100%;}

		#allBtn {padding-top : 10px;}
		
		#qnaTb {border-collapse: collapse;}
		#qnaTb tr {border-top: 1px solid grey;border-bottom: 1px solid grey; }
		#qnaTb td {line-height: 50px; width: 40px; }
		#qnaTb th {color:#0f4a7e;line-height: 50px; width: 40px;}
		
		/* review table */
		.rev_content { width:100%; margin:40px 0; border-top:2px solid #ddd; border-bottom:2px solid #ddd; }
		.rev_content .rev_table { width:100%; box-sizing:border-box; border-collapse: collapse; text-align:center; line-height:3; font-size:16px; }
		.rev_content .rev_table tr { border-bottom:1px solid #ddd; }
		
		.rev_content .rev_table tr th:nth-child(1) { width:50%; }
		.rev_content .rev_table tr th:nth-child(2) { width:10%; }
		.rev_content .rev_table tr th:nth-child(3) { width:10%; }
		.rev_content .rev_table tr th:nth-child(4) { width:15%; }
		.rev_content .rev_table tr th:nth-child(5) { width:15%; }
		
		.rev_content .rev_table tr.rvCont td { text-align:left; box-sizing:border-box; padding:20px 10px; background:#f8f8f8; }
		.rev_content .rev_table tr.rvCont td img { width:300px; border:1px solid #ddd; box-sizing:border-box; margin-right:40px; }
		.rev_content .rev_table tr.rvCont td .divLeft { float:left; }
		.rev_content .rev_table tr.rvCont td .divRight { float:left; width:70%; }
		
		
        .rev_content .rev_table tr.rvCont { display:none; }
        .rev_content .rev_table tr.rvCont.show { display:table-row; }
		
    </style>
</head>

<body>
	
	<%@ include file="../common/header.jsp" %>
	<%if(!list.isEmpty() && !sizeList.isEmpty()){ %> 
    <div id="prod-detail">
        <!-- 상품 정보 -->
        <div id="detail_top">
            <div id="photo_area">
                <img id="photo" name="photo" src="<%=request.getContextPath()+"/images/thumbnail/" + pd.getThumbnail() + ".jpg" %>">
            </div>
            <div id="p_detalis" name="p_detalis">
                <ul id="product_ul">
                    <li>
                        <div id="brand" name="brand"><%= pd.getbName() %></div>
                    </li>
                    <li>
                        <div id="name" name="name"><%= pd.getpName() %></div>
                    </li>
                    <li>
                        <div id="product_description"><%= pd.getpDetail() %></div>
                    </li>
                </ul>
                <input type="hidden" name="hiddenPno" value="<%= pd.getpNo() %>">

                <!-- 상품 판매가 -->
                <div id="right_wrap">
                    <ul class="price">
                        <li>
                            <span class="price_left">정상가</span><span class="price_right"><s><%= formatter.format(pd.getRetailPrice()) %></s></span>
                        </li>
                        <li>
                        <%-- <%=formatter.format(pPrice) %> --%>
                            <span class="price_left">할인가</span><span class="price_right">
                            <span class="price_dis"><%= pd.getDcRate()%>%▼</span><span><%=formatter.format(ratePrice) %></span>
                        </li>
                        <li>
                            <span class="price_left">적립금</span><span class="price_right"><%=formatter.format(pd.getpPoint()) %></span> 
                        </li>
                        <li>
                            <span class="price_left">회원가</span> <span class="price_right"><%=formatter.format(pd.getpPrice()) %></span>
                                    
                        </li>
                        <li>
                            <span>게이지바</span>
                                    
                        </li>
                        <li style="padding-top:20px;">
                            <div align="right" style="color:grey;">Funding Ends</div><h4 align="right" id="sample04"  style="color:#30586e;">타임</h4>	
                                    
                        </li>
                    </ul>
					<!-- 타이머 script -->
					<script>
		            const countDownTimer = function (id, date) {
		                var _vDate = new Date(date); // 전달 받은 일자
		                var _second = 1000;
		                var _minute = _second * 60;
		                var _hour = _minute * 60;
		                var _day = _hour * 24;
		                var timer;
		        
		                function showRemaining() {
		                    var now = new Date();
		                    var distDt = _vDate - now;
		        
		                    if (distDt < 0) {
		                        clearInterval(timer);
		                        document.getElementById(id).textContent = '해당 이벤트가 종료 되었습니다!';
		                        return;
		                    }
		        
		                    var days = Math.floor(distDt / _day);
		                    var hours = Math.floor((distDt % _day) / _hour);
		                    var minutes = Math.floor((distDt % _hour) / _minute);
		                    var seconds = Math.floor((distDt % _minute) / _second);
		        
		                    //document.getElementById(id).textContent = date.toLocaleString() + "까지 : ";
		                    document.getElementById(id).textContent = days + ' d ';
		                    document.getElementById(id).textContent += hours + ' h ';
		                    document.getElementById(id).textContent += minutes + ' m ';
		                    document.getElementById(id).textContent += seconds + ' s ';
		                }
		        
		
		                timer = setInterval(showRemaining, 1000);
		            }
		        
		            var dateObj = new Date();
		            
		            countDownTimer('sample04', '  <%=pd.getfEndDate() %>'); 
		            /* countDownTimer('sample04', '2020/05/28'); // 2024년 4월 1일까지 */
     			   </script>
     			 
                    <!-- 상품 선택 및 구매/장바구니 -->
                    <div class="buy_information">
                    
                        <form method="get" action="<%=request.getContextPath()%>/PaymentInfo" id="colorSizeform">
                            <ul id="buyList">
                            <%if(loginUser != null){ %>
                             <input type="hidden" name="pNo" value="<%=list.get(1).getpNo()%>">
                             <input type="hidden" name="p_no" value="<%=list.get(1).getpNo()%>">
                          	  <input type="hidden" name="userNo" value="<%=loginUser.getmNo() %>"> 

                          	  <input type="hidden" name="mEmail" value="<%=loginUser.getmEmail() %>"> 
                          	  <input type="hidden" name="pName" value="<%=pd.getpName() %>">
                          	  <input type="hidden" name="bNo" value="<%=pd.getbNo() %>"> 
                          	  <input type="hidden" name="bName" value="<%=pd.getbName() %>"> 

                          	  <%-- <input type="hidden" name="mEmail" value="<%=loginUser.getmEmail() %>">  --%>

                            <%}else{ %>
                           	 <input type="hidden" name="p_no" value="<%=list.get(1).getpNo()%>">
                           	 <%-- <input type="hidden" name="userNo" value="<%=loginUser.getmNo() %>"> --%>
                           	 <%-- <input type="hidden" name="mEmail" value="<%=loginUser.getmEmail() %>"> --%>
                            <% } %>	 
                            	 <li>
                                   <select class="sizeColor" id="color" name="color">
                                     <option value="noColor">color 선택</option>
                                    <%for(ProductDetail pDetail : colorList){ %>
                                   
	                                 	<%if(pDetail.getpColor().equals("BK")){ %>
	                                    <option value="BK">BLACK</option>
	                                   <%} %>
	                                   <%if(pDetail.getpColor().equals("BL")){ %>
	                                   <option value="BL">BLUE</option>
	                                    <%} %>
	                                   <%if(pDetail.getpColor().equals("WH")){ %>
	                                   <option value="WH">WHITE</option>
	                                    <%} %>
	                                   <%if(pDetail.getpColor().equals("RD")){ %>
	                                   <option value="RD">RED</option>
	                                    <%} %>
	                                   <%if(pDetail.getpColor().equals("KH")){ %>
	                                   <option value="KH">KHAKI</option>
	                                    <%} %>
	                                   <%if(pDetail.getpColor().equals("YL")){ %>
	                                   <option value="YL">YELLOW</option>
	                                    <%} %>
	                                   <%if(pDetail.getpColor().equals("GN")){ %>
	                                   <option value="GN">GREEN</option>
                                   		<%} %> 
                                    <%} %>
                                    </select> 
                                </li>
                                <li>
                                    <select class="sizeColor" id="size" name="size">
                                        <option value="noSize">size 선택</option>
                                       <%for(ProductDetail pro : sizeList){ %> 
                                    <option value="<%= pro.getpSize() %>"><%= pro.getpSize() %></option>
                                    <%} %>
                                    </select>
                                </li>
                                <li>
                                    <input type="number" name="number" id="num" min="1" max="100" step="1" value="1">
                                </li>
                            </ul>
                           
                            <div id="allBtn" >
                            <button type="button" id="by_now" onclick="byNow();">BUY IT NOW</button>
                            <button type="button" onclick="shoppingBag();" id="shopping_bag" >SHOPPING BAG</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script>

       	function byNow(){
       			if($("#color option:selected").val() != "noColor" &&  $("#size option:selected").val() != "noSize"  ){
    				$("#colorSizeform").submit();
    			}else{
           			alert("색상, 사이즈, 수량을 선택해주세요");
           		}
       		}
       	
       	function shoppingBag(){
       		if($("#color option:selected").val() != "noColor" &&  $("#size option:selected").val() != "noSize"  ){
				$("#colorSizeform").attr("action", "<%=request.getContextPath() %>/SBInsertServlet");
       			$("#colorSizeform").submit();
			}else{
       			alert("색상, 사이즈, 수량을 선택해주세요");
       		}
       	}
    	$(function(){
    
                 <%if(loginUser != null){%>
    			$("#by_now").attr("disabled",false);
    			$("#shopping_bag").attr("disabled",false);

    			<%}else{%>
    			
    			$("#by_now").attr("disabled",true);
    			$("#shopping_bag").attr("disabled",true);
    			<%}%>
    	}) 
    </script>

<!-- 내비게이션 시작 -->
<div id="section">
    <hr>
    <div id="sec_details_nav" class="sec_nav">
        <ul>
            <li class="sel_point"><a href="#sec_details_nav">THE DETAILS</a></li>
            <li><a href="#sec_review_nav">REVIEW</a></li>
            <li><a href="#sec_QnA_nav">Q&A</a></li>
        </ul>
    </div>
    <div id="details_area">
        <!-- <img src="images/detail/detail001.jpg"> -->
        <img id="photo" name="photo" src="<%=request.getContextPath()+"/images/thumbnail/" + pd.getImgRoter() + ".jpg" %>">

    </div>

    <!--reivew-->
    <div id="sec_review_nav" class="sec_nav">
        <ul>
            <li><a href="#sec_details_nav">THE DETAILS</a></li>
            <li class="sel_point"><a href="#sec_review_nav">REVIEW</a></li>
            <li><a href="#sec_QnA_nav">Q&A</a></li>
        </ul>
    </div>
    <div id="review_area">
        <form action="<%=request.getContextPath()%>/ReviewInsert" method="post" enctype="multipart/form-data">
        	<input type="hidden" name="rev_pNo" value="<%= pd.getpNo() %>" />
            <div class="rev_rate">
                <select name="rev_rateS" id="rev_rateS">
                    <option value="5">★★★★★</option>
                    <option value="4">★★★★☆</option>
                    <option value="3">★★★☆☆</option>
                    <option value="2">★★☆☆☆</option>
                    <option value="1">★☆☆☆☆</option>
                </select>
            </div>
            <div class="rev_textArea">
            	<input type="text" id="rev_tit" name="rev_tit" placeholder="리뷰 제목을 입력하세요." required/>
                <textarea name="rev_textArea" rows="10" placeholder="리뷰 등록 시 적립금을 드립니다!" required></textarea>
            </div>
            <div class="rev_btns">
                <p class="fileWrap">
                    <input type="file" id="rev_file" name="rev_file">
                    <span><i class="fas fa-camera"></i></span>
                </p>
            <button class="rev_submit" type="submit">리뷰 등록</button>
            </div>
        </form>
        <div class="rev_content">
        	<table class="rev_table">
        		<tr>
        			<!-- th>No</th-->
        			<th>Title</th>
        			<th>Rate</th>
        			<th>View</th>
        			<th>Writer</th>
        			<th>Date</th>
        		</tr>
        	</table>
        <!-- 리뷰 불러올 부분 -->
        <script>
        	// alert("!");
        $(window).load(function(){
        	$.ajax({
        		url : "<%=request.getContextPath()%>/ReviewList",
        		type : "post",
        		data : {"rev_pNo" : "<%= pd.getpNo() %>"},
        		success : function(data){
        			//alert("성공");
        			
        			$.each(data, function(index, value){
        				// 제목 부분
        				var $trLine = $("<tr>").attr("class", "rvLine");
        				// var $tdNo = $("<td>").text(value.rvNo);
        				var $tdTitle = $("<td>").text(value.rvTitle);
        				var $tdRate = $("<td>").text(value.rvRateStar);
        				var $tdView = $("<td>").text(value.rvView);
        				var $tdWriter = $("<td>").text(value.rvName);
        				var $tdDate = $("<td>").text(value.rvDate);
        				
        				// 컨텐츠 부분
        				var $trCont = $("<tr>").attr("class", "rvCont");
        				var $tdCont = $("<td>").attr("colspan", "5");
        				
        				var $divLeft = $("<div>").attr("class", "divLeft");
        				var $divRight = $("<div>").attr("class", "divRight");
        				
        				
        				if(value.rvImg != null){
        					var $pImgArea = $("<p>");
        					var $pImg = $("<img>").attr("src", "<%=request.getContextPath()%>/images/review/" + value.rvImg + ".jpg");
        					
        					$pImgArea.append($pImg);
        					$divLeft.append($pImgArea);
        					$tdCont.append($divLeft);
        				}
        				
        				
        				var $pPrdNo = $("<p>").text("상품명 : " + value.rvpNo);
        				var $pContt = $("<p>").text(value.rvContents);
        				
        				
        				
        				
        				// $tr.append($tdNo);
        				$trLine.append($tdTitle);
        				$trLine.append($tdRate);
        				$trLine.append($tdView);
        				$trLine.append($tdWriter);
        				$trLine.append($tdDate);
        				
        				$divRight.append($pPrdNo);
        				$divRight.append($pContt);
        				
        				$tdCont.append($divRight);
        				
        				$trCont.append($tdCont);
        				
        				
        				
        				$(".rev_table").append($trLine);
        				$(".rev_table").append($trCont);
        				
        				
        				
        			});

                    $(".rvLine").click(function(){
                        $(this).next().toggleClass("show");
                    });
        			
        		},
        		error : function(data){
        			alert("실패");
        		}
        	});
        	// ajax end
        	
        });
        </script>
        </div>
    </div>
    <!--Q&A-->
    <div id="sec_QnA_nav" class="sec_nav">
        <ul>
            <li><a href="#sec_details_nav">THE DETAILS</a></li>
            <li><a href="#sec_review_nav">REVIEW</a></li>
            <li class="sel_point"><a href="#sec_QnA_nav">Q&A</a></li>
        </ul>
    </div>
    <br>
    <div id="QnA_area">
        <h3>상품 Q&A</h3>
        <%if(loginUser != null){ %>
        <%-- <button onclick="location.href='<%=request.getContextPath() %>/views/productQnA/productQnAInsert.jsp?mNo=<%=loginUser.getmNo() %>&pName=<%=pd.getpName()%>&bName=<%=pd.getbName()%>&pNo=<%=pd.getpNo()%>'">상품문의 글쓰기</button> --%>
        <button onclick="productInsertQna();">상품문의 글쓰기</button>
        <%}else { %>
        <button onclick="productQna();">상품문의 글쓰기</button>
        <%} %>
        <br clear="both"><br>
        <table id="qnaTb">
            <tbody>
            	<% if(!qnaList.isEmpty()){ %>
            	 <tr>
                     <th align="center">아이디</th><th align="center">제목</th><th align="center">작성날짜</th>
                    
                </tr>
            	<%for(AdminProductQnA ap : qnaList){ %>
                <tr>
                    <td align="center"><%= ap.getmId() %></td><td align="center"><%= ap.getQnaTitle() %></td><td align="center"><%= ap.getQnaDate() %></td>
                    
                </tr>
				<%} %>
				<%}else{ %>
				<tr>
                    <th align="center">아이디</th><th align="center">제목</th><th align="center">작성날짜</th>
                    
                </tr>
				<tr>
                    <td colspan="3" align="center">상품문의글이 없습니다.</td>
                    
                </tr>
                <%} %>
            </tbody>
        </table>
    </div>
</div>
<%} %>
<script>
	function productQna(){
		alert("로그인을 후 입력이 가능합니다.");
	}
	
	function productInsertQna(){
		if($("#color").val() == "noColor" && $("#size").val() == "noSize"){
			alert("색상과 사이즈 선택 후 문의를 해주세요.");
		}else{
			
		$("#colorSizeform").attr("action","<%=request.getContextPath()%>/views/productQnA/productQnAInsert.jsp");
		$("#colorSizeform").submit();
		}
	}
	
</script>
	<%@ include file="../common/footer.jsp" %>

</body>

</html>