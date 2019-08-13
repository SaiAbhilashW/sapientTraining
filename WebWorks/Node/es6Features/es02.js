// to show working of tag functions

function myTag(string, p1,p2){
    console.log("Strings " + string);
    console.log(p1,p2);
    console.log(arguments);
}


let name = "Salah";
let age = 27;
let place = "Liverpool"

// let s1 = myTag `${name} is ${age} years old`; //string is 1st arg, name 2nd, age 3rd
// console.log(s1);

function myNewTag(string, ... args){
    console.log(string);
    console.log(args);
   
    for(temp of agrs){
        console.log(args);
    }
}

myNewTag `${name} is ${age} years old and lives in ${place}`;