let num = 0;
let countDigit=0;
if(num===0){
    ++countDigit;
    console.log("Total_Digits =",countDigit);
    return;
}

while(num>0){
    console.log(num);
    ++countDigit;
    num=parseInt(num/10);
    
}
console.log("Total_Digits =",countDigit);
