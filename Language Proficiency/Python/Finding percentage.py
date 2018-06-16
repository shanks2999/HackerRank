"""
Link to Original Problem:
    https://www.hackerrank.com/challenges/finding-the-percentage/problem
"""


if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    scores = student_marks[query_name]
    avg = (scores[0]+scores[1]+scores[2])/3
    print(format(avg, '.2f'))
