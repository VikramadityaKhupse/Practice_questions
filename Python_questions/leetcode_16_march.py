class Solution:

    def findMaxLength(self, nums: List[int]) -> int:
        max_length = 0
        running_sum = 0
        sum_indices_map = {0: -1}  # Initialize with 0 at index -1

        for i, num in enumerate(nums):
            if num == 0:
                running_sum -= 1
            else:
                running_sum += 1

            if running_sum in sum_indices_map:
                max_length = max(max_length, i - sum_indices_map[running_sum])
            else:
                sum_indices_map[running_sum] = i

        return max_length




