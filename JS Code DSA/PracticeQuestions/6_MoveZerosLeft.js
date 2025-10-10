function MoveZerosLeft(arr){
    let left=0;
    let right=arr.length-1;
    console.log('inside move zeros left');
    

    while(left<right){

        while(arr[left]==0){
            ++left;
        }
        while(arr[right]==1){
            --right;
        }
        while(left<right){
            let temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            ++left;
            --right;
        }
    }

    return arr;
}

console.log(MoveZerosLeft([0,0,1,0,1,0,1]));
