const {MongoClient} = require('mongodb');

const url = "mongodb://localhost";

MongoClient.connect(url, (err, conn)=>{
    if(err){
        throw err;
    }
    const db = conn.db('sapientdb');
    const emps = db.collection('newemps');

    emps.findOne((err, emp) => {
        if(err) throw err;
        console.log(emp);
        conn.close();
    })
})