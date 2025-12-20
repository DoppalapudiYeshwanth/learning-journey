const express = require("express");
const app = express();
const path = require("path");

const port = 3000;
app.listen(port,()=>{
    console.log("Listening on port 3000");
});
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));
app.get("/",(req,res)=>{
    res.render("home.ejs");
});
app.get("/rolldice",(req,res)=>{
    let diceVal = Math.floor(Math.random()*10)+1;
    res.render("rolldice.ejs",{num : diceVal});
});
// app.get("/:username",(req,res)=>{
//     let { username } = req.params;
//     const appData = require("./data.json");
//     res.render("instagram.ejs",{userData : appData [username]});
// });
app.get("/:name",(req,res)=>{
    res.send("Server is active");
    let {name} = req.params;
    res.render("portfolio.ejs",{username : name});
});
// app.use(express.static(__dirname,"public"));