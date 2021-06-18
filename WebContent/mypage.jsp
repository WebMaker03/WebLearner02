<%@page import="DTO.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- responsive-->
<link rel="stylesheet" href="css/responsive.css">
<!-- Mypage css -->
<link rel="stylesheet" href="css/Mypage.css">

</head>
<body>

   <jsp:include page="header.jsp"></jsp:include>

   <div class="theme">
      <div class="container1" style="margin-top: 80px; margin-bottom: 30px;">
         <h2 style="font-size: 40px;">
            <strong>마이페이지</strong>
         </h2>
         <br>
         <div class="row">
            <div class="col">
                        <div class="card p-2 text-center">
                           <div class="row">
                              <div class="col-md-7 border-right no-gutters">
                                 <div class="py-3">
                                    <img src="https://i.imgur.com/hczKIze.jpg" width="100" class="rounded-circle">
                                    <h4 class="text-secondary">Name</h4>
                                    <div class="stats">
                                       <div class="mt-4">
                                          <div class="cardP">현재 포인트는 ____P입니다.</div>
                                          <div class="px-3">
                                             <button type="button" class="btn btn-light btn-block"
                                                style="margin-left: 35px; width: 350px; font-size: 20px;">Point
                                                recharge</button>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                              <div class="col-md-5">
                                 <div class="py-3">
                                    <div>
                                       <span class="d-block head">ID</span> <span class="bottom">User
                                          Name</span>
                                    </div>
                                    <div class="mt-4">
                                       <span class="d-block head">Age</span> <span class="bottom">23</span>
                                    </div>
                                    <div class="mt-4">
                                       <span class="d-block head">Email</span> <span
                                          class="bottom">CodeRunner@gmail.com</span>
                                    </div>
                                    <div class="mt-4">
                                       <div class="px-3">
                                          <button type="button" class="btn btn-light btn-block"
                                             style="font-size: 18px;">Change Info</button>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
            </div>
            <div class="col">

               <div class="card"
                  style="width: 300px; height: 350px; margin-left: 70px;">
                  <div class="card-body">
                     <a href="#" class="btn btn-light"
                        style="margin-top: 30px; margin-left: 40px;"> 작성한 게시글 & 댓글</a><br>
                     <a href="#" class="btn btn-light"
                        style="margin-top: 20px; margin-left: 40px;"> 게시글 저장 목록 </a> <br>
                     <a href="#" class="btn btn-light"
                        style="margin-top: 20px; margin-left: 40px;"> 인증현황 보러가기 </a>
                  </div>
               </div>
            </div>
         </div>
      </div>

   <hr>
   <div class="container1" style="margin-top: 30px;">
      <h2 style="font-size: 40px;">
            <strong>나의 챌린지 현황</strong>
         </h2>
      <div class="row">
         <div class="col">
            <table class="table" style="width: 600px; margin-top: 30px; margin-bottom: 100px; color: black; text-align: center; background-color: white;">
               <caption style="font-size: 25px; caption-side: top;">
                  <strong>진행중인 챌린지</strong>
                  <div align="right" style="font-size: 18px;">___개 진행중</div>
               </caption>
               <thead>
                  <tr>
                     <th scope="col">no.</th>
                     <th scope="col">Title</th>
                     <th scope="col"></th>
                  </tr>
               </thead>
               <tbody>
                  <tr>
                     <th scope="row">1</th>
                     <td>challenge1</td>
                     <td>
                        <nav>
                           <ul class="pager"
                              style="background-color: #6495ED; margin-left: 25%; width: 150px;">
                              <li><a href="#" style="color: white;">인증보러가기</a></li>
                           </ul>
                        </nav>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">2</th>
                     <td>challenge2</td>
                     <td>
                        <nav>
                           <ul class="pager"
                              style="background-color: #6495ED; margin-left: 25%; width: 150px;">
                              <li><a href="#" style="color: white;">인증보러가기</a></li>
                           </ul>
                        </nav>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>challenge3</td>
                     <td>
                        <nav>
                           <ul class="pager"
                              style="background-color: #6495ED; margin-left: 25%; width: 150px;">
                              <li><a href="#" style="color: white;">인증보러가기</a></li>
                           </ul>
                        </nav>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>challenge3</td>
                     <td>
                        <nav>
                           <ul class="pager"
                              style="background-color: #6495ED; margin-left: 25%; width: 150px;">
                              <li><a href="#" style="color: white;">인증보러가기</a></li>
                           </ul>
                        </nav>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>challenge3</td>
                     <td>
                        <nav>
                           <ul class="pager"
                              style="background-color: #6495ED; margin-left: 25%; width: 150px;">
                              <li><a href="#" style="color: white;">인증보러가기</a></li>
                           </ul>
                        </nav>
                     </td>
                  </tr>
               </tbody>
            </table>
         </div>
         <div class="col">
            <table class="table"
               style="width: 600px; margin-top: 30px; color: black; text-align: center; background-color: white;">
               <caption style="font-size: 25px; caption-side: top;">
                  <strong>종료된 챌린지</strong>
                  <div align="right" style="font-size: 18px;">___개 완료</div>
               </caption>

               <thead>
                  <tr>
                     <th scope="col">no.</th>
                     <th scope="col">Title</th>
                     <th scope="col">progress</th>
                  </tr>
               </thead>
               <tbody>
                  <tr>
                     <th scope="row">1</th>
                     <td>challenge1</td>
                     <td>
                        <div class="progress">
                           <div class="progress-bar" role="progressbar" aria-valuenow="80"
                              aria-valuemin="0" aria-valuemax="100" style="width: 80%;">80%</div>
                        </div>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">2</th>
                     <td>challenge2</td>
                     <td>
                        <div class="progress">
                           <div class="progress-bar" role="progressbar" aria-valuenow="60"
                              aria-valuemin="0" aria-valuemax="100" style="width: 60%;">60%</div>
                        </div>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>challenge3</td>
                     <td>
                        <div class="progress">
                           <div class="progress-bar" role="progressbar"
                              aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"
                              style="width: 100%;">100%</div>
                        </div>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>challenge3</td>
                     <td>
                        <div class="progress">
                           <div class="progress-bar" role="progressbar" aria-valuenow="40"
                              aria-valuemin="0" aria-valuemax="100" style="width: 40%;">40%</div>
                        </div>
                     </td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>challenge3</td>
                     <td>
                        <div class="progress">
                           <div class="progress-bar" role="progressbar" aria-valuenow="0"
                              aria-valuemin="0" aria-valuemax="100" style="width: 0%;">0%</div>
                        </div>
                     </td>
                  </tr>
               </tbody>
            </table>
         </div>
      </div>
   </div>
   </div>

   <!-- footer start -->
   <jsp:include page="footer.jsp"></jsp:include>

</body>
</html>