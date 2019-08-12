const sum = (num1, num2) =>  num1 + num2;
const PI = 3.14;

class MyBusinessLogic{
    constructor(name){
        console.log('Obj created');
        this.name = name;
    }
}

//v1
// module.exports.sum = sum;
// module.exports.MyBusinessLogic = MyBusinessLogic;
// module.exports.PI = PI;

//v2
//module.exports = {sum:sum,PI:PI,MyBusinessLogic:MyBusinessLogic};

//v3
module.exports = {sum,PI,MyBusinessLogic}; //if you are maintaining the same name
