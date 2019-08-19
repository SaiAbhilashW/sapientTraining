// import React from 'react';
// import ReactDOM from 'react-dom';
// import './index.css';
// // import App from './App';
// import * as serviceWorker from './serviceWorker';
// import NewApp from './NewApp';
// import './VirtualDom';



// ReactDOM.render(<NewApp />, document.getElementById('root'));

// // If you want your app to work offline and load faster, you can change
// // unregister() to register() below. Note this comes with some pitfalls.
// // Learn more about service workers: https://bit.ly/CRA-PWA
// serviceWorker.unregister();

/////////////////////////////////////////////////////////////////////

// let h1 = document.createElement("h1");

// h1.setAttribute("id","heading");
// h1.innerHTML = "Testing DOM with JS";
// document.getElementById("root").appendChild(h1);

// let count = 1;

// setInterval(()=>{
//     let h1 = document.getElementById("heading");
//     h1.innerHTML = "Testing DOM with JS";
//     console.log("updating h1 " + (count++) + " times")
// })

import React, { Component } from 'react';

import ReactDom from 'react-dom';
const myHeading = (props) => (
    <h3>My custom heading goes here</h3>
)

class App extends Component{
    state = {
        title: "Hello World"
    }
    count = 1;


componentDidMount(){
    setInterval(()=>{
        let {title} = this.state;

        if(this.count %5 == 0){
            if(title=="Hello World"){
                title = "React Virtual JS Dom"
            } else title = "Hello World";
        }

        this.setState({title},()=>{console.log("Updated " + (this.count++) + " no of times")});
    },1000)
}

    render(){
        return (
            <div>
                <h1>{this.state.title}</h1>
            </div>
        )
    }
}