<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>admin_brand</title>
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

       
        /* 브랜드 관리 */
        .brand-select{
            margin-top: 30px;
            background-color: #bbb;
            width: 100%;
            height: 100px;
            text-align:center;
        }
        .brand-select ul{
            display:inline-block;
        }
        .brand-select ul:after {
            clear:both;
            content:"";
            display:block;
        }

        .brand-select ul li{
            float: left;
            margin: 40px;
        }

        /* 브랜드 조회 내역 list 영역 */
        .brand-list{
            padding-left: 20px;
            width: 100%;
        }
        .list-tb{
            margin-top: 30px;
            border-top: 2px solid #bbb;
            width: 100%;
            border-bottom: 1px solid #bbb;
            list-style: 50px;
            border-collapse: collapse;
            line-height: 40px;
        }
        .list-tb th{
            border-bottom: 1px solid #bbb;
        }
        .list-tb tr{
            border: 0; padding:0; border-bottom: 1px solid #bbb;
        }
        .list-tb td{
            text-align: center;
        }
        .list-tb .tb-last{
            border-left: 1px solid #bbb;
            border-bottom: 0px;
        }
        
    </style>
</head>
<body>

    <!-- 상원이 admin header include 하기 -->
	
	<%@ include file="../common/adminHeader.jsp" %>

    <section id="area">
        <h1 style="text-align: center;">브랜드 관리</h1>
        <form method="post" action="#">
            <div class="brand-select">
                <ul>
                    <li><label>브랜드 코드 : </label><input type="text" name="b_no" id="b_no"></li>
                    <li><label>브랜드 명 : </label><input type="text" name="b_name" id="b_name"></li>
                    <li>
                        <input type="submit" value="조회하기">
                        <button type="botton">상품 등록</button>
                    </li>
                </ul>
            </div>
        </form>
       
        <br clear="both"> 

        <div class="brand-List">
            <table class="list-tb">
                <tr style="background-color: lightgray;">
                    <th>브랜드 코드</th>
                    <th>브랜드 명</th>
                    <th>대표 명</th>
                    <th>연락처</th>
                    <th>회사 주소</th>
                    <th>이메일</th>
                    <th>입점 날짜</th>
                    <th>입점 유무</th>
                    <th class="tb-last">변경</th>
                </tr>

                <tr>
                    <td>브랜드 코드</td>
                    <td>브랜드 명</td>
                    <td>대표 명</td>
                    <td>연락처</td>
                    <td>회사 주소</td>
                    <td>이메일</td>
                    <td>입점 날짜</td>
                    <td>입점 유무</td>
                    <td class="tb-last">
                        <button type="button">수정</button>
                        <button type="button">삭제</button>
                    </td>
                </tr>

                <tr>
                    <td>브랜드 코드</td>
                    <td>브랜드 명</td>
                    <td>대표 명</td>
                    <td>연락처</td>
                    <td>회사 주소</td>
                    <td>이메일</td>
                    <td>입점 날짜</td>
                    <td>입점 유무</td>
                    <td class="tb-last">
                        <button type="button">수정</button>
                        <button type="button">삭제</button>
                    </td>
                </tr>

            </table>
        </div>

    </section>

</body>
</html>