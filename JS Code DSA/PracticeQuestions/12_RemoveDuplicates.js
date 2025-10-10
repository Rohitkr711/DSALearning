let array = [1, 1, 2];

const mySet=new Set();
for (let i = 0; i < array.length; ++i) {
   mySet.add(array[i]);
}
let index=0;
for (const item of mySet) {
  array[index]=item;
  ++index;
}
array.splice(index);
console.log(array);


