const express = require('express')

const app = express();

app.get('/',(req,res)=>{
    res.send('hellow')
})

app.listen(3000, ()=>{
    console.log('서버시작')
})
