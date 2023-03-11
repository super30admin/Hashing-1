class Solution:
    # using hashmap and hashset
    # TC: O(n), SC: O(1)
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')
        if pattern is None and s is None: return True
        if pattern is None or s is None: return False
        if len(pattern) != len(s): return False

        wpMap = {}
        wpSet = set()
       
        for i in range(0,len(pattern)):
            pChar = pattern[i]
            string = s[i]
            if pChar not in wpMap:
                if string not in wpSet:
                    wpMap[pChar] = string
                    wpSet.add(string)
                else:
                    return False
            else:
                if wpMap[pChar] != string: return False
        return True

            