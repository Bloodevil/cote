from typing import List

class cote0401_455_assignCookies:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        index=0
        count=0

        for i in range(len(s)):
            if index > len(g)-1:
                return count
            if g[index] <= s[i]:
                count+=1
                index+=1
            i+=1
        
        return count



