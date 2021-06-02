<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
   <%
      if(session.getAttribute("session_user")!=null){
         session.removeAttribute("session_user");
         
      %><script>
        	concole.log("로그아웃 되었습니다.");
      </script><%
       response.sendRedirect("index.jsp");
      }else{
    	  response.sendRedirect("index.jsp");
      }
   
   
   %>
</body>
</html>