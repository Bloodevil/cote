class Solution(object):
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        list=[]
        for i in len(nums)-1:
            x=abs(nums[i]-target)
            if(nums.index(x)>0):
                list.append(i)
                list.append(nums.index(x))
        return list