const fs = require('fs');

const readStream = fs.createReadStream('./files/sample.txt','UTF-8');
const writeStream = fs.createWriteStream('./files/newsample.txt','UTF-8');

readStream.on("data", (chunk)=>{
    console.log(chunk);
    writeStream.write(chunk);
});