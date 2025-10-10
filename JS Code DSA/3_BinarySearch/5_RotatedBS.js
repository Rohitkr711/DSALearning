let arr = [1,2,3,4,6,7], target = 2;

function RotatedBinarySearch() {
    let pivotElementIdx = searchPivotElementIdx(arr);
    console.log(pivotElementIdx);
    if (target === arr[pivotElementIdx]) {

        console.log(pivotElementIdx);
        return pivotElementIdx;
    }
    else if (target < arr[0]) {
        let start=pivotElementIdx;
        let end=arr.length-1;
        if(start===end) start=0;
        else start= start+1;
        let elementIdx=BinarySearch(arr, target, start, end);
        console.log("element index", elementIdx);
        return;
        
    }
    else{
        let elementIdx=BinarySearch(arr, target, 0, pivotElementIdx - 1);
        console.log("element index", elementIdx);
        return;

    }

    console.log("RBS done");
    


}

RotatedBinarySearch();

function searchPivotElementIdx(arr) {
    let start = 0, end = arr.length - 1;
    while (start <= end) {


        let mid = start + Math.floor((end - start) / 2);
        // console.log("Inside while: Start",start,"End",end,"Mid",mid);

        if (mid < end && arr[mid] > arr[mid + 1]) {

            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {

            return mid - 1;
        }

        if (arr[mid] < arr[start]) {

            end = mid - 1;
        }
        else {
            start = mid + 1;

        }
    }
    console.log("loop ends");

    return end;
}

function BinarySearch(nums, target, start, end) {

    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        if (nums[mid] === target) {
            return mid;
        }


        if (nums[mid] < target) {
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }
    }
    return -1;
}




