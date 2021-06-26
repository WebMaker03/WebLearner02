<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Post_Detail.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container_jonn" >
		
		<div class="d-flex justify-content-center row" >
			<div class="comment" style="margin-top: 200px">
				<div
					class="d-flex flex-row align-items-center text-left comment-top p-2 border-bottom px-4" id="po" >
					<div class="profile-image">
						<i class="fa fa-book" aria-hidden="true"></i>
					</div>
					<div class="d-flex flex-column ml-3">
						<div class="d-flex flex-row post-title">
							<h1>${p.p_title}</h1>
							<span class="ml-2">작성자이름</span>
						</div>
						<div>
							class="d-flex flex-row align-items-center align-content-center post-title">

							<span>등록날짜</span>

						</div>

					</div>
				</div>
				<div class="coment-bottom bg-white p-2 px-4" style="height: 200px;">
					<p class="comment-text">${v._p_title}</p>
				</div>
				<div class="coment-bottom bg-white p-2 px-4">
					<div class="d-flex flex-row add-comment-section mt-4 mb-4">
						<input
							type="text" class="search"
							placeholder="자신의 의견을 작성해보세요!">
						<button type="button" class="btn btn-link">완료!</button>
					</div>
					<div class="collapsable-comment">
						<div
							class="d-flex flex-row justify-content-between align-items-center action-collapse p-2"
							data-toggle="collapse" aria-expanded="false"
							aria-controls="collapse-1" href="#collapse-1" id="post">
							<span>댓글 보기</span><i class="fa fa-chevron-down servicedrop"></i>
						</div>

						<div id="collapse-1" class="collapse" >
							<tag:cmt_show></tag:cmt_show>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	

</body>
<script	src=https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js></script>
<script src="js/jquery.min.js"></script>
<script	src=https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js></script>
<script src="js/bootstrap.bundle.min.js"></script>

</html>