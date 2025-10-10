let nums = [2,1,0,3,12];
let leftPointer=0;
let rightPointer=0;

for(rightPointer in nums){
    if(nums[rightPointer]!==0){
        let temp = nums[rightPointer];
        nums[rightPointer]=nums[leftPointer];
        nums[leftPointer]=temp;

        ++leftPointer;
    }
}

console.log(nums);
