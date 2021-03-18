class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero_count = nums.count(0)
        one_count = nums.count(1)
        two_count = nums.count(2)

        nums[:] = [0]*zero_count + [1]*one_count + [2]*two_count
        
 class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = l = 0
        r = len(nums) - 1
        while i <= r:
            if(nums[i] == 1):
                i += 1
            elif nums[i] == 0:
                nums[i], nums[l] = nums[l], nums[i]
                i += 1
                l += 1
            else:
                nums[i] = nums[r]
                nums[r] = 2;
                r -= 1
