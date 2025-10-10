let arr=[1,2,4,8,9,12];

function IsArraySort(arr, idx){
       if(idx===arr.length-1){
        return true;
       }
       return arr[idx]<arr[idx+1] && IsArraySort(arr, idx+1);
    }
console.log(IsArraySort(arr,0));
