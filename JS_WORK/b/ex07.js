const doA=()=>{
    const promis = new Promise((resolve, reject)=>{
        setTimeout(()=>{
            // resolve('작동');
            reject('안됨')
        }, 3000)
    });
    return promis
}

// console.log(promis)

doA()
// then 이란 통신이 끝나고 나면, resolve를 받아올수있음
.then((result)=>{console.log(result);})
// catch란, reject를 받아올수 있음
.catch((result)=>{console.log(result);})



