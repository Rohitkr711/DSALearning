function SumOfDigit(num){

    if(num==0)
        return 0;

    let rem=num%10;
    console.log('rem',rem);
    num = Math.floor(num/10)
    console.log('num',num);
    
    return rem+SumOfDigit(num);
}
console.log(SumOfDigit(123));