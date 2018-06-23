"""
Link to Original Problem:
    https://www.hackerrank.com/contests/w38/challenges/minute-to-win-it
**/
"""

# !/bin/python3

import math
import os
import random
import re
import sys

def computeMinChanges(a, k, index, change, mySet):
    while (index < len(a) and a[index] - a[index - 1] == k):
        index += 1
    if (index >= len(a)):
        return change
    if(index) not in mySet:
        a1 = a[:]
        a1[index] = a1[index - 1] + k
        mySet.add(index)
        min1 = computeMinChanges(a1[:], k, 1, change + 1, mySet)
    if (index-1) not in mySet:
        a2 = a[:]
        a2[index - 1] = a2[index] - k
        mySet.add(index-1)
        min2 = computeMinChanges(a2[:], k, 1, change + 1, mySet)
    if (index) in mySet and (index-1) in mySet:
        return change
    else:
        return min(min1, min2)


# Complete the minuteToWinIt function below.
def minuteToWinIt(a, k):
    # Return the minimum amount of time in minutes.
    minChange = computeMinChanges(a, k, 1, 0, set())
    return minChange



if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    a = list(map(int, input().rstrip().split()))

    result = minuteToWinIt(a, k)
    print(result)
    # fptr.write(str(result) + '\n')
    #
    # fptr.close()
