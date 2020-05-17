<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.model.vo.Member" %>
    
    <%
    	Member loginUser = (Member)session.getAttribute("loginUser");
    %> 
<!DOCTYPE html>
	<html>
	<head>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/main.css">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/reset.css">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css">
	    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/slick/slick.css"/>
	    <!-- Add the new slick-theme.css if you want the default styling -->
	    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/slick/slick-theme.css"/>
		
  		  <script src="https://kit.fontawesome.com/39b470622c.js" crossorigin="anonymous"></script>
		<script src="<%=request.getContextPath()%>/js/action.js"></script>
		<!--script src="<%=request.getContextPath()%>/js/swiper.min.js"></script-->
		<script type="text/javascript" src="<%=request.getContextPath()%>/slick/slick.min.js"></script>
	</head>
	<body>
		<header id="header">
	        <div class="menu-wrap">
	            <div class="log-menu">
	            
	            <% if(loginUser != null){ %>
	                <ul class="log-sec login">
	                <%if(loginUser.getmId().equals("master")){ %>
	                	<li class="master"><a href="<%=request.getContextPath()%>/admin/mainView">MASTER</a></li>
	                	<%} %>
	                    <li><a href="#none">HELP</a></li>
	                    <li><a href="<%=request.getContextPath() %>/logout.me">LOGOUT</a></li>
	                    <li><a href="#none">MY PAGE</a></li>
	                    <li><a href="#none"><i class="fas fa-shopping-cart"></i></a></li>
	                </ul>
	                <% }else{ %>
	                <ul class="log-sec logout">
	                    <li><a href="#none">HELP</a></li>
	                    <li><a href="#none">JOIN</a></li>
	                    <li><a href="<%=request.getContextPath()%>/views/member/memberLogin.jsp">LOGIN</a></li>
	                    <li><a href="#none"><i class="fas fa-shopping-cart"></i></a></li>
	                </ul>
	                <% } %>
	                
	            </div>
	        </div> 
	        <div id="nav-wrap">
	            <div class="logo-wrap">
	                <h1 class="logo"><a href="index.jsp">FUN-THING</a></h1>
	                
	                <div class="search-box"><span><i class="fas fa-search"></i></span></div>
	                
	            </div>
	            <nav id="nav">
	                <ul>
	                    <li>
	                        <a href="#none">WOMAN</a>
	                        <ul class="sub-menu">
	                            <li><a href="#none">OUTER</a></li>
	                            <li><a href="#none">TOP</a></li>
	                            <li><a href="#none">BOTTOM</a></li>
	                            <li><a href="#none">JEAN</a></li>
	                            <li><a href="#none">ONEPIECE</a></li>
	                        </ul>
	                    </li>
	                    <li>
	                        <a href="#none">MAN</a>
	                        <ul class="sub-menu">
	                            <li><a href="#none">OUTER</a></li>
	                            <li><a href="#none">TOP</a></li>
	                            <li><a href="#none">BOTTOM</a></li>
	                            <li><a href="#none">JEAN</a></li>
	                        </ul>
	                    </li>
	                    <li><a href="<%=request.getContextPath()%>/CalendarSelect">CALENDAR</a></li>
	                </ul>
	            </nav>
	        </div>
	        <!-- nav end -->
	    </header>
	    
	    <div class="searchWrap">
	        <form id="search" action="<%=request.getContextPath() %>/MainSearch" method="GET">
	        
	            <input type="text" id="search" name="search" /><button type="submit" id="submitBtn" style="background-color:transparent; border:0px;"><i class="fas fa-search"></i></button>
	        </form>
	        <div class="close"><i class="fas fa-times"></i></div>
	    </div>
	</body>
	 
	<script>
		//헤더 상단 고정
		var headerTop = $("#header").offset();
		console.log(headerTop);
		$(window).scroll(function(){
		  if($(document).scrollTop() > headerTop.top){
		    $("#header").addClass("fixed");
		  }else{
		    $("#header").removeClass("fixed");
		  }
		});
		
		// 검색창 클릭 시
		$(".search-box").click(function(){
		    $(".searchWrap").show();
		    $('html').css({'overflow': 'hidden', 'height': '100%'});
		    $('#element').on('scroll touchmove mousewheel', function(event) {
		      event.preventDefault();
		      event.stopPropagation();
		      return false;
		    });
		});
		
		// 검색창 열렸을 때 닫기
		$(".searchWrap .close").click(function(){
		  $(".searchWrap").hide();
		  $('html').css({'overflow': 'scroll', 'height': '100%'});
		  $('#element').off('scroll touchmove mousewheel');
		
		});
		
		//nav menu
		$("#nav > ul > li .sub-menu").hide();
		
		$("#nav > ul > li").hover(function(){
		  $(this).children(".sub-menu").stop().slideDown();
		}, function(){
		  $(this).children(".sub-menu").stop().slideUp();
		
		});
	</script>
</html>