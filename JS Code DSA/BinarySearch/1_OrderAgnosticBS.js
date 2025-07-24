var search = function (nums, target) {
    let st = 0, end = nums.length - 1;
    let itemFound = false;


    while (st <= end) {
        let mid = Math.floor((st + end) / 2);
        if (nums[mid] === target) {
            itemFound = true;
            return mid;
        }
        if (nums[end] > nums[st]) {

            if (nums[mid] < target) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        else{
           if (nums[mid] < target) {
                end = mid - 1;
            }
            else {
                st = mid + 1;
            }            
        }
    }
    if (!itemFound) {
        return -1;

    }

};
console.log(search([142,98,55,17,14,9,5,4,2], 1));


