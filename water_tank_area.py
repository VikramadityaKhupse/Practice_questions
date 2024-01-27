def get_max_area(height, size):
    max_area = 0
    for i in range(size):
        height1 = height[i]
        for j in range(i+1, size):
            height2 = height[j]
            length = ((j - i) ** 2 + (height[j] - height[i]) ** 2) ** (1 / 2)
            min_height = min(height1, height2)
            area = length * min_height
            if area > max_area:
                max_area = area
    return max_area


def take_input():
    size = int(input("Enter size of array:"))
    array = []
    print(f"\nEnter {size} elements in array: ")
    for i in range(size):
        array.append(int(input(": ")))
    output = get_max_area(array, size)
    print(output)


take_input()
