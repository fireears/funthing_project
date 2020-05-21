<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg");
%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <title></title>
        <script src = "../../js/jquery-3.4.1.min.js"></script>
        <style>
            h2{
                text-align: center;
            }
            table{
                width: 600px;
                /* text-align: center; */
            }
            a{
                text-decoration:none;
                color:  lightgray;
            }
            input::-webkit-input-placeholder { 
                color: lightgray; 
            }
            
             .cont {
			width: 1460px;
			margin: 0 auto;
			}
			
			.cont form {
				width: 600px;
				margin: 0 auto;
				/* border: 1px solid black; */
				text-align: center;
			}
			.p{
				    vertical-align: middle;
            }
            
        </style>
    </head>
    <body>
    
    	<%@ include file="../common/header.jsp" %>
    	
        <div style="padding: 20px; background: lightgray; margin: 0 auto; text-align: center;">
            아이디 찾기
        </div>
        <br>
        <br>
        <br>
        <br>
        
        <div class="cont">
        <form method="get" action="<%=request.getContextPath()%>/searchId.me">
            <h2>아이디 찾기</h2>
            <hr style="height: 5px; background: black;">
            <br>
            <input type="radio" name="idchk" id="emailchk" value="1" style="zoom: 1.5;" checked="checked">
            <label>이메일</label>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="radio" name="idchk" id="phonechk" value="2" style="zoom: 1.5;">
            <label>휴대폰 번호</label>
            <hr>
            <br>
            <div>
                <table>
                    <tr class="p">
                        <td class="p">
                            <input type="text" id="userName" name="userName" style=" height: 30px; width: 400px; border-radius: 8px;" placeholder="이름를 입력하세요.">
                        </td>
                        <td rowspan="2">
                            <input type="submit" id="btn1" value="아이디 찾기" style="height: 100px; width: 180px; color: white; border-radius: 8px; background: darkgrey;">
                        </td>
                        
                    </tr>
                    <tr id="email">
                        <td>
                            <input type="email" id="email1" name="email" style=" height: 30px; width: 210px; border-radius: 8px;"  placeholder="이메일을 입력해주세요">
                            <select name="email" id="selectEmail" onchange="emailSelect" style=" height: 35px; width: 180px; border-radius: 8px;">
                                <option value ="">직접입력</option>
                                <option value="@naver.com">@naver.com</option>
                                <option value="@gmail.com">@gmail.com</option>
                                <option value="@hanmail.net">@hanmail.net</option>
                                <option value="@daum.net">@daum.net</option>
                                <option value="@nate.com">@nate.com</option>
                            </select>
                        </td>       
                    </tr>
                    <tr id="phone" style="display: none;">
                        <td>
                            <input type="tel" id="phone1" name="phone" style="width: 400px; height: 30px; border-radius: 8px;" placeholder="-빼고 입력해주세요">
                        </td>       
                    </tr>
                </table>
            </div>
            
            <br>
            <hr>
            <br>
            <div style="text-align: center;"> 
                <input type="button" id="pwd" value="비밀번호 찾기" style=" width: 200px; height: 40px; border-radius: 8px; font-size: 16px; background: lightgray;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="button" id="login" value="로그인하기" style=" width: 200px; height: 40px; border-radius: 8px; background: darkgrey; font-size: 16px; color: white;">
            </div>
        </form>
        </div>
		<script>
		$(function(){
			
		 <%if(msg != null){%>
			alert("<%=msg%>");
		 <%}%>
		});
		</script>
        

        <script>
        	// 라디오 버튼 선택
             $('input[type=radio][name=idchk]').on('click',function(){
            var chkValue = $('input[type=radio][name=idchk]:checked').val();

            if(chkValue == 1){
                $('#email').css('display','block');

                $('#phone').css('display','none');
            }else if(chkValue == 2){
                $('#email').css('display','none');

                $('#phone').css('display','block');
            }
        });
        $(function(){
             	// 휴대폰 정규화
                $("#phone1").change(function(){
                    var value = $("#phone1").val();
                    var reg = /^[0-9]{11,11}$/;
                    
                    if(!reg.test(value)){
                        alert("-를 제외한 숫자만을 입력해 주세요.");
                        $("#phone1").focus().val('');
                    }
                });
             	// 이름 정규화
                $("#userName").change(function(){
                    var value = $("#userName").val();
                    var reg = /^[가-힣]{2,4}$/;
                    
                    if(!reg.test(value)){
                        alert("한글로 2글자 이상 입력해주세요.");
                        $("#userName").focus().val('');
                    }
                });
                
            	// 로그인으로 이동
                $("#login").click(function(){
                	location.href="<%= request.getContextPath()%>/views/member/memberLogin.jsp";
                });
                // 비밀번호 찾기로 이동
                $("#pwd").click(function(){
                	location.href="<%= request.getContextPath()%>/views/member/searchPwd1.jsp";
                });
                // 이메일 선택(미완성..)
                $("#selectEmail").change(function(){
                var sum = $("#email1").val()+$("#selectEmail").val();
                $("#email1").val(sum);
                
                })
        })
       

        
        
       
        </script>
        
        <%@ include file="../common/footer.jsp" %>
        
    </body>
</html>