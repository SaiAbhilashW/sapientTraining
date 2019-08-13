const {addNewEmployee} = require('../services/mongo-emps-service');

const emp = {
    id: 1,
    first_name: 'Hilton',
    last_name: 'Alabaster',
    email: 'halabaster0@webeden.co.uk',
    gender: 'Female' };

    // _id: 5d5284c749c0093888d796e4,

addNewEmployee(emp)
    .then(id=>console.log(id))
    .catch(err=>console.log(err));