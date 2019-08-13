const {getAllContacts} = require('../services/file-contact-service');

//give me records of page 2 where each page size is 4 ie 4 records in eac page
let options = {pageNum : 2,pageSize : 4};

getAllContacts(options,(err,data) => {
    if(err) console.log(err);
    else console.log(data);
})
