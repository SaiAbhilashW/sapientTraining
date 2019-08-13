const {deleteEmployee} = require('../services/mongo-emps-service');

const id=2;

deleteEmployee(id)
    .then(data => console.log(data))
    .catch(err => console.log(err));