// const 변경불가
// let 변경가능

const aa = document.getElementById('btn_min');
// const bb = document.getElementById('btn_max');
const print_div = document.getElementById('print_div');

const n1 = document.getElementById('num1');
const n2 = document.getElementById('num2');
const n3 = document.getElementById('num3');
const n4 = document.getElementById('num4');
const n5 = document.getElementById('num5');


function min() {
    const arr = [n1.value,n2.value,n3.value,n4.value,n5.value];
    let min = arr[0];
    for (let index = 0; index < arr.length; index++) {
        const element = arr[index];
        if (Number(min) > Number(element)) {
            min = element;
        }
    }
    print_div.textContent = "최솟값은 : " + min;
}

// function max() {

// }

aa.addEventListener('click', min)
// bb.addEventListener('click', max)