<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>


        <style>
          table {
            width: 70%;
            border-top: 1px solid #444444;
            border-collapse: collapse;
            float: right;
            }
            th, td {
                border-bottom: 1px solid #444444;
                padding: 10px;
            }
            input{
                margin-left: 25px;
                margin-right: 25px;
            }
            .han{
                background-color: #e7e7e7;
                text-align: center;
            }
            #hahn{
                background-color: #444444;
                color: aliceblue;
                margin-left: 25;
            }
            span{
                margin-top: 20px;
                margin-bottom: 30px;
                border-bottom: 1px solid #444444;
                border-top: 1px solid #444444;
                width: 70%;
                float: right;
            }
        </style>
        
        
    </head>
    <body>
    
    	<%@ include file="../common/adminHeader.jsp" %>
    
        <span>
        <h3>공지사항 쓰기</h3>
    </span>
        <table>
            <form method="get" action="<%=request.getContextPath()%>/admin/noticeWriter">
            <br><br>
            <tr>
                <td class="han">제목</td>
                <td><input type="text" name="name" size="70" placeholder="내용을 입력해주세요"></td>
            </tr>
            <tr>
                <td class="han">본문</td>
                <td><textarea name="content" rows="10" cols="100" placeholder="내용을 입력해주세요"></textarea></td>
            </tr>
            <tr>
                <td colspan="2"> 
                    <div align="center">
                        <input class="han" type="button" value="이전으로">
                        <input class="han" type="submit" value="저장">
                    </div>

                </td>
            </tr>
            </form>
        </table>

    </body>
        
   
    