<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="DAO.LoginDAO"%>
<jsp:useBean id="user" class="DTO.Users" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <%
     if(request.getParameter("userid")!=null){
        
       String userid = request.getParameter("userid");
       String userpw = request.getParameter("userpw");
       user.setId(userid);
       user.setPw(userpw);
       LoginDAO lo = new LoginDAO();
       
        boolean flag=lo.login(userid,userpw);
        if(flag){
           session.setAttribute("session_user", user);
           %>
           <script>
           alert('로그인 실패');
           location.href="index.jsp";
           </script><%
        }else{
           %> <script>
              alert('로그인 실패');
              location.href="login.jsp";
              </script>
              <%
         }
     }
  %>
</body>

