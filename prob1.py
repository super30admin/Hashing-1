# Time Complexity : O(n)
# Space Complexity :O(n)
# Leet Code: Yes

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if len(strs) == 0:
            return None
        
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        hashmap = {}

        for val in strs:
            s = 1
            for i in val:
                s *= prime[ord(i)-ord('c')]
            if s not in hashmap:
                hashmap[s] = [val]
            else:
                hashmap[s].append(val)
        
        return list(hashmap.values())

        # hashmap = {}

        # for i in strs:
        #     w = ''.join(sorted(i))
        #     if w not in hashmap:
        #         hashmap[w] = [i]
        #     else:
        #         hashmap[w].append(i)

        # return list(hashmap.values())