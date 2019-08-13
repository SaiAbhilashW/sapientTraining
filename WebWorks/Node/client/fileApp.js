const {addNewContact} = require("../services/file-contact-service");

const contact = {
        "lastname": "Firmino",
        "gender": "Male",
        "email": "strinbey2r@tinypic.com",
        "phone": "8061608668",
        "dob": "1975-05-04",
        "address": "9 Hovde Street",
        "city": "Amarillo",
        "state": "Texas",
        "country": "United States",
        "picture": "./men/100.jpg"
};

addNewContact(contact,(err,newContact)=>{
    if(err) console.log(err);
    else console.log(newContact);
})