from collections import defaultdict 
class Solution:
    # Time = O(n2log(n)) | Space = O(1) 
    def anagram(self,input):
        d = defaultdict(list)
        for i in range(len(input)):
            word = ''.join(sorted(input[i]))
            d[word].append(input[i])
        return list(d.values())        

if __name__ == "__main__":
    input = ["eat", "tea", "tan", "ate", "nat", "bat"]
    s = Solution()
    res = s.anagram(input)
    print(res)

    """
    Output:
    [
    ["ate","eat","tea"],
    ["nat","tan"],
    ["bat"]
    ]
    """