
var splitArray = function (nums, k) {
    let totalSum = 0, max = nums[0];
    for (let i = 0; i < nums.length; ++i) {
        totalSum += nums[i]
        if (nums[i] > max)
            max = nums[i];
    }
    console.log('Total Sum=',totalSum);
    console.log('Largest Element',max);
    let result = splitLargestMinSum(max,totalSum,nums,k)
    console.log('Result',result);
    
    
};
function splitLargestMinSum(start, end, nums, k) {

    while (start <= end) {
        let countPieces = 1, arraySum=0;
        let mid = start + Math.floor((end-start) / 2);
        for (let i = 0; i < nums.length; ++i) {
            arraySum+=nums[i];
            if(arraySum>mid){
                arraySum-=nums[i]
                ++countPieces;
                arraySum=0;
            }
        }
        console.log('countPices', countPieces);
        
            if (countPieces<=k) {
                end=mid;
            }
            else {
                start = mid + 1;
            }
    }
    return end;
}

splitArray([7,2,5,8,10],2)