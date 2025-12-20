// let toDo=[];
// let request = prompt("Please enter your request : ","Add or Delete or Quit or List");
// while(true){
//     if(request=="quit"||request=="Quit"){
//         console.log("Quitting the app");
//         break;
//     }
//     else if(request=="List"||request=="list"){
//         for(let i=0; i<toDo.length;i++){
//             console.log(i,toDo[i]);
//         }
//         console.log("The tasks are listed");
//     }
//     else if(request=="add"||request=="Add"){
//         let addTask = prompt("Enter the tasks to Add.","Eat an egg");
//         toDo.push(addTask);
//         console.log("The tasks are added");
//     }
//     else if(request=="delete"||request=="Delete"){
//         let DeleteTask = prompt("Enter the tasks to Delete with its index ","Eat an egg");
//         toDo.splice(DeleteTask,1);
//         console.log("Task Deleted");
//      }
//      else{
//         console.log("Wrong request");
//      }
// }
let mainList = document.querySelector("ul");
let submitButton = document.querySelector("button");
let input = document.querySelector("input");
submitButton.addEventListener("click",function(){
    let list = document.createElement("li");
    list.innerText = input.value;
    let deleteButton = document.createElement("button");
    deleteButton.innerText = "delete";
    deleteButton.classList.add("delete");
    list.appendChild(deleteButton);
    mainList.appendChild(list);
    input.value = "";
});
mainList.addEventListener("click",function(event){
    if(event.target.nodeName == "BUTTON"){
        let listItem = event.target.parentElement;
        listItem.remove();
    }
})