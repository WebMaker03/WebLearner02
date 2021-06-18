<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<c:forEach var="v" items="${show_challenge}" varStatus="status">
   <c:choose>
      <c:when test="${status.first}">
         <div class="carousel-item active">
            <div class="container-fluid">
               <div class="carousel-caption we1_do">
                  <div class="row">
                     <div class="col-md-4">
                        <div id="bo_hoo" class="we_boxx text_align_center">
                           <i><img src="images/we1.png" alt="#" /></i>
                           <h3>${v.c_name}</h3>
                           <p>${status.index}</p>
                           <a href="showchal.ch?challenge=${v.c_code}">신청하기</a>
                        </div>
                     </div>
      </c:when>
      <%-- <c:when
         test="${status.index %3 == 0 && status.index eq fn:length(show_challenge)}">
         <div class="carousel-item active">
            <div class="container-fluid">
               <div class="carousel-caption we1_do">
                  <div class="row">
                     <div class="col-md-4">
                        <div id="bo_hoo" class="we_boxx text_align_center">
                           <i><img src="images/we1.png" alt="#" /></i>
                           <h3>${v.c_name}</h3>
                           <p>${status.index}</p>
                           <a class="read_moree" href="Chall_Detail.jsp">신청하기</a>
                        </div>
                     </div>
      </c:when> --%>
      <c:when test="${status.index %3 == 0}"> <!-- 새로 시작하는 경우 -->
         <div class="carousel-item">
            <div class="container-fluid">
               <div class="carousel-caption we1_do">
                  <div class="row">
                     <div class="col-md-4">
                        <div id="bo_hoo" class="we_boxx text_align_center">
                           <i><img src="images/we1.png" alt="#" /></i>
                           <h3>${v.c_name}</h3>
                           <p>${status.index}</p>
                           <a href="showchal.ch?challenge=${v.c_code}">신청하기</a>
               
                        </div>
                     </div>
      </c:when>
      <c:when
         test="${status.index%3 != 2 && status.index != fn:length(show_challenge) }">
         <!-- 그냥 열만 들어가는 경우 -->
         <div class="col-md-4">
            <div id="bo_hoo" class="we_boxx text_align_center">
               <i><img src="images/we1.png" alt="#" /></i>
               <h3>${v.c_name}</h3>
               <p>${status.index}</p>
               <a href="showchal.ch?challenge=${v.c_code}">신청하기</a>
            </div>
         </div>
      </c:when>
      <c:otherwise> <!-- 마지막은 아니고 행 닫아야 하는 경우 -->
         <div class="col-md-4">
            <div id="bo_hoo" class="we_boxx text_align_center">
               <i><img src="images/we1.png" alt="#" /></i>
               <h3>${v.c_name}</h3>
               <p>${status.index}</p>
               <a href="showchal.ch?challenge=${v.c_code}">신청하기</a>
            </div>
         </div>
         </div>
         </div>
         </div>
         </div>
         </div>

      </c:otherwise>
   </c:choose>
</c:forEach>