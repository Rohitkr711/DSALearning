function ReverseArray(arr){
    let revArr=[]
    let i=arr.length-1;
    let j=0;

    while(i>=0){
        revArr[j]=arr[i];
        --i;
        ++j;
    }
    // return revArr;

}
console.log(ReverseArray([1,3,5,7,9,11]));

// But the thing here is that our code is not optimized and its taking extra space by creating another array. So, for this we should go with the two pointer approach.