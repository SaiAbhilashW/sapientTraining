const http = require('http');


const server = http.createServer((req,res)=>{
    if(req.url === "/" ) {
        res.write("Hello from node js");
        res.end();
    } else {
        res.write("You are looking for something else");
        res.end();
    }
   
});

server.listen(3000);