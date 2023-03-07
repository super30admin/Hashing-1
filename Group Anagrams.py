# Time Complexity: O(n*k)
# Space Complexity: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Easy Approach
        # if len(strs) < 2:
        #     return [strs]
        # dic = {}
        # for str in strs:
        #     temp = tuple(sorted(str))
        #     # print(temp)
        #     if temp in dic:
        #         dic[temp].append(str)
        #     else:
        #         dic[temp] = [str]
        # # print(dic)
        # ans = []
        # for i in dic.values():
        #     ans.append(i)
        # return ans

        # Optimised approach
        # Step1: Compute 26 Prime numbers for 26 charcters of english alphabets. This would take O(1) Time as it is a constant operation
        alpha = {}
        alpha_ascii = 97
        prime = []
        count = 3
        while len(prime) < 26:
            isPrime = True
            for i in range(2, int(math.sqrt(count)+1)):
                if count % i == 0:
                    isPrime = False
                    break
            if isPrime:
                prime.append(count)
            count += 1
        # print(prime)
        for i in range(26):
            alpha[chr(alpha_ascii + i)] = prime[i]
        # print(alpha)
        # alpha = {'a': 3, 'b': 5, 'c': 7, 'd': 11, 'e': 13, 'f': 17, 'g': 19, 'h': 23, 'i': 29, 'j': 31, 'k': 37, 'l': 41, 'm': 43, 'n': 47, 'o': 53, 'p': 59, 'q': 61, 'r': 67, 's': 71, 't': 73, 'u': 79, 'v': 83, 'w': 89, 'x': 97, 'y': 101, 'z': 103}

        # Step 2: Now that each alphabet is assigned a prime number. We use the property that every prime number multiplication combo creates a unique value. We use this value as a key in our hash table
        import numpy
        dic = {}
        for str in strs:
            key = numpy.prod([alpha[x] for x in str])
            # print("key", key)
            if key in dic:
                dic[key].append(str)
            else:
                dic[key] = [str]
        # print(dic)
        ans = []
        for i in dic.values():
            ans.append(i)
        return ans