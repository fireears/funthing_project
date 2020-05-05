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

})