const {MongoClient} = require('mongodb');
const url = "mongodb://localhost";

const getOneEmployee = async() =>{
    const conn = await MongoClient.connect(url,{useNewUrlParser:true});
    const db = conn.db('sapientdb');
    const emps = db.collection('newemps');

    const emp = await emps.findOne({});
    console.log(emp);
    conn.close();
}

getOneEmployee()
    .then(()=> console.log('done'))
    .catch(err=> console.log(err)); 