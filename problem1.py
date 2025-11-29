class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dct=defaultdict(list)
        for st in strs:
        # Taking a list of 26 letters as the constraint says only lowercase letters
            char = [0]*26
            for j in st:
                val=ord(j)-ord('a')
                char[val]+=1
            # Taking tuple as lists are not allowed as keys because they are mutable
            # Dictionary does not allow keys which are mutable
            dct[tuple(char)].append(st)
        return list(dct.values())

        