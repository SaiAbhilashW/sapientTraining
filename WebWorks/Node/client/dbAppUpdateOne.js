const {updateEmployee} = require('../services/mongo-emps-service');

const emp = {
    id: 1,
    first_name: 'Hilton',
    last_name: 'Alabaster',
    email: 'halabaster0@webeden.co.uk',
    gender: 'Male' };

    // _id: 5d43cf690ec520e4dd8d84d6,

    updateEmployee(emp)
    .then(id=>console.log(id))
    .catch(err=>console.log(err));