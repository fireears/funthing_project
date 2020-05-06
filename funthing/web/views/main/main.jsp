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
	
            <div class="best-sell">
                <h2>BEST SELLING</h2>
                <section id="features" class="blue">
                    <div class="slider center">
                        <div>
                            <img src="images/thumbnail/thumb001.jpg">
                        </div>
                        <div>
                            <img src="images/thumbnail/thumb002.jpg">
                        </div>
                        <div>
                            <img src="images/thumbnail/thumb003.jpg">
                        </div>
                        <div>
                            <img src="images/thumbnail/thumb001.jpg">
                        </div>
                        <div>
                            <img src="images/thumbnail/thumb002.jpg">
                        </div>
                        <div>
                            <img src="images/thumbnail/thumb003.jpg">
                        </div>
                    </div>
                    
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
                </section>
            </div>
            
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