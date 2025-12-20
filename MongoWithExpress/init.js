const mongoose = require("mongoose");
const Chat = require("./models/chat.js");

main().then(()=>console.log("Connection Succesful")).catch(err => console.log(err));
async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/Telegram');
};

const allChats = [
    {
        from: "arjun",
        to: "meera",
        message: "Hey, what's up?",
        created_at: new Date()
    },
    {
        from: "meera",
        to: "arjun",
        message: "All good! You?",
        created_at: new Date()
    },
    {
        from: "rahul",
        to: "kavya",
        message: "Did you check the notes?",
        created_at: new Date()
    },
    {
        from: "kavya",
        to: "rahul",
        message: "Yes, I just finished reading them.",
        created_at: new Date()
    },
    {
        from: "vijay",
        to: "sahana",
        message: "Let's meet at 6 PM?",
        created_at: new Date()
    }
];

Chat.insertMany(allChats);
