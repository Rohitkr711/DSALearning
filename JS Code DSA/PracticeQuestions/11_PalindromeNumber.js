let x=121;
if(x<0)
   return "Not Palindrome";      

let reverseNumber=0;
while(x>0){
    let digit=x%10;
    reverseNumber=10*reverseNumber+digit;
    x=parseInt(x/10);
}
console.log("number =",x);
console.log("reverseNumber =",reverseNumber);

if(reverseNumber===x){
    console.log("Palindrome");
}
else{
    console.log("Not Palindrome");
}
  

