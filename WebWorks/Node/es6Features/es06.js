class Person{
    //you can have only one constructor in ES6

    // constructor(_name,_email){
    //     this.name = "Salah";
    //     this.email = "salah@gmail"
    // }
    constructor(_name,_email){
        this.name = _name;
        this.email = _email;
    }

    printPerson(){
        console.log("Name is " + this.name);
        console.log("Email is "+ this.email);
    }
}

let p1 = new Person();

console.log(p1);
console.log(typeof(p1));
p1.printPerson();

console.log(typeof("abshs"));
console.log(typeof(123));

let p2 = new Person("VVD", "vvd@gmail");
console.log(p2);
let p3 = new Person("Firmino");
console.log(p3);

class Employee extends Person{
    constructor(_name,_email,_empId){
        super(_name,_email);
        this.empId = _empId;
    }
}

let emp = new Employee("Klopp","klopp@gmail",12);

console.log(emp);