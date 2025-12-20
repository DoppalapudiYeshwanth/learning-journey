const express = require("express");
const mongoose = require("mongoose");
const methodOverride = require("method-override");
const app = express();
const port = 8080;
const path = require("path");
const Chat = require("./models/chat.js");
main().then(()=>console.log("Connection Succesful")).catch(err => console.log(err));

app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs");
app.use(express.static(path.join(__dirname,"public")));
app.use(express.urlencoded({extended : true}));
app.use(methodOverride("_method"));
async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/Telegram');
};

// let chat1 = new Chat({
//     from : "yesh",
//     to : "shijin",
//     message : "Hello",
//     created_at : new Date()
// });
// chat1.save().then((res)=>console.log(res));

app.listen(port,()=>{
    console.log("Listening on port 8080");
});
app.get("/",(req,res)=>{
    res.send("Route working");
});

//index route 
app.get("/chats",async (req,res)=>{
    let chats = await Chat.find();
    console.log(chats);
    res.render("index.ejs",{chats});
});

//new route
app.get("/chats/new",(req,res)=>{
    res.render("new.ejs");
});

//route to pass the info into database
app.post("/chats",(req,res)=>{
let { from , to, message } = req.body;
let newChat = new Chat({
    from : from,
    to : to,
    message : message,
    created_at : new Date(),
    updated_at : null,
});
newChat.save().then((res)=>console.log(res)).
catch((err)=>console.log(err));
res.redirect("/chats");
});

//edit route
app.get("/chats/:id/edit",async (req,res)=>{
    let {id}=req.params;
    let chat = await Chat.findById(id);
    res.render("edit.ejs",{chat});
});

//update route
app.put("/chats/:id",async (req,res)=>{
    let {id}= req.params;
    let {message : newMessage} = req.body;
    const newUpdated_at = new Date();
    console.log(newUpdated_at);
    let updatedChat = await Chat.findByIdAndUpdate(id,{message : newMessage,updated_at : newUpdated_at},{runValidators : true, new : true});
    console.log(updatedChat);
    res.redirect("/chats");
});

//delete route 
app.delete("/chats/:id/delete",async (req,res)=>{
    let {id} = req.params;
    await Chat.findByIdAndDelete(id);
    res.redirect("/chats");
});