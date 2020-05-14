<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <style>
            #noticeArea{margin: auto; width: 90%;}

            h3{font-weight:bold; font-size: 40px;}

            #search{width: 500px; height: 30px; border: 1px solid black; border-radius: 7px; margin-right: 30px;}
            #searchBtn{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}

            #noticelistArea{width: 100%; margin-top: 40px; border: 1px solid rgb(208, 206, 206); border-collapse: collapse;}
            #noticelistArea>tbody>tr{border-bottom: 2px solid black; height: 30px;}
            #noticelistArea>tbody>tr>td{text-align: center;}
            #noticelistArea>tbody:first-child{height: 80px;}
            
            .pageBtn{margin-top: 10px;}
            .pageBtn>button{border: 0px; width: 30px; height: 30px; font-weight: 600; size: 10px;}

        </style>
        

    </head>
    <body>
    
    	<%@ include file="../common/adminHeader.jsp" %>
    	
        <section id="noticeArea">
            <h3>LIST Search</h3>
            <input type="text" id="search" placeholder="검색어를 입력해주세요"> <input type="submit" id="searchBtn" value="SEARCH">
            
            <table id="noticelistArea">
                <tbody>
                    <tr>
                        <th>NO</th> <th>제목</th> <th>작성자</th> <th>날짜</th> <th>삭제여부</th>
                    </tr>

                    <!---->
                    <tr>
                        <input type="hidden" onclick="">
                        <td>1</td> <td>공지사항</td> <td>홍길동</td> <td>2020/01/01</td> <td>Y</td>
                    </tr>
                </tbody>
            </table>

            <div class="pageBtn" align="center">
                <button  onclick="";> < </button>

                <button  onclick="";> 1<!--페이지버튼--></button>

                <button  onclick="";> > </button>
            </div>
            
        </section>
    </body>
</html>