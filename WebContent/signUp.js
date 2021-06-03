/**
 * 
 */

// 아이디 중복체크 -> DB연동해서 해야되서 백단으로 빼야할지...

/* 비밀번호 조건 -> AJAX 사용
	1. 영문+숫자+특수문자(~`!@#$%^&*만 사용)
	2. 8~20 문자 사용
	*/
	
// PW1, PW2 일치 확인 -> AJAX 사용
$(function(){
	var pw1 = document.getElementById(pw1);
	var pw2 = document.getElementById(pw2);
//비밀번호 확인
	$('#pw2').blur(function(){
	   if($('#pw').val() != $('#pw2').val()){
	    	if($('#pw2').val()!=''){
		    alert("비밀번호가 일치하지 않습니다.");
	    	    $('#pw2').val('');
	          $('#pw2').focus();
	       }
	    }
	})  	   
});


