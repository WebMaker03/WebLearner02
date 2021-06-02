<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" href="css/style.css">
<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">


</head>
<body>
	<!--  start header -->
	<jsp:include page="header2.jsp"></jsp:include>
	<!--  end header -->

	<h2>마이페이지</h2>
	<br>
	<div class="container">
	<div class="row">
		<div class="col">
			<div class="card"
				style="width: 600px; height: 200px; margin-top: 100px; margin-left: 100px;">
				<div class="card-body">
					<p class="card-text">With supporting text below as a natural
						lead-in to additional content.</p>
					<a href="#" class="btn btn-primary" style="margin-top: 30px">회원정보
						보기</a> <a href="#" class="btn btn-primary" style="margin-top: 30px">회원정보
						수정</a>
				</div>
			</div>
		</div>
		<div class="col">

			<div class="card"
				style="width: 300px; height: 200px; margin-top: 100px; margin-left: 100px;">
				<div class="card-body">
					<p class="card-text">With supporting text below as a natural
						lead-in to additional content.</p>
					<a href="#" class="btn btn-primary" style="margin-top: 30px">회원정보
						보기</a> <a href="#" class="btn btn-primary" style="margin-top: 30px">회원정보
						수정</a>
				</div>
			</div>
		</div>
	</div>
</div>

	<!-- footer start -->
	<jsp:include page="footer.jsp"></jsp:include>




</body>
</html>