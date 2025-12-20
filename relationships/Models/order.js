const mongoose = require("mongoose");
const Schema = mongoose.Schema;

main().then(()=>console.log("The conection is sucess")).catch(()=>console.log(err));

async function main(){
    await mongoose.connect("mongodb+srv://yeshwanthd2006_db_user:yeshwanth2006D@airbnbproject.bcjspuj.mongodb.net/?appName=AirBnbProject");
}
// one to many 10 power 3

const orderSchema = new mongoose.Schema({
    item : {
        type : String,
    },
    price:{
        type : Number,
    }
});
const custSchema = new mongoose.Schema({
    name : {
        type : String,
    },
    order : [{
        type : Schema.Types.ObjectId,
        ref : "Order",
    },
    ],
});

const Order = mongoose.model("Order",orderSchema);
const Customer = mongoose.model("Customer",custSchema);

const addOrders = async()=>{
    // let res = await Order.insertMany([
    //     {item : "Chips", price :12},
    //     {item : "Cookies", price :14},
    //     {item : "Crunches", price :10},
    // ]);
}
const custCreate = async()=>{
let user1 = new Customer({
    name : "yesh"
});
let order1 = await Order.findOne({item : "Chips"});
let order2 = await Order.findOne({item : "Cookies"});

user1.order.push(order1);
user1.order.push(order2);

let res = (await user1.save());
console.log(res);

let populatedCustomer = await Customer
        .findById(user1._id)
        .populate("order");

    console.log(populatedCustomer);
}
// addOrders();
custCreate();
