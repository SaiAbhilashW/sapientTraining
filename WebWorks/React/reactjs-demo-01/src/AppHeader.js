import React ,{Component} from 'react';

class AppHeader extends Component{
    
    render(){
        console.log(this);
        console.log("----------------");
        console.log(this.props);
        return (
            <fragment>
            <h1>This is our header in reactJS, created in {this.props.company}</h1>
            <hr/>
        </fragment>
        );
            
    }
}

export default AppHeader;