class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        d5, d10 = 0, 0
        for i in range(len(bills)):
            if bills[i] == 5:
                d5+=1
            elif bills[i] == 10:
                d10+=1
                if not d5:
                    return False
                d5-=1
            else:
                if d10 and d5:
                    d10-=1
                    d5-=1
                elif count>2:
                    d5-=3
                else:
                    return False
        return True