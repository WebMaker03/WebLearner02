<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<link rel="stylesheet" href="css/SignUp.css">

<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<title>Login Page</title>
</head>
<body>
  <div class="container d-flex justify-content-center">
        <div class="col-md-6 rcol">
            <form class="sign-up">
                <h2 class="heading mb-4">Sign up</h2>
                <div class="form-group fone mt-2"> <i class="fas fa-user"></i> <input type="name" class="form-control" placeholder="Name"> </div>
                <div class="form-group fone mt-2"> <i class="fas fa-envelope"></i> <input type="email" class="form-control" placeholder="Work email"> </div>
                <div class="form-group fone mt-2"> <i class="fas fa-lock"></i> <input type="password" class="form-control" placeholder="Password">
                    <div class="image"><i class="fas fa-eye"></i></div>
                </div> <input type="checkbox" class="form-check-input ml-0" id="exampleCheck1"> <label class="form-check-label ml-3" for="exampleCheck1">I agree to Stoke <u>Terms</u> and <u>Privacy Policy</u></label>
            </form> <button type="button" class="btn btn-success mt-5">Get satrted now</button>
            <p class="exist mt-4">Existing user? <span>Log in</span></p>
        </div>
    </div>
</body>
</html>