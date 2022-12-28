# 205. Isomorphic Strings

# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // code here along with comments explaining approach

def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None and t is None:
            return True
        if s is None or t is None:
            return False
        st = {}
        ts = {}
        for charS,charT in zip(s,t): # O(n)
            if charS in st:
                if st[charS] != charT:
                    return False
            else:
                st[charS] = charT # map s to t
            if charT in ts:
                if ts[charT] != charS:
                    return False
            else:
                ts[charT] = charS # map t to s
        return True
