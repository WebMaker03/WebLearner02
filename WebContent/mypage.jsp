<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<div></div>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" href="css/style.css">
<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">
<!-- theme css -->
<link rel="stylesheet" href="css/theme.css">
<!-- Mypage css -->
<link rel="stylesheet" href="css/Mypage.css">


</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="theme">
		<div class="container1" style="margin-top: 80px; margin-bottom: 70px;">
			<h2 style="font-size: 40px;">
				<strong>마이페이지</strong>
			</h2>
			<br>
			<div class="row">
				<div class="col">
					<div class="card"
						style="width: 700px; height: 220px; margin-left: 80px; margin-top: 20px;">
						<div class="card-body">
							<div class="row">
								<div class="col">
									<p class="card-text" style="color: black;">ooo 님, 환영합니다!</p>
									<br> <br>

								</div>
								<div class="col">
									<div class="card-body">
										<a href="#" class="btn btn-primary"
											style="margin-left: 40%; background-color: white; color: black;">
											현재 포인트 :0000p</a><br> <br> <a href="#"
											class="btn btn-primary"
											style="margin-left: 40%; background-color: white; color: black;">
											나의 인증 현황 보기</a>
									</div>

								</div>
							</div>
							<div class="row justify-content-md-center">
								<a href="Info_View.jsp" class="btn btn-primary"
									style="margin-right: 40px;">회원정보 보기</a> <br>
								<a href="InfoModify.jsp" class="btn btn-primary"
									style="margin-right: 40%;">회원정보 수정</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col">

					<div class="card"
						style="width: 300px; height: 220px; margin-left: 60px; margin-top: 20px;">
						<div class="card-body">
							<a href="#" class="btn btn-primary"
								style="margin-top: 30px; margin-left: 40px;"> 작성한 게시글 & 댓글</a><br>
							<a href="#" class="btn btn-primary"
								style="margin-top: 20px; margin-left: 40px;"> 게시글 저장 목록 </a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<hr>
		<div class="container1" style="margin-top: 30px;">
			<h1>챌린지 현황</h1>
			<div class="row">
				<div class="col">
					<table class="table"
						style="width: 600px; margin-top: 30px; color: black; text-align: center; background-color: white;">
						<caption style="font-size: 20px;">진행중인 챌린지</caption>
						<thead>
							<tr>
								<th scope="col">no.</th>
								<th scope="col">Title</th>
								<th scope="col"></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">1</th>
								<td>challenge1</td>
								<td>
									<nav>
										<ul class="pager"
											style="background-color: #6495ED; margin-left: 25%; width: 150px;">
											<li><a href="#" style="color: white;">인증보러가기</a></li>
										</ul>
									</nav>
								</td>
							</tr>
							<tr>
								<th scope="row">2</th>
								<td>challenge2</td>
								<td>
									<nav>
										<ul class="pager"
											style="background-color: #6495ED; margin-left: 25%; width: 150px;">
											<li><a href="#" style="color: white;">인증보러가기</a></li>
										</ul>
									</nav>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>challenge3</td>
								<td>
									<nav>
										<ul class="pager"
											style="background-color: #6495ED; margin-left: 25%; width: 150px;">
											<li><a href="#" style="color: white;">인증보러가기</a></li>
										</ul>
									</nav>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>challenge3</td>
								<td>
									<nav>
										<ul class="pager"
											style="background-color: #6495ED; margin-left: 25%; width: 150px;">
											<li><a href="#" style="color: white;">인증보러가기</a></li>
										</ul>
									</nav>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>challenge3</td>
								<td>
									<nav>
										<ul class="pager"
											style="background-color: #6495ED; margin-left: 25%; width: 150px;">
											<li><a href="#" style="color: white;">인증보러가기</a></li>
										</ul>
									</nav>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="col">
					<table class="table"
						style="width: 600px; margin-top: 30px; color: black; text-align: center; background-color: white;">
						<caption style="font-size: 20px;">종료된 챌린지</caption>
						<thead>
							<tr>
								<th scope="col">no.</th>
								<th scope="col">Title</th>
								<th scope="col">progress</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">1</th>
								<td>challenge1</td>
								<td>
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
											style="width: 80%;">80%</div>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">2</th>
								<td>challenge2</td>
								<td>
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
											style="width: 60%;">60%</div>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>challenge3</td>
								<td>
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"
											style="width: 100%;">100%</div>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>challenge3</td>
								<td>
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"
											style="width: 40%;">40%</div>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>challenge3</td>
								<td>
									<div class="progress">
										<div class="progress-bar" role="progressbar" aria-valuenow="0"
											aria-valuemin="0" aria-valuemax="100" style="width: 0%;">0%</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


	<!-- footer start -->
</body>
</html>