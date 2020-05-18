<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<head>
		<meta charset="UTF-8">
		<title>FUN-THING</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
        <style>
            body{margin: auto; width: 100%;}
            /* #nav{margin: auto; width: 50%;} */
            #nav{background-color: rgb(199, 196, 196);}
            #nav_header{margin:auto; width:100%; height: 90px;}
            #nav_header ul li{float: left; width:6%; list-style-type: none; padding-right: 15px; padding-left: 15px; padding-top: 20px; line-height: auto;}
            #nav_header ul li button{width: 100%; height: 50px; background-color: gray; border-radius: 10px; border: 0px; font-size: 13px; font-weight: 400; color: white;}

            

        </style>
    </head>
    <body>
        <header>
            <br>
            <h1 style="text-align: center;">FUN-THING ADMIN</h1>
            <br>
            <div id="nav" align="center">
                <div id="nav_header" align="center">
                    <ul>
                        <li><button type="button" onclick="productManage();">상품관리</button></li>
                        <li><button type="button" onclick="productQnA();">상품문의</button></li>
                        <li><button type="button" onclick="orderManage();">주문관리</button></li>
                        <li><button type="button" onclick="">매출관리</button></li>
                        <li><button type="button" onclick="">상품통계</button></li>
                        <li><button type="button" onclick="memberManage();">회원 관리</button></li>
                        <li><button type="button" onclick="brandManage();">브랜드 관리</button></li>
                        <li><button type="button" onclick="reviewManage">리뷰관리</button></li>
                        <li><button type="button" onclick="qnaManage();">1:1문의 관리</button></li>
                        <li><button type="button" onclick="pointManage();">포인트</button></li>
                        <li><button type="button" onclick="notice();">공지사항 게시판</button></li>
                        <li><button type="button" onclick="client();">클라이언트</button></li>
                        

                        <!-- <li><button>캘린더 관리</button></li> -->
                    </ul>
                </div>
            </div>
        </header>


        <br>
        <hr clear="both">
	</body>
	<script>
		function productManage()
		{
			location.href="<%=request.getContextPath()%>/admin/mainView?table=" + "PRODUCT";
		}
		//상품 문의
		function productQnA()
		{
			location.href="<%=request.getContextPath()%>/admin/productQnA";
		}
		function orderManage()
		{
			location.href="<%=request.getContextPath()%>/admin/orderInfo";
		}
		function memberManage()
		{
			location.href="<%=request.getContextPath()%>/memberList.me";
		}
		function brandManage()
		{
			location.href="<%=request.getContextPath()%>/admin/brandServlet";
		}
		function reviewManage()
		{
			
		}
		function qnaManage()
		{
			location.href="<%=request.getContextPath()%>/admin/personalQna";
		}
		function pointManage()
		{
			
		}
		function notice()
		{
			
		}
		function client()
		{
			location.href = "<%=request.getContextPath()%>/main/mainView";
		}
		
		
		
	</script>
</html>