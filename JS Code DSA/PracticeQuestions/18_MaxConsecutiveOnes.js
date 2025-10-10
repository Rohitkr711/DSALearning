let nums = [1, 1, 0, 1, 1, 1, 0, 1, 1];
let maxNumberOfOnes = 0;
let count = 0;

for (let i = 0; i < nums.length; ++i) {
    if (nums[i]) {
        ++count;
        if (count > maxNumberOfOnes) {
            maxNumberOfOnes = count;
        }
    }
    else {
        count = 0;
    }


}

console.log(maxNumberOfOnes);

