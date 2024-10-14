import React, { useContext } from 'react';
// import styles from "../css/productdetail.module.css";
import { useLocation, useNavigate } from 'react-router-dom';
import { Stylecontext } from '../App';
// import skyVideo from '../video/sky.mp4'; 


function ProductList() {

    const styles = useContext(Stylecontext);
    const product = [
        {
            id : '1',
            title: '음식',
            price: 1000,
            rating: 5,
            review: 9999
        },
        {
            id : '2',
            title: '사무용품',
            price: 500,
            rating: 3,
            review: 10
        },
        {
            id : '3',
            title: '애견용품',
            price: 100,
            rating: 4,
            review: 749
        }
    ]

    const navigate  = useNavigate();
    const history  = useNavigate();


    const pageMove = (a, b, c, d, e)=>{
        navigate (`/product/${a}/${b}/${c}/${d}/${e}`);
    }

    const location = useLocation();

    return (<>
            <h2>초특가 상품</h2>
            <div  style={{display:'flex', ...styles}}>
                {product.map((item) => (
                    <div key={item.id} className={styles.box} onClick={() => pageMove(item.id,item.title,item.price,item.rating,item.review)}>
                        <p>상품이름 : {item.title}</p>
                        <p>가격 : {item.price}</p>
                        <p>별점 : {item.rating}점</p>
                        <p>후기 ( {item.review} )</p>
                    </div>
                ))};
            </div>

            <div>
                <h1>현재 경로 정보</h1>
                <p onClick={()=>{history(-1)}} > Pathname: {location.pathname}</p>
                <p>Search: {location.search}</p>
                <p>Hash: {location.hash}</p>
                <p>State: {JSON.stringify(location.state)}</p>

            </div>
    
                
    </>);
}

export default ProductList;