//rename the file to newsample.txt
//append the file
//delete the file

const fs = require('fs');

// fs.rename('./files/sample.txt', './files/newsample.txt', (err) => {
//     if (err) throw err;
//     console.log('Rename complete!');
//   });


//   fs.appendFile('./files/newsample.txt', 'data to append', (err) => {
//     if (err) throw err;
//     console.log('The "data to append" was appended to file!');
//   });

var tobedeleted = [];
fs.readdir('./files/tobedel', (err,files)=>{
    if(err) {
        console.log(err);
    }
    else{
        tobedeleted = files;
        console.log(tobedeleted);
        for(let file of tobedeleted){
            fs.unlink('./files/tobedel/'+file, (err) => {
                if (err) throw err;
                console.log('successfully deleted');
              });
        }
    }
})




 