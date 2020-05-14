<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html lang="ko">
<head>
    <title>myPage</title>
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
        body{
        	margin:0;
        }

        .header-mypage{
            position: relative; 
            background-color:#30586e;
            width: 100%;
            height: 220px;
            margin-bottom: 0px;
            clear: both;
            text-align:center;
        }

        .header-mypage .area h2{
            display: block;
            position: relative;
            font-size: 24px;
            font-weight: 400;
            letter-spacing: 2.9px;
            color: #fff;
            padding-bottom: 20px;
            padding-top: 50px;
        }

        .header-mypage .area h4{
            display: inline-block;
            color: #fff;
            font-weight: 200;
            font-size: 12px;
            position: relative;
            padding: 0 20px 0 7px;
        }

        #side{
           /* display: table-cell; */
           vertical-align: top;
           /* width: calc(100% *(288/1420)); */
           width:20%;
           padding-right: 0;
           float: left;
        }

        ul li{
            list-style: none;
            line-height: 35px;
        }

        #content { width:1460px; margin:0 auto; }
        #content:after { clear:both; content:""; display:block; }

        .mypage-lnb { 
            margin: 60px 0 0; 
        }

        .mypage-lnb h2 { 
            border-top:1px solid #bbb; 
            border-bottom:1px solid #bbb; 
            padding:20px 0; 
        }

        .mypage-lnb h3 { 
            padding:20px 0; 
            color:#0f4a7e; 
            position:relative; 
        }

        .mypage-lnb h3:after { 
            display:block; 
            content:""; 
            clear:both; 
            width:30px; 
            height:1px; 
            background:#0f4a7e;/* h3 밑에 있는 선 컬러 */ 
            position:absolute; 
            bottom:2px; 
            left:0; 
        }

        .mypage-lnb ul { margin-bottom:20px; }
   
        
        #r-cont{
           float:left;
           width:76%;
            padding: 20px 0; 
            margin-top: 60px;
            box-sizing: border-box;
            margin-left:4%;
        }

        

    </style>



</head>
<body>

    <!-- 마이페이지의 header 부분 (보류)-->
    <div class="header-mypage"> 
       <div class="area">
            <h2>MY PAGE</h2>
            <br>
            <h4>Home - MyPage</h4>
       </div>
       
    </div>



    





</body>

</html>