let nums=[4,2,1,2,1];
let uniqueNumber=0;

for (const element of nums) {
    uniqueNumber=element^uniqueNumber;
    
}
console.log(uniqueNumber);
