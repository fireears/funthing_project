<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "member.model.vo.Member"%>
    
<%
	Member member = (Member)request.getAttribute("member");

	String userId = member.getmId();
	String userPwd = member.getmPwd();
	String userName = member.getmName();
	String email = member.getmEmail() != null ? member.getmEmail() : "";
	String phone = member.getmTell() != null ? member.getmTell() : ""; 
	String year = (String)request.getAttribute("year");
	String mon = (String)request.getAttribute("mon");
	String day = (String)request.getAttribute("day");
	/* String birth = member.getbDay() != null ? member.getbDay() : ""; */
	String reference = member.getReference() != null ? member.getReference() : "";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

		body {
			position:relative !important;
		}
		#modify{
			margin:0 auto;
			width:700px
			
		}
        #joinform{
                width: 700px;
                margin: 0 auto;
            }
        #joinForm #modi{
                margin: 0;
                padding:0;
                width: 700px;
                border-top: 1px solid #444444;
                border-collapse: collapse;
            }
         #modi tr td {
                border-bottom: 1px solid #444444;
                padding: 10px;
            }
           #modi #lab{
                background-color: lightgray;
                color: black;
                text-align: center;
                padding: 10px;   
            }
           #modi #inp{
               padding: 10px;
               padding-left: 110px;
               padding-right: 100px;
            }
           #modi tr td input{
                border-radius: 5px;
                height: 30px;
                width: 280px;
            }
            #birth select{
              height: 30px;
              border-radius: 5px;
              width: 80px;
              float: left;
              margin-left: 3px ;
           }
           #h2{
               margin-left: 20px;
           }
           #h3{
               float: left;
               margin-left: 20px;
           }
           #hh5{
               float:right;
               margin-bottom: 0;
               color: lightgray;
           }
           #agr{
               
               margin-left: 20px;
           }
           input::-webkit-input-placeholder { 
                color: lightgray; 
            }
    </style>
