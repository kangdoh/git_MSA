import React, { useReducer, useState } from 'react'

function Count() {
  
  function countReducer(oldcount, action){
    if(action.type === "UP"){
      return oldcount + action.number;
    }
    else if(action.type === "DOWN"){
      return oldcount - action.number;
    }
    else if(action.type === "ZERO"){
      return 0;
    }
  }

  const [count1, Count1Dispatch] = useReducer(countReducer, 0);
  function up1(){
    Count1Dispatch({type:"UP", number:num});
  }
  function zero(){
    Count1Dispatch({type:"ZERO"});
  }
  function down1(){
    Count1Dispatch({type:"DOWN", number:num});
  }

  const [num, setNum] = useState();
  function change(event){
    setNum(Number(event.target.value));
  } 
  
  return (
    <>
        <div>
            <input type='button' value={"+"} onClick={up1}></input>
            <input type='button' value={0} onClick={zero}></input>
            <input type='button' value={"-"} onClick={down1}></input>
            <input type="number" onChange={change}/>

            <span>{count1}</span>
        </div>
    </>
  )
}
export default Count