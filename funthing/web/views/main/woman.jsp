<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='ko'>

<head>
   <title></title>
   <script src="../js/jquery-3.4.1.min.js"></script>
   <style>
      
       /* #main{
         width: 70%;
         border: 1 black solid;
      }
      #header_main{
         width: 100%;
      }
      #main >#header_main> img{
         width: 100%;
         height: 180px;
         margin-bottom: 30px;
      }
    #select_main{
       height: 30px;
       border: 1px black solid;
       border-collapse:collapse;
       border-right: none;
       border-left: none;
    }
    #select_main_left{
       float : left;
     
       height: 100%;
       
    }
    #select_main_right{
      float: right;
      border-left: 1px black solid;
      width: 15%;
      height: 100%;
     

    }
    #select_main_right >select{
       float : right;
       height: 100%;
    }
    #content_main{
      width: 100%;
      border-bottom: black 1px solid;
    }
    #content_main >ul{
       width: 100%;
       height: 150px;
       
    }
    #content_main >ul >li{
       width: 25%;
       float: left;
      margin-right: 0px;
       
    }
    #content_main >ul >li >ul>li >img{
       width: 100%;
       
    }
    ul{
       list-style: none;
       display: block;
    list-style-type: none;
    margin-block-start: 0em;
    margin-block-end: 0em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    padding-inline-start: 0px;
}
   #discont{
      color: chocolate;
   }
   
     */

    /* 추가 */

    a { color:#333; text-decoration:none; }
    ul, li, p { margin:0; padding:0; list-style: none; }

    #productWrap { width:1460px; margin:0 auto; }

    #productWrap .prod_top { width:100%; }
    #productWrap .prod_top img { width:100%; }

    #productWrap .product { width:100%; }
    #productWrap .product:after { display:block; content:""; clear:both; }
    #productWrap .product > li { float:left; width:25%; box-sizing:border-box; padding:0 20px; margin-bottom:60px; }
    #productWrap .product li a img { width:100%; border:1px solid #666; }

    #productWrap .product li .prod-cont { margin-top:10px; }
    #productWrap .product li .prod-cont .prod-brand { color:#0f4a7e; }
    #productWrap .product li .prod-cont .prod-tit {  }
    #productWrap .product li .prod-cont .prod_price { margin-top:8px; font-size:18px; font-weight:700;  }
    #productWrap .product li .prod-cont .prod_price span { display:inline-block;  }
   /* .product li .prod-cont .prod_price:after { display:block; content:""; clear:both; } */
   
    #productWrap .product li .prod-cont .prod_price .origin_p { color:#666; font-size:16px; text-decoration: line-through; margin-right:6px; font-weight: normal; }
    #productWrap .product li .prod-cont .prod_price .new_p { color:#333; }
    #productWrap .product li .prod-cont .prod_price .discount { color:#0f4a7e; font-weight:700; margin-left:14px; }
   
    #productWrap .prod_cont { width:100%; border-top:1px solid #aaa; border-bottom:1px solid #aaa; padding:14px 10px; box-sizing: border-box; margin:20px 0 40px; }
    #productWrap .prod_cont:after { display:block; content:""; clear:both; } 
    #productWrap .prod_cont .prod_count { float:left; color:#666; }
    #productWrap .prod_cont .prod_sort { float:right; }
    #productWrap .prod_cont .prod_sort:after { display:block; content:""; clear:both; } 
    #productWrap .prod_cont .prod_sort li { float:left; margin-left:16px; position: relative; }
    #productWrap .prod_cont .prod_sort li:after { position: absolute; right:-8px; top:5px; background:#888; height:16px; width:1px; display:block; content:""; clear:both; }
    #productWrap .prod_cont .prod_sort li:last-child:after { background:transparent; }
    #productWrap .prod_cont .prod_sort li a { color:#666; }
    #productWrap .prod_cont .prod_sort li a:hover { color:#aaa; }
   </style>
</head>

<body>

	<%@ include file="../common/header.jsp" %>

  <div id="productWrap">
   <div class="prod_top">
      <img src="C://Users/violi/Desktop/image01.jpg">
   </div>
<!-- 
   <div id="select_main" class="hansol">
      <div id="select_main_left">100style</div>
      <div id="select_main_right">
         <select>
            <option value="40">40</option>
            <option value="20">20</option>
            <option value="12">12</option>
            <option value="8">8</option>
         </select>

      </div>
   </div> -->
   <div class="prod_cont">
      <p class="prod_count">100style</p>
      <ul class="prod_sort">
         <li><a href="#">high price</a></li>
         <li><a href="#">low price</a></li>
         <li><a href="#">close to completion</a></li>
         <li><a href="#">new product</a></li>
      </ul>
   </div>
      <div class="prod_area">
         <ul class="product">
            <li>
               <div class="prod-img">
                     <a href="#none"><img src="C://Users/violi/Desktop/image02.jpg"></a>
               </div>
               <ul class="prod-cont">
                     <li class="prod-brand">brand</li>
                     <li class="prod-tit"><a href="#none">product title</a></li>
                     <li class="prod_price"><span class="origin_p">298,000</span><span class="new_p">179,200</span><span class="discount">20%</span></li>
               </ul>
            </li>
            <li>
               <div class="prod-img">
                     <a href="#none"><img src="C://Users/violi/Desktop/image02.jpg"></a>
               </div>
               <ul class="prod-cont">
                     <li class="prod-brand">brand</li>
                     <li class="prod-tit"><a href="#none">product title</a></li>
                     <li class="prod_price"><span class="origin_p">298,000</span><span class="new_p">179,200</span><span class="discount">20%</span></li>
               </ul>
            </li>
            <li>
               <div class="prod-img">
                     <a href="#none"><img src="C://Users/violi/Desktop/image02.jpg"></a>
               </div>
               <ul class="prod-cont">
                     <li class="prod-brand">brand</li>
                     <li class="prod-tit"><a href="#none">product title</a></li>
                     <li class="prod_price"><span class="origin_p">298,000</span><span class="new_p">179,200</span><span class="discount">20%</span></li>
               </ul>
            </li>
            <li>
               <div class="prod-img">
                     <a href="#none"><img src="C://Users/violi/Desktop/image02.jpg"></a>
               </div>
               <ul class="prod-cont">
                     <li class="prod-brand">brand</li>
                     <li class="prod-tit"><a href="#none">product title</a></li>
                     <li class="prod_price"><span class="origin_p">298,000</span><span class="new_p">179,200</span><span class="discount">20%</span></li>
               </ul>
            </li>
         </ul>
      </div>
   </div>
   
   <%@ include file="../common/footer.jsp" %>

</body>

</html>



    