# Time Complexity: O(n.k), where n is the number of strings and k is the maximum length of a string, since we compute the hash by iterating each character.
# Space Complexity: O(n.k), to store the grouped anagrams in the hashmap and the output list.
# Approach: Assign each character a unique prime number and compute the product for each string to form a unique hash, then use a hashmap to group strings that share the same hash
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # smap = defaultdict(list)
        smap = {}
        for i in strs:

            hash_ = self.getHash(i)
            if hash_ in smap:
                smap[hash_].append(i)
            else:
                smap[hash_] = [i]

        return list(smap.values())

    def getHash(self, str: str) -> float:

        primes = [
            2,
            3,
            5,
            7,
            11,
            13,
            17,
            19,
            23,
            29,
            31,
            37,
            41,
            43,
            47,
            53,
            59,
            61,
            67,
            71,
            73,
            79,
            83,
            89,
            97,
            101,
        ]

        hash = 1
        for c in str:
            hash *= primes[ord(c) - ord("a")]

        return hash
