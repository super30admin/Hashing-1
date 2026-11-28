class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #approach is sort the strings in strs and append it as the key then map the values to the key in the hashmap
        hashmap={}
        for i in strs:
            sorted_i="".join(sorted(i))
            # print(sorted_i,"sort")
            if sorted_i not in hashmap:
                hashmap[sorted_i]=[]
            # print(i,"i")
            hashmap[sorted_i].append(i)
            
        return list(hashmap.values())
        