const express = require('express');

const app = express();

app.get('/', (req,res)=>{
    res.send("Hello World from express");
});

app.get('/example',(req,res)=>{
    res.send("Example route called");
});

app.get('/example/:name/:age',(req,res)=>{
    console.log(req.params);
    console.log('========');
    console.log('Name' + req.params.name);
    console.log('Age' + req.params.age); 

   // http://localhost:3000/example/sai/22?city=pune&country=india
    console.log("City :" + req.query.city);
    console.log("Country :" + req.query.country);
    
    
    res.send("name= " + req.params.name);
});

app.listen(3000);