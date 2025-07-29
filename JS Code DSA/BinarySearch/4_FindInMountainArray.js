let findInMountainArray = function (target, mountainArr) {

    console.log("Mountain Array", mountainArr);
    
    let peakIndex = peakElementIndex(mountainArr);
    console.log("Peak index", peakIndex);
    

    //Search idx in Asc array
    let targetInIncArr = binarySearch(mountainArr, target, 0, peakIndex, true);
    if(targetInIncArr!==-1){
        console.log('',targetInIncArr);
        
        return targetInIncArr;
    } 
 
    //Search idx in Dec Array
    let targetInDecArr = binarySearch(mountainArr, target, peakIndex+1, mountainArr.length - 1, false);
    console.log(targetInDecArr);
    
    return targetInDecArr;


};

// Finding peak index of mountain array
function peakElementIndex(arr) {
    let start = 0, end = arr.length - 1;
    console.log("inside PeakEleIdx func", arr);
    

    while (start < end) {
        let mid = start + Math.floor((end - start) / 2);

        if (arr[mid] < arr[mid + 1]) {
            start = mid + 1;
        }
        else {
            end = mid;
        }

    }
    return start;
}

// order agnostic binary search
function binarySearch(arr, target, start, end, isAsc) {

    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);
        if (arr[mid] === target)
            return mid;


        if (isAsc) {

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        } 
        else {
            if (arr[mid] < target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
    }
    return -1;
}

findInMountainArray(2,[1,5,2])
