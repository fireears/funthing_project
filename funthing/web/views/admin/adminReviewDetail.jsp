<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="review.model.vo.*"%>
    <% Review rv = (Review)request.getAttribute("rv"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	#review_detail { width:100%; text-align:center; }
	#review_detail h2 { text-align:center; padding:20px 0; }
	#review_detail table { width:100%; border-collapse:collapse; }
	
	#review_detail table th { background:#ddd; border:1px solid #aaa; }
	#review_detail table td { border:1px solid #aaa; padding:10px 0; }
	
	#review_detail table .thumb img { height:200px; }
	
	#review_detail table .content { text-align:left; box-sizing:border-box; padding:20px; }
	#review_detail .backBtn { width:300px; height:50px; margin:20px 0; }
	
</style>
<body>
	<%@ include file="../common/adminHeader.jsp"%>
	<div id="review_detail">
		<h2>리뷰 상세 관리</h2>
		<table>
			<tr>
				<th>작성자 회원번호</th>
				<td><%=rv.getmNo() %></td>
				<th>작성자 아이디</th>
				<td><%=rv.getRvmId() %></td>
				<th>작성자 이름</th>
				<td><%=rv.getRvName() %></td>
			</tr>
			<tr>
				<th>리뷰 게시글 번호</th>
				<td><%=rv.getRevNo() %></td>
				<th>리뷰 제목</th>
				<td><%=rv.getRevTitle() %></td>
				<th>별점</th>
				<td><%=rv.getRate() %></td>
			</tr>
			<tr>
				<th rowspan="2">상품 이미지</th>
				<td rowspan="2" class="thumb"><img src="<%=request.getContextPath()%>/images/thumbnail/<%=rv.getRvThumb() %>.jpg"></td>
				<th>품번</th>
				<td><%=rv.getpNo() %></td>
				<th>주문번호</th>
				<td><%=rv.getRevONo() %></td>
			</tr>
			<tr>
				<th>리뷰 내용</th>
				<td colspan="5">
				
					<div class="content">
						<%if(rv.getRevPic().isEmpty()){ %>
							<img src="<%=request.getContextPath()%>/images/review/<%=rv.getRevPic() %>.jpg"><br/>
						<%} %>
						<%=rv.getRevContents() %>
						
					</div>
				</td>
			</tr>
		</table>
		<button class="backBtn" onclick="location.href='<%=request.getContextPath() %>/admin/AdminReviewSelect'">돌아가기</button>
	</div>

</body>
</html>