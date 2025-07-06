# TC : O(n)
# SC : O(n)

class Solution(object):
    def wordPattern(self, pattern, s):
       
        shash={}
        phash={}
        s=s.split()
        # print(s)
        for i in range(len(s)):
            if len(s) != len(pattern):
                return False
            sChar=pattern[i]
            pChar=s[i]
            if sChar in shash:
                if shash[sChar] != pChar:
                    return False
            else:
                shash[sChar] = s[i]
            if pChar in phash:
                if phash[pChar] != sChar:
                    return False
            else:
                phash[pChar] = sChar

        return True
