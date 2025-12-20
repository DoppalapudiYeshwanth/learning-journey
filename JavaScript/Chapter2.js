// let arr = [1,2,3,4,5,6,2,3];
// let num = 2;
// let newarr = [false];
// for(let i =0;i<arr.length;i++){
//     let element = arr[i];
//     if(newarr[element]==true){
//         arr.splice(i,1);
//         break;
//     }
//     newarr[element]=true;
// }
// console.log(arr);

// //remove all the duplicates 

// let arr1 = [1, 2, 3, 4, 5, 6, 2, 3];
// let newarr1 = [];
// let result = [];

// for (let i = 0; i < arr1.length; i++) {
//     if (!newarr1[arr[i]]) {
//         result.push(arr1[i]);
//         newarr1[arr1[i]] = true;
//     }
// }
// console.log(result); // [1, 2, 3, 4, 5, 6]

// count the numbers

// let num = 1172837;
// let result = 0;
// for(let digit of num.toString()){
//     if(digit!==0){
//         result++;
//     }
// }
// console.log(result);

// let num = 1234;
// let result = 0;
// while(num>0){
//     let digit = num%10;
//     result += digit;
//     num = Math.floor(num/10);
// }
// console.log(result);

// let student = {
//     name : "yeshwanth",
//     age : 18,
//     marks : [1,2,3,4,5]
// };
// console.log(student);

// const insta = {
//     username : "yesh",
//     content : "coding",
//     likes : 10000000000,
//     reposts : 0,
//     tags : ["@yesh","@coding"]
// };
// console.log(insta.username="yeshu"+delete insta.reposts);
// console.log(insta);

// const student = {
//     yesh : {
//         grade : "A"
//     },
//     jesh : {
//         grade : "A"
//     },
//     yeshu : {
//         grade : "A"
//     }
// };
// let start = Math.random()*10/2;
// console.log(start);
// console.log(Math.ceil(start));

// let input = prompt("Enter the range of numbers from 0 to the last ","100");
// let range = Number(input);
// let randomNum = Math.ceil(Math.random()*range);
// let maxAttempts = 5;
// let count = 0;
// let guessedNum = Number(prompt("Guess the number between 0 to "+range))
// while(count<maxAttempts){
//     if(guessedNum===randomNum){
//         console.log("You won the game");
//     }
//     else if(guessedNum<randomNum){
//         console.log("The guess is too small");
//         let hint = randomNum+Math.ceil(Math.random()*5);
//         console.log("The number may be close to this "+ hint);
//     }
//     else if(guessedNum>randomNum){
//         console.log("The guess is too large");
//         let hint = randomNum-Math.ceil(Math.random()*5);
//         console.log("The number may be close to this "+ hint);
//     }
//     count++;
//     if(count===maxAttempts||guessedNum==0){
//         console.log("Out of Attempts or user wanted to quit and the answer is  "+final);
//         break;
//     }
//     guessedNum = Number(prompt("Try again (" + (maxAttempts - count) + " attempts left):"));
// }

// let generatedDice = Math.ceil(Math.random()*6);
// console.log(generatedDice);

let car = {
    name : "ertiga",
    model : 2021,
    color : "maroon-red"
};
car.name = "fortuner";
car.country = "india";
console.log(car);