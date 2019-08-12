const fs = require('fs');

const zlib = require('zlib');

//const gzip = zlib.createGzip();
const gunzip = zlib.createGunzip();

// const readStream = fs.createReadStream('./files/employees.txt', 'UTF-8');
// const writeStream = fs.createWriteStream('./files/newmployees.txt.gz', 'UTF-8');
// readStream.pipe(gzip).pipe(writeStream);


const newReadStream = fs.createReadStream('./files/newmployees.txt.gz');
const newWriteStream = fs.createWriteStream('./files/uncompress.txt');
newReadStream.pipe(gunzip).pipe(newWriteStream);