// let Myname="Rohit";
// console.log(Myname.split(''));

// const str = "The quick brown fox jumps over the lazy dog.";
// const words = str.split('');
// console.log(words)
// console.log(words[3]);

function main(stringVal,ch) {
    // your code goes here
    let stringArray=stringVal.split('');
    
    for(let i=0;i<stringArray.length;++i){
        if(stringArray[i]===ch){
            return i;
        }
    }
    
    return -1;
}

console.log(main("helping",'g'));