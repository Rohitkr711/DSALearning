let nums=[9,6,4,2,3,5,7,0,1];


for(let i=0;i<=nums.length;++i){
    let numPresent=false;
    for(let j=0;j<nums.length;++j){
        if(nums[j]===i)
            numPresent=true;
    }
    if(!numPresent){
        console.log("Missing number :",i);
        break;
    }
}