-- 그린중/고등학교 수행평가 일정 및 점수 관리시스템 
-- 1)사용자 : 학생, 선생님
-- 2)회원가입 : 학생, 선생님
-- 3)로그인 : 학생, 선생님
-- 4)나이스 : 미리제공정보 끌어다 사용 
-- (학생 학교, 학년, 학반, 학번, 학생이름 ) 
-- (선생님 소속된 학교, 과목명, 담당학년, 수업명, 해당학년, 해당학기, 담당반)

-- --- 기능
-- 1) 선생님 기능 : 학생정보, 학사일정, 수행평가일정등록, 수행평가제출, 수행평가점수등록, 수행평가점수확인, 선생님정보관리(과목, 수업)
-- 2) 학생 기능 : 점수조회, 이의신청, 수행평가일정조회

-- --- 요구사항분석
-- 1) 나이스 : 
-- 선생님 : 회원가입(O-정교사, 기간제교사, 산학교사 등등), 아이디, 비번, 담당과목, 담당수업
-- 학생 : 소속학교, 올해의 학년, 학반, 학번, 회원가입(X), 바로로그인한 직후 비번변경, 로그인

-- 2) 선생님 기능
-- - 수행평가일정등록 : 수행평가날짜(시작일시, 종료일시), 수행평가과목/수업, 과제/평가, 평가기준, 수행평가내용
-- - 내가 등록한 수행평가 리스트보기, 수정, 삭제
-- - 점수입력 / 점수확정 / 점수수정
-- - 선생님 정보 관리

-- 3) 학생 기능
-- - 일정보기, 상세조회, 내점수조회, 이의신청, 점수확정

-- 4) 필요하다고 생각되는 테이블
-- 학생정보
-- 선생님
-- 수행평가
-- 수업
-- 수강생정보
-- 점수

-- 5) 학생테이블 : 나이스에서 받아오는 정보
-- P.K : 연도 +학년+학반+학번
-- 학생이름 : VARCHAR, NN
-- 연도 : INT, CHAR, VARCHAR, DATE, NN, DEFAULT VALUE(올해로)
-- 학년 : INT, CHAR, VARCHAR, NN
-- 학반 : INT, CHAR, VARCHAR, NN
-- 학번 : INT, CHAR, VARCHAR, NN
-- 패스워드 : VARCHAR, NN, DEFAULT VALUE(PK / 1234)

-- 6) 선생님테이블 : 
-- ID : P.K. VARCHAR, NN
-- 패스워드 : VARCHAR, NN
-- 이름 : VARCHAR, NN
-- 과목 : VARCHAR, NN
-- 교사상태 : CHAR(1) - 0:정교사 / 1:기간제교사 / 2:방과후교사 / 3:산학교사 / 4:기타, N, DEFAULT VALUE(기타)


-- 선생님 - 수업개설 - 수업등록 - 학생
-- 7) 수업테이블 : 
-- ID : 프라이머리키
-- 수업명 : 
-- 개선된 연도 :
-- 개설된 학기 :
-- 개설학년 : 
-- 개설학반 :
-- 수업요일 :  
-- 수업시간 :
-- 교실 : 
-- F.K : 교사의 ID - 해당과목/교사명 

-- 8) 수강생정보 테이블 : 
-- F.K : 수업테이블ID
-- F.K : 학생 ID - 학생이름(수강생이름)
-- F.K : 학생 ID - 학생이름(수강생이름)

-- 9)수행평가 테이블
-- ID :
-- 수행평가 제목 :
-- 수행평가 수업 : (사라짐)
-- 수행평가 날짜(기간) : (시작일과 종료일, 시작일시로 시간까지 포함)
-- 수행평가 타입 : 과제형, 시험형 등
-- 수행평가 내용 : 
-- 수행평가 담당선생님 :
-- 수행평가 채점기준 : 
-- F.K : 수업ID -> 수행평가수업, 수행평가 담당선생님
-- F.K : 수행평가에 해당되는 학생 정보(?)

-- 10) 점수 : 점수의 이의신청, 점수확정 -> 변동이력 남길건지 ?
-- F.K : 수행평가 ID :
-- F.K : 학생 ID :
-- 점수 :
-- 확정여부 :
-- 확정일시 :


create database highschool;

use highschool;

-- 학생테이블
create table Students(
	s_id varchar(15) not null primary key,
	s_name varchar(20) not null,
    s_year date not null default(sysdate()),
    s_grade varchar(2) not null,
    s_class varchar(2) not null,
    s_number varchar(2) not null,
    s_password varchar(20) not null default'1234'
    -- primary key(s_year, s_grade, s_class, s_number)
);

-- 선생님테이블
create table Teacher(
	t_id varchar(15) not null primary key,
    t_password varchar(20) not null,
    t_name varchar(20) not null,
    t_subject varchar(20) not null,
    t_type char(1) default 9
);

create table Lesson(
	l_id integer auto_increment primary key,
    t_id varchar(15) not null,
    l_name varchar(20) not null,
    l_Oyear char(4) not null,
    l_Ograde varchar(2) not null,
    l_Osemester char(1) not null,
    l_Oclass varchar(2) not null,
    l_day char(1) not null,
    l_time varchar(2) not null,
    l_room varchar(20) null,
    foreign key(t_id) references Teacher(t_id)
);

create table chulsuk(
	s_id integer not null,
    l_id integer not null,
    primary key(l_id, s_id),
    foreign key(s_id) references Students(s_id),
    foreign key(l_id) references Lesson(l_id)
);

create table perform(
	p_id integer auto_increment primary key,
    p_title varchar(100) not null,
    p_type char(1) null,
    p_content tinytext not null,
    p_kijun varchar(100) null,
    p_startdate date not null,
    p_enddate date not null,
    l_id integer not null,
    foreign key(l_id) references Lesson(l_id)
);

create table evaluation(
	-- e_id integer auto_increment primary key,
    s_id integer not null,
    p_id integer not null,
    e_score integer not null,
    e_check char(1) null,
    e_checkdate date null,
    primary key(s_id, p_id),
    foreign key(s_id) references Students(s_id),
    foreign key(p_id) references perform(p_id)
);









