class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        count, gIdx, sIdx = 0, 0, 0
        while gIdx <len(g) and sIdx<len(s):
            if g[gIdx]<=s[sIdx]:
                count+=1
                gIdx+=1
            sIdx+=1
        return count
