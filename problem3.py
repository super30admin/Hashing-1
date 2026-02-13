# Time Complexity: O(n), where n is the number of words in s
# Space Complexity:O(n), for storing mappings in the hashmap smap and the used set
# Approach: Split the string into words, then use a hashmap to map each pattern character to a word and a set to ensure no two characters map to the same word,

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        smap={}
        s=s.split()
        # print(s)
        used=set()
        if len(pattern)!=len(s):
            return False
        for i in range(len(s)):
            # print(pattern[i], s[i])
            if pattern[i] in smap:
                if smap[pattern[i]]!=s[i]:
                    return False
            else:
                if s[i] in used:
                    return False
            smap[pattern[i]]=s[i]
            used.add(s[i])

        return True
        


        
        
            
        