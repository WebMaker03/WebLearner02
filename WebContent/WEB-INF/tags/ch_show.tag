<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="v" items= "${show_challenge}" begin="0"
	end="${show_challenge.size() }">
	<c:choose>
		<c:when test="${v%3 == 0 && v = show_challenge.size()}">
			<div class="carousel-item active">
				<div class="container-fluid">
					<div class="carousel-caption we1_do">
						<div class="row">
							<div class="col-md-4">
								<div id="bo_hoo" class="we_boxx text_align_center">
									<i><img src="images/we1.png" alt="#" /></i>
									<h3>${v.c_name}</h3>
									<p>${v.c_context}</p>
									<a class="read_moree" href="Chall_Detail.jsp">신청하기</a>
								</div>
							</div>
		</c:when>
		<c:when test="${v%3 == 0}">
			<div class="carousel-item">
				<div class="container-fluid">
					<div class="carousel-caption we1_do">
						<div class="row">
							<div class="col-md-4">
								<div id="bo_hoo" class="we_boxx text_align_center">
									<i><img src="images/we1.png" alt="#" /></i>
									<h3>${v.c_name}</h3>
									<p>${v.c_context}</p>
									<a class="read_moree" href="Chall_Detail.jsp">신청하기</a>
								</div>
							</div>
		</c:when>
		<c:when test="${v%3 != 2 && v != show_challenge.size() }">
			<div class="col-md-4">
				<div id="bo_hoo" class="we_boxx text_align_center">
					<i><img src="images/we1.png" alt="#" /></i>
					<h3>${v.c_name}</h3>
					<p>${v.c_context}</p>
					<a class="read_moree" href="Chall_Detail.jsp">신청하기</a>
				</div>
			</div>
		</c:when>
		<c:otherwise>
			<div class="col-md-4">
				<div id="bo_hoo" class="we_boxx text_align_center">
					<i><img src="images/we1.png" alt="#" /></i>
					<h3>${v.c_name}</h3>
					<p>${v.c_context}</p>
					<a class="read_moree" href="Chall_Detail.jsp">신청하기</a>
				</div>
			</div>
			</div>
			</div>
			</div>
			</div>

		</c:otherwise>
	</c:choose>
</c:forEach>
