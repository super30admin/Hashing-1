

# time O(n*k), space O(n*k)
# hash each word based on it's character count, and append words of like charCount hash to the key in the map
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        mp = {}
        for word in strs:
            charCount = [0]*26
            for char in word:
                charCount[ord(char)-ord('a')]+=1
            strCount = str(charCount)
            if strCount not in mp:
                mp[strCount]=[word]
            else:
                mp[strCount].append(word)
        
        res=[]
        for i in mp.values():
            res.append(i)

        return res