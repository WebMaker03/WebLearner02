<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <%
      
      	 Users user=(Users)session.getAttribute("session_user");
         if(user==null){%>
      		<jsp:include page="header.jsp"></jsp:include>
      		
      	<%}else{
      		%> <jsp:include page="header2.jsp"></jsp:include><%
      	}
      %>

      <div class="board">
         <div class="container">
         
         </div>
      </div>
      <!-- end portfolio -->
  
</body>
</html>