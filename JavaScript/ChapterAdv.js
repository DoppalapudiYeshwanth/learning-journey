// function one(){
// //     return 1;
// // }
// // function two(){
// //     return one() + one();
// // }
// // function three(){
// //     let ans = two() + one();
// //     console.log(ans);
// // }
// // let h1 = document.querySelector("h1");

// // function changeColor(color,delay,nextColorChange){
// //     setTimeout(()=>{
// //         h1.style.color = color;
// //         if(nextColorChange) nextColorChange();
// //     },delay);
// // }
// // changeColor("red",1000,()=>{
// //     changeColor("orange",1000);
// // });

// let internetSpeed = Math.floor(Math.random()*10);
// function saveToDb(data,success,failure){
//     if(internetSpeed>4){
//         success();
//     }
//     else{
//         failure();
//     }
// }
// saveToDb("Yeshwanth",()=>{
//     console.log("Data saved successfully");
//     saveToDb("Shijin",()=>{
//         console.log("Second data is added");
//     },()=>{
//         console.log("Second data cant be done");
//     });
// },()=>{
//     console.log("Data is not saved weak connection");
// });

// function saveToDbPromise(data){
//     return new Promise((resolve,reject)=>{
//         let internetSpeed = Math.floor(Math.random()*10);
//         if(internetSpeed>4){
//             resolve();
//         }
//         else{
//             reject();
//         }
//     })
// }

// let request = saveToDbPromise("Yeshwanth");
// request.then(()=>{
//     console.log("It is a success");
// })
// .catch(()=>{
//     console.log("Its a failure");
// })
// //promise chaining
// saveToDbPromise("yesh")
// .then(()=>{
//     console.log("Data 1 saved");
//     saveToDbPromise("happy")
//     .then(()=>{
//         console.log("Data 2 saved");
//     })
// })
// .catch(()=>{
//     console.log("Data is not saved");
// });
// //improved version of promise chaining

// saveToDbPromise("yesh")
// .then((result)=>{
//     console.log("Data 1 saved"+result);
//     return saveToDbPromise("happy")
// })
// .then((result)=>{
//         console.log("Data 2 saved"+result);
//         return saveToDbPromise("heloo");
// })
// .then((result)=>{
//         console.log("Data 3 saved"+result);
// })
// .catch((error)=>{
//     console.log("Data is not saved"+error);
// });

// async function greet(){
//     throw "404 error code"
//     console.log("hello");
// }
// greet()
// .then((result)=>{
//     console.log("Done "+result);
// })
// .catch((error)=>{
//     console.log("Not done "+error);
// });

// let demo = async ()=>{
//     console.log("Hello world");
// }
// demo();

//await call
// function getNum(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//         let ranNum = Math.floor(Math.random()*10);
//         console.log(ranNum);
//         resolve();
//     },1000);
//     })
    
// };
// async function demo(){
//     await getNum();
//     await getNum();
// };
// // demo();

// function changeColor(color) {
//     let h1 = document.querySelector("h1");
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             h1.style.color = color;
//             resolve();
//         },1000);
//     });
// }
// async function callColor() {
//     await changeColor("red");
//     await changeColor("blue");
//     await changeColor("green");
//     await changeColor("black");
// }
// // callColor();
// function changeColor1(color) {
    
//     let h1 = document.querySelector("h1");
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             let num = Math.floor(Math.random()*5);
//         if(num>3){
//          reject("Rejected");
//         }
//             h1.style.color = color;
//             resolve();
//         },1000);
//     });
// }
// async function callColor1() {
//     try{
//     await changeColor1("red");
//     await changeColor1("blue");
//     await changeColor1("green");
//     await changeColor1("black");
//     }
//     catch(err){
//         console.log("Rejected");
//         console.log(err);
//     }
// }
// callColor();
// now as the num greater than 3 no another code after that is executed

//API s
// let jsonData = "{\"fact\":\"A sexually-active feral tom-cat 'owns' an area of about three square miles and \\\"sprays\\\" to mark his territory with strong smelling urine.\",\"length\":145}";
// let validRes = JSON.parse(jsonData);
// console.log(validRes);

// let student = {
//     name : "yeshwanth",
//     age : 19
// };
// console.log(JSON.stringify(student));

// let api = "https://catfact.ninja/fact";
// fetch(api)
// .then((res)=>{
//     console.log(res);
//     return res.json();
// })
// .then((data1)=>{
//     console.log("Data 1 fetched "+data1.fact);
//     return fetch(api);
// })
// .then((res)=>{
//     return res.json();
// })
// .then((data2)=>{
//     console.log("Data 2 fetched "+data2.fact);
// })
// .catch((err)=>{
//     console.log(err);
// });

//async and awiat in api calling
// let buttonAction = document.querySelector(".factButton");
// buttonAction.addEventListener("click",()=>{
//     getfact();
// })
// let url = "https://catfact.ninja/fact";
// async function getfact(){
//     try{
//         let res = await axios.get(url);
//         let para = document.querySelector("p");
//         para.innerText = res.data.fact;
//     }
//     catch(e){
//         console.log("Error "+ e);
//     }
// }
// getfact();

let imageButton = document.querySelector(".imageButton");
imageButton.addEventListener("click",()=>{
    getPic();
})
let url2 = "https://dog.ceo/api/breeds/image/random";
async function getPic(){
    try {
        let res = await axios.get(url2);
        let image = document.querySelector("img");
        image.src = res.data.message;
    }
    catch{
        let errror = "Not found";
        return errror;
    }
}

//headers in axios
let buttonAction1 = document.querySelector(".factButton");
buttonAction1.addEventListener("click",()=>{
    getfact();
})
let url1 = "https://catfact.ninja/fact";
async function getfact(){
    try{
        const config = {headers :{Accept :"application/json"}};
        let res = await axios.get(url1,config);
        let para = document.querySelector("p");
        para.innerText = res.data.fact;
    }
    catch(e){
        console.log("Error "+ e);
    }
}
getfact();
