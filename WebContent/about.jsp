<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" href="css/style.css">
<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">

<link rel="stylesheet" href="css/about.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  start header -->

	<%
      
      	 Users user=(Users)session.getAttribute("session_user");
         if(user==null){%>
	<jsp:include page="header.jsp"></jsp:include>

	<%}else{
      		%>
	<jsp:include page="header2.jsp"></jsp:include>
	<%
      	}
      %>

	<section id="team">

		<div class="container" style="margin-top: 150px">
			<div class="section-header" id="service">
				<h3>Meet Our Service</h3>
				<hr>
				<p style="margin-top: 30px; font-size: 20px; font-weight: bold">챌린지
					러너는 여러분들의 목표달성을 응원합니다!</p>

			</div>
		</div>

		<div class="container" style="margin-top: 20px">
			<div class="section-header">
				<h3>Meet Our Team</h3>
				<hr>
				<p style="margin-top: 30px">FrontEnd</p>
			</div>
			<div class="row justify-content-md-center">
				<div class="col-lg-3 col-md-6 wow fadeInUp"
					style="visibility: visible; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/f_1.png" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4>Kang onyu</h4>
								<h4> 강 온 유 </h4>
								<span>Frontend Developer</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.1s"
					style="visibility: visible; animation-delay: 0.1s; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/f_2.png" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4> Yu aerim </h4>
								<h4> 유 애 림 </h4>
								<span>Frontend Developer</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.2s"
					style="visibility: visible; animation-delay: 0.2s; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/f_3.png" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4> Yoon sujeong </h4>
								<h4> 윤 수 정 </h4>
								<span>Frontend Developer</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="section-header">
				<hr>
				<p style="margin-top: 30px">BackEnd</p>
			</div>


			<div class="row">
				<div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.2s"
					style="visibility: visible; animation-delay: 0.2s; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/sj.jpg" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4> Kim SeungJoo</h4>
								<h4> 김 승 주 </h4>
								<span>Project Manager</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.2s"
					style="visibility: visible; animation-delay: 0.2s; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/sj1.png" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4> Lee JaeHyun</h4>
								<h4> 이 재 현</h4>
								<span>BackEnd Developer</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.2s"
					style="visibility: visible; animation-delay: 0.2s; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/sj2.jpeg" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4> 장 수 현 </h4>
								<span>Backend Developer</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.2s"
					style="visibility: visible; animation-delay: 0.2s; animation-name: fadeInUp;">
					<div class="member">
						<img src="images/sj3.jpg" class="img-fluid"
							alt="">
						<div class="member-info">
							<div class="member-info-content">
								<h4>현 석 호 </h4>
								<span>Backend Developer</span>
								<div class="social">
									<a href=""><i class="fa fa-twitter"></i></a> <a href=""><i
										class="fa fa-facebook"></i></a> <a href=""><i
										class="fa fa-google-plus"></i></a> <a href=""><i
										class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
	</section>
 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>