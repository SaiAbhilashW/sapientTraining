import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import ContactList from './ContactList';

class NewApp extends Component {
    state = { 
        contacts: []
     }

     componentDidMount(){
         //to hit to the rest point 
         //fetch, jQuery, axios

         fetch("http://localhost:4000/contacts")
            .then(res => res.json())
            .then(data => this.setState({contacts : data}))
     }

    render() { 
        return ( 
            <div>
                <h1 className="alert alert-warning">Using fetch for getting data</h1>
                <p>Number of contacts : {this.state.contacts.length}</p>

                <div className="row">
                    <div className="col">
                        <ContactList contacts={this.state.contacts} />
                    </div>
                </div>
            </div>
         );
    }
}
 
export default NewApp;