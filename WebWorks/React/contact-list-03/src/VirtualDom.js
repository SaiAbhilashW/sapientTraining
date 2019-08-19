let h1 = document.createElement("h1");

h1.setAttribute("id","heading");
h1.innerHTML = "Testing DOM with JS";
document.getElementById("root").appendChild(h1);

let count = 1;

setInterval(()=>{
    let h1 = document.getElementById("heading");
    h1.innerHTML = "Testing DOM with JS";
    console.log("updating h1 " + (count++) + " times")
})