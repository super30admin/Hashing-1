class Solution:
    """
    TC - O(n.k) where n is the len(strs) and k is the average length of word in strs
    SC -> O(n.k)
    Here we generate a token for each word using a list, convert it to a tuple so it
    acts like a key for a hashmap. Anagrams will generate the same token/key and
    this can be used to group anagrams together
    """
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = defaultdict(list)
        for word in strs:
            token = [0]*26
            for char in word:
                idx = ord(char)-ord('a')
                token[idx]+=1
            hashmap[tuple(token)].append(word)
        return list(hashmap.values())