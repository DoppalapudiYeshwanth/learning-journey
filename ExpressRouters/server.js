const express = require("express");
const app = express();
const user = require("./routes/user");
const post = require("./routes/post");
const cookieParser = require("cookie-parser");
const ExpressSession = require("express-session");
const connectFlash = require("connect-flash");
const path = require("path");

app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));

app.listen(3000,()=>{
    console.log("Server working");
});
//express-session
app.use(ExpressSession({secret : "MySuperSecret",resave:false,saveUninitialized:true}));
//connect-flash
app.use(connectFlash());

app.get("/register",(req,res)=>{
    let { name = "anonymous"} = req.query;
    req.session.name = name;
    req.flash("success","User registered succesfully");
    res.redirect("/hello");
});
app.get("/hello",(req,res)=>{
    res.locals.msg = req.flash("success");
    res.render("page.ejs",{name : req.session.name});
});

// app.get("/users",(req,res)=>{
//     if(req.session.count){
//         req.session.count++;
//     }
//     else{
//         req.session.count = 1;
//     }
//     res.send(`You sent request ${req.session.count} times`);
//     console.log("Sent the session id inform of cookies");
// }); 

// app.use(cookieParser());
// app.use(cookieParser("1234"));

// //cookies
// app.get("/getcookies",(req,res)=>{
//     res.cookie("Yeshwanth","Namaste");
//     res.send("We are sending cookies");
// });
// //signed cookies
// app.get("/getcookies",(req,res)=>{
//     res.cookie("Yeshwanth","Namaste",{signed:true});
//     res.send("We are sending cookies");
// });
// app.get("/verify",(req,res)=>{
//     console.log(req.signedCookies);
//     res.send("verified");
// });

// app.use("/users",user);
// app.use("/posts",post);


