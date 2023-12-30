"""
Approach 1 - To sort the str and store it as a key like aet:, values like eat, ate, tea will be appeneded as values in the list of key
SC - O(Nk) k -len(s)
TC - O(Nklogk) k - len(s)

Approach 2 - Use a count map to store the counters, using count_array's string or tuple to make it a key. 
TC - O(NK)
SC - O(NK)

Approach 3 - Prime multiplication approach. Generate prime numbers till 26, multiply them to create the key, and then store the lists.
TC - O(NK)
SC - O(NK)

"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # # Approach - 1
        # result = []
        # anagram_map = defaultdict(list)
        # # Insert into dictionary, Keep in mind that sorted(s) is a list, hence we cant directly use it as a key as Lists are not hashable in Python, hence we convert it to string by joining with emptyspaces before making it a key.
        # for s in strs:
        #     anagram_map[str(sorted(s))].append(s)
        # for key, val in anagram_map.items():
        #     result.append(val)
        # return result
        
        # Approach -2 
        #Instead of maintaining the sorted string, we can maitain the string of count_arr or tuple of count_arr as they are immutable unlike lists 
        
        def counter(s):
            count_arr = [0]*26
            #While using the count array for alphabets we need to know ord function in Python - The ord() function returns the number representing the unicode code of a specified character.
            for c in s:
                count_arr[ord(c)-ord('a')] += 1
            return tuple(count_arr)

        anagram_map = defaultdict(list)
        result = []
        for s in strs:
            anagram_map[counter(s)].append(s)
        
        for key, val in anagram_map.items():
            result.append(val)
        return result
        