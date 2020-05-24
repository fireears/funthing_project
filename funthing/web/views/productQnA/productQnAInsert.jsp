<!-- 상품문의 페이지(클라이언트)_혜린  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.*"%>
<%

	String pName = request.getParameter("pName");
	String bName = request.getParameter("bName");
	String pNo = request.getParameter("pNo");
	String bNo = request.getParameter("bNo");
	String color = request.getParameter("color");
	String size = request.getParameter("size");
			
	

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    <script src="https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit"
    async defer></script>
    <style>
        .qna11 .q1_title h2 { color:#0f4a7e; line-height:3; border-top:1px solid #aaa; border-bottom:1px solid #aaa; }
        .q1_wrap { margin-top:40px;  }
        .q1_wrap table { border-collapse: collapse; width:100%; border-top:2px solid #aaa; border-bottom:2px solid #aaa; }
        .q1_wrap table tr { border-bottom:1px solid #aaa; width:100%; }
        .q1_wrap table tr td:nth-child(1) { width:30%; box-sizing:border-box; padding-left:20px; line-height:3; font-weight:700; background:#eee; color:#0f4a7e; }   
        .q1_wrap table tr td:nth-child(2) { width:70%; box-sizing:border-box; padding:8px 14px 8px; }
        .q1_wrap table button { width:80px; height:26px; line-height:26px; background:#0f4a7e; border:1px solid #aaa; color:#fff; margin-left:10px; }

        .q1_wrap .q1_text { font-size:14px; color:#777; }
        .q1_wrap input { height:24px; width:100%; }
        .q1_wrap textarea { resize: none; width:100%; }

        .q1_wrap .q1_btnArea { width:100%; text-align:center; margin-top:20px; }
        .q1_wrap .q1_btnArea .btn { margin:0 3px; width:160px; height:60px; font-size:16px; border:1px solid #ddd; background:#eee; }
        .q1_wrap .q1_btnArea .btn.submit { background:#0f4a7e; border:1px solid #aaa; color:#fff; }
    </style>
</head>
<body>
	 
	<%@ include file="../common/header.jsp" %>
	
	<%@ include file="../common/myPageHeader.jsp" %>

	<div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
	<div id="r-cont"> 
	
	
    <div class="qna11">
        <div class="q1_title">
            <h2>상품 문의</h2>

            <div class="q1_wrap">
                <form action="<%=request.getContextPath()%>/productQnaInsert" method="post">
                    <input type="hidden" name="mNo" value="<%=loginUser.getmNo() %>"> <!-- loginUser2.getmNo()  -->
                     <input type="hidden" name="pName" value="<%=pName %>">
                     <input type="hidden" name="misPNo" value="<%=pNo %>">
                     <input type="hidden" name="bNo" value="<%=bNo %>">
                     <input type="hidden" name="color" value="<%=color %>">
                     <input type="hidden" name="size" value="<%=size %>">
                     <input type="hidden" name="pNo" value="<%=pNo %><%=color %><%=size %>">
                    <table>
                        <tr>
                      		
                            <td>제목</td>
                            <td><input type="text" id="q1_tit" name="q1_tit" placeholder="제목을 입력하세요"/></td>
                        </tr>
                        <tr>
                            <td>상품명</td>
                            <td><span><%= pName %></span><!-- 상품번호 불러오기  -->
                        </tr>
                         <tr>
                            <td>브랜드명</td>
                            <td><span><%= bName %></span><!-- 브랜드번호 불러오기  -->
                        </tr>
                        <tr>
                            <td>작성자</td>
                            <td><%=loginUser.getmName() %></td>
                        </tr>
                        <tr>
                            <td>본문</td>
                            <td>
                                <textarea id="q1_cont" name="q1_cont"  rows="10"></textarea>
                                <p class="q1_text">해당글은 비밀글로만 작성이 됩니다.</p>
                            </td>
                        </tr>
                        <tr>
                            <!-- <td>자동등록방지</td>
                            <td>
                               <div class="g-recaptcha" data-sitekey="6Lc-LfUUAAAAALl4aAS6eP84F_e8L8T1Xjj17L_X"></div>
                           		체크 확인 될 경우 #recaptcha-accessible-status, .rc-anchor-aria-status의 텍스트가 인증 필요  > 확인됨으로 바뀐다
                           input type="submit" value="Submit">
                           자동 등록 방지 들어오는지 확인하는 스크립트라 주석처리함
                           script type="text/javascript">
                               var onloadCallback = function() {
                                 alert("grecaptcha is ready!");
                               };
                             </script  
                            </td> -->
                        </tr>
                    </table>
                    <div class="q1_btnArea">
                        <button type="submit" class="btn submit">등록</button>
                        <button type="reset" class="btn cancel">취소</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    </div>
    </div>
    
    <%@ include file="../common/footer.jsp" %>
    
</body>
</html>