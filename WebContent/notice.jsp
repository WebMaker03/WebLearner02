<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="css/notice.css">



<meta charset="UTF-8">
<title>사이트 이용방법</title>
</head>
<body>
 	<jsp:include page="header.jsp"></jsp:include>
 	
 	<div class="container-fluid px-1 py-5 mx-auto">
    <div class="row d-flex justify-content-center text-center">
        <div class="col-lg-9 col-md-10" style="margin-top:170px">
            <div class="card b-0 rounded-0 show">
                <div class="row justify-content-center mx-auto step-container">
                    <div class="col-md-3 col-4 step-box active">
                        <h6 class="step-title-0"> <span class="fa fa-circle"></span> <span class="break-line"></span> <span class="step-title">사이트 사용 방법 안내</span></h6>
                    </div>
                    
                </div>
              <div class="container main" style="margin-bottom: 170px">
    <center>
        <div class="accordian">
            <div class="sec">
                <span class="section">Section 1</span> <i class="fa fa-plus right"></i>
            </div>
            <div id="colp1" class="collapsable">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
            </div>
            <div class="sec">
                <span class="section">Section 2</span> <i class="fa fa-plus right"></i>
            </div>
            <div id="colp2" class="collapsable">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
            </div>
            <div class="sec">
                <span class="section">Section 3</span> <i class="fa fa-plus right"></i>
            </div>
            <div id="colp3" class="collapsable">
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
            </div>
        </div>
        
     
        <center>
           <button name="next" id="next1" class="btn btn-success rounded-0 mb-5 next" style="margin-top: 70px">home</button>
</div>
            </div>
                        
            
        </div>
    </div>
</div>
 
    <jsp:include page="footer.jsp"></jsp:include>
</body>

<script type="text/javascript" src="js/notice.js"></script>
</html>