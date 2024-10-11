import React, { lazy, Suspense } from 'react';
// import ProductList from '../component/ProductList';
import PageLoading from '../component/PageLoading';


const ProductList = lazy(()=> import('../component/ProductList'));

function Product() {
    return (
        <div>
            <h1>product</h1>

            <Suspense fallback={<PageLoading/>}>
                <ProductList></ProductList>
            </Suspense>

            {/* <ProductList></ProductList>
            <ProductList></ProductList> */}
        </div>
    );
}

export default Product;