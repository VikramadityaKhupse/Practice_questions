# Answer for question on hackerrank: Given the names and grades for each student in a class of students, store them
# in a nested list and print the name(s) of any student(s) having the second lowest grade. Note: If there are
# multiple students with the second-lowest grade, order their names alphabetically and print each name on a new line.
# https://www.hackerrank.com/challenges/nested-list/problem?isFullScreen=true

if __name__ == '__main__':
    scores = names = nested_list = []

    for _ in range(int(input())):
        name = input()
        score = float(input())
        nested_list.append([name, score])

    for name, score in nested_list:
        scores.append(score)

    sorted_scores = sorted(set(scores))

    for name, score in nested_list:
        if score == sorted_scores[1]:
            names.append(name)

    for name in sorted(names):
        print(name)

    print(nested_list)
