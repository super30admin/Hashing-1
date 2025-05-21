class Solution(object):
    def groupAnagrams(self,strs):
        from collections import defaultdict
        anagram_map=defaultdict(list)

        for word in strs:
            freq=[0]*26

            for char in word:
                index=ord(char)-ord('a')
                freq[index]+=1

            key =tuple(freq)

            anagram_map[key].append(word)
        return list(anagram_map.values())

#Test cases
sol=Solution()
print(sol.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(sol.groupAnagrams([""]))
print(sol.groupAnagrams(["a"]))