const express = require("express");
const app = express();

// console.dir(app);

let port = 3000;
app.listen(port,()=>{
    console.log(`The app is listening at Port ${port}`);
});
// app.use((req,res)=>{
//     console.log("request recieved");
//     // res.send("Hello world");
//     // res.send("<h1>Its me, Yeshwanth</h1>");
//      res.send({name : "yeshwanth",
//          age : 19
//      });
// });
app.get("/",(req,res)=>{
    res.send("im root path");
});
// app.get("/apple",(req,res)=>{
//     res.send("You contacted the apple path");
// });
// app.get("/orange",(req,res)=>{
//     res.send("You contacted the orange path");
// });
app.get("/:username",(req,res)=>{
    let {username} = req.params;
    res.send(`Welcome to ${username} page`);
});
app.get("/search",(req,res)=>{
    console.log(req.query);
});