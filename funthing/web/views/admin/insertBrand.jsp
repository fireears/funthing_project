<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>admin_brand_insert</title>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <style>
        a { text-decoration:none; color:#666; }

        ul {
            list-style-type: none;
            margin-block-start: 0;
            margin-block-end: 0;
            margin-inline-start: 0px;
            margin-inline-end: 0px;
            padding-inline-start: 0px;
        }

        h1, h2, h3, h4, h5, h6 {
            padding:0;
            margin:0;
        }
       
        .main{
            width: 100%;
            /* height: 50px; */
            margin-top: 30px;
            padding-top: 20px;
            padding-bottom: 20px;
            border-top: 1px solid #bbb;
            border-bottom: 1px solid #bbb;
        }

        .clear:after {
            clear:both;
            content:"";
            display:block;
        }

        .main ul li{
            float: left;
        }
        .sub1{
            width: 100%;
            /* height: 50px; */
            padding-top: 20px;
            padding-bottom: 20px;
            border-top: 1px solid #bbb;
            border-bottom: 1px solid #bbb;
        }
        .sub1 ul li{
            float: left;
            width: 32.33%;
            box-sizing: border-box;
        }


        .sub2{
            width: 100%;
            padding-top: 20px;
            padding-bottom: 20px;
            border-top: 1px solid #bbb;
            border-bottom: 1px solid #bbb;
        }
        .search-list{
            margin-top: 10px;
            width: 90%;
            height: 200px;
            border: 1px solid #bbb;
            margin-left: 20px;
        }
        ul{
            line-height: 40px;   
        }
        ul li{
            margin-left: 10px;
            width: 32.33%;

        }

        /* 등록하기&삭제하기 버튼 */
        .btn{
            margin-top: 20px;
            text-align: center;
        }

        .btn button{
            width: 200px;
            height: 50px;
            border: 0px;
            background-color: #bbb;
            color: white;
            font-weight: bold;
            font-size: 17px;
        }


    </style>

</head>
<body>
    <!-- 상원이 header include하기 -->
    
    <%@ include file="../common/adminHeader.jsp" %>

    <section id="area" style="width: 1460px; margin: 0 auto;">
        <br>
        <h1 style="text-align: center;">브랜드 등록/수정</h1>
        <div class="main">
            <ul class="clear">
                <li><label>브랜드 코드 : </label><input type="text" id="p_no"></li>
                <li><label>브랜드 명 : </label><input type="text" id="p_no"></li>
            </ul>
        </div>

        <!-- <br clear="both"> -->

        <div class="sub1">
            <ul class="clear">
                <li><label>대표 명 : </label><input type="text" id="ceo"></li>
                <li><label>연락처 : </label><input type="tel" id="phone"></li>
                <li><label>이메일 : </label><input type="email" id="email"></li>
                <li><label>회사 주소 : </label><input type="address" id="address"></li>
                <li><label>입점 날짜 : </label><input type="date" id="entry_date"></li>
                <li><label>입점 유무 : </label><input type="text" id="entry_yn"></li>
            </ul>
        </div>

        <!-- <br clear="both"> -->

        <div class="sub2">
            <form id="search">
                <ul class="clear">
                    <li>
                        <label>판매상품 번호 : </label><input type="text" id="p_no">
                        <button type="button" value="찾아보기">찾아보기</button>
                    </li>
                </ul>
             </form>

             <div class="search-list">
                 
             </div>
        </div>

        <br clear="both">

        <div class="btn">
            <button type="submit" value="insert">등록하기</button>&nbsp;
            <button type="button" value="modify">삭제하기</button>
        </div>
    </section>

</body>


</html>