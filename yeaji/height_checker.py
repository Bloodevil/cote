class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        orderedHeights = sorted(heights)
        result = 0
        for i, height in enumerate(heights):
            if height != orderedHeights[i]:
                result += 1
        return result
