//perform CRUD operations with Mongodb

//./service/mongo-emps-service

const {MongoClient,ObjectId} = require('mongodb');
const url = "mongodb://localhost";

const requiredFields = ['firstname','email','phone','city'];

module.exports.getEmployeeById = async(id) =>{
    if(!id || typeof id != 'string') throw "Sorry Id supplied is not a string";

    try{
        const _id = ObjectId(id);
        const conn = await MongoClient.connect(url, {useNewUrlParser:true});
        const emps = conn.db('sapientdb').collection('newemps');
        const emp = await emps.findOne({_id});
        conn.close();
        return emp;
    } catch(err){
        throw err;
    }
}

module.exports.addNewEmployee = async(emp)=>{
    const conn = await MongoClient.connect(url, {useNewUrlParser:true});
    const emps = conn.db('sapientdb').collection('newemps');
    const response = await emps.insertOne(emp);
    conn.close();
    emp._id = response.insertedId;
    return emp;
}

module.exports.deleteEmployee = async(_id)=>{
    const conn = await MongoClient.connect(url, {useNewUrlParser:true});
    const emps = conn.db('sapientdb').collection('newemps');
    const response = await emps.deleteOne({id:_id});
    conn.close();
    return response.deletedCount;
}


module.exports.updateEmployee = async(emp)=>{
    const conn = await MongoClient.connect(url, {useNewUrlParser:true});
    const emps = conn.db('sapientdb').collection('newemps');
    const deleted = await emps.deleteOne({email:emp.email});
    if(deletedCount === 1){
        const response = await emps.insertOne(emp);
        conn.close();
       emp._id = response.insertedId;
        return emp;    
    } else {
        conn.close();
        return deleted.deletedCount;
    }
    
}
//sort by city dsc/asc
module.exports.getAllRecords = async(options)=>{
    if(!options || typeof options != 'object'){
        throw "Sorry options supplied are not compatible"
    }
    try{
        const conn = await MongoClient.connect(url, {useNewUrlParser:true});
        const emps = conn.db('sapientdb').collection('newemps');
        let empArray = null;
       
        if(options.sort === "asc"){
            empArray = await emps.find().limit(10).sort({email:1}).toArray();
            conn.close();
            console.log("inside asc");
            return empArray;
        } else if(options.sort === "dsc"){
            empArray = await emps.find().limit(10).sort({email:-1}).toArray();
            conn.close();
            console.log("inside dsc");
            return empArray;
        } else throw "Specify correct option value for sort";
    } catch(err){
        throw err;
    }
    
}