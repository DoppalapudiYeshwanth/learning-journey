const sum = (a,b)=>{
    return a+b;
}
const sum_ = 9;
const mul = 19;
const div = 10;
const g = 9.8;
export let obj = {
    sum : sum_,
    mul : mul,
    div : div,
    g : g
};
// console.log("Hello");

let args = process.argv;
for(let i=0;i<args.length;i++){
    console.log("Hello "+args[i]);
}