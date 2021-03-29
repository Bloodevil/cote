"""
파이썬 굉장히 낯설어요 ㅎㅎ
일단 기존 코드를 파이썬으로 옮기는 것 까지만 했습니다.
        Runtime: 104 ms, faster than 96.84% of Python online submissions for Lemonade Change.
        Memory Usage: 13.8 MB, less than 49.37% of Python online submissions for Lemonade Change.
"""

class Solution(object):
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        change = [0, 0];
        for i in range(len(bills)):
            if(bills[i] == 5):
                change[0] = change[0] + 1
            elif bills[i] == 10:
                if change[0] < 1: return 0
                else:
                    change[0] = change[0] - 1;
                    change[1] = change[1] + 1;
            elif bills[i] == 20:
                if 1 <= change[0] and 1 <= change[1]:
                    change[0] = change[0] - 1
                    change[1] = change[1] - 1
                elif 3 <= change[0]:
                    change[0] = change[0] - 3
                else:
                    return 0

        return 1

