import { cc } from "./myclass.js";

const [a,b,c] = cc;



document.querySelector('#orange').onclick=()=>{
    console.log("확인");
    console.log(`a = ${a}`);
}