const mongoose = require("mongoose");
const Schema = mongoose.Schema;

main().then(()=>console.log("The conection is sucess")).catch(()=>console.log(err));

async function main(){
    await mongoose.connect("mongodb+srv://yeshwanthd2006_db_user:yeshwanth2006D@airbnbproject.bcjspuj.mongodb.net/?appName=AirBnbProject");
}
// one to few

const orderSchema = new mongoose.Schema({
    name : {
        type : String,
    },
    address : [
        {
            location : String,
        }
    ],
});

const Order = mongoose.model("Order",orderSchema);

const addOrders = async()=>{
    let user1 = new Order({
        name : "yesh",
        address : [{
            location : "Robo",
        }],
    });

user1.address.push({
    location : "Chitti",
});
let result = await user1.save();
console.log(result);
}
addOrders();


