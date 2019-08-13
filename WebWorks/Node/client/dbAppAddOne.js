const {addNewEmployee} = require('../services/mongo-emps-service');


const emp = {
    id: 1,
    first_name: 'Hilton',
    last_name: 'Alabaster',
    email: 'halabaster0@webeden.co.uk',
    gender: 'Male'
 };

addNewEmployee(emp)
    .then(id=>console.log(id))
    .catch(err=>console.log(err));