let p1 = {
    name : "Anjan",
    city: "Bengaluru",
    email:"anjan@gmail"
};

console.log(p1);

let name1 = p1.name;
let city1 = p1.city;
let email1 = p1.email;

console.log(name1);
console.log(city1);
console.log(email1);

///easier way : 

let {name,city} = p1;

//if names are same then mapping is possible otherwise undefined
console.log(name);
console.log(city);


let {_name,_city,email} = p1;

//if names are same then mapping is possible otherwise undefined
console.log(_name);
console.log(_city);
console.log(email);


function sayHello({name,city}){
    console.log("Function name : " + name);
    console.log("Function city : " + city);
    console.log("---------------------");
}

sayHello({name:"saket",city:"pune"});
sayHello(p1);