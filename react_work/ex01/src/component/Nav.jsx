import React from "react";
import { NavLink } from "react-router-dom";


function navSelect(isActive) {
  return isActive ? "active-link" : "";
}
function navStyle(isActive) {
  return { color: isActive ? "red" : "black" };
}


function Nav() {
  return (
    <>
      <ul>
        <li>
          <NavLink
            className={({ isActive }) => navSelect(isActive)}
            style={({ isActive }) => navStyle(isActive)}
            to="/">홈</NavLink>
        </li>
        <li>
          <NavLink 
           className={({ isActive }) => navSelect(isActive)}
           style={({ isActive }) => navStyle(isActive)}
          to="/company">회사소개</NavLink>
        </li>
        <li>
          <NavLink 
           className={({ isActive }) => navSelect(isActive)}
           style={({ isActive }) => navStyle(isActive)}
          to="/product">상품</NavLink>
        </li>
        <li>
          <NavLink 
           className={({ isActive }) => navSelect(isActive)}
           style={({ isActive }) => navStyle(isActive)}
          to="/qa">고객센터</NavLink>
        </li>
        <li>
          <NavLink 
           className={({ isActive }) => navSelect(isActive)}
           style={({ isActive }) => navStyle(isActive)}
          to="/count">카운트</NavLink>
        </li>
      </ul>
    </>
  );
}

export default Nav;
