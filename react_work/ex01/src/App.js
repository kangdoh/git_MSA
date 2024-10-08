import React from "react";
import { BrowserRouter as Router, useNavigate } from "react-router-dom";
import Nav from "./component/Nav";
import Rview from "./@Router/Rview";
import Rview2 from "./@Router/Rview2";

function App() {
  const navigate = useNavigate();
  const onClick = () => {
    navigate("/page1");
  };

  return (
    <>
      <div>
        <Router>
          <Nav />

          <Rview />

          <article style={{ height: "100vh", width: "100vw" }}>
            <div
              style={{
                width: "100px",
                height: "100px",
                backgroundColor: "yellow",
              }}
            >
              1
            </div>
            <div
              onClick={onClick}
              style={{
                width: "100px",
                height: "100px",
                backgroundColor: "red",
              }}
            >
              2
            </div>
            <div
              style={{
                width: "100px",
                height: "100px",
                backgroundColor: "blue",
              }}
            >
              3
            </div>
          </article>
        </Router>
      </div>

      <Router>
        <Nav />
        <Rview2 />
      </Router>

      <div>dfasdasd</div>
    </>
  );
}

export default App;
