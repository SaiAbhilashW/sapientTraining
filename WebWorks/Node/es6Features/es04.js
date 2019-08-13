let nums = [10,20,30,40];

console.log(nums);
// ... is a spread operator which appends the values to the array;
let anotherNums = [100, 200, ... nums];
console.log(anotherNums);

///////
let num2 = nums;
num2.push(999);

//a new memory for num2 is not created
//it is just a reference
//so both nums and num2 change when 99 is pushed
//to avoid this ... is used
console.log(nums);
console.log(num2);

let p1 = {name:"Harish",email:"harish@gmail"};
console.log(p1);
let p2 = {city:"Pune", location: "Swargate", ... p1};
console.log(p2);

let p3 = {... p1};
console.log(p3);

console.log(p1==p3? "p1 and p3 are equal" : "p1 and p3 are not equal");
