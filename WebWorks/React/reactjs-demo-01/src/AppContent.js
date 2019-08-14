import React, {Component} from 'react';
class AppContent extends Component{
    btnHandler = ()=>{
        console.log("button clicked " + this);
    }

    constructor(){
        super();
        console.log("Constructor called");
        this.btnHandler = this.btnHandler.bind(this);
    }

    render(){
        return(
            <div>
                <h3>This is a content area</h3>
                <button onClick={this.btnHandler}>Button 1</button>
            </div>
        );
    }
}

export default AppContent;