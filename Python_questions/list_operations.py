if __name__ == '__main__':
    N = int(input())
    list1 = []


    def perform_ops(operation):
        ops = {
            "insert": add(operation),
            "print": print(list1),
            "remove": remove(operation),
            "sort": sorted(list1),
            "pop": pop(),
            "reverse": list1.reverse()
        }
        return ops.get(operation)


    def add(operation):
        list1.insert(int(operation[-3]), int(operation[-1]))


    def remove(operation):
        list1.remove(int(operation[-1]))


    def pop():
        if len(list1) != 0:
            list1.pop()
        else:
            list1.pop(int(list1[-1]))


    for i in range(N):
        command = input()
        perform_ops(command)


