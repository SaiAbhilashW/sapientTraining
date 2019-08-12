const readLine = require('readline');

const rl = readLine.createInterface({input:process.stdin,output:process.stdout});

//we want to generate 2 random numbers

let num1 = Math.round(Math.random()*20);
let num2 = Math.round(Math.random()*20);

console.log(num1);
console.log(num2);

let answer = num1 + num2;

rl.question(`Enter your answer for ${num1} + ${num2}\n`, (userInput)=>{
    if(parseInt(userInput) == answer){
        rl.close();
    } else {
        rl.setPrompt("Sorry, wrong answer\n");
        rl.prompt();
        rl.on("line", (userInput)=>{
            if(parseInt(userInput) == answer){
                rl.close();
            } else {
                rl.setPrompt("again its wrong , try again\n");
                rl.prompt();
            }
        })
    }
});

rl.on("close", ()=>{
    console.log('You are correct!');
})

