class Solution:
    def maskPII(self, S: str) -> str:
        if len(S.split('@')) == 2:
            return self.parseEmail(S)
        return self.parseNumber(S)
            
    def parseEmail(self, S: str) -> str:
        name, rest = S.split('@')
        return name[0].lower() + "*****" + name[-1].lower() + "@" + rest.lower()
    
    def parseNumber(self, S: str) -> str:
        S = S.replace('+', '')
        S = S.replace('(', '')
        S = S.replace(')', '')
        S = S.replace('-', '')
        S = S.replace(' ', '')
        if len(S) == 10:
            return "***-***-" + ''.join(S[-4:10])
        return "+" + "*"*(len(S)-10) + "-***-***-" + ''.join(S[-4:len(S)])
