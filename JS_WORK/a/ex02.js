const a = [1,2,3,4,5,6];
const [e1,e2,e3,e4] = a;

console.log(`e1 = ${e1}`);
console.log(`e2 = ${e2}`);
console.log(`e3 = ${e3}`);
console.log(`e4 = ${e4}`);


function aa([a,b,c]){
    console.log(`a = ${a}`);
    console.log(`b = ${b}`);
    console.log(`c = ${c}`);
}
aa([10,20,30])


