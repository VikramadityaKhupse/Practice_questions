if __name__ == '__main__':
    N = int(input())
    list1 = []


    def perform_ops(operation):
        ops = {
            "insert": list1.insert(operation[0], operation[1]),
            "print": print(list1),
            "remove": list1.remove(operation[1]),
            "sort": sorted(list1),
            "pop": pop(),
            "reverse": list1.reverse()
        }
        return ops.get(operation)


    def pop():
        if len(list1) == 1:
            list1.pop()
        else:
            list1.pop(list1[1])


    for i in range(N):
        command = input()
        perform_ops(command)
