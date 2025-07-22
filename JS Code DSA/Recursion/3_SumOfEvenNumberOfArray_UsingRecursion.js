let arr = [2, 3, 4, 5, 6, 7, 8];

function arraySum(n) {
    // code here
    if (n === 0 && arr[n] % 2 === 0) {
        return arr[0];
    }
    if (n === 0 && arr[n] % 2 !== 0) {
        return;
    }

    if (arr[n] % 2 === 0) {
        return arr[n] + arraySum(n - 1);
    }
    else {
        return arraySum(n - 1);
    }

}
let totalSum = arraySum(arr.length - 1);
console.log(totalSum);