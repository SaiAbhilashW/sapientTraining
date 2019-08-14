const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const {addNewEmployee,deleteEmployee,getAllRecords,getEmployeeById,updateEmployee} = require('../services/mongo-emps-service');

app.use(bodyParser.json());

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

app.post('/employees',(req,res)=>{
    console.log(req.body);
    addNewEmployee(req.body)
        .then(data=>res.send(data))
        .catch(err=>res.send(err));
});

app.put('/employees',(req,res)=>{
    updateEmployee(req.body)
        .then(data=>res.send(data))
        .catch(err=>res.send(err));
});

app.delete('/employees/:id',(req,res)=>{
    deleteEmployee(req.params.id)
    .then(data => console.log(data))
    .catch(err => console.log(err));
});



app.listen(3001);