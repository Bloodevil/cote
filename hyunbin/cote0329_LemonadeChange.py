class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        ch5=0
        ch10=0
        for bill in bills:
            if bill == 5:
                ch5+=1
            elif bill == 10:
                if ch5 > 0:
                    ch5-=1
                    ch10+=1
                else:
                    return False
            elif bill == 20:
                if ch5>0 and ch10>0:
                    ch5-=1
                    ch10-=1
                elif ch5 >= 3:
                    ch5-=3
                else:
                    return False

        return True