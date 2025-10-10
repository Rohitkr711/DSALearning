let nums = [3, 2, 2, 3];
let val = 3;
let arr=[];
    for(let i=0;i<nums.length;++i){
        if(nums[i]!==val){
            arr.push(nums[i]);
        }
    }
    console.log(arr);
    console.log(arr.length);
    
