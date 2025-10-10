function mergeSort(arr) {
    if (arr.length === 1) {
        return arr;
    }

    const mid = Math.floor(arr.length / 2);
    const left = mergeSort(arr.slice(0, mid));
    const right = mergeSort(arr.slice(mid));

    return merge(left, right);
}

function merge(left, right) {
    const mix = [];
    let i = 0, j = 0;

    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            mix.push(left[i]);
            i++;
        } else {
            mix.push(right[j]);
            j++;
        }
    }

    // add remaining elements
    while (i < left.length) {
        mix.push(left[i]);
        i++;
    }

    while (j < right.length) {
        mix.push(right[j]);
        j++;
    }

    return mix;
}

// Example usage
const arr = [8, 3, 4, 12, 5, 6];
const sortedArr = mergeSort(arr);
console.log(sortedArr);
