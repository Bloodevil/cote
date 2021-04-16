class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0: return ""
        answer = strs[0]
        for s in strs[1:]:
            comparelen = min(len(s), len(answer))
            i = 0
            tmp = ""
            while i < comparelen:
                if s[i] == answer[i]:
                    tmp += s[i]
                else:
                    break
                i+=1
            if len(tmp) < len(answer):
                answer = tmp
        return answer
