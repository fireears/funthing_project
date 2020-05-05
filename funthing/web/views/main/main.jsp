<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Insert title here</title>
	
		
		
		<script src="<%=request.getContextPath()%>/js/action.js"></script>
		<script src="<%=request.getContextPath()%>/js/swiper.min.js"></script>
	
	</head>
	<body>
		<div class="searchWrap">
	        <form id="search" action="#" method="post">
	            <input type="text" id="search" name="search" /><i class="fas fa-search"></i>
	        </form>
	        <div class="close"><i class="fas fa-times"></i></div>
	    </div>
	    <!-- search end -->
	    <div id="container">
	        <div id="content">
	            <div class="main-img">
	                <img src="<%=request.getContextPath()%>/images/main_img.jpg" />
	            </div>
	            <div class="con-box discover">
	                <h2>DISCOVER THE LATEST ARRIVALS</h2>
	                <ul class="product">
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
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb002.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb003.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb002.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb003.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
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
	                </ul>
	            </div>
	            <!-- discover end -->
	
	            <%-- <div class="best-sell">
	                <h2>BEST SELLING</h2>
	                <!-- Swiper -->
	                <div class="swiper-container">
	                  <div class="swiper-wrapper">
	                    <div class="swiper-slide">                        
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb001.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </div>
	                    <div class="swiper-slide">                        
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb002.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </div>
	                    <div class="swiper-slide">                        
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb003.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </div>
	                    <div class="swiper-slide">                        
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb001.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </div>
	                    <div class="swiper-slide">                        
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb002.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </div>
	                    <div class="swiper-slide">                        
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb003.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </div>
	                  </div>
	                  <!-- Add Pagination -->
	                    <div class="swiper-pagination"></div>
	                    <!-- Add Arrows -->
	                    <div class="swiper-button-next"></div>
	                    <div class="swiper-button-prev"></div>
	                </div>
	                <script>
	                    var swiper = new Swiper('.swiper-container', {
	                    slidesPerView: 5,
	                    spaceBetween: 30,
	                    loop: true,   
	                    pagination: {
	                        el: '.swiper-pagination',
	                        clickable: true,
	                    },
	                    });
	                </script>
	            </div> --%>
	            <!-- best-sell end -->
	
	            <div class="con-box completion">
	                <h2>CLOSE TO COMPLETION</h2>
	                <ul class="product">
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
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb002.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb003.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb002.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
	                    <li>
	                        <div class="prod-img">
	                            <a href="#none"><img src="<%=request.getContextPath()%>/images/thumbnail/thumb003.jpg"></a>
	                        </div>
	                        <ul class="prod-cont">
	                            <li class="prod-brand">brand</li>
	                            <li class="prod-tit"><a href="#none">product title</a></li>
	                            <li class="fun-sdate">2020/05/30~</li>
	                        </ul>
	                    </li>
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
	                </ul>
	            </div>
	            </div>
	            <!-- completion end -->
	
	        <!-- sell content end -->
	        <div class="bt-wrap">
	            <div class="bt-sec left">
	                <h3>QNA</h3>
	                <ul>
	                    <li><a href="#none">title</a><span>date</span></li>
	                    <li><a href="#none">title</a><span>date</span></li>
	                    <li><a href="#none">title</a><span>date</span></li>
	                    <li><a href="#none">title</a><span>date</span></li>
	                </ul>
	            </div><!-- left end -->
	            
	            <div class="bt-sec center">
	                <h3>NOTICE</h3>
	                <ul>
	                    <li><a href="#none">title</a><span>date</span></li>
	                    <li><a href="#none">title</a><span>date</span></li>
	                    <li><a href="#none">title</a><span>date</span></li>
	                    <li><a href="#none">title</a><span>date</span></li>
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
	</body>
</html>