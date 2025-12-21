const mongoose = require("mongoose");
const Order = require("./order");

const custSchema = new mongoose.Schema({
    name : {
        type : String,
    },
    orders : [{
        type : mongoose.Schema.Types.ObjectId,
        ref : "Order",
    }]
});
// mongoose middlewares

custSchema.pre("save",function(){
    console.log("Pre Middleware activated");
    this.name = this.name.toUpperCase();
});
custSchema.post("findOneAndDelete",async function(customer){
    console.log("Post Middleware activated");
    if(customer){
    await Order.deleteMany({
        _id : {$in : customer.orders}
    });
    }
    else{
        return;
    }
});

//model creation

const Customer = mongoose.model("Customer",custSchema);

module.exports = Customer;



