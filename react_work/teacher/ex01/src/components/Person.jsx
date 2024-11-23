import React, { useState } from 'react'

function Person({ name:personName, age:personAge }) {

    const [name, setpName] = useState(personName);
    const [age, setpAge] = useState(Number(personAge));

    const onName =()=>{
        setpName(name);
    }
    const onAge =()=>{
        setpAge(age+1)
    }

  return (
    <div>
        <h1>Person</h1>        
        <p>This is a person compenent.</p>
        <h2>이름은 = {name}</h2>
        <h2>나이는 = {age}</h2>


        <button onClick={onName}>이름증가</button>
        <button onClick={onAge}>나이증가</button>
    </div>
  )
}

export default Person
