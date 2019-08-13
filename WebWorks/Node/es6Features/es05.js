function fnParams(name1,name2,name3){
    console.log(arguments);
}

fnParams("harry","potter","Hermione");


//may or may not take params
function newParams(... myParams){
    console.log(myParams);
}

//category is mandatory
function newerParams(category, ... items){
    console.log(category);
    console.log(items);
}

newerParams("electronics");
newerParams("electronics","laptop","computer","mouse");

