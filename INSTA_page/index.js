const express = require("express");
const app = express();
const port = 8080;
const path = require("path");
app.set("view engine","ejs");
app.set("views",path.join(__dirname,("views")));

const {v4 : uuidv4} = require('uuid');

app.use(express.urlencoded({ extended: true }));
app.use(express.json());

const methodOverride = require("method-override");
app.use(methodOverride("_method"));

app.use(express.static(path.join(__dirname,"public")));

const multer = require("multer");
const upload = multer({ dest: "public/uploads/" });

let account = [{
    id : uuidv4(),
    username : "yeshwanth",
    content : "happy",
    image : "",
}];
app.get("/home",(req,res)=>{
    res.render("home.ejs",{account});
    console.log(account);
});
app.get("/home/new",(req,res)=>{
    res.render("new.ejs");
});
app.post("/home",upload.single("image"),(req,res)=>{
    let id = uuidv4();
    let {username , content} = req.body;
    let image = req.file ? req.file.filename: "";
    account.push({id ,username ,content,image});
    res.redirect("/home");
});
app.get("/home/:id",(req,res)=>{
    let {id} = req.params;
    let acc = account.find((p)=>id===p.id);
    console.log(id);
    res.render("show.ejs",{acc});
});
app.get("/home/:id/update",(req,res)=>{
    let {id} = req.params;
    let acc = account.find((p)=>id===p.id);
    res.render("update.ejs",{acc});
});
app.patch("/home/:id",(req,res)=>{
    let {id} = req.params;
    let newContent = req.body.content;
    let acc = account.find((p)=>id===p.id);
    acc.content = newContent;
    res.redirect("/home");
});
app.delete("/home/:id",(req,res)=>{
    let {id} = req.params;
    account = account.filter((p)=>id!==p.id);
    res.redirect("/home");
});
app.listen(port,()=>{
    console.log("Listening at "+port);
});