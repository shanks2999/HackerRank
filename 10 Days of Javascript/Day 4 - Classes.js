/**
 Link to Original Problem:
 https://www.hackerrank.com/challenges/js10-class/problem
 **/

/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

class Polygon
{
    constructor(arr)
    {
        this.arr = arr;
    }
    perimeter()
    {
        let p = 0;
        for(let i=0;i<this.arr.length;i++)
        {
            p += this.arr[i];
        }
        return p;
    }
}


const rectangle = new Polygon([10, 20, 10, 20]);
const square = new Polygon([10, 10, 10, 10]);
const pentagon = new Polygon([10, 20, 30, 40, 43]);

console.log(rectangle.perimeter());
console.log(square.perimeter());
console.log(pentagon.perimeter());
