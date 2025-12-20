const mongoose = require("mongoose");
const Schema = mongoose.Schema;

main().then(()=>console.log("The conection is sucess")).catch(()=>console.log(err));

async function main(){
    await mongoose.connect("mongodb+srv://yeshwanthd2006_db_user:yeshwanth2006D@airbnbproject.bcjspuj.mongodb.net/?appName=AirBnbProject");
}
//one to million or squillion

const userSchema = new Schema({
    username: String,
});

const postSchema = new Schema({
    content: String,
    user: {
        type: Schema.Types.ObjectId,
        ref: "User",
    }
});

const User = mongoose.model("User", userSchema);
const Post = mongoose.model("Post", postSchema);

/* ================= FUNCTIONS ================= */

// create user
const createUser = async () => {
    let user = new User({
        username: "yesh",
    });
    await user.save();
    console.log("User created:", user);
    return user._id;
};

// create posts for that user
const createPosts = async (userId) => {
    await Post.insertMany([
        { content: "My first post", user: userId },
        { content: "Learning MongoDB relationships", user: userId },
        { content: "Mongoose is awesome", user: userId }
    ]);
    console.log("Posts created");
};

// fetch posts of a user
const getUserPosts = async (userId) => {
    let posts = await Post
        .find({ user: userId })
        .populate("user");

    console.log("User posts:", posts);
};

/* ================= RUN ================= */

const run = async () => {
    let userId = await createUser();
    await createPosts(userId);
    await getUserPosts(userId);
};

run();