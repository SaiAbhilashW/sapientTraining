// to create a file and keep he data, for exception show the message

const fs = require('fs');

fs.writeFile('./files/sample.txt','this is sample data',(err)=>{
    if(err){
        console.log('file not saved', err)
    } else {
        console.log('file saved successfully')
    }
});


fs.readFile('./files/sample.txt','utf8', (err, data) => {
    if (err) throw err;
    console.log(data);
  });

  //<Buffer 74 68 69 73 20 69 73 20 73 61 6d 70 6c 65 20 64 61 74 61> returned if encoding not specified

