<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${session_user==null}">
		<ul class="email text_align_right">
			<li><a href="login.jsp"> Login </a></li>
			<!--   <li> <a href="Javascript:void(0)"> <i class="fa fa-search" style="cursor: pointer;" aria-hidden="true"> </i></a> </li> -->
			<li><a href="SignUp.jsp"> SignUp </a></li>
		</ul>
	</c:when>
	<c:otherwise>
		<div class="col-md-2 d_none">
			<ul class="email text_align_right">
				<li><a href="logout.do"> Logout </a></li>
			</ul>
		</div>
	</c:otherwise>
</c:choose>
