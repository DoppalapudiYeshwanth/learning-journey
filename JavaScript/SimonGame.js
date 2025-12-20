let gameSeq = [];
let userSeq = [];
let buttons = ["red","green","yellow","purple"];

let start = false ;
let level = 0;
let h2 = document.querySelector("h2");

document.addEventListener("keydown",function(){
    if(start == false){
    console.log("The key is pressed");
    start = true;
    levelUp();
    }
});
function levelUp(){
    userSeq=[];
    level++;
    h2.innerText = `Level ${level}`;

    //selecting a random button to flash
    let randomIndex = Math.floor(Math.random()*buttons.length);
    let randomColor = buttons[randomIndex];
    let randomButton = document.querySelector(`.${randomColor}`);
    gameSeq.push(randomColor);
    console.log(gameSeq);
    gameFlash(randomButton);
    console.log("The level function is working");
}
function gameFlash(btn){
    btn.classList.add("flash");
    setTimeout(function(){
        btn.classList.remove("flash");
    },250);
    console.log("The button flash class is called");
}
function userFlash(btn){
    btn.classList.add("userflash");
    setTimeout(function(){
        btn.classList.remove("userflash");
    },250);
    console.log("The user flash class is called");
}
function buttonPress(){
    console.log(this);
    let btn = this;
    userFlash(btn);
    userColor = btn.getAttribute("id");
    console.log(userColor);
    userSeq.push(userColor);
    checkAns(userSeq.length-1);
    console.log("The button press function is called");
}
let allButtons = document.querySelectorAll(".btn");
for(btn of allButtons){
    btn.addEventListener("click",buttonPress);
};
function checkAns(index){
    console.log("current level :",level);
    if(userSeq[index]===gameSeq[index]){
        if(userSeq.length===gameSeq.length){
            setTimeout(function(){
                levelUp();
            },1000);   
        }
    }
    else{
        h2.innerHTML = `Game over at level ${level}, Your Score was <b>${level}</b><br>Press any key to start.`
        let effect = document.querySelector("body");
        effect.style.backgroundColor = "red";
        setTimeout(function(){
            effect.style.backgroundColor = "white";
        },150);
        reset();
    }
}
function reset(){
    start = false;
    gameSeq = [];
    userSeq = [];
    level = 0;
}