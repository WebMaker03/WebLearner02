<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재 참가중인 챌린지 상세보기 화면 & 인증 파트</title>

<link rel="stylesheet" href="css/Prochal_detail.css">
<link rel="stylesheet" href="css/style.css">
<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">




</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container marketing">



		<div class="row">

			<div class="col-lg-4" style="margin-top: 220px">
			
				<svg class="bd-placeholder-img rounded-circle" width="140"
					height="140" xmlns="http://www.w3.org/2000/svg" role="img"
					aria-label="Placeholder: 140x140"
					preserveAspectRatio="xMidYMid slice" focusable="false">
				<title>수영</title><rect width="100%" height="100%" fill="#777"></rect>
				<text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
				</svg>
				
				
				
				
				<div style="margin-bottom: 20px">
					<h2>수영 챌린지</h2>
				</div>
				<h3>상세 기간 : </h3>
				<p>챌린지 상세 설명</p>
				<p>
					<a class="btn btn-secondary" href="#">인증 현황 ↓↓</a>
				</p>

			
			</div>

		</div>
		<!-- START THE FEATURETTES -->

		<hr class="featurette-divider">
<h2 class = "row" > <a class="btn btn-secondary" href="#"> 챌린지 인증 </a>
			 </h2>
		<div class="row featurette">
			<div class="col-md-7">
				<h2 class= row" > <a  href="#"> </a>
				</h2>
				<p class="lead">Some great placeholder content for the first
					featurette here. Imagine some exciting prose here.</p>
			</div>
			<div class="col-md-5">
				<svg
					class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto"
					width="500" height="500" xmlns="http://www.w3.org/2000/svg"
					role="img" aria-label="Placeholder: 500x500"
					preserveAspectRatio="xMidYMid slice" focusable="false">
					<title>Placeholder</title>
					</svg>

			</div>
		</div>

	
		<hr class="featurette-divider">

	</div>
	<!-- /END THE FEATURETTES -->

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>