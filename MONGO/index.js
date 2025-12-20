const mongoose = require("mongoose");
// mongoose.connect("mongodb://127.0.0.1:27017/test");

// main()
//     .then(()=>{
//         console.log("Successful connection");
//     })
//     .catch((err)=>{
//         console.log(err);
//     })
// async function main(){
//     await mongoose.connect("mongodb://127.0.0.1:27017/test");
// }
// const userSchema = mongoose.Schema({
//     name : String,
//     age : Number,
// });
// const User = mongoose.model("User",userSchema);
// const user1 = new User({
//     name : "yesh",
//     age : 19
// });
// user1.save();
// User.insertMany([{
//     name : "yesh",
//     age : 19
// },
// {name : "yeshwanth",
//     age : 15}])
//     .then((res)=>{
//         console.log(res);
//     });
// User.find().then((res)=>{
//     console.log(res);
// }).catch((err)=>{
//     console.log(err);
// });
// User.find({name:"yesh",age:{$gte:12}}).then((res)=>{
//     console.log(res);
// }).catch((err)=>{
//     console.log(err);
// });
main().then(()=>{
    console.log("Success");
}).catch((err)=>{
    console.log(err);
});
async function main(){
    await mongoose.connect("mongodb://127.0.0.1:27017/amazon")
}
const bookSchema = new mongoose.Schema({
    title : {
        type : String,
        required : true,
    },
    author : {
        type : String,
    }
});