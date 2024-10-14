import React, { useContext } from 'react';
import { LanguageContext, Stylecontext } from '../App'; 

function Company() {
    const value = useContext(LanguageContext); 
    const styles = useContext(Stylecontext);

    return (
        <div style={styles}>
            <h1>company</h1>
            <p>Welcome, {value.name}!</p>
        </div>
    );
}

export default Company;