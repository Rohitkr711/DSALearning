var sortColors = function(arr) {
    for(let i=0;i<arr.length-1;++i){
            let isSwap=false;
            for(let j=1;j<=arr.length-i-1;++j){
                if(arr[j]<arr[j-1]){
                    let temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap)
            break;
        }
};