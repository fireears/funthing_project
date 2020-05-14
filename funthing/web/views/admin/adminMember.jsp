<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
        <style>
            div{
                background-color: lightgray;
            }
            table{
                margin: auto;
                width: 800px;
            }
            #table2{
                margin: auto;
                width: 1500px;
                border-top: 1px solid #444444;
                border-collapse: collapse;
                
            }
            #table2 tr th{
                padding: 10px;
            }
            #table2 tr td{
                text-align: center;
                padding: 10px;
            }
            #table2 th, td {
                border-bottom: 1px solid #444444;
                padding: 10px;
            }     
            #d{
                border: 0;
                padding: 10;
            }
            #f{
                border-left: 1px solid #444444;
            }
            h2{
                text-align: center;
            }
        </style>
    </head>
    <body>
    
    	  <%@ include file="../common/adminHeader.jsp" %>
    	
        <h2>회원관리</h2>
        <br><br>
        <div>
            <table>
                <tr>
                    <td id="d"><laebl class="search">회원 이름 : </laebl></td>
                    <td id="d"><input type="text" id="userName"></td>
                    <td id="d"><label class="search">회원 아이디 : </label></td>
                    <td id="d"><input type="text" id="userId"></td>
                    <td id="d"><input type="button" value="조회하기"></td>
                </tr>
            </table>
        </div>
        <br><br><br>
        <form>   
            <table id="table2">
                <tr>
                    <th>회원번호</th>
                    <th>아이디</th>
                    <th>성명</th>
                    <th>생년월일</th>
                    <th>이메일</th>
                    <th>휴대폰번호</th>
                    <th>회원가입날짜</th>
                    <th>추천인</th>
                    <th>알람수신동의여부</th>
                    <th>등급코드</th>
                    <th>적립금</th>
                    <th>누적결제금액</th>
                    <th>회원탈퇴유무</th>
                    <th id="f">변경</th>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td id="f"><input type="button" value="수정"></td>
                </tr>
            </table>
        </form>
    </body>

</html>