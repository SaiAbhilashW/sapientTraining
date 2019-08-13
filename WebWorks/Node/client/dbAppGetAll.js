const {getAllRecords} = require('../services/mongo-emps-service');

 const options = {sort:"dsc"};
getAllRecords(options)
    .then(data => console.log(data))
    .catch(err => console.log(err));        