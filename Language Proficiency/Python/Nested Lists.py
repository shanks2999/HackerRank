"""
Link to Original Problem:
    https://www.hackerrank.com/challenges/nested-list/problem
"""

if __name__ == '__main__':
    name_list = []
    score_list = []
    last = 100
    second_to_last = 100
    for _ in range(int(input())):
        name = input()
        score = float(input())
        name_list.append(name)
        score_list.append(score)
        if score < last:
            second_to_last = last
            last = score
        elif score < second_to_last and score != last:
            second_to_last = score

    lowest_names = []
    for i in range(len(name_list)):
        if score_list[i] == second_to_last:
            lowest_names.append(name_list[i])
    lowest_names = sorted(lowest_names)
    for name in lowest_names:
        print(name)
