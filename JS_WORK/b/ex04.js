const arr1 = [10,3,5];
// const sortArr1 = arr1.sort((a,b)=>{
//     if(a>b){
//         return -1;
//     }
//     else if(a<b){
//         return 1;
//     }
//     else{
//         return 0;
//     }
// });
const sortArr1 = arr1.sort((a,b)=>{
    return a-b;
})
console.log(sortArr1)


const arr2 = [
    {name:"홍길동", age:20},
    {name:"김길동", age:15},
    {name:"이길동", age:30},
];
const age = arr2.sort((a,b)=>{
    return b.age-a.age
})
console.log(age)


const arr3 = ["안녕", "아하하하"]
console.log(arr3.join(""));

