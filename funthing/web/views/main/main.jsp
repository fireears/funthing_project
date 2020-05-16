<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="product.model.vo.Product" %>
    <%@ page import="productQnA.model.vo.ProductQnA" %>
    <%@ page import="notice.model.vo.Notice" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.sql.Date" %>
    
    
    <!--  돈 , 표시 import -->
    <%@ page import="java.text.DecimalFormat" %>
    <%
    	ArrayList<Product> arriProduct = (ArrayList<Product>)request.getAttribute("arriProduct");
    	ArrayList<Product> bestProduct = (ArrayList<Product>)request.getAttribute("bestProduct");
    	ArrayList<Product> closeProduct = (ArrayList<Product>)request.getAttribute("closeProduct");
    	ArrayList<ProductQnA> qnalist = (ArrayList<ProductQnA>)request.getAttribute("qnalist");
    	ArrayList<Notice> noticelist = (ArrayList<Notice>)request.getAttribute("noticelist");
    	
    	//돈 , 표시에 필요한 객체
    	DecimalFormat formatter = new DecimalFormat("###,###");
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>FUN-THING</title>
		
		<script src="<%=request.getContextPath()%>/js/action.js"></script>
		<script src="<%=request.getContextPath()%>/js/swiper.min.js"></script>
	
	</head>
	<body>
		
		<%@ include file="/views/common/header.jsp" %>
		
		
	    <!-- search end -->
	    <div id="container">
	        <div id="content">
	            <div class="main-img">
	                <img src="<%=request.getContextPath()%>/images/main_img.jpg" />
	            </div>
	            <div class="con-box discover">
	                <h2 id="title">DISCOVER THE LATEST ARRIVALS</h2>
	                <ul class="product">
	                
	                	<%if(arriProduct != null) { %>
	                	<%	for(int i = 0; i<8; i++) { %>
	                	<%		Product p = arriProduct.get(i);
	                	
	                			String thumbnail = p.getThumbnail();
	                			String pName = p.getpName();
	                			int pPrice = p.getpPrice();
	                			Date fStartDate = p.getfStartDate();
	                			Date fEndDate = p.getfEndDate();
	                			
	                			String thumbnailUrl = "web/images/thumbnail/" + thumbnail + ".jsp";
	                	%>
		                    <li>
		                        <div class="prod-img">
		                            <%-- <a href="#none"><img src=<%=thumbnailUrl %>></a> --%>
		                            <a href="#none"><img src="<%=request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" %>"></a>
		                            <%-- <img src="<%=request.getContextPath()+"/images/book/"+b.getBookImage() %> --%>
		                        </div>
		                        <ul class="prod-cont">
		                            <!-- <li class="prod-brand">brand</li> -->
		                            <li class="prod-tit"><a href="#none"><%=pName %></a></li>
		                            <li class="prod-tit"><a href="#none"><%=formatter.format(pPrice) %>원</a></li>
		                            <li class="fun-sdate"><%=fStartDate %>~<%=fEndDate %></li>
		                        </ul>
		                    </li>
	                    <%} 
	                	}else { %>
		                    <li>
		                        <div class="prod-img">
		                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb001.jpg"></a>
		                        </div>
		                        <ul class="prod-cont">
		                            <li class="prod-brand">brand</li>
		                            <li class="prod-tit"><a href="#none">product title</a></li>
		                            <li class="fun-sdate">2020/05/30~</li>
		                        </ul>
		                    </li>
	                    <%} %>
	                    
	                </ul>
	            </div>
	            <!-- discover end -->
	
            <div class="best-sell">
                <h2 id="title">BEST SELLING</h2>
                <section id="features" class="blue">
                    <div class="slider center">
                    	<%if(bestProduct != null) { %>
                    	<%	for(int i=0; i<6;i++) { %>
                    	<%		 Product p = bestProduct.get(i);
	                			
								 String thumbnail = p.getThumbnail();
						%>
		                        <div>
		                            <img src="<%=request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" %>">
		                        </div>
	                   <%	} %>
                       <%}else { %>
                       
                       <%} %>
                    </div>
                </section>
            </div>
            
	            <div class="con-box completion">
	                <h2 id="title">CLOSE TO COMPLETION</h2>
	                <ul class="product">
	                	<%if(closeProduct != null) { %>
	                	<%	for(int i = 0; i<8; i++) { %>
	                	<%		Product p = closeProduct.get(i);
	                			
			                	String thumbnail = p.getThumbnail();
		            			String pName = p.getpName();
		            			int pPrice = p.getpPrice();
		            			Date fStartDate = p.getfStartDate();
		            			Date fEndDate = p.getfEndDate();
	                	%>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()+"/images/thumbnail/" + thumbnail + ".jpg" %>"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <!-- <li class="prod-brand">brand</li> -->
	                            <li class="prod-tit"><a href="#none"><%=pName %></a></li>
	                            <li class="prod-tit"><a href="#none"><%=formatter.format(pPrice) %>원</a></li>
	                            <li class="fun-sdate"><%=fStartDate %>~<%=fEndDate %></li>
	                        </ul>
	                    </li>
	                    
	                    <%	} %>
	                    <%}else{ %>
	                    
	                    <%} %>
	                </ul>
	            </div>
	            </div>
	            <!-- completion end -->
	
	        <!-- sell content end -->
	        <div class="bt-wrap">
	            <div class="bt-sec left">
	                <h3>QNA</h3>
	                <ul>
	                	<%if(qnalist != null) { %>
	                	<%	for(int i =0; i<4; i++) { %>
	                	<%		ProductQnA q = qnalist.get(i);
	                			
	                			String title = q.getQnaTitle();
	                			Date qnaDate = q.getQnaDate();
	                	%>
	                    		<li><a href="#none"><%=title %></a><span><%=qnaDate %></span></li>
	                    <%	} %>
	                    <%}else{} %>
	                </ul>
	            </div><!-- left end -->
	            
	            <div class="bt-sec bcenter">
	                <h3>NOTICE</h3>
	                <ul>
	                	<%if(noticelist != null) { %>
	                	<%	for(int i=0;i<4;i++) { %>
	                	<%		Notice n = noticelist.get(i);
	                			
	                			String title = n.getnTitle();
	                			Date date = n.getnDate();
	                	%>
	                    	<li><a href="#none"><%=title %></a><span><%=date %></span></li>
	                    
	                    <%	} %>
	                    <%} else {} %>
	                </ul>
	            </div><!-- center end -->
	            
	            <div class="bt-sec right">
	                <h3>CUSTEMER CENTER</h3>
	                <ul>
	                    <li class="tel">1234-5678</li>
	                    <li>운영시간 : 10:00 ~ 17:00</li>
	                    <li>점심시간 : 11:30 ~ 13:30</li>
	                    <li>주말 및 공휴일은 휴무입니다.</li>
	                </ul>
	            </div><!-- right end -->
	        </div>
	
	        </div><!-- content end -->
	    </div><!-- container end -->
	    
	    <%@include file="/views/common/footer.jsp" %>
	</body>
	
	<script>
	    $('.center').slick({
	    centerMode: true,
	    centerPadding: '200px',
	    infinite : true, 	//무한 반복 옵션	 
	    slidesToShow : 3,		// 한 화면에 보여질 컨텐츠 개수
	    slidesToScroll : 1,		//스크롤 한번에 움직일 컨텐츠 개수
	    speed : 100,	 // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)
	    arrows : true, 		// 옆으로 이동하는 화살표 표시 여부
	    dots : true, 		// 스크롤바 아래 점으로 페이지네이션 여부
	    autoplay : true,			// 자동 스크롤 사용 여부
	    autoplaySpeed : 5000, 		// 자동 스크롤 시 다음으로 넘어가는데 걸리는 시간 (ms)
	    pauseOnHover : true,		// 슬라이드 이동	시 마우스 호버하면 슬라이더 멈추게 설정
	    // prevArrow : "<button type='button' class='slick-prev'>Previous</button>",		// 이전 화살표 모양 설정
	    // nextArrow : "<button type='button' class='slick-next'>Next</button>",		// 다음 화살표 모양 설정
	    dotsClass : "slick-dots", 	//아래 나오는 페이지네이션(점) css class 지정
	    draggable : true, 	//드래그 가능 여부 
	    responsive: [
	        {
	        breakpoint: 768,
	        settings: {
	            arrows: false,
	            centerMode: true,
	            centerPadding: '40px',
	            slidesToShow: 3
	        }
	        },
	        {
	        breakpoint: 480,
	        settings: {
	            arrows: false,
	            centerMode: true,
	            centerPadding: '40px',
	            slidesToShow: 1
	        }
	        }
	    ]
	    });
	</script>
</html>