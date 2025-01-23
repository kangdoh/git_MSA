// 콜백함수, 그냥 차례를 정하는 느낌인것 같다.

function aa(callback){
    setTimeout(()=>{
        console.log("콜백함수 호출a")
        callback();
    }, 3000)
}
function bb(callback){
    setTimeout(()=>{
        console.log("콜백함수 호출b")
        callback();
    }, 4000)
}
function cc(callback){
    setTimeout(()=>{
        console.log("콜백함수 호출c")
        callback();
    }, 5000)
}



aa(()=>{
    console.log("aaa")
    bb(()=>{
        console.log("bbb")
        cc(()=>{
            console.log("ccc")
        })
    })
})
