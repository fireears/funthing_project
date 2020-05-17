<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
        
 		<script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
        <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
        
        <style>
            #chartContainer{height: 600px; margin: auto; width: 50%;}
            table{
                border-collapse:collapse;
            }
            th{
                background-color:rgb(219, 216, 216);
            }
            td{
                text-align: center;
            }
            label {
                display: block;
                font: 1rem 'Fira Sans', sans-serif;
            }

            input,
            label {
                margin: .4rem 0;
            }
            h2{
            	text-align:center;
            }

            /* 추가 css */
            #graphWrap { width:70%; margin:0 auto; }
            #g_button_area { width:100%; border:1px solid #aaa; line-height:3; }
            #g_button_area table { border-collapse: collapse; width:100%; }
            #g_button_area tr:first-child td { border-bottom:1px solid #aaa; }
            #g_button_area tr:first-child td:last-child { border-bottom:none; border-left:1px solid #aaa; width:20%;  }

            #g_button_area tr:last-child td:nth-of-type(2) { width:20%; }
            #g_button_area tr:last-child td:nth-of-type(4) { width:40%; }
            #g_button_area tr:first-child button { width:100px; height:36px; }
            #g_button_area tr:first-child input {  height:46px; width:140px; }
            #graphWrap #g_button_area tr.g_title, #graphWrap #g_button_area td.g_title { background:#ddd; width:10%; }


        </style>
</head>
<body>
<%@ include file="/views/common/adminHeader.jsp" %>
<h2>상품통계</h2>
  <div id="graphWrap">
            <form>
            <script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
        	<script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
                <div id="g_button_area">
                    <table>
                        <tr>
                            <td class="g_title">기간별</td>
                            <td colspan="3">
                                <button value="day">일간</button>
                                <button value="day">주간</button>
                                <button value="day">월간</button>
                                <button value="day">분기별</button>
                                <input type="date" id="start" name="start"
                                value="2020-01-01"
                                min="2010-01-01" max="2021-12-31"> ~ 
                                <input type="date" id="end" name="end"
                                value="2020-01-01"
                                min="2010-01-01" max="2021-12-31">
                            </td>
                            <td rowspan="2" colspan="2" class="g_btn_submit">
                                <input type="submit" value="조회">
                            </td>
                        </tr>
                        <td class="g_title">성별</td>
                        <td>
                            <input type = "radio" values="all" id="gender">전체
                            <input type = "radio" values="male" id="gender">남자
                            <input type = "radio" values="female" id="gender">여자
                        </td>
                        <td class="g_title">카테고리별</td>
                        <td>
                            <input type = "checkbox" values="outer">겉옷
                            <input type = "checkbox" values="outer">상의
                            <input type = "checkbox" values="outer">하의
                            <input type = "checkbox" values="outer">데님
                            <input type = "checkbox" values="outer">원피스
                        </td>
                    </tr>
                    </table>
                </div>

                <div id="chartContainer" style="height: 500px; width: 100%; "></div>     <!-- 그래프 js 호출 -->       

                <script>
                window.onload = function () {

                    var options = {
                    
                        data: [{
                            type: "column",
                            yValueFormatString: "#,###",
                            indexLabel: "{y}",
                                color: "#546BC1",
                            dataPoints: [
                                { label: "brand1", y: 100 },
                                { label: "brand2", y: 50 },
                                { label: "brand3", y: 80 },
                                { label: "brand4", y: 90 },
                                { label: "brand5", y: 40 },
                                { label: "brand6", y: 20 },
                                { label: "brand7", y: 120 }
                            ]
                        }]
                    };
                    $("#chartContainer").CanvasJSChart(options);
                    
                    function updateChart() {
                        var performance, deltaY, yVal;
                        var dps = options.data[0].dataPoints;
                        for (var i = 0; i < dps.length; i++) {
                            deltaY = Math.round(0 );
                            yVal = deltaY + dps[i].y > 0 ? dps[i].y + deltaY : 0;
                            dps[i].y = yVal;
                        }
                        options.data[0].dataPoints = dps;
                        $("#chartContainer").CanvasJSChart().render();
                    };
                    updateChart();
                    
                    setInterval(function () { updateChart() }, 500);
                    
                    }
                </script>



            </form>
        </div>
</body>
</html>