# 37-c. 데이터 관리를 DBMS에게 맡기기 : 무결성 제약 조건 다루기

이번 훈련에서는,
- **무결성 제약 조건(integrity constraints)** 중에서 외부 키를 사용하는 방법을 배울 것이다.


## 훈련 목표
- **무결성 제약 조건** 의 의미를 이해한다.
- **외부 키** 를 설정하는 방법과 활용하는 방법을 연습한다.

## 훈련 내용
-

## 실습

### 1단계 - 프로젝트 테이블(pms_project)과 작업 테이블(pms_task)에 외부 키 제약 조건을 설정한다.

- 프로젝트 테이블을 재정의한다.
```
/* 프로젝트와 멤버의 다대다 관계를 재정의한다. *.
create table pms_member_project(
  member_no int not null,
  project_no int not null
);

/* 다대다 관계를 저장할 컬럼의 대해 FK를 설정한다. */
alter table pms_member_project
add constraint pms_member_project_fk1 foreign key(member_no) references pms_member(no),
add constraint pms_member_project_fk2 foreign key(project_no) references pms_project(no);

/* 프로젝트-멤버 정보가 중복 저장되지 않도록 PK로 설정한다 */
alter table pms_member_project
add constraint pms_member_project_pk primary key(member_no, project_no);

```

```
create table pms_project(
  no int not null,
  title varchar(255) not null,
  content text not null,
  sdt date not null,
  edt date not null,
  owner int not null     /* pms_member 테이블의 'no' PK 컬럼 값을 저장해야 한다. */
);

alter table pms_project
  add constraint pms_project_pk primary key(no);

alter table pms_project
  modify column no int not null auto_increment;

alter table pms_project
  add constraint pms_project_fk foreign key(owner) references pms_member(no);
```

- 프로젝트 테이블을 재정의한다.
```
create table pms_task(
  no int not null,
  content text not null,
  deadline date not null,
  owner int not null,
  status int default 0
);

ALTER TABLE [테이블 명] MODIFY [컬럼 명] [변경할 컬럼타입];
 ALTER TABLE table_name MODIFY column_name NULL;

 alter table pms_task modify int null;


alter table pms_task
  add constraint pms_project_pk primary key(no);

alter table pms_project
  modify column no int not null auto_increment;

alter table pms_task
add constraint pms_task_fk foreign key(owner) references pms_member(no);
```


```
create table pms_task(
  no int not null,
  content text not null,
  deadline date not null,
  owner int not null,
  project_no int not null, /* */
  status int default 0
);

alter table pms_task
  add constraint pms_project_pk primary key(no);

alter table pms_project
  modify column no int not null auto_increment;

alter table pms_task
add constraint pms_task_fk1 foreign key(owner) references pms_member(no);

alter table pms_task
add constraint pms_task_fk2 foreign key(project_no) references pms_project(no);
```

com.eomcs.pms.domain.Task 변경




## 실습 결과
- src/main/java/com/eomcs/pms/handler/BoardXxxCommand.java 변경
- src/main/java/com/eomcs/pms/handler/MemberXxxCommand.java 변경
- src/main/java/com/eomcs/pms/handler/ProjectXxxCommand.java 변경
- src/main/java/com/eomcs/pms/handler/TaskXxxCommand.java 변경
