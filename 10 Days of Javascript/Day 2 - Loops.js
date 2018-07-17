/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/js10-loops/problem
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
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    let consonant = "";
    for(let i=0;i<s.length;i++)
    {
        let letter = s.charAt(i)
        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
            console.log(letter);
        else
            consonant += letter;
    }
    for(let i=0;i<consonant.length;i++)
    {
        console.log(consonant.charAt(i));
    }
}


function main() {
    const s = readLine();

    vowelsAndConsonants(s);
}