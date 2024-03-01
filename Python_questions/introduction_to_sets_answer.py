def average(array):
    # your code goes here
    distinct_heights = set(arr)
    total_height = sum(distinct_heights)
    num_plants = len(distinct_heights)
    avg = total_height / num_plants
    return round(avg, 3)

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)