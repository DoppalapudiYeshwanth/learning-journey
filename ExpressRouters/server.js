const express = require("express");
const app = express();
const user = require("./routes/user");
const post = require("./routes/post");
const cookieParser = require("cookie-parser");

app.listen(3000,()=>{
    console.log("Server working");
});
// app.use(cookieParser());
app.use(cookieParser("1234"));

//cookies
app.get("/getcookies",(req,res)=>{
    res.cookie("Yeshwanth","Namaste");
    res.send("We are sending cookies");
});
//signed cookies
app.get("/getcookies",(req,res)=>{
    res.cookie("Yeshwanth","Namaste",{signed:true});
    res.send("We are sending cookies");
});
app.get("/verify",(req,res)=>{
    console.log(req.signedCookies);
    res.send("verified");
});

app.use("/users",user);
app.use("/posts",post);


