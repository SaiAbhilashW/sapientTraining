//to show event driver program with node

const EventEmitter = require("events");

const eventEmitter = new EventEmitter();

eventEmitter.on("myJob", ()=>{
    console.log("sample event is invoked");
});

eventEmitter.on("maths", (num1,num2)=> console.log(num1+num2))
eventEmitter.emit("myJob");
eventEmitter.emit("maths",10,20);

class Person extends EventEmitter{
    constructor(name,salary){
        super();
        this.__name = name;
        this.__salary = salary;
    }

    get name(){
        return this.__name;
    }

    set name(name){
        this.__name = name;
    }

    get salary(){
        return this.__salary;
    }

    set salary(salary){
        this.__salary = salary;
    }
   
}

let person1 = new Person("Salah", 1212);
let person2 = new Person("VVD",30000);


person1.on("person1", ()=> { 
    console.log("Person name : "  + person1.__name);
    console.log("Person salary : " + person1.__salary);
})

person2.on("person2", ()=> { 
    console.log("Person name : "  + person2.__name);
    console.log("Person salary : " + person2.__salary);
});

person1.emit("person1");
person2.emit("person2");
