const express = require("express");
const app = express();
const port = 8080;

app.use(express.urlencoded({extended : true}));

app.get("/register",(req,res)=>{
    res.send("simple get request");
});
app.post("/register",(req,res)=>{
    res.send("simple get request");
});
app.listen(port,()=>{
console.log("Listening on port "+ port);
})