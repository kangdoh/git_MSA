let arr = [1,2,3];
let brr = [4,5,6];
let myarr = [{age:20, name:"홍길동"}, {age:45, name:"박길동"}, {age:30, name:"김길동"}]


console.log(arr+brr);
console.log(arr.concat(brr));

// fillter 주어진 함수에 predicate true -> 새로운 배열...
const crr = arr.filter((n)=>n%2==0);
console.log(crr);


const drr = arr.concat(brr).filter((n)=>n%2==0);
console.log(drr);

const fillter =myarr.filter(item=>item.age>20);
console.log(fillter);

