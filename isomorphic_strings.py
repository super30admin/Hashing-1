"""
Time Complexity: O(n)
Space Complexity: O(n)
Did your code run on leetcode?: yes
issues faced: accessing elements of the dictionary was confusing because of the syntax of key and value. 
"""
class Solution:
    def isIsomorphic(self, s: SmapTr, t: SmapTr) -> bool:
        if len(s)!= len(t): return False

        SmapT = {}
        TmapS = {}
        for i in range(len(s)):
            if s[i] not in SmapT:
                SmapT[s[i]] = t[i]
                # print("SmapT=",SmapT)
                # print("\n TmapS=", TmapS)
            else:
                if SmapT[s[i]] != t[i]:
                    return False
            if t[i] not in TmapS:
                TmapS[t[i]] = s[i]
            else:
                if TmapS[t[i]] != s[i]:
                    return False
        return True

# if __name__ == '__main__':
#     A = Solution()
#     print(A.isIsomorphic("add","fee"))
