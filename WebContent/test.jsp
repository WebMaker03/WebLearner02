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
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h2>등록</h2>
   <form method="post" action="test.jsp">
      이름: <input type="text" name="name"> <br> 번호: <input
         type="text" name="phone"> <br> <input type="submit"
         value="등록">
   </form>

   <hr>

   <h2>목록출력</h2>
   <sql:query var="rs" dataSource="jdbc/mysql">
      select * from dbcp2
   </sql:query>
   <c:forEach var="v" items="${rs.rows}" varStatus="status">
      <p>${v.name}
         / ${v.phone}<br>
   </c:forEach>


</body>
</html>