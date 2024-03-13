head = [1, 2, -3, 3, 1]
head = sorted(head)
front = 0
rear = len(head)
while rear != front:
    if head[rear] + head[front] == 0:
        head.pop(rear)
        head.pop(front)
    rear -= 1
    front += 1

print(head)
