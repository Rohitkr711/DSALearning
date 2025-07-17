let n=9;

for(let i=0;i<n;++i){
    let row="";
    for(let j=n;j>0;--j){
      if(j<=(i+1)){
        row=row+'*';
      }
      else{
        row=row+' ';
      }
    }
    console.log(row);
}