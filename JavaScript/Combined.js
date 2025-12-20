// let smallimg = document.getElementsByClassName("oldImg");
// for(let i= 0;i<smallimg.length;i++){
//     console.dir(smallimg[i].src);
// }   
// //to replace all img
// for(let i=0;i<smallimg.length;i++){
//     smallimg[i].src = "/images/spiderman_img.png";
//     console.log(`The img of ${i} is changed to the main image`);
// }
// let links = document.querySelectorAll("a");
// for(let i = 0 ; i < links.length ; i++){
//     links[i].style.color = "green";
// }
// let newParagraph = document.createElement("p");
// newParagraph.innerText = "hello";

// let newPara = document.createElement("p");
// newPara.innerText = "Hey I'm red";
// newPara.style.color = "red";
// document.querySelector('body').append(newPara);
// let newDiv = document.createElement('div');
// newDiv.style.backgroundColor("red");
// newDiv.style.borderColor("black");
// document.querySelector('body').append(newDiv);

let newButton = document.querySelectorAll("button");
// newButton.onclick = ()=>{
//     console.log("The button is clicked");
// }
// for(button of newButton){
//     button.onclick = ()=>{
//         console.log("Clicked it");
//     }
//     button.onmouseenter = ()=>{
//         console.log("The cursor is in");
//     }
// }
// for(btn of newButton){
//     btn.addEventListener("click",sayHello);
//     btn.addEventListener("dblclick",doubleClick);
// }
// function sayHello(){
//     alert("Hello");
// }
// function doubleClick(){
//     alert("Clicked double");
// }

// let selectButton = document.querySelector("button");

// function fillRandomColor(){
//     let red = Math.floor(Math.random()*255);
//     let green = Math.floor(Math.random()*255);
//     let blue = Math.floor(Math.random()*255);
//     let color = `rgb(${red},${green},${blue})`;
//     return color;

// }
// selectButton.addEventListener("click",function (){
//     let selectH2 = document.querySelector("h2");
//     let randomColor = fillRandomColor();
//     selectH2.innerText = randomColor;
//     let selectDiv = document.querySelector("div");
//     selectDiv.style.backgroundColor = randomColor;
// });
// let newPara = document.querySelector("p");
// newPara.addEventListener("click",changeP);
// function changeP(){
//     let red = Math.floor(Math.random()*255);
//     let green = Math.floor(Math.random()*255);
//     let blue = Math.floor(Math.random()*255);
//     let color = `rgb(${red},${green},${blue})`;
//     newPara.style.color = color;
// }
// let newAnchor = document.querySelector("a");
// newAnchor.addEventListener("click",changeA);

// function changeA(){
//    this.style.color = "green;"
// }
// //used for any number od elements the same function
// let selectInput = document.querySelector("input");
// selectInput.addEventListener("keyup",function(){
//     console.log(event);
//     console.log("Hello");
// })
// let form = document.querySelector("form");
// form.addEventListener("submit",function(event){
//     event.preventDefault();
//     let input = document.querySelector("input");
//     console.log(input.value);
// });

// let form = document.querySelector("form");
// form.addEventListener("submit",function(event){
//     event.preventDefault();
//     let button = document.querySelector("button");
//     button.addEventListener("mouseout",()=>{
//         button.style.backgroundColor = "yellow";
//     })
//     button.addEventListener("click",()=>{
//         button.style.backgroundColor = "green";
//     })
// });
// let input = document.querySelector("input");
// input.addEventListener("change",function(){
//     console.log("The change event");
//     let h1 = document.querySelector("h1");
//     h1.innerText = input.value;
// });
// input.addEventListener("input",function(){
//     console.log("The input event");
// });

// let div = document.querySelector("div");
// let ul = document.querySelector("ul");
// let lis = document.querySelectorAll("li");
// div.addEventListener("click",function(){
//     console.log("Hello div");
// })
// ul.addEventListener("click",function(event){
//     event.stopPropagation();
//     console.log("Hello ul");
// })

// for(li of lis){
//     li.addEventListener("click",function(event){
//     event.stopPropagation();
//     console.log("Hello li");
// })}


    
    

