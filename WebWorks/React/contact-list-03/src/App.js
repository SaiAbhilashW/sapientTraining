import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import ContactCard from './ContactCard.js';

class App extends Component {
  state = {  }
  render() { 

    const contacts = [
      {
      "id":101,
      "name":"Sai",
      "email":"saiw@gmail.com",
      "phone":"9923939322",
      "picture":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbiuS3t98piUotojJuoet6s06_cNbL57f4VrmfDLWqS0qKRRLL"
    },
    {
      "id":102,
      "name":"Mane",
      "email":"saiw@gmail.com",
      "phone":"9923939322",
      "picture":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbiuS3t98piUotojJuoet6s06_cNbL57f4VrmfDLWqS0qKRRLL"
    },
    {
      "id":103,
      "name":"Salah",
      "email":"saiw@gmail.com",
      "phone":"9923939322",
      "picture":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbiuS3t98piUotojJuoet6s06_cNbL57f4VrmfDLWqS0qKRRLL"
    },
    {
      "id":104,
      "name":"Firmino",
      "email":"saiw@gmail.com",
      "phone":"9923939322",
      "picture":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbiuS3t98piUotojJuoet6s06_cNbL57f4VrmfDLWqS0qKRRLL"
    }
    ];

    const contactCardsArray = contacts.map(c=> <ContactCard key={c.id} contact= {c}/>)

    return ( 
     <div className="container">
       <h1 className="alert alert-info">Contacts with Arrays</h1>
       {/* <ContactCard contact={contact} /> */}
      <h2>Output From the map</h2>
      {contactCardsArray}
     </div>
      

     );
  }
}
 
export default App;