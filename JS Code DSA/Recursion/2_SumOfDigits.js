function sumOfDigits(num){
    
        // let sum=0;
        // while(num>0){
        //     let rem=num % 10;
        //     sum+=rem;
        //     num=num/10;
        // }
        // return sum;

        if(num==0){
            return num;

        }

        let rem=num%10;
        return rem + sumOfDigits(Math.floor(num/10));
    }

    console.log(sumOfDigits(123));
    