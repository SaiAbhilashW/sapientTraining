import React, {Component} from 'react';

import './AppComponent.css';
class AppComponent extends Component{
    render(){
        return (
            <fragment>
            <h1 className="app-component">This is our component in reactJS, created by {this.props.createdBy}</h1>
            </fragment>
        );
    }
}

export default AppComponent;