create database university;

use university;

-- 교수 
create table Professor(
	p_ssn varchar(20) not null primary key,
    p_name varchar(20) not null,
    p_age integer not null,
    p_rank varchar(20) not null,
    p_speciality varchar(40) null
);

-- 학과 
create table Department(
	d_dno integer primary key,
    d_dname varchar(40) not null,
    d_office varchar(40) not null,
    
    run varchar(20) not null,
    foreign key(run) references Professor(p_ssn)
);

-- 대학원생
create table Graduate(
	g_ssn varchar(20) not null primary key,
    g_name varchar(20) not null,
    g_age integer not null,
    g_deg_prog char(1) not null,
    
	major integer not null,
    adviser varchar(20) not null,
    foreign key(major) references Department(d_dno),
	foreign key(adviser) references Graduate(g_ssn)
);

-- 과제
create table Project(
	pid integer not null primary key,
    sponsor varchar(20) not null,
    start_date date not null,
    end_date date null,
    budget integer null default'0',
    
    manage varchar(20) not null,
    foreign key(manage) references Professor(p_ssn)
);

create table work_dept(
	p_ssn varchar(20) not null,
	d_dno integer not null,
    pct_time integer not null,
    primary key(p_ssn, d_dno),
    foreign key(p_ssn) references Professor(p_ssn),
    foreign key(d_dno) references Department(d_dno)
);

 create table work_in(
	p_ssn varchar(20) not null,
    pid integer not null,
    primary key(p_ssn, pid),
    foreign key(p_ssn) references Professor(p_ssn),
    foreign key(pid) references Project(pid)
);

 create table work_prog(
	g_ssn varchar(20) not null,
    pid integer not null,
    primary key(g_ssn, pid),
    foreign key(g_ssn) references Graduate(g_ssn),
    foreign key(pid) references Project(pid)
);






















