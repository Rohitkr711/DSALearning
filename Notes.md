1. Q)Search Largest element in an array.
Corner cases:-
Array is empty✅
Array has negative no.✅
Array has duplicates [10,5,10]✅
```bash
        int first = NEGATIVE_INFINITY;
        int second = NEGATIVE_INFINITY;

        if(arr.length==0)
        return second;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;
            }
        }
        return second;
```
2. Print this pattern
```
            * 
          * * 
        * * * 
      * * * * 
    * * * * *

    Logic:  printing n-(i+1) empty spaces then i+1 stars
```

3. 