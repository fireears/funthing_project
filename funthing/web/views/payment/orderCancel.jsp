<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title></title>
    <script src="../js/jQuery-3.4.1.min.js"></script>
    <style>
        body {
            font-family: sans-serif;
            color:rgb(67, 74, 82)
        }

        h2 {
            margin: 10px;
         
        }

        #c_h2 {
            border-bottom: solid 1.5px grey;
        }

    
       
        #info{
             margin:20px;
            border-top:solid lightslategrey 0.5px;
            border-bottom: solid lightslategrey 0.5px;
            background:rgba(218, 219, 219, 0.479);
            /* height: 20%;
            width:30%; */
            text-align: center;

        }

        
        #cancle_reason{
            margin:20px;
            /* height: 20%;
            width: 30%; */

        }

        #c_image{
            display: inline-block;
            
        }
        #c_img {
            margin-top: 10px;
            margin-bottom: 10px;
            height: 100px;
            width: 70px;
        }

        #c_title{
            width:50%;
            height: 100%;
            float:none;
            display: inline-block;
 
        }

        #c_price{
            display: inline-block;
        }
       

        .radio {
            margin-bottom: 5px;
        }

        div {
            /* border: solid 1px; */

        }

        #c_textarea {
            width: 100%;
        }
        

        
    </style>
</head>

<body>
    <div id="c_h2">
        <h2>취소</h2>
    </div>
    <form method="get" action="#" id="cancal_form">
        
        <div id="info">
            <table>
                <tr>
                    <td id="c_image" name="c_image">
                        <img id="c_img" src="../images/thumbnail/thumb001.jpg">
                    </td>
                    <td id="c_title" name="c_title">
                        MINIMAL HIDDEN JACKET_COLOR_2차
                    </td>
                    <td id="c_price" name="c_price">
                        190,000원
                    </td>
                </tr>
            </table>
        </div>
        <div id="cancle_reason">
            <h3>취소 사유</h3>
            <div class="radio">
                <input type="radio" id="c_design" name="c_reason">
                <label for="design">디자인이 마음에 들지 않습니다.</label><br>
            </div>
            <div class="radio">
                <input type="radio" id="c_latedate" name="c_reason">
                <label for="c_latedate">배송출고 날짜가 늦습니다.</label><br>
            </div>
            <div class="radio">
                <input type="radio" id="misssize" name="c_reason">
                <label for="c_misssize">사이즈가 부적절합니다.</label><br>
            </div>
            <div class="radio">
                <input type="radio" id="c_etc" name="c_reason">
                <label for="c_etc">기타</label><br>
                <textarea id="c_textarea" name="c_reason" rows="3"  placeholder="기타 사유를 입력해주세요."></textarea>
            </div>
        </div>
    </form>
</body>

</html>