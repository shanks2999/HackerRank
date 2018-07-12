"""
Link to Original Problem:
    https://www.hackerrank.com/challenges/staircase/problem
"""


#!/bin/python3

import os
import sys

#
# Complete the staircase function below.
#
def staircase(n):
    #
    # Write your code here.
    #
    for i in range(1, n+1):
        for j in range(n-i):
            sys.stdout.write(' ')
            # print(' ', end='')
        for j in range(i):
            sys.stdout.write('#')
            # print('#', end='')
        sys.stdout.write('\n')

if __name__ == '__main__':
    n = int(input())

    staircase(n)
