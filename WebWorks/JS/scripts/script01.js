var clicked = 0;
var deadClicks = 5;
var message="";
    function fn(){ 
        console.log("Welcome to javascript from head!");
        clicked++;
        console.log(" You have " + clicked + " clicks");
    }

    function fnDead(){ 
        deadClicks--;
        if(deadClicks > 0){
            console.log('Told you not to! you are dead now');
            console.log(" You'll be dead in " + deadClicks + " days");            
        }
      if(deadClicks === 0){
            console.log('You are dead');
        }
    }

    function checkVoteCriteria(){
        var name = prompt("Give me your name or else....");
       var age = prompt("Give me your age");
        if(age > 18) {
            message = "<h2>You are elligible</h2>"
        } else message ="<h2>Wait for " + (18- age) + " years loser</h2>";

        document.getElementById("message").innerHTML = message;
    }

    var sum = 0;
    function giveSum(){
        var num = prompt("tell me a number");
        while(num != 0){
            sum = sum + parseInt(num);
            num = prompt("tell me a number");
        }

        document.getElementById("sum").innerHTML = "<h3> The sum is " + sum + "</h3>";
    }
   
    function greet(message){
        if(message == null) message = "Hello you!";
        noOfParams = greet.arguments.length;
        console.log("You passed "  + noOfParams + "arguements");
        alert(message);
    }

    //// object based JS

    function getNameAndId(empId, empName){
        this.empId = empId;
        this.empName = empName;
    }

    getNameAndId.prototype.displa

    function getInfo(){
        var emp = new getNameAndId("salah",27);
        document.getElementById("emp").innerHTML = "The name is " + emp.empId + " and the age is " + emp.empName;
    }