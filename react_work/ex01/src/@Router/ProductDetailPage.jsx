import React from 'react'
import { useParams } from 'react-router-dom'

function ProductDetailPage() {
  
  const {a, b, c, d, e} = useParams();

  return (
    <div>
      <h1>상품 아이디 : {a}</h1>
      <h1>카테고리 : {b}</h1>
      <h1>가격 : {c}</h1>
      <h1>별점 : {d}</h1>
      <h1>후기 : {e}</h1>
    </div>
  )
}

export default ProductDetailPage