let arr = [7, 8, 18, 52, 55, 98, 110, 220, 310], target = 31;
let st = 0;
let end = arr.length - 1;


let search = (arr, st, end, target) => {
    if (st > end)
        return -1;

    let mid = Math.floor(st + (end - st) / 2);
    if (arr[mid] === target)
        return mid;

    if (arr[mid] < target)
        return search(arr, mid + 1, end, target);
    else {
        return search(arr, st, mid - 1, target);

    }
}

let BSReturn = search(arr, st, end, target);

if(BSReturn===-1)
    console.log("Item not found");
else
    console.log("Item found at index", BSReturn);
    
    
