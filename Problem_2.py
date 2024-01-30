'''
Time Complexity: O(n). Number of characters in the string.
Space Complexity: O(n), we are using hashMap to store the mapping

This code is working on leetcode.
'''


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        #approach using HashMap
        # st, ts = {}, {} # create 2 mappings, one for s to t and other for t to s
        # for i in range(0, len(s)):
        #     if s[i] in st and st.get(s[i]) == t[i] and t[i] in ts and ts.get(t[i])==s[i]: check for consistency if mapping is present
        #         continue
        #     elif s[i] not in st and t[i] not in ts: #if no mapping present then create the mapping in the hashmap
        #         st[s[i]] = t[i]
        #         ts[t[i]] = s[i]
        #     else:
        #         return False #else we have a breach. so given strings are not isomorphic
        # return True

        #approach using HashSet
        st, valSet={}, set()
        for i in range(0, len(s)):
            if s[i] in st and st.get(s[i])==t[i]: #check for consistency if mapping present in hashmap
                continue
            elif s[i] not in st and t[i] not in valSet: #add the mapping if not present in the hashmap and also add the value in the Set.
                st[s[i]] = t[i]
                valSet.add(t[i])
                print(st,"   ", valSet)
            else:
                return False
        return True
            
        