import React from 'react'
import { Link, Outlet } from 'react-router-dom'

function Home() {
  return (
    <div>
      <h1 className='text'>Home</h1>
      
      <nav>
        <Link to="kakao">카카오</Link>
        <Link to="google">/구글</Link>
      </nav>
      
      <Outlet />
    </div>
  )
}

export default Home
