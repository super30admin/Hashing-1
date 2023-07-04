#  Method - 1 hashmap and 1 set
# Time complexity - O(n), since we need to iterate over each character. 
# Space Complexity - O(1)
# We use hashmap to map each element of the pattern to each word of s. 
# If pattern[i] is present, check if it's the same current word, word[i].
# If not, check if word[i] is in the hashset, if it is present, return False.
# If not, add pattern[i] to the hashmap and also, add word[i]

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word=s.split()
        if len(word)!=len(pattern):
            return False
        d=defaultdict(lambda: "")
        seen=set()
        for i in range(len(word)):
            if pattern[i] in d:
                if d[pattern[i]]!=word[i]:
                    return False
            else:
                if word[i] in seen:
                    return False
                d[pattern[i]]=word[i]
                seen.add(word[i])
        return True

