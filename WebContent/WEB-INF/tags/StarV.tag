<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty VStar}">
		<c:forEach var="v" items="${VStar}" varStatus="status">
			<h4 class="font-weight-bold">
				별점 ${status.index} <span class="float-right">${v}%</span>
			</h4>
			<div class="progress mb-4">
				<div class="progress-bar bg-danger" role="progressbar"
					style="width: ${v}%" aria-valuenow="${v}" aria-valuemin="0"
					aria-valuemax="100"></div>
			</div>
		</c:forEach>
	</c:when>
	<c:otherwise>
		<h4 class="font-weight-bold">인증 정보가 아직 없습니다.</h4>

	</c:otherwise>
</c:choose>
<!--  <h4 class="font-weight-bold">
                        별점 1 <span class="float-right">10%</span>
                     </h4>
                     <div class="progress mb-4">
                        <div class="progress-bar bg-danger" role="progressbar"
                           style="width: 10%" aria-valuenow="10" aria-valuemin="0"
                           aria-valuemax="100"></div>
                     </div> -->