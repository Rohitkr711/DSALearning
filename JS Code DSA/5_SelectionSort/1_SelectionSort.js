function selectionSort(arr){
  
    // for(let i=0;i<arr.length-1;++i){
    //     let max=-Infinity;
    //     let idx;
    //     for(let j=0;j<=arr.length-1-i;++j){
    //         if(arr[j]>max){
    //             idx=j;
    //             max=arr[j];
    //         }
    //     }
    //     let temp=arr[arr.length-1-i];
    //     arr[arr.length-1-i]=max;
    //     arr[idx]=temp;
    // }

for (let i = arr.length - 1; i > 0; --i) {
    let max = arr[0];
    let idx = 0; // initialize to first element

    for (let j = 1; j <= i; ++j) {
        if (arr[j] > max) {
            max = arr[j];
            idx = j;
        }
    }

    let temp = arr[i];
    arr[i] = max;
    arr[idx] = temp;
}


}

let arr=[5,4,3,2,1];
selectionSort(arr)
console.log(arr);
