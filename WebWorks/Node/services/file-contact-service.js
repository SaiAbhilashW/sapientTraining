const fs = require('fs');
const path = require('path');

const filename = path.join(__dirname,"../data/data.json");

//mandatory for user to insert the record
const requiredFields = ["firstname","email","phone","city"];

if(fs.existsSync(filename)){
    data = JSON.parse(fs.readFileSync(filename,"UTF-8"));
}

class contactService{
    constructor(){}

    //iterate using map / findIndex
    getContactById(id){
        console.log("Get contact by id : " + id);
    }

    //splice()
    deleteContact(id){
        console.log("Delete contact of id : " + id);
    }

    //update = delete + add
    updateContact(contact){
        console.log("update contact " + contact);
    }

    addNewContact(contact,callBackFn){
        if(!callBackFn || typeof callBackFn != 'function'){
            let err = {code:1001,message:"Please give callback"};
            callBackFn(err);
            return;
        }

        if(!contact || typeof contact != 'object'){
            let err = {code:1002,message:"Sorry please pass the object"};
            callBackFn(err);
            return;
        }

        //checking required fields
        const missingFields = [];
        requiredFields.forEach(field => {
            if(!(field in contact)){
                missingFields.push(field);
            }
        });

        if(missingFields.length > 0){
            let err = {code:1003,message:"Pass missing fields " + missingFields.join(" ,") + " fields"};
            callBackFn(err);
            return;
        }

        if(data.length === 0){
            contact.id = 1;
        } else {
            contact.id = data.length + 1;
        }

        data.push(contact);

        fs.writeFile(filename, JSON.stringify(data), (err) => {
            if(err){
                callBackFn(err);
                return;
            }

            callBackFn(null, {... contact});
        });

        console.log("Added new contact " + contact);
    }

    getAllContacts(options,callBackFn){
        if(!callBackFn || typeof callBackFn != 'function'){
            throw new "Sorry callback is not supplied, so not executed";
        }

        //default value assigned if options is null
        let {pageNum=1,pageSize=10}=options;

        if(typeof pageNum !== 'number' || typeof pageSize !== 'number'){
            let err = {code:1004,message:"Please enter page num and page size"};
            callBackFn(err);
            return;
        }

        //since array starts from '0'
        let begin = (pageNum - 1)*pageSize;
        let end = begin + pageSize;

        let newData = data.slice(begin,end);
        callBackFn(null,newData);

    }
}

module.exports = new contactService();