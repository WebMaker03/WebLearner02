<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,javax.sql.*,javax.naming.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
   request.setCharacterEncoding("UTF-8");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>등록</h2>
	<form method="post" action="showuser.do">
		이름: <input type="text" name="userid"> <br> <input
			type="submit" value="테스트">
	</form>

	<hr>
	${show_user.pw} ${show_user.u_name} ${show_user.id} ${show_user.point}

	<%-- 
   <h2>목록출력</h2>
   <sql:query var="rs" dataSource="jdbc/mysql">
      select * from dbcp2
   </sql:query>
   <c:forEach var="v" items="${rs.rows}" varStatus="status">
      <p>${v.name}
         / ${v.phone}<br>
   </c:forEach>
 --%>

</body>
</html>