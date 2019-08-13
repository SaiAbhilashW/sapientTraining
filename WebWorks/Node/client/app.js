const express = require('express');

const app = express();
const {addNewEmployee,deleteEmployee,getAllRecords,getEmployeeById} = require('../services/mongo-emps-service');


app.get('/', (req,res)=>{
    res.send("Hi, This is my mongo app!");
});

app.get('/employees/:id',(req,res)=>{
   getEmployeeById(req.params.id)
        .then(data=> res.send(data))
        .catch(err => res.send(err));
});

app.get('/employees',(req,res)=>{
    getAllRecords({sort:"dsc"}).then(data=> res.send(data))
    .catch(err => res.send(err));
});


app.listen(3001);