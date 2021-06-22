
$('#submitBtn').on('click',function(){
	console.log('평점: '+$('input[name=rating]:checked').val());
	console.log('리뷰: '+$('textarea#review').val());
	$('#modalBox').modal("hide");
});