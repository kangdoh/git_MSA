import React from 'react';
import styles from "../css/productdetail.module.css";

function ProductDetail() {
    

    return (<>
        <div className={styles.box}>
            <h2>초특가 상품</h2>
            <p>상품이름 : 연필</p>
            <p>가격 : 1,000</p>
            <p>별점 : 5점</p>
            <p>후기 (9,999)</p>
        </div>

    </>);
}

export default ProductDetail;