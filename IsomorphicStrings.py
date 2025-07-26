# Approach 1

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_dict = {}

        # build dictionary based on s to t mapping and check if it's isomorphic
        for i in range(len(s)):
            sKey = s[i]
            tVal = t[i]

            if sKey not in s_dict:
                s_dict[sKey] = tVal
            else:
                if s_dict[sKey] == tVal:
                    s_dict[sKey] = tVal
                else:
                    return False

        # build dictionary based on t to s mapping and check if it's isomorphic
        for i in range(len(t)):
            tKey = t[i]
            sVal = s[i]

            if tKey not in t_dict:
                t_dict[tKey] = sVal
            else:
                if t_dict[tKey] == sVal:
                    t_dict[tKey] = sVal
                else:
                    return False
    
        return True

# Approach 2

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_set = set()

        for i in range(len(s)):
            sKey = s[i]
            tVal = t[i]

            if sKey not in s_dict:
                if tVal not in t_set:
                    s_dict[sKey] = tVal
                    t_set.add(tVal)
                else:
                    return False
            else:
                if s_dict[sKey] == tVal:
                    s_dict[sKey] = tVal
                else:
                    return False
        
        return True