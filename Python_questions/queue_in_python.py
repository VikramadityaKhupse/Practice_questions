class Queue:

    def __init__(self):
        self.queue = []

    def enqueue(self, num):
        self.queue.append(num)
        print(f"{num} added in queue!")

    def dequeue(self):
        if not self.queue:
            print("Queue is empty! Add an item first.")
        else:
            print(f"{self.queue.pop(0)} removed from queue!")

    def front(self):
        if not self.queue:
            print("Queue is empty! Please add an element!")
        else:
            print(f"{self.queue[0]} is the front element in queue")

    def rear(self):
        if not self.queue:
            print("Queue is empty! Please add an element!")
        else:
            print(f"{self.queue[-1]} is the last element in queue")

    def show(self):
        print(self.queue)


def takeInput():
    queue1 = Queue()
    print("Queue has been created!\n")
    print("Which action you want to perform?\n")
    while 1:
        choice = int(input("\n1)Add an element\n2)Remove an element\n3)Front element\n4)Rear element\n5)Print "
                           "queue\n6)Exit"
                           "program: "))
        if choice == 1:
            inpt = int(input("Please enter a number to add:"))
            queue1.enqueue(inpt)
        elif choice == 2:
            queue1.dequeue()
        elif choice == 3:
            queue1.front()
        elif choice == 4:
            queue1.rear()
        elif choice == 5:
            queue1.show()
        elif choice == 6:
            print("Program ended!")
            exit(0)
        else:
            print("Invalid choice!")


if __name__ == '__main__':
    takeInput()
