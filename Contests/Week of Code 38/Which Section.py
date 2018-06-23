"""
Link to Original Problem:
    https://www.hackerrank.com/contests/w38/challenges/which-section
**/
"""



#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the whichSection function below.
def whichSection(n, k, a):
    # Return the section number you will be assigned to assuming you are student number k.
    count_student = 0
    section = 0
    for i in range(len(a)):
        count_student += a[i]
        if count_student >= k:
            section = i+1
            break
    return section



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        nkm = input().split()

        n = int(nkm[0])

        k = int(nkm[1])

        m = int(nkm[2])

        a = list(map(int, input().rstrip().split()))

        result = whichSection(n, k, a)

        fptr.write(str(result) + '\n')

    fptr.close()
