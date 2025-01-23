// map은 반환되는값 있는경우, forEach 반화되는 값이 없는 경우

const arr1 = [1,2,3];

// 중괄호 없으면 람다문법
const map1 = arr1.map(item=>{return item+1});
const map2 = arr1.map(item=>item+1);

const foreach = arr1.forEach(item=>{return item+1})

console.log(map1)
console.log(map2)
console.log(foreach)

