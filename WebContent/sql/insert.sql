use codelearner2;

/* 가상데이터 insert */

/*users 테이블*/
insert into users(usersid, userspw, u_name, age, email) values('hong', 'a1234567', '홍길동', 20, 'email1@gmail.com');
insert into users(usersid, userspw, u_name, age, email) values('lim', 'a1234567', '임꺽정', 30, 'email2@gmail.com');
insert into users(usersid, userspw, u_name, age, email) values('kim', 'a1234567', '김유저', 15, 'email3@gmail.com');
select * from users;

/* challenges 테이블 */
insert into challenges(c_name, theme, img) values('공부챌린지1','공부', '공부사진1');
insert into challenges(c_name, theme, period, img) values('독서챌린지1','독서', 30, '독서사진1');
insert into challenges(c_name, theme, fee, img) values('운동챌린지1','운동', 500, '운동사진1');
insert into challenges(c_name, theme, fee, period, img) values('생활습관챌린지1','생활습관', 500, 30, '생활습관사진1');
select * from challenges;

/* myC 테이블 */

/* 끝난챌린지*/
insert into myC(c_code, u_code, state ,startD, finishD, achievementPercentage, img) values(1, 1, true, '2021-05-17 00:00:00','2021-05-31 00:00:00', 50, '챌린지사진1');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(2, 2, true , '2021-05-01 00:00:00', '2021-05-31 00:00:00', 60, '챌린지사진2');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(3, 3, true ,'2021-05-17 00:00:00', '2021-05-31 00:00:00', 70, '챌린지사진3');

/* 진행중챌린지*/
insert into myC(c_code, u_code, state ,startD, finishD, achievementPercentage, img) values(1, 1, true, '2021-06-05 00:00:00','2021-06-20 00:00:00', 50, '챌린지사진4');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(2, 2, true , '2021-06-01 00:00:00', '2021-07-01 00:00:00', 60, '챌린지사진5');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(3, 3, true ,'2021-06-15 00:00:00', '2021-06-20 00:00:00', 70, '챌린지사진6');

select * from myC;

/* verification 테이블*/
insert into verification(u_code, mc_code, v_text, v_img) values(1, 1, '인증텍스트1', '인증사진1');
insert into verification(u_code, mc_code, v_text, v_img) values(2, 2, '인증텍스트2','인증사진2');
insert into verification(u_code, mc_code, v_text, v_img) values(3, 3, '인증텍스트3','인증사진3');
select * from verification;



/* board, post, comments*/
insert into board (c_code) values(1);
insert into board (c_code) values(2);
insert into board (c_code) values(3);
insert into board (c_code) values(4);
select* from board;

insert into post (u_code,b_code,p_text) values(1,1,'게시물1');
insert into post (u_code,b_code,p_text) values(2,2,'게시물2');
insert into post (u_code,b_code,p_text) values(3,3,'게시물3');
select* from post;

insert into comments (u_code,p_code,cm_text) values(1,1,'댓글1');
insert into comments (u_code,p_code,cm_text) values(2,2,'댓글2');
insert into comments (u_code,p_code,cm_text) values(3,3,'댓글3');
select* from comments;