</head>
<body>
	<%@ include file="../common/header.jsp" %>
	
	<%@ include file="../common/myPageHeader.jsp" %>

	<div id="content">
        <!-- 오른쪽 컨텐츠 영역 -->
	<%@ include file="../common/myPageSide.jsp" %>
			<div id="r-cont"> 
			
			<div id=modify>
			<form id="joinForm" method="post" action="<%=request.getContextPath() %>/update.me?mNo=<%=member.getmNo()%>">
		            <h2 id="h2">정보수정</h2>
		            <hr>
		            <h3 id="h3">기본정보</h3>
		            <br>
		            <h5 id="hh5">*은 반드시 적어야 하는 항목</h5>
		            <table id="modi">
		                <tr>
		                    <td id="lab">
		                        <label>*아이디</label>
		                    </td>
		                    <td id="inp">
		                        <input type="text" id="userId" name="userId" required placeholder="4글자 이상 12글자 이하 영문자(소문자)와 숫자" value="<%=userId%>">
		                        <input type="button" id="idCheck" value="중복확인" style="width: 70px; background: darkgrey; color: white;" onclick="openIdChk()">
		                    </td>
		                </tr>
		                <tr>
		                    <td id="lab">
		                        <label>*비밀번호</label>
		                    </td>
		                    <td id="inp"> 
		                        <input type="password" id="userPwd" name="userPwd" required placeholder="6글자 이상 18글자 이하 영문자(소문자)와 숫자" value="<%=userPwd %>" disabled>
		                    </td>
		                </tr>
		               	<!-- <tr>
		                    <td id="lab"> 
		                        <label>*비밀번호 확인</label>
		                    </td>
		                    <td id="inp"> 
		                        <input type="password" id="pwd_check" name="pwd_check" required>
		                    </td>
		                </tr> -->
		                <tr>
		                    <td id="lab">
		                        <label>*이름</label>
		                    </td>
		                    <td id="inp">
		                        <input type="text" id="userName" name="userName" required placeholder="한글로 2글자 이상" value="<%= userName %>">
		                    </td>
		                </tr>
		                <tr>
		                    <td id="lab">
		                        <label>*이메일</label>
		                    </td>
		                    <td id="inp">
		                        <input type="email" id="email" name="email" required value="<%=email %>">
		                    </td>
		                </tr>
		                <tr>
		                    <td id="lab">
		                        <label>*휴대폰</label>
		                    </td>
		                    <td id="inp">
		                        <input type="tel" id="phone" name="phone" required placeholder="-제외 하고 입력" value="<%=phone%>">
		                    </td>
		                </tr>
		                <tr>
		                    <td id="lab">
		                    <label>*생년월일</label>
		                    </td>
		                    <td id="inp">
		                        <div id="birth">
		                            <select id="year" name="year" required >
		                                <option value="년">년</option>
		                                <option value="2020">2020</option>
		                                <option value="2019">2019</option>
		                                <option value="2018">2018</option>
		                                <option value="2017">2017</option>
		                                <option value="2016">2016</option>
		                                <option value="2015">2015</option>
		                                <option value="2014">2014</option>
		                                <option value="2013">2013</option>
		                                <option value="2012">2012</option>
		                                <option value="2011">2011</option>
		                                <option value="2010">2010</option>
		                                <option value="2009">2009</option>
		                                <option value="2008">2008</option>
		                                <option value="2007">2007</option>
		                                <option value="2006">2006</option>
		                                <option value="2005">2005</option>
		                                <option value="2004">2004</option>
		                                <option value="2003">2003</option>
		                                <option value="2002">2002</option>
		                                <option value="2001">2001</option>
		                                <option value="2000">2000</option>
		                                <option value="1999">1999</option>
		                                <option value="1998">1998</option>
		                                <option value="1997">1997</option>
		                                <option value="1996">1996</option>
		                                <option value="1995">1995</option>
		                                <option value="1994">1994</option>
		                                <option value="1993">1993</option>
		                                <option value="1992">1992</option>
		                                <option value="1991">1991</option>
		                                <option value="1990">1990</option>
		                                <option value="1989">1989</option>
		                                <option value="1988">1988</option>
		                                <option value="1987">1987</option>
		                                <option value="1986">1986</option>
		                                <option value="1985">1985</option>
		                                <option value="1984">1984</option>
		                                <option value="1983">1983</option>
		                                <option value="1982">1982</option>
		                                <option value="1981">1981</option>
		                                <option value="1980">1980</option>
		                                <option value="1979">1979</option>
		                                <option value="1978">1978</option>
		                                <option value="1977">1977</option>
		                                <option value="1976">1976</option>
		                                <option value="1975">1975</option>
		                                <option value="1974">1974</option>
		                                <option value="1973">1973</option>
		                                <option value="1972">1972</option>
		                                <option value="1971">1971</option>
		                                <option value="1970">1970</option>
		                                <option value="1969">1969</option>
		                                <option value="1968">1968</option>
		                                <option value="1967">1967</option>
		                                <option value="1966">1966</option>
		                                <option value="1965">1965</option>
		                                <option value="1964">1964</option>
		                                <option value="1963">1963</option>
		                                <option value="1962">1962</option>
		                                <option value="1961">1961</option>
		                                <option value="1960">1960</option>
		                                <option value="1959">1959</option>
		                                <option value="1958">1958</option>
		                                <option value="1957">1957</option>
		                                <option value="1956">1956</option>
		                                <option value="1955">1955</option>
		                                <option value="1954">1954</option>
		                                <option value="1953">1953</option>
		                                <option value="1952">1952</option>
		                                <option value="1951">1951</option>
		                                <option value="1950">1950</option>
		                            </select>
		                            <select id="mon" name="mon" required >
		                                <option value="월">월</option>
		                                <option value="01">01</option>
		                                <option value="02">02</option>
		                                <option value="03">03</option>
		                                <option value="04">04</option>
		                                <option value="05">05</option>
		                                <option value="06">06</option>
		                                <option value="07">07</option>
		                                <option value="08">08</option>
		                                <option value="09">09</option>
		                                <option value="10">10</option>
		                                <option value="11">11</option>
		                                <option value="12">12</option>
		                            </select>
		                            <select id="day" name="day" required>
		                                <option value="일">일</option>
		                                <option value="01">01</option>
		                                <option value="02">02</option>
		                                <option value="03">03</option>
		                                <option value="04">04</option>
		                                <option value="05">05</option>
		                                <option value="06">06</option>
		                                <option value="07">07</option>
		                                <option value="08">08</option>
		                                <option value="09">09</option>
		                                <option value="10">10</option>
		                                <option value="11">11</option>
		                                <option value="12">12</option>
		                                <option value="13">13</option>
		                                <option value="14">14</option>
		                                <option value="15">15</option>
		                                <option value="16">16</option>
		                                <option value="17">17</option>
		                                <option value="18">18</option>
		                                <option value="19">19</option>
		                                <option value="20">20</option>
		                                <option value="21">21</option>
		                                <option value="22">22</option>
		                                <option value="23">23</option>
		                                <option value="24">24</option>
		                                <option value="25">25</option>
		                                <option value="26">26</option>
		                                <option value="27">27</option>
		                                <option value="28">28</option>
		                                <option value="29">29</option>
		                                <option value="30">30</option>
		                                <option value="31">31</option>
		                            </select>
		                        </div>
		                    </td>
		                </tr>
		               <!--  <tr>
		                    <td id="lab">
		                        <label>추천인</label>
		                    </td>
		                    <td id="inp">
		                        <input type="text" id="reference" name="reference">
		                    </td>
		                </tr> -->
		            </table>
		            <br>
		            <br>
		
		            <div style="text-align: center;">
		                <input type="submit" value="수정" id="submit_btn" style="width: 90px; height: 40px; color: white; background: darkgrey; border-radius: 7px;" onclick="insertCheck()">
		                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
		                <input type="button" value="취소" id="cancel" onclick=cancle(); style="width: 90px; height: 40px; color: black; background-color: lightgray; border-radius: 7px;">
		            </div>
		        </form>
		            </div>
	            </div>
            </div>
            
    <%@ include file="../common/footer.jsp" %>
        <script>
        	// 취소 버튼
        	function cancle(){
        		location.href="<%=request.getContextPath()%>/myPageMainServlet?userNoM=<%=member.getmNo()%>";
        	}
        	
        	$(function(){
       			
        		// 생년월일
       			$("#year").val("<%=year%>").prop("selected",true);
       			$("#mon").val("<%=mon%>").prop("selected",true);
       			$("#day").val("<%=day%>").prop("selected",true);
       			
       			// 아이디 정규화
	            $("#userid").change(function(){
	                    var value = $("#userid").val();
	                    var reg = /^[a-z0-9]{4,12}$/;
	                    if(!reg.test(value)){
	                        alert("영문자와 숫자로 4글자 이상 12글자 이하여야 합니다.");
	                        $("#userid").focus().val('');
	                    }
	                });
       			
       			// 비밀번호 정규화
                $("#userpwd").change(function(){
                    var value = $("#userpwd").val();
                    var reg = /^[a-z0-9]{6,18}$/;
                    if(!reg.test(value)){
                        alert("영문자와 숫자로 6글자 이상 12글자 이하여야 합니다.");
                        $("#userpwd").focus().val('');
                    }
                });
       			
       			// 비밀번호 확인
                $("#pwd_check").change(function(){
                    var pw1 = $("#userpwd").val();
                    var pw2 = $("#pwd_check").val();
                    
                    if(pw1 == pw2){
                        $("#pwd_check").val();
                    }else{
                        alert("비밀번호가 일치하지 않습니다.");
                        $("#pwd_check").focus().val('');
                    }
                });
       			
       			// 이름
                $("#username").change(function(){
                    var value = $("#username").val();
                    var reg = /^[가-힣]{2,4}$/;
                    
                    if(!reg.test(value)){
                        alert("한글로 2글자 이상 입력해주세요.");
                        $("#username").focus().val('');
                    }
                });
       			
       			// 휴대폰
                $("#phone").change(function(){
                    var value = $("#phone").val();
                    var reg = /^[0-9]{11}$/;
                    
                    if(!reg.test(value)){
                        alert("-를 제외한 숫자만을 입력해 주세요.");
                        $("#phone").focus().val('');
                    }
                });
	                
        	});
        	
        	 // ajax!
                $(function(){
                	// 중복체크 버튼에 대해 ajax처리
                	
                	$("#idCheck").click(function(){
                		var userId = $("#joinForm input[name='userId']");
                		console.log(userId);
                		if(!userId || userId.val().length < 4){
                			userId.focuse();
                		}else{
                			$.ajax({
                				url:"<%= request.getContextPath()%>/idCheck.me",
                				type:"post",
                				data:{userId:userId.val()},
                				success:function(data){
                					if(data == 'fail'){
                						alert("아이디가 중복됩니다.");
                						userId.focus();
                					}else{
                						alert("아이디가 사용가능합니다.");
                						
                						
                					}
                				},
                				error:function(data){
                					console.log("서버 통신 안됨");
                				}
                			});
                		}
                	});
                	
                });
        </script>
</body>
</html>