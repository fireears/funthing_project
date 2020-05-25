$(function(){
    // alert("!");

    // 헤더 상단 고정
    var headerTop = $("#header").offset();
    console.log(headerTop);
    $(window).scroll(function(){
      if($(document).scrollTop() > headerTop.top){
        $("#header").addClass("fixed");
      }else{
        $("#header").removeClass("fixed");
      }
    });

    // 검색창 클릭 시
    $(".search-box").click(function(){
        $(".searchWrap").show();
        $('html').css({'overflow': 'hidden', 'height': '100%'});
        $('#element').on('scroll touchmove mousewheel', function(event) {
          event.preventDefault();
          event.stopPropagation();
          return false;
        });
    });

    // 검색창 열렸을 때 닫기
    $(".searchWrap .close").click(function(){
      $(".searchWrap").hide();
      $('html').css({'overflow': 'scroll', 'height': '100%'});
      $('#element').off('scroll touchmove mousewheel');

    });

    // nav menu
    $("#nav > ul > li .sub-menu").hide();

    $("#nav > ul > li").hover(function(){
      $(this).children(".sub-menu").stop().slideDown();
    }, function(){
      $(this).children(".sub-menu").stop().slideUp();

    });

    // 위아래 이동하는 버튼
    $(".sc-btns").hide();

    var conTp = $(".discover").offset().top - 350;
    // console.log(conTp);
    $(window).scroll(function(){
      if($(document).scrollTop() > conTp){
        $(".sc-btns").fadeIn();
      }else {
        $(".sc-btns").fadeOut();
      }
    });

    // up down
    $(".sc-btns .up").click(function(){
      $("html").animate({scrollTop : 0}, 300);
    });
    $(".sc-btns .down").click(function(){
      $("html").animate({
        scrollTop: $("html").height()}, 300);
    });
})