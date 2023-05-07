class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # optimized solution TC = O(n * k)
        def primeProduct(str):
            result = 1
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101,
                      103]
            for i in range(len(str)):
                c = ord(str[i])
                p = 'a'
                prime = primes[c - ord(p)]
                result = result * prime

            return result

        di = {}

        for i in strs:
            char = i
            # print(sorted(char))
            value = primeProduct(char)
            # print(primeProduct(char))
            if value not in di:
                di[value] = [char]
            else:
                di[value].append(char)

        return di.values()
        # print(di)