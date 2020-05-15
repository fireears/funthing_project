<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <title></title>
    <!-- <script src="../js/jQuery-3.4.1.min.js"></script> -->

    <script src="https://kit.fontawesome.com/39b470622c.js" crossorigin="anonymous"></script>
<style>
        body {
            width: 100%;
            font-family:  'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif; 
        }

        ul {
            padding: 0;
        }

        li {
            list-style: none;
            padding:5px;
        }

        #brand{
            font-weight: 800;
            color:#30586e;
        }
        #name{
            padding-bottom: 5px;
             border-bottom: 1.5px solid #30586e;
        }
        #product_description{
            font-size:small;
        }
        #prod-detail {
            width: 1200px;
            margin: 0 auto;
        }

        #prod-detail:after {
            content: "";
            clear: both;
            display: block;
        }

        #photo {
            width: 100%;
            height: 30%;

        }

        #photo_area {
            float: left;
            width: 30%;
        }

        #p_detalis {
            float: left;
            width: 50%;
            box-sizing: border-box;
            padding: 0 0 0 40px;
        }

        #right_wrap {}

        #right_wrap:after {
            content: "";
            clear: both;
            display: block;
        }

        #right_wrap ul {}

        #right_wrap ul li {}

        #right_wrap ul li:after {
            content: "";
            clear: both;
            display: block;
        }

        #right_wrap ul li .price_left {
            float: left;
            font-style: normal;
        }

        #right_wrap ul li .price_right {
            float: right;
        }

        .price {
            float: left;
            width: 40%;
            box-sizing: border-box;
            padding-right: 5%;
        }

        .buy_information {
            float: left;
            width: 50%;
        }

        .price_dis{
            color:red;
        }

        #color{
            width: 250px;
            height: 30px;
        }

        #num{
            width: 245px;
            height: 25px;
        }

        #by_now, #shopping_bag{
            background:#9fa5a8;
            color:white;
            border:0;
            width:130px;
            height: 30px;
        }

        /* 내비게이션 시작 */
        #section{margin: auto; width: 80%; height: 100%;}
        .sec_nav{margin: 0; width: 100%; height: 80px; background-color: rgb(223, 220, 220); text-align:center;}

        .sec_nav ul {height: 100%; line-height: 80px; margin:0 auto; display:inline-block; }
        .sec_nav ul:after { clear:both; content:""; display:block; }
        .sec_nav ul li {list-style: none; float: left; box-sizing:border-box; padding:0;}
        .sec_nav ul li a{text-decoration: none; margin-left: 100px; margin-right: 100px; color: black;}

        .sec_nav .sel_point { background:#0f4a7e; }
        .sec_nav .sel_point a { display:inline-block; color:#fff; }

        #details_area{margin: auto; width: 100%; text-align:center; }

        #review_area{height: auto; width: 100%; /*border: 1px solid gray;*/ padding-bottom:40px; }
        #review_area .rev_rate  { width:100%; margin:20px 0 0; }
        #review_area .rev_rate select { width:100%; font-size:24px; height:50px; }
        #review_area .rev_textArea { box-sizing:border-box; margin: 20px 0 20px;  }
        #review_area .rev_textArea textarea { width:100%; resize: none; padding:10px; box-sizing:border-box; }
        #review_area .rev_textArea textarea::placeholder { color:#666; }
        #review_area .rev_btns { width:100%; }
        #review_area .rev_btns:after { display:block; content:""; clear:both; }
        #review_area .rev_btns .rev_submit { float:right; width:160px; border-radius:0; height:60px; background:#30586e; color:#fff; font-size:16px; border:none; }
        #review_area .rev_btns .fileWrap { float:left; margin:0; width:60px; height:60px; overflow:hidden; position:relative; }
        #review_area .rev_btns .fileWrap input { font-size:40px; opacity:0; position:relative; z-index:2; }
        #review_area .rev_btns .fileWrap span { position:absolute; top:0; left:0; }
        #review_area .rev_btns .fileWrap span i { color:#30586e; font-size:60px; }

        #QnA_area h3{float: left;}
        #QnA_area button{float: right; background-color: #30586e; border: 0px; height: 60px; color: white; font-size: 100%;}
        #QnA_area table{border-top: 2px solid rgb(223, 220, 220); border-bottom: 1px solid rgb(223, 220, 220); width: 100%;}

    </style>
</head>

<body>

	<%@ include file="../common/header.jsp" %>

    <div id="prod-detail">
        <!-- 상품 정보 -->
        <div id="detail_top">
            <div id="photo_area">
                <img id="photo" name="photo" src="images/thumbnail/thumb001.jpg">
            </div>
            <div id="p_detalis" name="p_detalis">
                <ul id="product_ul">
                    <li>
                        <div id="brand" name="brand">OFT</div>
                    </li>
                    <li>
                        <div id="name" name="name">V NECK BEAN BUTTON ONEPIECE_2COLORS</div>
                    </li>
                    <li>
                        <div id="product_description">
                            힙을 덮지 않는 길이감으로 데님, 스커트에 매치해도 잘 어울립니다.
                        </div>
                    </li>
                </ul>

                <!-- 상품 판매가 -->
                <div id="right_wrap">
                    <ul class="price">
                        <li>
                            <span class="price_left">정상가</span><span class="price_right"><s>140,700</s></span>
                        </li>
                        <li>
                            <span class="price_left">판매가</span><span class="price_right"><span
                                    class="price_dis">5%▼</span> 139,500</span>
                        </li>
                        <li>
                            <span class="price_left">적립금</span><span class="price_right">6,975p</span>
                        </li>
                        <li>
                            <span class="price_left">회원가</span><span class="price_right"><span
                                    class="price_dis">15%▼</span> 118,575</span>
                        </li>
                    </ul>

                    <!-- 상품 선택 및 구매/장바구니 -->
                    <div class="buy_information">
                        <form>
                            <ul>
                                <li>
                                    <select id="color">
                                        <option>size 선택</option>
                                        <option>S</option>
                                        <option>M</option>
                                        <option>L</option>
                                    </select>
                                </li>
                                <li>
                                    <input type="number" id="num" min="1" max="100" step="1" value="1">
                                </li>
                            </ul>
                            <button type="button" id="by_now">BUY IT NOW</button>
                            <button type="button" id="shopping_bag">SHOPPING BAG</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

<!-- 내비게이션 시작 -->
<div id="section">
    <hr>
    <div id="sec_details_nav" class="sec_nav">
        <ul>
            <li class="sel_point"><a href="#sec_details_nav">THE DETAILS</a></li>
            <li><a href="#sec_review_nav">REVIEW</a></li>
            <li><a href="#sec_QnA_nav">Q&A</a></li>
        </ul>
    </div>
    <div id="details_area">
        <img src="images/detail/detail001.jpg">

    </div>

    <!--reivew-->
    <div id="sec_review_nav" class="sec_nav">
        <ul>
            <li><a href="#sec_details_nav">THE DETAILS</a></li>
            <li class="sel_point"><a href="#sec_review_nav">REVIEW</a></li>
            <li><a href="#sec_QnA_nav">Q&A</a></li>
        </ul>
    </div>
    <div id="review_area">
        <form>
            <div class="rev_rate">
                <select>
                    <option value="5">★★★★★</option>
                    <option value="4">★★★★☆</option>
                    <option value="3">★★★☆☆</option>
                    <option value="2">★★☆☆☆</option>
                    <option value="1">★☆☆☆☆</option>
                </select>
            </div>
            <div class="rev_textArea">
                <textarea rows="10" placeholder="리뷰 등록 시 적립금을 드립니다!"></textarea>
            </div>
            <div class="rev_btns">
                <p class="fileWrap">
                    <input type="file" id="rev_file" name="rev_file">
                    <span><i class="fas fa-camera"></i></span>
                </p>
            <button class="rev_submit" type="submit">리뷰 등록</button>
            </div>
        </form>

    </div>
    <!--Q&A-->
    <div id="sec_QnA_nav" class="sec_nav">
        <ul>
            <li><a href="#sec_details_nav">THE DETAILS</a></li>
            <li><a href="#sec_review_nav">REVIEW</a></li>
            <li class="sel_point"><a href="#sec_QnA_nav">Q&A</a></li>
        </ul>
    </div>
    <br>
    <div id="QnA_area">
        <h3>상품 Q&A</h3>
        <button>상품문의 글쓰기</button>
        
        <br clear="both"><br>
        <table>
            <tbody>
                <tr>
                    <th>asd</th>
                </tr>

            </tbody>
        </table>
    </div>
</div>


	<%@ include file="../common/footer.jsp" %>

</body>

</html>