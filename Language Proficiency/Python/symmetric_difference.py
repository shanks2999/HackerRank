"""
Link to Original Problem:
    https://www.hackerrank.com/challenges/py-set-symmetric-difference-operation/problem
"""


if __name__ == "__main__":
    e = int(input())
    english = list(map(int, input().split()))
    f = int(input())
    french = list(map(int, input().split()))
    extended = english + french
    count = 0
    for i in range(len(extended)):
        flag = 0
        for j in range(len(extended)):
            if i!=j and extended[i]==extended[j]:
                flag = 1
                break
        if flag == 0:
            count+=1
    print(count)
