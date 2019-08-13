const {getEmployeeById} = require('../services/mongo-emps-service');

const id ="5d5284c749c0093888d796e4";

getEmployeeById(id)
    .then(data => console.log(data))
    .catch(err => console.log(err));