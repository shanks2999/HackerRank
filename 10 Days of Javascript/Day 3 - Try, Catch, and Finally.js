/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/js10-try-catch-and-finally/problem
 **/


'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try{
        let arr = s.split("");
        let reverse = "";
        for(let i=arr.length-1;i>=0;i--)
        {
            reverse = reverse.concat(arr[i]);
        }
        console.log(reverse);
    }
    catch(e)
    {
        console.log(e.message);
        console.log(s);
    }

}


function main() {
    const s = eval(readLine());

    reverseString(s);
}
