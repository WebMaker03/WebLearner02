<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import="java.sql.*,javax.sql.*,javax.naming.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
   request.setCharacterEncoding("UTF-8");
%>

<c:if test="${not empty param.name}">
   <sql:update dataSource="jdbc/mysql" var="res">
      insert into dbcp2 values(?,?)
      <sql:param value="${param.name}" />
      <sql:param value="${param.phone}" />
   </sql:update>
</c:if>
<!--  아직 c태그는 몰라요... -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- insert -->
</body>
</html>