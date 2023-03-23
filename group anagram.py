#In here we need to group all the words which has same letters in them.
# To group them we are using hashmaps. we are converting each word into numbers using primenumbervalues
# they are grouped based up on the numbers. and returns just grouped values



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []

        hashmap = {}
        for characters in strs:
            primevalue = self.primenumbervalues(characters)
            if hashmap.get(primevalue) == None:          #tc o(k). sc: o(1)
                hashmap[primevalue] = []
            hashmap[primevalue].append(characters)

        return hashmap.values

    def primenumbervalues(self, s):
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                 103];
        primeproduct = 1
        for i in range(len(s)):
            chars = s[i]
            primeproduct = primeproduct * prime[ord(chars) - ord('a')]
        return primeproduct


