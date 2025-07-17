let s=['H','a','n','n','a','h'];
// let s = ["A", " ", "m", "a", "n", ",", " ", "a", " ", "p", "l", "a", "n", ",", " ", "a", " ", "c", "a", "n", "a", "l", ":", " ", "P", "a", "n", "a", "m", "a"];
// console.log(s1.length);


    let backwordIdx = s.length - 1;
    if (s.length % 2 === 0) {
        for (let i = 0; i <= Math.floor(s.length/2)-1; ++i) {
            let temp = s[i];
            s[i] = s[backwordIdx];
            s[backwordIdx] = temp;

            --backwordIdx;
        }
    }
    else {

        for (let i = 0; i <= Math.floor(s.length / 2); ++i) {
            let temp = s[i];
            s[i] = s[backwordIdx];
            s[backwordIdx] = temp;

            --backwordIdx;
        }
    }

    console.log(s);