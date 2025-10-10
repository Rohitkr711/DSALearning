let stockValuePerDay = [7,6,4,3,1];
// M-1
// let stockProfit = 0;

// for (let i = 0; i < stockValuePerDay.length; ++i) {
//     for (let j = i + 1; j < stockValuePerDay.length; ++j) {
//         if (stockValuePerDay[j] > stockValuePerDay[i]) {
//             let currStockPrice = stockValuePerDay[j] - stockValuePerDay[i];
//             if (currStockPrice > stockProfit) {
//                 stockProfit = currStockPrice;
//             }
//         }
        
//     }
// }
// console.log("highest Stock price for",stockValuePerDay[i],'=',stockProfit);

// M-2
// let highestFutureStock=new Array(stockValuePerDay.length).fill(0);
// console.log(highestFutureStock);

// for(let i=stockValuePerDay.length-1;i>=0;--i){
//     let maximum=-Infinity;
//     for(let j=i;j<=highestFutureStock.length-1;++j)
//     {
//         if(stockValuePerDay[j]>maximum){
//             maximum=stockValuePerDay[j];
//         }
//     }
//     highestFutureStock[i]=maximum;
// }

// let maxStockPrice=-Infinity;
// for(let i=0;i<stockValuePerDay.length;++i){
//    let diff=highestFutureStock[i]-stockValuePerDay[i];
//    if(diff>maxStockPrice){
//     maxStockPrice=diff;
//    }
// }
// console.log(maxStockPrice);
// console.log(highestFutureStock);


// M-3
let minSoFar=stockValuePerDay[0];
let maxStockPrice=-Infinity;

for(let i=0;i<stockValuePerDay.length;++i){
    if(stockValuePerDay[i]<minSoFar){
        
        minSoFar=stockValuePerDay[i];
    }

    let currentStockPrice=stockValuePerDay[i]-minSoFar;
    if(currentStockPrice>maxStockPrice){
        
        maxStockPrice=currentStockPrice;
    }
}

console.log(maxStockPrice);
