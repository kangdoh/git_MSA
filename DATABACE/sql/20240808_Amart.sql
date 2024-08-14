-- 푸드코트 ERD- 요구사항
-- 나는 주말에 아이들과 A마트 푸트코트를 자주 이용한다. 
-- A마트 푸트코트에는 사항이, 한성면옥, 전주한식, 돈이돈가스 음식코너가 있고,
-- 각각 다섯 개 이상의 메뉴를 갖고 있다.
-- 나와 아이들은 각자 원하는 음식을 주문 기계롤 주문한다.
-- 큰 아이는 두가지 음식을 시키기도 한다.
-- 주문을 한 후 주문번호가 적힌 주문서를 가지고 기다리면 음식이 나온다.
-- 음식은 주문서와 교환하여 받아온다.


create database Amart;
use Amart;

create table corner(
	corner_id varchar(6) primary key,
    corner_name varchar(20) not null
);
create table menu(
	menu_id varchar(6) primary key,
	menu_name varchar(20) not null,
    price integer not null,
    corner_id varchar(6),
    foreign key (corner_id) references corner(corner_id)
);
create table orders(
	order_id varchar(6) not null,
    menu_id varchar(6) not null,
    cnt integer not null,
    order_date date not null,
    status char(1) null,
    foreign key (menu_id) references menu(menu_id),
    primary key(order_id, menu_id)
);





INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(1, '사항이', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(1, '사항이', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(1, '사항이', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(1, '사항이', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(1, '사항이', '1', '김치전');

INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(2, '한성면옥', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(2, '한성면옥', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(2, '한성면옥', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(2, '한성면옥', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(2, '한성면옥', '1', '김치전');

INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(3, '전주한식', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(3, '전주한식', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(3, '전주한식', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(3, '전주한식', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(3, '전주한식', '1', '김치전');

INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(4, '돈이돈까스', '1', '등심돈까스');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(4, '돈이돈까스', '1', '');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(4, '돈이돈까스', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(4, '돈이돈까스', '1', '김치전');
INSERT INTO Foodcourt(f_id, f_name, f_category, f_menu, f_price) VALUES(4, '돈이돈까스', '1', '김치전');