#Time complexity : O(n * klog(k))
#Space Complexity : O(n)
#Runs all testcases on leetcode

class Solution:
    #sol2
    primeNums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,     71, 73, 79, 83, 89, 97, 101]
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        bucketOfStrs = defaultdict(list)
        for word in strs:
            key = self.getKey(word)
            bucketOfStrs[key].append(word)
        return bucketOfStrs.values() 
    def getKey(self,word):
        key = 1
        for char in word:
            key = key * self.primeNums[ord(char) - ord('a')]
        return key
    
    # def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    #     h = {}
    #     for word in strs:
    #         sortedWord = ''.join(sorted(word))
    #         if sortedWord not in h:
    #             h[sortedWord] = [word]
    #         else:
    #             h[sortedWord].append(word)
    #     final = []
    #     for value in h.values():
    #         final.append(value)
    #     return final
        
        
        #sol1 : own
        # bucketOfStr = defaultdict(list)
        # for word in strs:
        #     key = "".join(sorted(word))
        #     bucketOfStr[key].append(word)
        # return bucketOfStr.values()
        