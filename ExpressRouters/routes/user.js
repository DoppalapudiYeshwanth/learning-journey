const express = require("express");
const router = express.Router();

//index route
router.get("",(req,res)=>{
    console.dir(req.cookies);
    res.send("User index route");
});
//post route
router.post("/;id",(req,res)=>{
    res.send("User index route");
});
//delete route
router.delete("/:id/delete",(req,res)=>{
    res.send("User index route");
});
// edit route
router.get("/:id/edit",(req,res)=>{
    res.send("User index route");
});

module.exports = router;