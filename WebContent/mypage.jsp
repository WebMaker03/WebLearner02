<%@page import="DTO.Users"%>
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

	<jsp:include page="header.jsp"></jsp:include>

	<div class="theme">
		<div class="container" style="margin-top: 100px">
			<h1>마이페이지</h1>
			<br>
			<div class="row">
				<div class="col">
					<div class="card"
						style="width: 600px; height: 200px; margin-left: 100px;">
						<div class="card-body">
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<br>
							<br>
							<div class="row justify-content-md-center">
								<a href="#" class="btn btn-primary" style="margin-right: 30px">회원정보보기</a>
								<a href="#" class="btn btn-primary">회원정보 수정</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col">

					<div class="card"
						style="width: 300px; height: 200px; margin-left: 60px;">
						<div class="card-body">
							<a href="#" class="btn btn-primary" style="margin-top: 30px">회원정보
								보기</a> <br> <a href="#" class="btn btn-primary"
								style="margin-top: 20px">회원정보 수정</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- footer start -->
	<jsp:include page="footer.jsp"></jsp:include>




</body>
</html>