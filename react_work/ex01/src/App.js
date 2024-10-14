import React, { createContext, useState } from "react";
import Nav from "./component/Nav";
import Home from "./@Router/Home";
import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import Company from "./@Router/Company";
import Product from "./@Router/Product";
import Qa from "./@Router/Qa";
import Kakao from "./@Router/Kakao";
import Google from "./@Router/Google";
import ProductDetailPage from "./@Router/ProductDetailPage";
import NotFound from "./@Router/NotFound";
import Count from "./@Router/Count";

function App() {

  const [isStyled, setIsStyled] = useState(false);

  const [styles, setStyles] = useState({
    backgroundColor: "lightblue",
    color: "darkblue",
    padding: "10px",
  });

  const wb = () => {
    if (isStyled) {
      setStyles({
        backgroundColor: "lightblue",
        color: "darkblue",
        padding: "10px",
      });
    } else {
      setStyles({
        backgroundColor: "white",
        color: "black",
        padding: "20px",
      });
    }
    setIsStyled(!isStyled);
  };

  return (
    <>
      <BrowserRouter>
        <Nav></Nav>

        <button onClick={wb}>모드 / {isStyled ? "라이트모드" : "다크모드"} </button>
        
          <Stylecontext.Provider value={styles}>
          <LanguageContext.Provider value={{ name: "John Doe", age: 20 }}>

            <Routes>
            

              <Route path="/company" element={<Company />}></Route>

              <Route path="/product" element={<Product />}></Route>
              <Route path="/product/:a/:b/:c/:d/:e" element={<ProductDetailPage />}></Route>
            
              <Route path="/count" element={<Count/>}></Route>

              <Route path="/qa" element={<Qa />}></Route>
              <Route path="*" element={<NotFound />}></Route>

              <Route path="/" element={<Home />}> 
                <Route path="kakao" element={<Kakao />}></Route>
                <Route path="google" element={<Google />}></Route>
                <Route path="/" element={<Navigate to="google" />} />
              </Route>
            </Routes>
            
            </LanguageContext.Provider>
          </Stylecontext.Provider>

          {/* <Routes></Routes> */}
      </BrowserRouter>
    </>
  );
}

export default App;

export const LanguageContext = createContext();
export const Stylecontext = createContext();
