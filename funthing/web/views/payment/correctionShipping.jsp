<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <title></title>
    <!-- <script src="../js/jQuery-3.4.1.min.js"></script> -->
    <style>
        body {
            font-family: sans-serif;
            color: rgb(67, 74, 82)
        }

        h2 {
            margin: 10px;

        }

        #c_h2 {
            border-bottom: solid 1.5px grey;
        }




        #info {
            margin: 20px;
            border-top: solid lightslategrey 0.5px;
            border-bottom: solid lightslategrey 0.5px;
            background: rgba(218, 219, 219, 0.479);
            /* height: 20%;
            width: 30%; */
            text-align: center;

        }


        #c_image {
            display: inline-block;

        }

        #c_img {
            margin-top: 10px;
            margin-bottom: 10px;
            height: 100px;
            width: 70px;
        }

        #c_title {
            width: 50%;
            height: 100%;
            float: none;
            display: inline-block;
                       

        }

        #c_price {
            display: inline-block;
        }

        div {
            /* border: solid 1px; */

        }



        table {
            width:100%;
            border-bottom: 1px solid lightslategray;
            
        }


        .corr {
            border-top: 0.5px solid lightslategray;
            font-size: small;
            height: 20px;
            line-height: 30px;
        }

        #corr_info td {
            padding-right:0;
            
            
        }

        #corr_info th {

            background: rgba(218, 219, 219, 0.479);
            padding-right: 50px;
        
        }
      
        #correction {
            margin: 20px;

        }

        #addressBtn{
            float: right;
            border:0;
            border-radius: 5px;
            height:25px;
            background: lightgrey;
        }
    </style>
</head>

<body>
    <div id="c_h2">
        <h2>배송지 수정</h2>
    </div>
    <form method="get" action="#">
        <div id="shipping">
            <div id="info">
                <table>
                    <tr>
                        <td id="c_image" name="c_image">
                            <img id="c_img" src="../images/thumbnail/thumb001.jpg">
                        </td>
                        <td id="c_title" name="c_title" >
                            MINIMAL HIDDEN JACKET_COLOR_2차
                        </td>
                        <td id="c_price" name="c_price" >
                            190,000원
                        </td>
                    </tr>
                </table>
            </div>
            <div id="correction">
                <h3>받으실 분 </h3>
                <table id="corr_info">
                    <tr>
                        <th class="corr" align="left" >이름</th>
                        <td class="corr" id="ship_name" name="ship_name">신희지</td>
                    
                    </tr>
                    <tr>
                        <th class="corr" align="left">주소</th>
                        <td class="corr" id="ship_address" name="ship_name">경기도 안산시
                        <button type="button" id="addressBtn" name="addressBtn" align="right">주소검색</button></td>
                      
                    </tr>
                    <tr>
                        <th class="corr" align="left">전화번호</th>
                        <td class="corr" id="ship_tel" name="ship_tel">010-4343-5656</td>
                       
                    </tr>
                    <tr>
                        <th class="corr" align="left">남기실 말씀</th>
                        <td class="corr">깜짝놀래킬 선물입니다. 숨어서 놀래켜주세요</td>
                       
                    </tr>
                </table>
            </div>
        </div>
    </form>
</body>

</html>