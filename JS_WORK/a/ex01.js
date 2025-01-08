
// flase 값
const f1 = undefined;
const f2 = null;
const f3 = 0;
const f4 = -0;
const f5 = NaN;

const result = f1 && "result"
console.log(result)


// true 갑
const t1 = "result"
const t2 = 123
const t3 = [];
const t4 = {};
const t5 = ()=>{};
// const t6 = new A(20);


const result2 = t1 && "result2222"
console.log(result2)


// function printName(test){
//     if(test){
//         console.log("출력된다.")
//     }
// }
// printName(f5)


function aa(a){
    if(a){
        console.log(a)
    }
}
aa({
    a:10,
    b:20,
})

console.log(aa)



