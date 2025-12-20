// console.log("Hello, World!");
// console.log("Welcome to JavaScript programming");
// console.log(5==4);
// let light = 'red'; // Change this to 'yellow' or 'green' to test other cases
// if(light=='red'){
//     console.log("Stop");
// }
// else if(light=='yellow'){
//     console.log("Get Ready");
// }
// else if(light=='green'){
//     console.log("Go");
// }
// else{
//     console.log("Invalid light");
// }
// let size='large'; // Change this to 'medium' or 'small' to test other cases
// let name="yeshwanth";
// if(size=='small'){
//     console.log(`Small size popcorn for ${name}`);
// }
// else if(size=='medium'){
//     console.log(`Medium size popcorn for ${name}`);
// }
// else if(size=='large'){
//     console.log(`Large size popcorn for ${name}`);
// }

// let str = "apple"; // Change this to test other strings
// if((str[0]==='a') && (str.length>3)){
//     console.log("The string starts with 'a' and is longer than 3 characters");
// }
// else{
//     console.log("The string does not start with 'a' or is not longer than 3 characters");
// }
// let day="Monday"; // Change this to test other days
// switch(day){
//     case "Monday":
//         console.log("Today is Monday");
//         break;
//     case "Tuesday":
//         console.log("Today is Tuesday");
//         break;              
//     case "Wednesday":
//         console.log("Today is Wednesday");
//         break;      
//     case "Thursday":
//         console.log("Today is Thursday");       
//         break;  
//     case "Friday":
//         console.log("Today is Friday");
//         break;
//     case "Saturday":
//         console.log("Today is Saturday");
//         break;
//     case "Sunday":
//         console.log("Today is Sunday");
//         break;
//     default:
//         console.log("Invalid day");
//         break;
// }
// alert("This is an alert message!");
// console.error("This is an error message!");
// console.warn("This is a warning message!");

// let firstname = prompt("Please enter your name:", "firstname");
// let lastname = prompt("Please enter your lastname : ", "lastname");
// let name = `${firstname} ${lastname}`;
// alert(`Hello, ${name}! Welcome to JavaScript programming.`);

// let num=20;
// if(num%10==0){
//     console.log("The number is divisible by 10");
// }
// else{
//     console.log("The number is not divisible by 10");
// }

// let username = prompt("Enter your username:","username");
// let age = prompt("Enter your age:","age");
// alert(`${username} is ${age} years old`);

// let button=1;
// switch(button){
//     case 1:
//         console.log("January February March");
//         break;
//     case 2:
//         console.log("April May June");
//         break;
//     case 3:
//         console.log("July August September");
//         break;
//     case 4:
//         console.log("October November December");   
//         break;
//     default:
//         console.log("Invalid button");
//         break;
// }

// let str="Hello World";
// if(str[0]==='A'||str[0]==='a'&& str.length>5){
//     console.log("The string starts with 'A' or 'a' and is longer than 5 characters");
// }
// else{
//     console.log("The string does not start with 'A' or 'a' or is not longer than 5 characters");
// }
// let num1 = 10;
// let num2 = 20;
// let num3 = 30;
// if(num1 > num2 && num1 > num3){
//     console.log(`${num1} is the largest number`);
// }
// else if(num2 > num1 && num2 > num3){
//     console.log(`${num2} is the largest number`);
// }
// else if(num3 > num1 && num3 > num2){
//     console.log(`${num3} is the largest number`);
// }
// else{
//     console.log("All numbers are equal or invalid");
// }

// let num12=15;
// let num22=25;
// if(num12[num12.length-1] === num22[num22.length-1]){
//     console.log("The last digits of the numbers are equal");
// }
// else{
//     console.log("The last digits of the numbers are not equal");
// }

// let str=" a Hello ";
// console.log(str.trim()); // Removes whitespace from both ends of the string
// console.log(str.indexOf("love"));
// console.log(str.toUpperCase());
// console.log(str.replace("Hell","yesh"));
// let msg = "help!"
// console.log(msg.trim().toUpperCase());
// let students = ["yesh","yeshwanth"];
// students.push("madhu");
// students.pop();
// console.log(students);

// const arr=[1,2,3];
// arr.push(4);
// console.log(arr);
// let tictacToe = [["X"," ","O"],[" ","X"," "],["O"," ","X"]]
// console.log(tictacToe);
// tictacToe[0].splice(1,1,"O");

let num=[1,2,3,4,5];
let key= 3;
console.log(num.slice(0,key));

