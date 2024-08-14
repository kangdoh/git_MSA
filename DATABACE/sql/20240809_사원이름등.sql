-- --- Date 타입 처리 문제
-- 5. 부서별, 연도별 입사한 사원의 수를 구하세요. 



-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
select first_name, last_name
from employees E
having length(E.first_name)+length(E.last_name) > 8;

-- 2. 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.
select first_name, last_name
from employees E
where substr(E.last_name, 1,1) like upper('_');

-- 3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
select first_name, last_name
from employees E
where substr(E.last_name, 2,1) like 'c';

-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
select street_address
from locations L
where length(L.street_address) in (select min(length(street_address))
from locations);

-- 5. 이름이 'A','J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.
select last_name, first_name
from employees E
where substr(E.first_name, 1,1) like 'A' or
substr(E.first_name, 1,1) like 'J' or
substr(E.first_name, 1,1) like 'M';


-- 1. 1987년에 입사한 사원의 이름을 출력하세요.
select concat(E.last_name, E.first_name) as 'full_name'
from employees E
-- date_format 날짜를 문자로 바꾼다. 
where date_format(E.hire_date, '%Y') = '1987';

-- 2. 사원의 이름, 입사년도, 근무년수를 출력하세요.
-- select concat(last_name, first_name) as 'full name', hire_date,
-- adddate(sysdate(), interval - E.hire_date)
-- from employees E;

-- 3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.
select first_name, hire_date
from employees
where hire_date between '1930-01-01' and '2000-07-30'; 

-- 4. 6월에 입사한 사원의 이름과 성을 출력하세요.
select first_name, last_name
from employees
where hire_date like 'y%-6%-D%';








