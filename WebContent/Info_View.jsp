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
				<strong>회원정보 확인</strong>
			</h2>
			<br>
			<div class="container-mt-5">
				<div class="row d-flex">
					<div class="col-md-7">
						<div class="card p-2 text-center">
							<div class="row">
								<div class="col-md-7 border-right no-gutters">
									<div class="py-3">
										<img src="https://i.imgur.com/hczKIze.jpg" width="100"
											class="rounded-circle">
										<h4 class="text-secondary">John Smith</h4>
										<div class="allergy">
											<span>Allergy</span>
										</div>
										<div class="stats">
											<table class="table table-borderless">
												<tbody>
													<tr>
														<td>
															<div class="d-flex flex-column">
																<span class="text-left head">DOB</span> <span
																	class="text-left bottom">03/13/2016</span>
															</div>
														</td>
														<td>
															<div class="d-flex flex-column">
																<span class="text-left head">Age</span> <span
																	class="text-left bottom">22Y 4m</span>
															</div>
														</td>
													</tr>
														<tr>
														<td>
															<div class="d-flex flex-column">
																<span class="text-left head">Weight</span> <span
																	class="text-left bottom">168 lb</span>
															</div>
														</td>
														<td>
															<div class="d-flex flex-column">
																<span class="text-left head">Height</span> <span
																	class="text-left bottom">5'9"</span>
															</div>
														</td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="px-3">
											<button type="button" class="btn btn-primary btn-block">Send
												Message</button>
										</div>
									</div>
								</div>
								<div class="col-md-5">
									<div class="py-3">
										<div>
											<span class="d-block head">Home Address</span> <span
												class="bottom">123 Broadway,New York,NY,10012</span>
										</div>
										<div class="mt-4">
											<span class="d-block head">Mobile Phone#</span> <span
												class="bottom">917 (543)-1234</span>
										</div>
										<div class="mt-4">
											<span class="d-block head">Home Phone#</span> <span
												class="bottom">212 (213)-1234</span>
										</div>
										<div class="mt-4">
											<span class="d-block head">Work Phone#</span> <span
												class="bottom">718 (702)-9876</span>
										</div>
										<div class="mt-4">
											<span class="d-block head">Email</span> <span class="bottom">j.smith@gmail.com</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>



		<!-- footer start -->
</body>
</html>