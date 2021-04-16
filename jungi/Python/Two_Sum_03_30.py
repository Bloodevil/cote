"""
Runtime: 36 ms, faster than 46.14% of Python online submissions for Two Sum.
Memory Usage: 13.3 MB, less than 94.92% of Python online submissions for Two Sum.
문법에 조~~~금 익숙해진 것 같습니다. ㅎㅎ
"""

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result = [0, 0]
        for i in range(len(nums)):
            tempValue = target - nums[i]
            for j in range(i+1,len(nums)):
                if tempValue == nums[j]:
                    result = [i,j]
                    return result
        return result