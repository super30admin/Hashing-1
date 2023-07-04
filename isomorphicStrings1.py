# Run time: O(n)
# space: O(1)
# did it run on leetcode: yes
# any issues faced: case when a mapping is encountered again.
# Approach:
# compare both strings, element by element.
# maintain mappings of each element in string1 to each element in string2 as key: value
# while adding a mapping into the hashmap, verify if the key already exists or the value already exists(by maintaining another hash set of values), then False. else, return True.
# basically the mapping relation must be a one to one function.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s2t, s2t_values = {}, set()
        for i in range(len(s)): #len(s)=len(t) is constraint, O(n)
            if not s2t.get(s[i]):
                if t[i] in s2t_values:
                    return False
                else:
                    s2t[s[i]] = t[i]
                    s2t_values.add(t[i])
            elif s2t.get(s[i]) != t[i]:
                return False
        return True