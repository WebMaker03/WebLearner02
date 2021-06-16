<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet" href="css/Board_write.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

<div class="container px-4 py-5 mx-auto" >
 <div class="h2 font-weight-bold" style="margin-top:150px">게시글 작성하기</div>
    <div class="row d-flex justify-content-center" >
        <div class="card">
            <div class="row px-3">
                <div class="flex-column">
                
                    <h3 class="mb-0 font-weight-normal">작성자 이름</h3> <select name="privacy" class="privacy">
                    
                        <option>축구</option>
                        <option>야구</option>
                        <option>농구</option>
                    </select>
                   
                </div>
            </div>
        
            <div class="row px-3 form-group"> <textarea class="text-muted bg-light mt-4 mb-3" placeholder="Hi Camilla, what's on your mind today?"></textarea> </div>
            <div class="row px-3">
                <p class="fa fa-user options mb-0 mr-4"></p>
                <p class="fa fa-map-marker options mb-0 mr-4"></p>
                <p class="fa fa-image options mb-0 mr-4"></p> <img class="options" src="https://img.icons8.com/material/24/000000/more--v2.png" width="30px" height="28px">
                <div class="btn btn-success ml-auto">Post</div>
            </div>
        </div>
    </div>
</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
<script src=https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js></script>
<script src=https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js></script>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
</html>