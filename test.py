if __name__ == '__main__':
    student = []
    nested_list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        nested_list.append([name, score])

    scores, names = [score, name for score, name in nested_list]

    print(nested_list)
    print(scores)
    print(names)
