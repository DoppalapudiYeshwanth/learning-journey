let arr1 = [1,2,3,4];
let arr2 = [1,2,3,4];
let result = JSON.stringify(arr1)===JSON.stringify(arr2);
if(result){
    console.log("These are the same");
}
else{
    console.log("These are different");
}