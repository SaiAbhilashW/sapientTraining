let names = ["sandeep","udit","shashank","anurag"];

let chars = names.map((value) => value.charAt(0));
console.log(chars);

let indexPosition = names.findIndex((value)=>value === 'udit');

console.log("value found at " +indexPosition);