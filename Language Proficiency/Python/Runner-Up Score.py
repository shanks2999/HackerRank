"""
Link to Original Problem:
    https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem
"""


if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    max = -100
    runner = -100
    for i in range(len(arr)):
        if max < arr[i]:
            runner = max
            max = arr[i]
        elif runner < arr[i] and arr[i] != max:
            runner = arr[i]
    print(runner)
