"""
Link to Original Problem:
    https://www.hackerrank.com/challenges/plus-minus/problem
"""


#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the plusMinus function below.
def plusMinus(arr):
    p=0
    n=0
    z=0
    for i in range (len(arr)):
        if arr[i] > 0:
            p += 1
        elif arr[i] < 0:
            n += 1
        else:
            z += 1
    print(format(p/len(arr), ".6f"))
    print(format(n/len(arr), ".6f"))
    print(format(z/len(arr), ".6f"))

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
