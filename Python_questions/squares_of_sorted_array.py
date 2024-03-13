
# leetcode qustion. to return squares of all elements in a list but sorted order
def sortedSquares(self, nums: List[int]) -> List[int]:
    return sorted([i * i for i in nums])