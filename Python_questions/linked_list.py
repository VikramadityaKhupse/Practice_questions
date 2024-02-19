class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


def takeInput():
    head_node = None
    current_node = None

    while True:
        inpt = int(input("Choose which action you want to perform:\n1) Add Node\n2) Delete last node\n3) Preview Linked"
                         "List\n4) Exit: "))

        if inpt == 1:
            num = int(input("Enter data for node: "))
            node = Node(num)
            if head_node is None:
                head_node = node
            elif current_node is None:
                current_node = head_node
            else:
                current_node.next = node
                current_node = node

        elif inpt == 2:
            if head_node is None:
                print("Linked List is empty.")
            elif current_node == head_node:
                print(f"Deleted {current_node.data}")
                head_node = None
                current_node = None
            else:
                temp_node = head_node
                while temp_node.next != current_node:
                    temp_node = temp_node.next
                print(f"Deleted {current_node.data}")
                temp_node.next = None
                current_node = temp_node

        elif inpt == 3:
            temp_node = head_node
            while temp_node is not None:
                print(f"{temp_node.data}->", end="")
                temp_node = temp_node.next
            print("")

        elif inpt == 4:
            exit(0)


if __name__ == "__main__":
    takeInput()
