select * from Book;
select * from Orders;
select * from Customer;

select bookname from Book where price = (select max(price) from Book);
-- 서브 쿼리이다.-- 

select distinct name
from Customer, Orders
where Customer.custid = Orders.custid;

select name
from Customer
where custid in (select distinct custid from Orders);

select name, count(orderid)
from Customer, Orders
where Customer.custid=Orders.custid
group by Customer.name
order by count(orderid) desc;

-- 1번 --  
select bookname
from Book
where bookid = 1;

-- 2번 -- 
select bookname
from Book
where price>20000;

-- 3번 -- 
select name, sum(saleprice)
from Customer, Orders
where name='박지성' and Customer.custid=Orders.custid;

-- 4번 -- 
select name, count(orderid) as '총 갯수'
from Customer, Orders
where name='박지성' and Customer.custid=Orders.custid;

-- 5번 -- 
select name, count(distinct publisher) as '출판사 수'
from Customer, Book, Orders
where name='박지성'
and Customer.custid=Orders.custid 
and Book.bookid=Orders.bookid;

-- 6번 -- 
select name, bookname, price, price-saleprice as '할인된 가격'
from Orders, Customer, Book
where name='박지성' and Customer.custid=Orders.custid and Book.bookid=Orders.bookid;

-- 7번 -- 
select name, bookname
from Customer, Book, Orders
where name != '박지성'
and Customer.custid=Orders.custid and Book.bookid=Orders.bookid;

-- 8번 -- 
select count(bookid) as '도서의 총 갯수'
from Book;

-- 9번 -- 
select count(distinct publisher) as '출판사의 갯수'
from Book;

-- 10번 -- 
select name, address
from Customer;

-- 11번 -- 
select bookname, orderdate
from Book,Orders
where orderdate between'2024-07-04' and '2024-07-07'
and Book.bookid = Orders.bookid
order by orderdate;

-- 12번 -- 
select name, address
from Customer
where name like '김%';

-- 13번 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소 -- 
select name address
from Customer
where name like '김%아';

-- 14번 주문 금액의 총액과  평균금액 -- 
select  sum(saleprice) as '주문 총액',
		count(orderid) as '총 주문수',
		cast(avg(saleprice)as signed) as '평균 금액'
from Orders;

-- 15번 고객의 이름과 고객별 구매액 -- 
select name, sum(saleprice) as '구매액'
from Customer, Orders
where Customer.custid=Orders.custid
group by Customer.name;

-- 16번 고객의 이름과 고객이 구매한 도서목록 -- 
select name, bookname
from Customer, Book, Orders
where Customer.custid=Orders.custid and Book.bookid=Orders.bookid
order by Customer.name;

-- 대한미디어의 책을 산 고객의 이름을 찾아라 -- 
select name, publisher
from Customer, Orders, Book
where Book.publisher = '대한미디어' 
and Customer.custid = Orders.custid 
and Book.bookid = Orders.bookid;

select name
from Customer
where address like '대한민국 %'
union
select name
from Customer
where custid in(select custid from Orders);

select * from Customer
union all
select * from Book;

select name, address
from Customer cs
where exists (select * from Orders od where cs.custid=od.custid);

create table New(
	bookid integer primary key,
    bookname varchar(20),
    publisher varchar(20),
    price integer
);

create table NewBook(
	bookid integer primary key,
    bookname varchar(20),
    publisher varchar(20),
    price integer
);

create table NewCustomer(
	custid integer primary key,
    name varchar(40),
    address varchar(40),
    phone varchar(30)
);

create table NewOrders(
	orderid integer primary key,
    custid integer not null,
    bookid integer not null,
    saleprice integer,
    orderdate date,
    foreign key(custid) references NewCustomer(custid) on delete cascade,
    foreign key(bookid) references NewBook(bookid) on delete cascade
);

-- 추가하기 -- 
alter table NewBook add isbn varchar(13);
-- 속성변경하기 -- 
alter table NewBook modify isbn integer;
-- 삭제하기 -- 
alter table NewBook drop isbn;
-- 속성변경하기 -- 
alter table NewBook modify bookname varchar(20) not null;
-- 속성변경하기(primary key) -- 
alter table NewBook add primary key(bookname, publisher);
-- 확인하기 -- 
describe NewBook;
insert into Book(bookid, bookname,publisher, price) value(11, '스포츠의학', '한솔의학서적', 90000);



-- 1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select C.name, B.publisher as BP
from Customer C, Orders O, Book B
where C.custid=O.custid and B.bookid=O.bookid
and publisher in(C.name='박지성');

select publisher , name
from Book, Customer, Orders
where Book.bookid=Orders.bookid and Customer.custid=Orders.custid 
and publisher in (
	select publisher
	from Book , Customer , Orders 
	where Book.bookid= Orders.bookid and Customer.custid= Orders.custid 
    and name = '박지성' 
);

-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select C.name, count(B.publisher) as amount
from Customer C, Book B, Orders O
where C.custid=O.custid and B.bookid=O.bookid
group by C.name
having count(distinct B.publisher) >= 2
order by amount desc;

-- 3) 전체 고객의 30%이상이 구매한 도서 (orders 기준)
select B.bookname, count(O.bookid) as mount
from Customer C, Book B, Orders O
where C.custid=O.custid and B.bookid=O.bookid
group by B.bookname
having count(O.bookid) >= count(O.bookid)*(3/10);

-- 3) 전체 고객의 30%이상이 구매한 도서 (customer 기준)


-- ABS -- 
select ABS(-78), ABS(78);

select round(4.875);

select concat('마당', '서점');

select lower('MR.SCOTT');

select upper('mr.scott');

select lpad('Page 1', 10, "*");

select replace('jack & jue', 'j', 'bl');

select substr('ABCDEFG', 3, 4);

select trim('=' from "= A= B= C =D =E =");

select adddate('2024-07-01', interval -5 day) before5,
adddate('2024-07-01', interval 5 day) after5;



