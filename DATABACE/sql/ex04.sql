-- 오늘 배울거 rdb수업 데이터 조작어(DML), 내장함수

select abs(-78), abs(+78); -- abs: 절대값. 자료형이 int거나 하면 얼터 하기전에 abs 하고 얼터함.
select round(4.875,1); -- 반올림, (a,b) a를 소수점 b자리 까지 반올림. b 안적으면 소수 첫째자리에서 반올림.
 
-- 고객별 평균 주문 금액을 100원 단위로 반올림
select name, round(avg(saleprice),-2) as average
from customer C, orders O
where (C.custid=O.custid)
group by name;

select name, round(avg(saleprice/100))*100 as '평균주문금액' 
from Customer,Orders
where Customer.custid=Orders.custid
group by Customer.name;

select concat('마당','s2'); -- 두 문자열을 연결
select lower('Mr.Lawrence'); -- 모두 소문자화
select upper('Mr.Lawrence'); -- 모두 대문자화
select lpad('page 1',10,"*");-- 문자열의 왼쪽부터 지정자리수 만큼 채움 (rpad 는 오른쪽부터)
select replace('jack & jue','j','bl');
select substr('ABCDEFG',3,4); -- 문자열중 3번째 부터 4개를 잘라와라.
select trim('=' from "=A= B= C= D= E="); -- 양끝자르기 

-- 도서 제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 나타내세요.
select bookname, replace(bookname,'야구','농구')as changes
from book
where bookname like '%야구%';

-- 굿스포츠에서 출판한 도서의 제목과 제목의 ㅁ누자수, 바이트수를 출력하세요
select bookname, char_length(bookname) as charlen, length(bookname) as byte
from book
where publisher='굿스포츠';

-- 마당서점의 고객중에서 성이 같은 사람이 몇명이나 되는지 알고싶다. 姓 별 인원수를 구하라.
select substr(name,1,1) as 성 ,count(*) as 인원
from customer
group by 성;

select adddate('2024-07-01',interval -5 day) before5, -- 일자로부터 -5일 +5일
	   adddate('2024-07-01',interval 5 day) after5;
     
-- 마당서점은 주문일로부터 10일 후에 매출을 확정한다. 각 주문의 확정일자를 구하세요

select bookid, orderdate, adddate(orderdate,interval +10 day) as 매출확정일
from orders;

-- 2024년7월4일 주문받은 도서를 모두 나타내세요. 단 주문일은 240704 , jul 04 2024 , 24 07 04 요일 형태로.
select orderid, orderdate,date_format(orderdate,'%y%m%d')as ymd,date_format(orderdate,'%b %d %Y')as bdY,date_format(orderdate,'%y %m %d')as bbb ,custid ,bookid
from orders
where orderdate in ('2024-07-04');

-- <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 뷰 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
-- ex) 오더 테이블에 책이름, 고객이름 넣으라면 걍 때려넣을수도 잇지만 조인 한다음 뷰를 만들어서 쓰는게 좋음
	
create view vorders
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
from customer C, book B, orders O
where (C.custid = O.custid) and (B.bookid=O.bookid); 
       
select* from vorders;

-- 대한민국 거주 고객들로 구성된 뷰를 만들고 조회하세요. 뷰 이름은 vw_customer

create view vw_customer
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate, address
from customer C, book B, orders O
where (C.custid = O.custid) and (B.bookid=O.bookid) and address like '%대한민국%'; 
       
select* from vw_customer;

-- 오더 테이블에서 고객명과 도서명을 확일할수 있는 뷰를 생성한 후 , 김연아 고객이 구입한 도서의 주문번호 도서명 주문액을 출력하세요

create view 하기싫다
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
from customer C, book B, orders O
where (C.custid = O.custid) and (B.bookid=O.bookid); 

select orderid, bookname, saleprice
from 하기싫다
where name='김연아';

create table mybook(
	bookid integer not null,
    price integer null
);

INSERT INTO mybook VALUES(1,10000);
INSERT INTO mybook VALUES(2,20000);
INSERT INTO mybook VALUES(3,null);
insert into mybook(bookid) value(4);

select*from mybook;

alter table mybook add primary  key (bookid);

select price+100
from mybook
where bookid=3;

select sum(price),avg(price),count(*),count(price)
from mybook
where bookid >= 4;

select * from mybook
where price is null;

select count(*) from mybook
where price is null;

select * from mybook
where price = 0;

select count(*) from mybook
where price = 0;

select name as 이름, ifnull(phone,'연락처없음') as 전화번호
from customer;

select * from mybook;

select bookid , ifnull(price, '가격미입력') as price
from mybook;













