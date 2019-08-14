import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css';

class ContactForm extends Component {
    constructor(props) {
    super(props);
    this.state = {name: '',email:'',phone:'',picture:''};
    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleChange = this.handleChange.bind(this);
  }

    
    handleChange(event) {
        console.log(event.target.value);
        this.setState({[event.target.name]: event.target.value});
    }

    handleSubmit(event) {
        console.log('A name was submitted: ' + this.state.name + ' ' +  this.state.email + ' ' + this.state.phone + ' ' +  this.state.picture);
        //alert();
        event.preventDefault();
    }

   

    // addNewContact = (event) => {
    //     console.log("Adding new contact");
    //     const name = this.refs.name.value;
    //     const email = this.refs.email.value;
    //     const phone = this.refs.phone.value;
    //     const picture = this.refs.picture.value;
    //     const contact = {name,email,phone,picture};
    //     console.log(contact);

    //     this.refs.name.value="";
    //     this.refs.email.value="";
    //     this.refs.phone.value="";
    //     this.refs.picture.value="";
    //     alert('A name was submitted: ' + this.state.value);
    //     event.preventDefault();
    // }
    render() { 
        return ( 
            <div className="container">
                <h3>Add New Contact</h3>
                <h4>Uncontrolled form, data passed with ref</h4>
                <form className="form" onSubmit={this.handleSubmit}>

                    <div className="form-group row">
                        <label className="control-label col-md-4">Name : </label>
                        <div className="col-md-8">
                            <input type="text" className="form-control" name="name" value={this.state.name} onChange={this.handleChange} />
                        </div>
                    </div>

                    <div className="form-group row">
                        <label className="control-label col-md-4">Email : </label>
                        <div className="col-md-8">
                            {this.state.email}
                            <input type="text" className="form-control"  name="email" value={this.state.email} onChange={this.handleChange} />
                        </div>
                    </div>

                    <div className="form-group row">
                        <label className="control-label col-md-4">Phone number : </label>
                        <div className="col-md-8">
                            <input type="text" className="form-control" name="phone" value={this.state.phone} onChange={this.handleChange} />
                        </div>
                    </div>

                    <div className="form-group row">
                        <label className="control-label col-md-4">Picture : </label>
                        <div className="col-md-8">
                            <input type="text" className="form-control" name="picture" value={this.state.picture} onChange={this.handleChange} />
                        </div>
                    </div>

                    <button className="btn btn-danger">Save Data</button>
                </form>
            </div>

            
         );
    }
}
 
export default ContactForm;