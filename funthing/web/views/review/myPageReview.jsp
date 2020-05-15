<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <script src = "../js/jquery-3.4.1.min.js"></script>
        <style>
            #noticeArea{margin: auto; width: 90%;}

            h3{font-weight:bold; font-size: 40px;}

            #search{width: 500px; height: 30px; border: 1px solid black; border-radius: 7px; margin-right: 30px;}
            #searchBtn{height: 33px; width: 80px; border: 0px; border-radius: 7px; background-color: gray; color: white;}

            #noticelistArea{width: 100%; margin-top: 40px; /*border: 1px solid rgb(208, 206, 206);*/ border-collapse: collapse;}
            #noticelistArea>tbody>tr{border-bottom: 2px solid black; height: 30px;}
            #noticelistArea>tbody>tr>td{text-align: center;}
            #noticelistArea>tbody:first-child{height: 80px;}
            
            .pageBtn{margin-top: 10px;}
            .pageBtn>button{border: 0px; width: 30px; height: 30px; font-weight: 600; size: 10px;}
            .hansol{width: 100%; height: 150px; background-color:cornsilk; display: none;}
            tr{width: 100%;}
            th,td{float: left; margin-right: 50px;}
        </style>
        

    </head>
    <body>
    	
    	<%@ include file="../common/header.jsp" %>
    	
    	<%@ include file="../common/myPageHeader.jsp" %>
    
    	<div id="content">
		<!-- 오른쪽 컨텐츠 영역 -->
		<%@ include file="../common/myPageSide.jsp"%>
		<div id="r-cont">
			<!-- 오른쪽 컨텐츠 수정 영역  -->
    
    
        <section id="noticeArea">
            <h3>REVIEW Search</h3>
            <input type="text" id="search" placeholder="검색어를 입력해주세요"> <input type="submit" id="searchBtn" value="SEARCH">
            
            <table id="noticelistArea">
                <tbody>
                    <tr>
                        <th>NO</th>
                        <th>제목</th>       
                    </tr>
                   
                    <!---->
                    <tr>
                        <input type="hidden">
                        <td>1</td>
                        <td>공지사항</td>                         
                    </tr>
                    <tr>
                        <td colspan="2" class="hansol">공지사항입니다</td>
                    </tr>
                </tbody>
            </table>

            <div class="pageBtn" align="center">
                <button  onclick="";> < </button>

                <button  onclick="";> 1<!--페이지버튼--></button>

                <button  onclick="";> > </button>
            </div>
            
        </section>

        <script>
            $(function(){
                $('tr').click(function(){
                $(this).next('tr').children().slideToggle(500);
                });
          });
        </script>
        </div>
        </div>
        
        
        <%@ include file="../common/footer.jsp" %>
        
    </body>
</html>