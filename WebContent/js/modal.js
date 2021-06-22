$('#submitBtn').on('click',function(){
   $(document).ready(function(){
      $('#verRating').val($('input[name=rating]:checked').val());
      $('#verReview').val($('textarea#review').val());
   });
   console.log('평점: '+$('input[name=rating]:checked').val());
   console.log('리뷰: '+$('textarea#review').val());
   $('#modalBox').modal("hide");
   $(".modal-backdrop").remove();
});