class Stack:
    def __init__(self):
        self.stack = []

    def push(self, num):
        self.stack.append(num)
        print(f"{num} pushed to stack!")

    def pop(self):
        if not self.stack:
            print("Stack is empty! Please add an element to pop!")
        else:
            print(f"{self.stack.pop(-1)} popped from stack!")

    def peak(self):
        if not self.stack:
            print("Stack is empty! Please add an element!")
        else:
            print(f"{self.stack[-1]} is the top element in stack")

    def show(self):
        print(self.stack)


def takeInput():
    stack1 = Stack()
    print("Stack has been created!\n")
    print("Which action you want to perform?\n")
    while 1:
        choice = int(input("\n1)Push an element\n2)Pop an element\n3)Peak element\n4)Print stack\n5)Exit "
                           "program: "))
        if choice == 1:
            inpt = int(input("Please enter a number to push:"))
            stack1.push(inpt)
        elif choice == 2:
            stack1.pop()
        elif choice == 3:
            stack1.peak()
        elif choice == 4:
            stack1.show()
        elif choice == 5:
            print("Program ended!")
            exit(0)
        else:
            print("Invalid choice!")


if __name__ == '__main__':
    takeInput()
