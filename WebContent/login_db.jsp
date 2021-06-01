<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="DAO.LoginDAO"%>
 <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <%
   	String userid = request.getParameter("inputId");
    String password = request.getParameter("pw");
    
  	LoginDAO lo = new LoginDAO();
  	lo.login(userid, password);
    
  
  %>
</body>
</html>