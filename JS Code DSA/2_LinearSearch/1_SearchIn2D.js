let arr = [
                [1, 2, 4 ],
                [ 9, 88, 5, 7 ],
                [ 0, 8, 3 ]
];
 let Indexarr=searchInTwoD(arr, 90);
 console.log(Indexarr);
 

function searchInTwoD(arr,target) {
    
        for (let row = 0; row < arr.length; ++row) {
            for (let col = 0; col < arr[row].length; ++col) {
                 if(arr[row][col]==target)
                 return [row,col];
            }
        }
        return [-1,-1];
    }

