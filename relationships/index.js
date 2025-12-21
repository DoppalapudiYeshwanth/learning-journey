const mongoose = require("mongoose");
const Customer = require("./Models/customer");
const Order = require("./Models/order");

main().then(()=>console.log("The conection is sucess")).catch(()=>console.log(err));

async function main(){
    await mongoose.connect("mongodb+srv://yeshwanthd2006_db_user:yeshwanth2006D@airbnbproject.bcjspuj.mongodb.net/?appName=AirBnbProject");
    await addOrd();
    await addCust();
    await deleteCust();
    mongoose.connection.close();
}

//functions

const addOrd = async()=>{
    const order = await Order.insertMany([
        { item :"burger"},
        { item :"pizza"},
        { item :"coke"},
        { item :"cake"},
    ]);
};

const addCust = async()=>{
    let cust1 = new Customer({name : "Yeshwanth"});

    let order1 = await Order.findOne({item : "burger"});
    let order2 = await Order.findOne({item : "pizza"});

    cust1.orders.push(order1._id);
    cust1.orders.push(order2._id);

    await cust1.save();
    console.log("Customer Saved",cust1);
};

const deleteCust = async()=>{
    let res = await Customer.findOneAndDelete({name : "YESHWANTH"});
    console.log("Customer Deleted",res);
};