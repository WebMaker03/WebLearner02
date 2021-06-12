<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/SignUp.css">

<title>Insert title here</title>
</head>
<body>
	<div class="container_join">
		<div class="d-flex justify-content-center">
			<form class="sign-up">
				<h2 class="heading mb-6" id="signupTitle">Sign Up</h2>
				<!--  ID -->
				<div class="form-group fone mt-5">
					<div class="input-group is-invalid">
						<div class="input-group-prepend">
							<span class="input-group-text" id="InputArea"
								style="width: 120px;">ID</span>
						</div>
						<input type="text" class="form-control is-invalid" maxlength="20"
							placeholder="ID를 입력하세요" aria-describedby="InputArea" required
							name="id">
						<!-- 중복체크 버튼 불필요 
							 <input type="button" class="Idcheckbtn"
							style="margin-left: 6px; text-align: center;" value="중복확인 ">
						 -->
					</div>

					<div class="check_font" id="id_check">
						<!--  alert -->
					</div>
				</div>
				<!--  PW -->
				<div class="form-group fone mt-4">
					<div class="input-group is-invalid">
						<div class="input-group-prepend">
							<span class="input-group-text" id="passwordArea"
								style="width: 120px;">비밀번호</span>
						</div>
						<input type="password" class="form-control is-invalid"
							maxlength="20" placeholder="비밀번호를 입력하세요"
							aria-describedby="passwordArea" required name="pw1">
					</div>
					<div class="check_font" id="pw_check">
						<!--  alert -->
					</div>
				</div>
				<!--  PW2 -->
				<div class="form-group fone mt-4">
					<div class="input-group is-invalid">
						<div class="input-group-prepend">
							<span class="input-group-text" id="passwordCheckArea"
								style="width: 120px;">비밀번호 확인</span>
						</div>
						<input type="password" class="form-control is-invalid"
							maxlength="20" placeholder="비밀번호를 입력하세요"
							aria-describedby="passwordCheckArea" required name="pw2">
					</div>
					<div class="check_font" id="pw2_check">
						<!--  alert -->
					</div>
				</div>
				<!--  name  -->
				<div class="form-group fone mt-4">
					<div class="input-group is-invalid">
						<div class="input-group-prepend">
							<span class="input-group-text" id="nameArea"
								style="width: 120px;">이름</span>
						</div>
						<input type="text" class="form-control is-invalid" maxlength="20"
							placeholder="이름을 입력하세요" aria-describedby="nameArea" required
							name="userName">
					</div>
					<div class="check_font" id="name_check">
						<!--  alert -->
					</div>
				</div>


				<!--  E-mail  -->
				<div class="form-group fone mt-4">
					<div class="input-group is-invalid">
						<div class="input-group-prepend">
							<span class="input-group-text" id="passwordArea"
								style="width: 120px;">이메일</span>
						</div>
						<input type="text" class="form-control is-invalid" maxlength="40"
							placeholder="이메일을 입력하세요" aria-describedby="passwordArea" required
							name="userEmail">
					</div>
					<div class="check_font" id="email_check">
						<!--  alert -->
					</div>
				</div>
				<!--  GENDER -->

				<div class="form-group fone mt-4">

					<div class="input-group-prepend">
						<span class="input-group-text" style="width: 120px;">성별</span>

						<div class="input-group-text" style="margin-left: 3px">
							<input type="radio" name="gender" checked="checked">
						</div>
						<span class="input-group-text" style="margin-right: 5px;">남자</span>

						<div class="input-group-text">
							<input type="radio" name="gender">
						</div>
						<span class="input-group-text">여자</span>
					</div>
				</div>


				<input type="checkbox" class="form-check-input ml-0"
					id="exampleCheck1"> <label class="form-check-label ml-4"
					for="exampleCheck1">I agree to Stoke <u>Terms</u> and <u>Privacy
						Policy</u></label> <br> <br>
				<div id="signupbtn">
					<input type="button" class="signupbtn" id="signup_btn" value="회원가입"
						onclick="button1_click();">
					<!-- onclick이랑 frm.submit() 부분 필요 -->
				</div>
				<p class="exist mt-2" style="text-align: center;">
					Existing user? <a href="login.jsp"><span>Log in</span></a>
				</p>
			</form>


		</div>

	</div>

</body>
<script type="text/javascript" src="signUp.js"></script>
<script>
function button1_click() {
	console.log("버튼1을 누르셨습니다.");
	/*  frm.submit(); */
}
</script>
</html>