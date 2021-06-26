<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:forEach var="v" items="${cList}" varStatus="status">

							<div class="commented-section mt-2">
								<div class="d-flex flex-row align-items-center commented-user">
									<h5 class="mr-2">${uList[status.index].u_name}</h5>
									<span class="dot mb-1"></span><span class="mb-1 ml-2">챌린지이름, 색깔바꾸기</span>
								</div>
								<div class="comment-text-sm">
									<span>${v.cm_text}</span>
								</div>
								
								<c:if test="${v.u_code eq session_user.u_code}">
									<ul class="nav justify-content-end">
										<button type="button" class="btn btn-link">삭제</button>
									</ul>
								</c:if>
								
							</div>
							<hr>



	
</c:forEach>
