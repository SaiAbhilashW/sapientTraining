import React,{Component} from 'react';

import 'bootstrap/dist/css/bootstrap.css';
import './ContactForm';

//for stateless
const Btn = ({caption,handler})=>(
  <button className="btn btn-danger" onClick={handler}>
    {caption}
  </button>
)

//for stateful
class App extends Component{
  state = {
    num : 0
  }

  // increment = ()=>{
  //  // this.state = this.state++;
  //  this.setState({num:this.state.num+1})
  // }

  // decrement = ()=>{
  //  // this.state = this.state--;
  //  this.setState({num:this.state.num-1})
  // }

  incOrDec = (val) => {
    this.setState({num:this.state.num + val});
  }

  render(){
    return (
      <div className="container">
        <h1 className="alert alert-info">React JS Counter</h1>
        <hr/>
        <h3>Value of counter : {this.state.num}</h3>
        <hr/>
      {/*   <button className="btn btn-primary" onClick={()=>{this.increment()}}>INCREMENT</button>
        <button className="btn btn-primary" onClick={()=>{this.decrement()}}>DECREMENT</button>
       */}  

       <Btn caption="Increment" handler={()=>this.incOrDec(1)}/>
       <Btn caption="Increment" handler={()=>this.incOrDec(-1)}/>
        
      </div>
    );
  }
}

export default App;
