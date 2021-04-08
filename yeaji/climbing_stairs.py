class Solution:
    def __init__(self):
        self.cache = {}
        
    def climbStairs(self, n: int) -> int:
        if n in self.cache:
            return self.cache[n]
        answer = 0
        if n <= 2:
            return n
        answer += Solution.climbStairs(self, n-2)
        answer += Solution.climbStairs(self, n-1)
        if n not in self.cache:
            self.cache[n] = answer
        return answer
