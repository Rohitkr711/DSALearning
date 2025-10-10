function IdxofMaxElement(arr){
    let index=0;
    for(let i=1;i<arr.length;++i){
        if(arr[i]>arr[index]){
            index=i;
        }
    }
    return index;

}
let idxVal = IdxofMaxElement([1,5,3,7,2,7]);
console.log('Index of max val is',idxVal);
