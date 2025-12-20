// function printPoem(){
//     console.log("Humpty said on the wall and had a great fall");
// }
// // printPoem();
// function rollDice(){
//     console.log(Math.ceil(Math.random()*6));
// }
// // rollDice();
// function average(num1,num2,num3){
//     console.log((num1+num2+num3)/3);
// }
// // average(2,2,6);
// function mulTable(num,edge){
//     for(let i=0;i<=edge;i++){
//         console.log(`${num} x ${i} = ${num*i}`);
//     }
// }
// // mulTable(2,10);
// // mulTable(2,100);
// function sumN(edge){
//     let sum = 0;
//     for(let i = 0; i<= edge; i++){
//         sum+=i;
//     }
//     return sum;
// }
// // console.log(sumN(10));
// function concat(arr){
//     let result = "";
//     for(let i =0; i<arr.length; i++){
//         result+=arr[i];
//     }
//     return result;
// }
// let arr = ["y","e","s","h"];
// // console.log(concat(arr));

// const Student = {
//     name : "yesh",
//     eng : 25,
//     math : 24,
//     getAvg(){
//         let avg = (this.eng+this.math)/2;
//         console.log("the average is : "+ avg);
//     }
// };
// // console.log(Student.getAvg());
// // const func = () => {
// //     console.log("hello world",n);
// // }
// // const pow = (a,b)=>{
// //     console.log(Math.pow(a,b));
// // }
// // // setTimeout(pow,5000);

// // const student = {
// //     name : this
// // };
// // console.log(student);
// // const square = n => n*n;
// // console.log(square(3));
// // const id = setInterval(()=>{
// //     console.log("Hello world");
// // },2000);
// // // clearInterval(id);
// // setTimeout(()=>{clearInterval(id)},10000);
// // console.log(id);
// const arrayAverage = ()=>{
//     let arr =[];
//     let sum= 0;
//     let size = 3;
//     for(let i=0;i<size;i++){
//         let input = Number(prompt("enter a number into the array: "));
//         arr[i]=input;
//         sum+=arr[i];
//     }
//     return sum/size;
// }
    // let arr = [1,2,3,4];
    // let newArr = arr.forEach((el)=>{
    //     console.log(el);
    // })
    // console.log(newArr);
    // let newArr2 = arr.map((el)=>{
    //     return el*2
    // })
    // console.log(newArr2);
    // let student = arr.filter((el)=>{
    //     if(el!=1){
    //         return el;
    //     }
    // })
    // console.log(student);
    // let check = arr.every((el)=>{
    //     if(el>1){
    //         return true;
    //     }
    // })
    // console.log(check);
    // let add = arr.reduce((ac,el)=>{
    //     return ac+el;
    // })
    // console.log(add);
    // let largest = arr.reduce((lar,el)=>{
    //     if(lar<el){
    //         return el;
    //     }
    //     else{
    //         return lar;
    //     }
    // })
    // console.log(largest);
    // let check1 = arr.every((el)=>{
    //     if(el%10==0){
    //         return true;
    //     }
    // })
    // console.log(check1);
    // let smallest = arr.reduce((lar,el)=>{
    //     if(lar<el){
    //         return lar;
    //     }
    //     else{
    //         return el;
    //     }
    // })
    // console.log(smallest);
    // let arr1 = ["hello","yeshu"];
    // console.log(...arr1);
    // let data = {
    //     name : "yeshu",
    //     age : 19
    // };
    // let newData = {
    //     ...data,id : 123
    // }
    // console.log(newData);
    // let names = ["yesh","shjin"];
    // let [winner,winner2]=names;
    // console.log(winner,winner2);

    let student = {
        name : "yesh",
        pass : 231
    };
    let {nuser,password} = student;

    let arr =[1,2,3,4];
    let square = arr.reduce((ac, el) => {
        return (ac + el * el);
    }, 0);
    console.log(square/arr.length);