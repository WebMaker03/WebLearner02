<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="css/SignUp.css">

<title>Insert title here</title>
</head>
<body>
        <div class="col-md-6 rcol">
            <form class="sign-up">
                <h2 class="heading mb-4">Sign up</h2>
				<!--  ID -->
                <div class="form-group fone mt-2"> <i class="fas fa-user"></i> <input type="id" class="form-control" placeholder="ID"> </div>
				<!--  PW -->
                <div class="form-group fone mt-2"> <i class="fas fa-lock"></i> <input type="password" class="form-control" maxlength="20" placeholder="Password"> </div>
				<!--  PW2 -->
                <div class="form-group fone mt-2"> <i class="fas fa-lock"></i> <input type="password" class="form-control" placeholder="CheckPassword">
                    <div class="image"><i class="fas fa-eye"></i></div>
				<!--  NAME -->
                <div class="form-group fone mt-2"> <i class="fas fa-user"></i> <input type="name" class="form-control" maxlength="20" placeholder="Name"> </div>
                    <div class="image"><i class="fas fa-eye"></i></div>
				<!--  EMAIL -->
                <div class="form-group fone mt-2"> <i class="fas fa-envelope"></i> <input type="email" class="form-control" placeholder="E mail"> </div>
                </div>
				<!--  GENDER -->
                <div class="form-group fone mt-2">
                <label class="form-group fone mt-2">Male<input type="radio" name="gender" value="남자" checked></label>
                <label class="form-group fone mt-2">Female<input type="radio" name="gender" value="여자"></label>
                </div>
                <div class="form-group fone mt-2">Job 
            <select>
                <option value="첫화면">Select from below</option>
                <option value="조무사">고등학생</option>
                <option value="무직">대학생</option>
                <option value="백엔드개발자">백엔드개발자</option>
                <option value="야구선수">프론트앤드개발자</option>
                <option value="주부">직장인</option>
                <option value="농부">백수</option>
            </select></div>
                 <input type="checkbox" class="form-check-input ml-0" id="exampleCheck1"> <label class="form-check-label ml-3" for="exampleCheck1">I agree to Stoke <u>Terms</u> and <u>Privacy Policy</u></label>
            </form> <button type="button" class="btn btn-success mt-5">Get started now</button>
            <p class="exist mt-4">Existing user? <a href="login.jsp"><span>Log in</span></a></p>
        </div>
</body>
</html>