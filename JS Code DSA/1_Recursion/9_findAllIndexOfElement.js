let arr = [2, 3, 4, 4, 9, 8, 1, 4];

console.log(findAllIndex(arr, 4, 0));

function findAllIndex(arr, target, idx) {
    let localArr = []
    if (idx == arr.length)
        return localArr;
    
    if (arr[idx] == target) {
        
        localArr.push(idx);
    }
    
    let returnArr = findAllIndex(arr, target, idx + 1);
    localArr.push(...returnArr)
    return localArr;
    
    
}

