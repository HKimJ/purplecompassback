create table users(
      id varchar2(20) primary key,
      nickname varchar2(30),
      email varchar2(30) not null,
      password varchar2(20) not null,
      admin number(2),
      joinDate Date default sysdate,
      profileImage varchar2(30)
);
