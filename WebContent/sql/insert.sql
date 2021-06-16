use codelearner2;

/* �������� insert */

/*users ���̺�*/
insert into users(userid, userpw, u_name, age, email) values('hong', 'a1234567', 'ȫ�浿', 20, 'email1@gmail.com');
insert into users(userid, userpw, u_name, age, email) values('lim', 'a1234567', '�Ӳ���', 30, 'email2@gmail.com');
insert into users(userid, userpw, u_name, age, email) values('kim', 'a1234567', '������', 15, 'email3@gmail.com');
select * from users;

/* challenges ���̺� */
insert into challenges(c_name, theme, img) values('����ç����1','����', 'challenge1.jpg');
insert into challenges(c_name, theme, period, img) values('����ç����1','����', 30, 'challenge3.jpg');
insert into challenges(c_name, theme, fee, img) values('�ç����1','�', 500, 'challenge2.jps');
insert into challenges(c_name, theme, fee, period, img) values('��Ȱ����ç����1','��Ȱ����', 500, 30, 'challenge4.jpg');
select * from challenges;

/* myC ���̺� */

/* ����ç����*/
insert into myC(c_code, u_code, state ,startD, finishD, achievementPercentage, img) values(1, 1, true, '2021-05-17 00:00:00','2021-05-31 00:00:00', 50, 'ç��������1');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(2, 2, true , '2021-05-01 00:00:00', '2021-05-31 00:00:00', 60, 'ç��������2');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(3, 3, true ,'2021-05-17 00:00:00', '2021-05-31 00:00:00', 70, 'ç��������3');

/* ������ç����*/
insert into myC(c_code, u_code, state ,startD, finishD, achievementPercentage, img) values(1, 1, true, '2021-06-05 00:00:00','2021-06-20 00:00:00', 50, 'ç��������4');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(2, 2, true , '2021-06-01 00:00:00', '2021-07-01 00:00:00', 60, 'ç��������5');
insert into myC(c_code, u_code, state, startD, finishD, achievementPercentage, img) values(3, 3, true ,'2021-06-15 00:00:00', '2021-06-20 00:00:00', 70, 'ç��������6');

select * from myC;

/* verification ���̺�*/
insert into verification(u_code, mc_code, v_text, v_img) values(1, 1, '�����ؽ�Ʈ1', '��������1');
insert into verification(u_code, mc_code, v_text, v_img) values(2, 2, '�����ؽ�Ʈ2','��������2');
insert into verification(u_code, mc_code, v_text, v_img) values(3, 3, '�����ؽ�Ʈ3','��������3');
select * from verification;



/* board, post, comments*/
insert into board (c_code) values(1);
insert into board (c_code) values(2);
insert into board (c_code) values(3);
insert into board (c_code) values(4);
select* from board;

insert into post (u_code,b_code, p_title,p_text) values(1,1,'�Խù�����1','�Խù�1');
insert into post (u_code,b_code, p_title,p_text) values(2,2,'�Խù�����2','�Խù�2');
insert into post (u_code,b_code, p_title,p_text) values(3,3,'�Խù�����3','�Խù�3');
select* from post;

insert into comments (u_code,p_code,cm_text) values(1,1,'���1');
insert into comments (u_code,p_code,cm_text) values(2,2,'���2');
insert into comments (u_code,p_code,cm_text) values(3,3,'���3');
select* from comments;