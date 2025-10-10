var search = function (arr, target) {
    let pivotIdx = findPivotWithDuplicates(arr);
    console.log('Pivot Idx', pivotIdx);
    
    // let left = binarySearch(arr, target, 0, pivotIdx);
    // // console.log('left',left);
    
    // if (left || pivotIdx==arr.length-1){
    //     console.log('left',left);
    //     return left;
        
    // }
    // let right =  binarySearch(arr, target, pivotIdx + 1, arr.length - 1);
    // console.log('Right',right);
    // return right;

}

// check with this example [1,2,2,2,2,3,-1,0,1,1]
function findPivotWithDuplicates(arr) {
    let start = 0;
    let end = arr.length - 1;
    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);
        // 4 cases over here
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        // if elements at middle, start, end are equal then just skip the duplicates
        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            // skip the duplicates
            // NOTE: what if these elements at start and end were the pivot??
            // check if start is pivot
            if (start<end && arr[start] > arr[start + 1]) {  // start<end for handling [2] single length array
                return start;
            }
            start++;

            // check whether end is pivot
            if (end>start && arr[end] < arr[end - 1]) {  // end>start for handling [2] single length array
                return end - 1;
            }
            end--;
        }
        // left side is sorted, so pivot should be in right
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return end;
}

function binarySearch(nums, target, start, end) {

    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);
        if (nums[mid] === target) {
            // return mid;
            return true
        }
        if (nums[end] > nums[start]) {

            if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        else {
            if (nums[mid] < target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
    }
    return false;
}

search([2,2,2,2,2,2,3,2,2,2], 2)

