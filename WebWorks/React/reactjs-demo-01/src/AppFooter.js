import React from 'react';

import './AppFooter.css';
export default function AppFooter(props){
    return (
        <div>
            <p className="app-footer">This is my footer</p>
            <p>Website: {props.website} ,company: {props.company}, year: {props.year}</p> 
        </div>
    )
}