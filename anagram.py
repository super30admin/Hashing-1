from collections import defaultdict;

class Solution:
    def gram(self, anagrams):

        lookUp = dict(defaultdict(list))

        for val in anagrams:
            element = "".join(sorted(val))
            
            lookUp[element].append(val)
        
        return [i for i in lookUp.values()]


input = ["eat", "tea", "tan", "ate", "nat", "bat"]
res = Solution()
output = res.gram(input)
print(output)