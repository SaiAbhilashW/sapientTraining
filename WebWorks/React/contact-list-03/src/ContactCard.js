import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';

const ContactCard = ({contact})=> ( //style={} needs an object, so {{}} we write key value pairs inside the inner bracket
    <div className="card" style={{width:"400px",height:"200px",padding:"50px",margin:"30px"}}>
        <div className="row">
            <div className="row">
                <div className="col-md-4">
                    <img src={contact.picture} className="card-img" alt={contact.name}
                    style={{width:100,height:100,marginRight:"20px"}} />
                </div>
            </div> 
            <div className="row">
                <div className="col-md-12">
                    <h6 className="card-title">{contact.name}</h6>
                    <p className="card-text">{contact.email}</p>
                    <p className="card-text">{contact.phone}</p>
                </div>
            </div> 
        </div>
    </div>
)



export default ContactCard;