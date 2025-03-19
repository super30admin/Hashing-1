# In this case we calculate the hash value of each word using prime number. That will give us same value for anagrams words.
# We store this inside a hashmap and return them
# Time Complexity = O(N*K)
# Space Complexity  = O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap={}
        for i in strs:
            hashvalue = self.gethashvalue(i)
            if hashvalue in hashmap.keys():
                hashmap[hashvalue].append(i)
            else:
                hashmap[hashvalue] = [i]
        
        output_list = []
        for i in hashmap.values():
            output_list.append(i)

        return output_list

    
    def gethashvalue(self,strs):
        prime_number = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        hashvalue = 1
        for i in strs:
            hashvalue = hashvalue * prime_number[ord(i) - ord("a")]
        return hashvalue