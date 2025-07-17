// #Approach-1
// class Solution {
//     search(arr, x) {
//         for (let i = 0; i < arr.length; i++) {
//             console.log('inside for loop');
//             if (arr[i] === x) return i;
//         }
//         return -1;
//     }
// }

// let SolutionObject=new Solution();
// let returnValue=SolutionObject.search([],8);
// console.log(returnValue);

// #Approach-2
class Solution1 {
    search(arr, x) {
        return arr.indexOf(x);
    }
}
let SolutionObject1=new Solution1();
console.log(SolutionObject1.search([],0));


let arr=[];
console.log(arr[0]);



