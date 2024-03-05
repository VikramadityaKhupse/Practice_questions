def distinctAverages(nums: list[int]) -> int:
    avg = []
    while len(nums) != 0:
        min_num = min(nums)
        nums.remove(min_num)
        if len(nums) != 0:
            max_num = max(nums)
            nums.remove(max_num)
        avg.append((min_num + max_num) / 2)

    return len(set(avg))


nums1 = [4, 1, 4, 0, 3, 5]
print(distinctAverages(nums=nums1))
