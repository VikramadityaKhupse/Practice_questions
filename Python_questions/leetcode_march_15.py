def productExceptSelf(nums: list[int]) -> list[int]:
    answer = []
    for i in range(len(nums)):
        multi = 1
        for j in range(len(nums)):
            if i != j:
                multi *= nums[j]

        answer.append(multi)
    return answer


print(productExceptSelf([1, 2, 3, 4]))
