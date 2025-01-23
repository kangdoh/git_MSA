setTimeout(()=>{
    console.log("3초 뒤에")
}, 3000)
setTimeout(()=>{
    console.log("2초 뒤에")
}, 2000)
console.log("test")


const aa = setInterval(()=>{
    console.log("2초 마다")
},2000)

setTimeout(()=>{
    clearInterval(aa)
}, 8000)




