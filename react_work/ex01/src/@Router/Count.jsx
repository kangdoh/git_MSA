import React, { useState } from 'react'

function Count() {
  const [count1, setCount1] = useState(0);
  function up1(){setCount1(count1 + 1);}
  function down1(){setCount1(count1 - 1);}
  function zero(){setCount1(count1 == 0);}
  

  return (
    <>
        <div>
            <input type='button' value={"+"} onClick={up1}></input>
            <input type='button' value={0} onClick={zero}></input>
            <input type='button' value={"-"} onClick={down1}></input>
            <span>{count1}</span>
        </div>
        <br />
        {/* <div>
            <input type='button' value={"+"} onClick={up2}></input>
            <input type='button' value={0}></input>
            <input type='button' value={"-"} onClick={down2}></input>
            <span>{count2}</span>
        </div> */}
    </>
  )
}

export default Count