<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/css/reset.css">
    <style>
        #ad_reviewListWrap {  }
        #ad_reviewListWrap h2 { text-align:center; font-size:24px; margin:20px 0; }
        #ad_reviewListWrap .ad_rvSearchWrap { background:#c7c4c4; text-align:center; padding:20px 0; }
        #ad_reviewListWrap .ad_rvSearchWrap span { display:inline-block; padding:0 10px; }
        #ad_reviewListWrap .ad_rvSearchWrap button { background:#808080; border:1px solid transparent; border-radius:5px; color:#fff; }


        #ad_reviewListWrap .ad_rvTableWrap { width:100%; margin:20px 0; border:1px solid #333; line-height:2; }
        #ad_reviewListWrap .ad_rvTableWrap table { width:100%; text-align:center; }


        #ad_reviewListWrap .ad_rvTableWrap table tr:first-child { background:#c7c4c4; }
        #ad_reviewListWrap .ad_rvTableWrap table tr {  border-bottom:1px solid #aaa; }
        #ad_reviewListWrap .ad_rvTableWrap table tr:last-child { border:none; }
        #ad_reviewListWrap .ad_rvTableWrap table th { font-size:16px; }

        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(1) { width:5%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(2) { width:20%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(3) { width:20%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(4) { width:10%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(5) { width:10%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(6) { width:5%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(7) { width:5%; }
        #ad_reviewListWrap .ad_rvTableWrap table th:nth-child(8) { width:20%; }

        #ad_reviewListWrap .ad_rvTableWrap table td { vertical-align: middle;  font-size:16px;  padding:6px 0; }
        #ad_reviewListWrap .ad_rvTableWrap table td:nth-child(3) { text-align:left; }
        #ad_reviewListWrap .ad_rvTableWrap table td.rv_tbImg {  }
        #ad_reviewListWrap .ad_rvTableWrap table td.rv_tbImg img { width:50px; }
    </style>
</head>
<body>
   	<%@ include file="../common/adminHeader.jsp" %>
    <div id="ad_reviewListWrap">
        <h2>리뷰 관리</h2>
        <div class="ad_rvSearchWrap">
            <form action="<%=request.getContextPath() %>/admin/AdminReviewSelect" method="GET">
                <span>
                    <label for="ad_rvId">아이디 : </label>
                    <input type="text" id="ad_rvId" name="ad_rvId" />
                </span>
                <span>
                    <label for="ad_rvPrdName">상품명 : </label>
                    <input type="text" id="ad_rvPrdName" name="ad_rvPrdName" />
                </span>
                <span class="ad_RvS_btnWrap">
                    <button type="submit">검색</button>
                </span>
            </form>
        </div>
        <!-- 상단 검색 영역 end -->
        <div class="ad_rvTableWrap">
            <!-- 인덱스 번호 / 상품 사진 / 상품 이름 / 제목 / 별점 / 회원 이름 / 조회수 / 리뷰 올린 날짜 -->
            <table>
                <tr>
                    <th>번호</th>
                    <th colspan="2">상품명</th>
                    <th>리뷰 제목</th>
                    <th>별점</th>
                    <th>회원명</th>
                    <th>조회수</th>
                    <th>리뷰 날짜</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td class="rv_tbImg"><img src="images/thumbnail/thumb001.jpg"></td>
                    <td>O01001</td>
                    <td>review test</td>
                    <td>★★★★★</td>
                    <td>김땡땡</td>
                    <td>0</td>
                    <td>2020/05/19</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td class="rv_tbImg"><img src="images/thumbnail/thumb002.jpg"></td>
                    <td>O01001</td>
                    <td>review test</td>
                    <td>★★★★★</td>
                    <td>김땡땡</td>
                    <td>0</td>
                    <td>2020/05/19</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td class="rv_tbImg"><img src="images/thumbnail/thumb003.jpg"></td>
                    <td>O01001</td>
                    <td>review test</td>
                    <td>★★★★★</td>
                    <td>김땡땡</td>
                    <td>0</td>
                    <td>2020/05/19</td>
                </tr>
            </table>
        </div>

    </div>

</body>
</html>