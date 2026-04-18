class Solution:
    def groupAnagrams(self, strs):
        my_dict = {}
        for word in strs:
            freq = [0] * 26
            for c in word:
                freq[ord(c) - ord("a")] += 1
            hashCode = ""
            for num in freq:
                hashCode += "#" + str(num)
            if hashCode in my_dict:
                my_dict[hashCode].append(word)
            else:
                my_dict[hashCode] = [word]
        ans = []
        for items in my_dict.values():
            ans.append(items)
        return ans

strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
sl = Solution()
print(sl.groupAnagrams(strs))

# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]