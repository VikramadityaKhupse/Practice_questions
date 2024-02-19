def get_steps(arr):
    n = len(arr)
    current_index = 0
    jump = 0

    while current_index < n - 1:
        max_reach = 0
        new_index = current_index

        for i in range(current_index + 1, current_index + arr[current_index] + 1):
            if i < n and i + arr[i] > max_reach:
                max_reach = i + arr[i]
                new_index = i

        current_index = new_index
        jump += 1

    return jump


def main():
    array = [2, 3, 1, 1, 4]
    output = get_steps(array)
    print(output)


if __name__ == "__main__":
    main()
