const arr1 = [
    {name:"홍길동", age:20},
    {name:"김길동", age:15},
    {name:"이길동", age:30},
]

arr1.forEach(obj =>{
    console.log(obj.name)
})

const arr2 = [...arr1, {name:"강길동", age:130}];
console.log(arr2)




const findobj = arr1.find( obj => {
    if(obj.name=="홍길동" && obj.age===20){
        return obj;
    }
}); 
console.log(findobj)


const findIndex1 = arr1.findIndex( index => {
        return index == 2;
}); 
console.log(findIndex1)

