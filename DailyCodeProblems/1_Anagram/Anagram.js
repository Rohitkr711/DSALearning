function isAnagram(s, t) {
    // Step 1: Strings must be the same length
    if (s.length !== t.length) return false;

    // Step 2: Create an array of size 26 (for lowercase letters)
    const customMap = new Array(26).fill(0); //[0=1,1=2,2=0,3=0..25=0]

    // Step 3: Count characters in s
    for (let i = 0; i < s.length; i++) {  // `a b b`
        customMap[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;  
    }

    // Step 4: Subtract counts using characters in t
    for (let i = 0; i < t.length; i++) {  //b a c
        customMap[t.charCodeAt(i) - 'a'.charCodeAt(0)]--;
        if (customMap[t.charCodeAt(i) - 'a'.charCodeAt(0)] < 0) {
            return false; // More occurrences in t than in s
        }
    }

    return true; // All counts matched
}

// Example usage:
console.log(isAnagram("rat", "tar")); // true
console.log(isAnagram("cat", "rat")); // false





`a,b,b`   //r=1 | a=1 |t=1 | c=0
`b,a,b`   //t=1 |a=1 | c=1 

// [0=0,1=0,2,3......25] 26 character of alphabet
// [a=0,b=0,c...t=0,.z] 1


a=97
b=98
c=99
z=122