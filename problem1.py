# 49. Group Anagrams 

# // Time Complexity : O(n klogk)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // code here along with comments explaining approach

def groupAnagrams(self, strs: List[str]) -> List[List[str]]: # O (n klogk)  
        if strs is None: return strs
        hmap = dict()
        for i in strs: # O(N)
            sorted_i = ''.join(sorted(i)) # O(klogk)
            if sorted_i in hmap:
                hmap[sorted_i].append(i)
            else:
                hmap[sorted_i ] = [i]
        return hmap.values()