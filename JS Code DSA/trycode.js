// let People = function(person, age) { 
//     this.person = person; 
//     this.age = age; 
//     this.info = function() { 
//         console.log(this);  
//        setTimeout(() => {  
//         console.log(this.person + " is " + this.age + " years old"); 
//        }, 3000); 
//     } 
// }  
// let person1 = new People('John', 21); 
// console.log(person1);

// person1.info();

// const condition = console.log('Hello')||false;
// console.log(condition);

// function test(a,b){
// console.log(a+b);
// }
// let rval=test(2,3,4);
// console.log(rval);

// let x=-123;
// x=-x;
// console.log(x);

// let arr=[2,3,4,5,6,7,8];

// function arraySum(n) {
//         // code here
//         if(n===0 && arr[n]%2===0){
//             return arr[0];
//         }
//         if(n===0 && arr[n]%2!==0){
//             return;
//         }

//         if(arr[n]%2===0){
//            return arr[n] + arraySum(n-1);
//         }
//         else{
//             return arraySum(n-1);
//         }

//     }
// let totalSum = arraySum(arr.length-1);
// console.log(totalSum);

// let board = ['x', 'o', 'x', 'o', 'x', 'o', 'x', 'x', 'x']
// let winner = ''
// let val=board.every((ele) => {
//     console.log('ele', ele);

//     return ele !== ''
// })

// console.log(val);

// if(val && !winner)
//     console.log('passed');

let arr1=[2,3];
let arr2=[];
let arr3=arr2.push(...arr1)
console.log(arr2);

    



