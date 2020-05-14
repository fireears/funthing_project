<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
        <style>
            body{margin: auto; width: 100%;}
            /* #nav{margin: auto; width: 50%;} */
            #nav{background-color: rgb(199, 196, 196);}
            #nav_header{margin:auto; width:100%; height: 90px;}
            #nav_header ul li{float: left; width:7.5%; list-style-type: none; padding-right: 15px; padding-left: 15px; padding-top: 20px; line-height: auto;}
            #nav_header ul li button{width: 100%; height: 50px; background-color: gray; border-radius: 10px; border: 0px; font-size: 16px; font-weight: 600; color: white;}

            

        </style>
    </head>
    <body>
        <header>
            <br>
            <h1 style="text-align: center;">FUN-THING ADMIN</h1>
            <br>
            <div id="nav">
                <div id="nav_header">
                    <ul>
                        <li><button type="button" onclick="productManage();">상품관리</button></li>
                        <!-- <li><button>상품등록</button></li> -->
                        <li><button type="button" onclick="orderManage();">주문관리</button></li>
                        <li><button type="button" onclick="">매출관리</button></li>
                        <li><button type="button" onclick="">상품통계</button></li>
                        <li><button type="button" onclick="memberManage();">회원 관리</button></li>
                        <li><button type="button" onclick="brandManage">브랜드 관리</button></li>
                        <li><button type="button" onclick="reviewManage">리뷰관리</button></li>
                        <li><button type="button" onclick="qnaManage();">1:1문의 관리</button></li>
                        <li><button type="button" onclick="pointManage();">포인트</button></li>
                        <li><button type="button" onclick="notice();">공지사항 게시판</button></li>

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
		function orderManage()
		{
			
		}
		function memberManage()
		{
			
		}
		function brandManage()
		{
			
		}
		function reviewManage()
		{
			
		}
		function qnaManage()
		{
			
		}
		function pointManage()
		{
			
		}
		function notice()
		{
			
		}
		
		
	</script>
</html>