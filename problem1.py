# Time Complexity: O(n*k) + O(n) ~ O(nk) where n -> no. of words in string and k -> max number of letters in a word
# Space Complexity: O(n*k) + O(n) ~ O(nk)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        list1 = []
        dict1 = {}
        for i in range(len(strs)):
            temp = sorted(list(strs[i]))
            if tuple(temp) not in dict1:
                dict1[tuple(temp)] = list()
            dict1[tuple(temp)].append(strs[i])

        for key in dict1:
            list1.append(dict1[key])
        return list1