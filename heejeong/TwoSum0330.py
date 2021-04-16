class Solution(object):
    def twoSum(self, nums, target):
        for i in range(0, len(nums)-1):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]

    #using dictionary
    def twoSum_dic(self, nums, target):
        dic = {}
        for i, number in enumerate(nums):
            key = target - number
            if key in dic:
                return [dic[key], i]
            dic[number] = i




