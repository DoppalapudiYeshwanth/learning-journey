const express = require("express");
const app = express();
const port = 8080;
const ExpressError = require("../Middleware/ExpressError");
//middleware id sends response then execution stops it will not reach the route also
// app.use("/api",(req,res,next)=>{
//     let {token} = req.query;
//     if(token==="giveaccess"){
//         next();
//     }
//     else{
//         res.send("Denied");
//     }
// });
// app.get("/api",(req,res)=>{
//     res.send("data");
// });
// app.use((req,res,next)=>{
//     console.log("This is the middle ware");
//     next();
// });
// app.use((req,res,next)=>{
//     req.time = new Date(Date.now()).toString();
//     console.log(req.time);
//     next();
// });
// app.get("/home",(req,res)=>{
//     console.log("This is the route");
// });
app.listen(port,()=>{
    console.log("Listening on port 8080");
});
app.get("/",async(req,res)=>{
    
});
app.get("/admin",(req,res)=>{
    throw new ExpressError(403,"Access Denied");
});
app.use((err,req,res,next)=>{
    let{status = 500,message ="Some Error"} = err;
    res.status(status).send(message);
    next();
});