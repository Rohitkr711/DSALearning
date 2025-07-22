    function findSum(n) {
        // code here
        if(n===1){
            return n;
        }
        return n + findSum(n-1);
        
    }
    let sum=findSum(10);
    console.log(sum);
    