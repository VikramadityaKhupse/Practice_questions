def productExceptSelf(nums: list[int]) -> list[int]:
    answer = []
    for i in range(len(nums)):
        multi = 1
        for j in range(len(nums)):
            if i != j:
                multi *= nums[j]

        answer.append(multi)
    return answer

# OPTIMIZED:
#     def productExceptSelf(self, nums: List[int]) -> List[int]:
#         n = len(nums)
#         left_product = [1] * n
#         right_product = [1] * n
#         result = [0] * n
#
#         # Calculate the product of all elements to the left of each element
#         for i in range(1, n):
#             left_product[i] = left_product[i - 1] * nums[i - 1]
#
#         # Calculate the product of all elements to the right of each element
#         for i in range(n - 2, -1, -1):
#             right_product[i] = right_product[i + 1] * nums[i + 1]
#
#         # Multiply the left and right products for each element to get the result
#         for i in range(n):
#             result[i] = left_product[i] * right_product[i]
#
#         return result


print(productExceptSelf([1, 2, 3, 4]))
