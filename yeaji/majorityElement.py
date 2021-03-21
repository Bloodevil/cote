class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        did = []
        target = len(nums)/2
        for n in nums :
            if n in did:
                continue
            if nums.count(n) > target:
                return n
            did.append(n)
        return 0
