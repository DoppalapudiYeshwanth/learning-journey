const mongoose = require("mongoose");

const ordSchema = new mongoose.Schema({
    item : {
        type : String,
        required : true,
    },
});
//model creation
const Order = mongoose.model("Order",ordSchema);


module.exports = Order;