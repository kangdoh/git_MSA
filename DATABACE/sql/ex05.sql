-- 변수 이름앞에 @기호를 붙이며, 치환문에는 SET과 := 기호를 사용한다..

-- set @seq:=0; 행 번호 나타내기

set @seq:= 0;

select (@seq:=@seq+1)'순번',custid, name, phone
from customer
where @seq <3 ;


-- <<<<<<<<< 서브쿼리 >>>>>>>>>>
-- 박지성이 산 책값의 합
select sum(saleprice)
from orders
where custid= (select custid
			   from customer
			   where name = '박지성');

-- 평균 주문금액 이하의 주문에 대해 주문번호와 금액을 나타내시오
select orderid , saleprice
from orders
where saleprice <= ( select avg(saleprice)
					 from orders
					 );
                     
-- "고객별 평균금액" 보다 큰 금액의 주문내역에 대해서 주문번호 고객번호 금액 나타내시요
select orderid, custid, saleprice
from orders od1
where saleprice > ( select avg(saleprice) from orders od2
					where od1.custid = od2.custid);
                    
select o1.orderid , o1.custid, avg(o1.saleprice)
from orders o1, orders o2
where o1.custid = o2.custid
group by o1.orderid;
                    

-- 3번 고객이 주문한 도서의 최고금액보다 더 비싼 도서를 구입한 주문의 주문번호와 판매금액을 표시하세요
-- (((ALL))) 모든 조건 중에 라는 뜻... 여기선 max 써도 됌
select orderid , saleprice
from orders
where saleprice >all ( select saleprice
					  from orders
					  where custid = 3); 
                      
                      
-- (((exists))) 존재하는~~
-- 대한민국에 거주 고객에게 판매한 도서의 총판매액을 표시하라
select sum(saleprice) 'total'
from Orders od
where exists(select *
			 from Customer cs
             where address like '%대한민국%' and cs.custid=od.custid);
             
-- 스칼라 서브쿼리
-- 마당서점의 고객별 판매액을 나타내시오(고객이름, 고객별판매액)
select ( select name
		 from customer cs
		 where cs.custid = od.custid) as 'name', SUM(saleprice) as 'total'
from orders od
group by od.custid;

-- 고객번호가 2 이하인 고객의 판매액을 나타내시오(고객이름, 고객별판매액 출력).
select cs.name,SUM(od.saleprice) 'total'
from (select custid,name
	  from customer
	  where custid <=2) cs, orders od
where cs.custid = od.custid
group by cs.name;


--  !!!@@@ 인덱스 @@@!!!
-- 검색 빨리 하기위해 만들어. 유니크(전번,이메일 같은거) 에다각 거는게 좋음. 쓸데없이 많이걸면 느려지기만 함.
-- create [unique] index [인덱스이름]  => 인덱스 만들기

-- 테이블 만들때 생각할것에 대해 배움....?(업무파악, 업무분석) ,명세서도 만들어얃댐 나중에






