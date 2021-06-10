<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/Chall_Detail.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">


</head>
<body>
	<!--For Page-->

	<div class='container'>
		<div class="row">
			<div class="col scroll">
				<div class="card">
					<div class="card-title d-flex px-4">
						<p class="challenge_title">하루 독서 1시간 챌린지</p>

					</div>
					<div class="row">
						<img id=challenge_img src="https://i.imgur.com/kXUgBQZ.jpg" /><br>
						<div class="col">
							<div class="row">
								<div class="card" id="chell_info">
									<div class="row">
										<i class="fa fa-thumbs-o-up fa-3x" aria-hidden="true"></i> <span
											id="chel_people"> 챌린지 가입자 수 : 100명</span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="card" id="chell_info">
									<div class="row">
										<i class="fa fa-clock-o fa-3x" aria-hidden="true"></i> <span
											id="chel_people"> 챌린지 기간: 2주</span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="card" id="chell_info">
									<div class="row">
										<i class="fa fa-star fa-3x" aria-hidden="true"></i> <span
											id="chel_people"> 챌린지 포인트 : 100P</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<hr id="line">
					<div class="card-body">
						<p class="text-muted">챌린지 정보</p>
						<div class="challenge_info mb-3"></div>
						<div class="challenge_info mb-3"></div>

					</div>
					<hr id="line">
					<div class="buttons">
						<button type="button" class="btn btn-primary">참가하기</button>
						<a class="btn btn-primary" href="#" role="button">Cancel</a>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>