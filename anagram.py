class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for word in strs:
            # itertaing through word
            l = list(word)  # splitting the word into char
            l.sort()  # sorting the char
            sword = "".join(l)  # join the char to a string

            # checking if sorted word is in hashmap
            if sword not in hashmap.keys():
                # if not there create a list equivlent to the sorted word
                hashmap[sword] = []
                # put the word as value to the sortedword which is the key
            hashmap[sword].append(word)

            # return only the values of the hashmap
        return (list((hashmap.values())))
