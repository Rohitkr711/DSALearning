let nums1=[2,2,3,0,0,0];
let nums2=[1,5,6];
let m=3,n=3;
let lastIdx=m+n-1;

while(m>0 && n>0){
    if(nums1[m-1]>nums2[n-1]){
        nums1[lastIdx]=nums1[m-1];
        --m;
    }
    else{
       nums1[lastIdx]=nums2[n-1];
       --n;
    }
    --lastIdx;
}
while(n>0){
    nums1[lastIdx]=nums2[n-1];
    --n;
    --lastIdx;
}
console.log(nums1);