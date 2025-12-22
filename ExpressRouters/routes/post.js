const express = require("express");
const router = express.Router();

//index route
router.get("",(req,res)=>{
    res.send("Post index route");
});
//post route
router.post("/;id",(req,res)=>{
    res.send("Post index route");
});
//delete route
router.delete("/:id/delete",(req,res)=>{
    res.send("Post index route");
});
// edit route
router.get("/:id/edit",(req,res)=>{
    res.send("Post index route");
});

module.exports = router;