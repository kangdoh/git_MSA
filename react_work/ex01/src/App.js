import React from "react";
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


function App() {
  return (
    <>
      <BrowserRouter>
        <Nav></Nav>

        <Routes>
          <Route path="/" element={<Home />}>
            <Route path="kakao" element={<Kakao />}></Route>  
            <Route path="" element={<Navigate to="google" />} />
            <Route path="google" element={<Google />}></Route>
          </Route>


          <Route path="/company" element={<Company />}></Route>


          <Route path="/product" element={<Product />}></Route>
          <Route path="/product/:a/:b/:c/:d/:e" element={<ProductDetailPage />}></Route>


          <Route path="/qa" element={<Qa />}></Route>
          <Route path="*" element={<NotFound />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
