import { useState  } from "react";
import "./App.css";
import Person from "./components/Person";

function App() {
  const [data, setData] = useState (0);
  const [age, setAge] = useState (1);

  const ageClick = () => {
    // alert("Hello, React!");
    setAge(age+1);
  };
  const dateClick = () => {
    // alert("Hello, React!");
    setData(data+1);
  };

  return (
    <div className="App">
      <h1>안녕</h1>
      
      <h2>content : {data}</h2>
      <h2>age : {age}</h2>
      <button onClick={dateClick}>날짜클릭</button>
      <button onClick={ageClick}>나이클릭</button>


      <Person name="홍길동" age="20"></Person>



    </div>
  );
}

export default App;
