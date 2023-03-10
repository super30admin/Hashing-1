# Time Complexity :  O(nk)
# Space Complexity : O(nk) number of groups * number of strings in each group
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

#Group Anagrams

class Solution:
    def __init__(self):
        self.primes = [2]

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for i in strs: #n
		# Note: if sorting is used to get hashmap key, then TC is n + klogk
            # sortedStr = "".join(sorted(list(i))) #klogk
            # if sortedStr not in groups: #k
            #     groups[sortedStr] = [i]
            # else:
            #     groups[sortedStr].append(i)

            hashval = self.generateHash(i)
            if hashval not in groups: #k
                groups[hashval] = [i]
            else:
                groups[hashval].append(i)
        return groups.values()

    
    def generatePrime(self):
        for i in range(3,200):
            for j in range(2,(i//2)+1):
                if i%j == 0:
                    break
            else:
                self.primes.append(i)
            if (len(self.primes) == 26):
                break

    def generateHash(self,key):
        self.generatePrime()
        result = 1
        for i in key:
            result *= self.primes[ord(i)-97]
        return result
