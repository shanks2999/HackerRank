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

    if len(a) <= 0:
        return change

    index = 1
    while index < len(a) and a[index] - a[index - 1] == k:
        index += 1

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

    count = 0


# for i in range(1, len(a)):
#     if a[i] - a[i - 1] != k:
#         after = 0
#         before = 0
#         for j in range(i, len(a)):
#             if (a[j] - a[i]) == ((j - i) * k):
#                 after += 1
#             if (a[j] - a[i - 1]) == ((j - i + 1) * k):
#                 before += 1
#         after -= 1
#         if after > before:
#             a[i - 1] = a[i] - k
#             count += 1
#         else:
#             count += 1
#             a[i] = a[i - 1] + k
# return count



# Complete the minuteToWinIt function below.
def minuteToWinIt(a, k):
    # Return the minimum amount of time in minutes.
    count = 0
    index = 0
    for i in range(1, len(a)):
        if a[i] - a[i - 1] == k and a[i+1]-a[i]==k:
            index = i
            break
    if a[0] != (a[index] - index*k):
        a[0] = (a[index] - index*k)
        count += 1
    for i in range(1, len(a)):
        if a[i] != (a[0] + i*k):
            count += 1
    return count



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
