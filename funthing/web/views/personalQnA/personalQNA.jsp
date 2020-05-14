<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
	.r-cont-header{
            width: 100%;
            padding: 20px 20px;
            border-top: 1px solid #bbb; 
            border-bottom:1px solid #bbb;
        }

        .r-cont-header:after {
            clear:both;
            content:"";
            display:block;
        }

        .r-cont-text{
            width: 30%;
            margin: 0 0 0 0;
            margin-right: 0;
            padding: 0 0 0 0;
            float:left;
        }
        .r-cont-button{
            float: right;
            border: 1px solid #bbb;
            background-color: #bbb;
        }

        .r-cont-button a{
           margin:20px;
           font-size: 15px;
           color: white;
        }


         /* 날짜 조회 영역 */
         .point{
            padding-left: 20px;
            width: 100%;
            margin: 60px 0;
        }

        /* 날짜 영역 */
        .point-search{
            margin-top: 30px;
            height: 130px;
            border-top: 1px solid #0f4a7e;
            border-bottom: 1px solid #bbb;
            border-left: 1px solid #bbb;
            border-right: 1px solid #bbb;
        }

        .point-search ul{
            display: inline-block;
        }

        .point-search ul:after{
            display: block;
            content: "";
            clear: both;
        }

        .point-search ul li{
            float: left;
            margin-top: 45px;
            margin-left: 30px;
        }
        .point-search ul h3{
            color: darkgray;
        }

        
        #submit{ /* 날짜 조회 버튼 */
            width: 120px;
            height: 30px;
            background-color: #0f4a7e;
            color: white;
            border: none;
            font-size: 15px;
        }

        /* 1:1문의 조회 list 영역 */
        .search-list{
            padding-left: 20px;
            width: 100%;
        }
        .list-tb{
            margin-top: 30px;
            border-top: 2px solid #0f4a7e;
            width: 100%;
            border-bottom: 1px solid #0f4a7e;
            line-height: 50px;
            border-collapse: collapse;
        }
        .list-tb th{
            border-bottom: 1px solid #0f4a7e;
        }
        .list-tb tr{
            border: 0; padding:0; border-bottom: 1px solid #bbb;
        }
        .list-tb td{
            text-align: center;
        }
        .list-tb .tb-first{
            width: 200px;
        }
        .list-tb .tb-last{
            width: 200px;
        }
	
	
	</style>
	
	
</head>
<body>
	
	<%@ include file="../common/header.jsp" %>
	
	<%@ include file="../common/myPageHeader.jsp" %>
	
    <div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
	<div id="r-cont"> 
	<!-- 오른쪽 컨텐츠 수정 영역  -->
            <!-- 오른쪽 컨텐츠 헤더 영역-->
            <div class="r-cont-header">
               
                <div class="r-cont-text">
                    <h2>
                        <b style="color:#0f4a7e;">1:1 문의</b>
                    </h2>
                </div>

                <!-- 1:1 문의하기 버튼 -->
                <div class="r-cont-button">
                    <a href="#">1:1 문의하기</a>
                </div>
            
            </div> <!-- 오른쪽 컨텐츠 헤더 end -->


            <!-- 1:1 문의 날짜 조회 영역 -->
            <div class="point">
                <form method="post" action="#">
                    <div class="point-search">
                        <ul>
                            <li><h3>조회기간</h3></li>
                            <li>
                                <input type="radio" name="0" id="today" value="today">
                                <label for="today">오늘</label>
                            </li>
                            <li>
                                <input type="radio" name="0" id="week" value="week">
                                <label for="week">7일</label>
                            </li>
                            <li>
                                <input type="radio" name="0" id="month" value="month">
                                <label for="month">1개월</label>
                            </li>
                            <li>
                                <input type="radio" name="0" id="3months" value="3month">
                                <label for="3month">3개월</label>
                            </li>
                            <li>
                                <input type="radio" name="0" id="6months" value="6months`">
                                <label for="6months">6개월</label>
                            </li>
                            <li>
                                <input type="radio" name="0" id="year" value="year">
                                <label for="year">1년</label>
                            </li>
                            <li>
                                <input type="date" name="first_date">
                            </li>
                            <li>
                                <input type="date" name="second_date">
                            </li>
                            <li>
                                <input type="submit" id="submit" value="조회">
                            </li>
                        
                        </ul>

                    </div>
                </form><!-- 1:1 문의 날짜 조회기간 end -->
            </div><!-- 1:1 문의 조회 영역 end -->

            <br clear="both">

            <!-- 1:1 문의 조회 결과 영역 -->
            <div class="search-list">
                <table class="list-tb">
                    <tr>
                        <th class="tb-first">문의날짜</th>
                        <th>카테고리</th>
                        <th>제목</th>
                        <th class="tb-last">문의상태</th>
                    </tr>

                    <tr>
                        <td class="tb-first">2020-05-09</td>
                        <td>상품문의</td>
                        <td>상품문의 입니다.</td>
                        <td class="tb-last">접수완료</td>
                    </tr>

                    <tr>
                        <td class="tb-first">2020-05-09</td>
                        <td>상품문의</td>
                        <td>상품문의 입니다.</td>
                        <td class="tb-last">접수완료</td>
                    </tr>
                </table>


            </div><!-- 1:1 문의 조회 결과 영역 end -->


<!-- 이 위까지만 수정하세요 -->
        </div><!--오른쪽 컨텐츠 수정 영역 end-->

            
    </div><!--content 영역 end-->
    
    <%@ include file="../common/footer.jsp" %>
	
	


</body>
</html>