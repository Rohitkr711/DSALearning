// # Using For-Loop :
if (n > 0 && n % 2 === 0 || n === 1) {

    for (let i = 0; i < 31; ++i) {

        if (n === 2 ** i)
            return true;
    }
}
return false;

// # Using Recursion :
if (n <= 0)
    return false;
if (n === 1)
    return true;
if (n % 2 !== 0)
    return false;
return isPowerOfTwo(n / 2);


// # Using Binary :
return n > 0 && (n & (n - 1)) === 0;
