<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Self-development challenge</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- awesome fontfamily -->
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
   </head>
   <!-- body -->
   <body class="utmain-layo">
      <!-- loader  -->
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="" /></div>
      </div>
      <!-- end loader -->
      
       <%
      
      	 Users user=(Users)session.getAttribute("session_user");
         if(user==null){%>
      		<jsp:include page="header.jsp"></jsp:include>
      		
      	<%}else{
      		%> <jsp:include page="header2.jsp"></jsp:include><%
      	}
      %>
      <!-- start slider section -->
      <div id="top_section" class="banner_main">
         <div class="container" style="margin-top:80px">
            <div class="row">
               <div class="col-md-12">
                  <div id="myCarousel" class="carousel slide" data-ride="carousel">
                     <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                       
                     </ol>
                     
                     <div class="carousel-inner">
                        <div class="carousel-item active">
                           <div class="container-fluid">
                              <div class="carousel-caption relative">
                                 <div class="bluid">
                                    <h1>자기개발  <br>챌린지 </h1>
                                    <p>Codelearner<br>안녕하세요 챌린지에 오신걸 환ㄴ영합니다!!!!!!!!!!!!!!!!!!
                                    </p>
                                    <a class="read_more" href="login.html">로그인 </a><a class="read_more" href="회원가입.html">회원가입 </a>
                                 </div>
                              </div>
                           </div>
                        </div>
                        
                        <div class="carousel-item">
                           <div class="container-fluid">
                              <div class="carousel-caption relative">
                                 <div class="bluid">
                                    <h1>Self-development  <br>challenge </h1>
                                    <p>Codelearner<br>코드러너
                                    </p>
                                    <a class="read_more" href="about.html">로그인 </a><a class="read_more" href="contact.html">회원가입</a>
                                 </div>
                              </div>
                           </div>
                        </div>
                        
                     <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                     <i class="fa fa-angle-left" aria-hidden="true"></i>
                     <span class="sr-only">Previous</span>
                     </a>
                     <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                     <i class="fa fa-angle-right" aria-hidden="true"></i>
                     <span class="sr-only">Next</span>
                     </a>
                     
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- end slider section -->
     

      <jsp:include page="footer.jsp"></jsp:include>
      
      <!-- end footer -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/custom.js"></script>
   </body>
</html>