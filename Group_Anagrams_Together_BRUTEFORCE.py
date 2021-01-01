# Created by Aashish Adhikari at 6:20 PM 12/30/2020

'''

Time Complexity:
We iterate through all the words in the list and at each iteration, we sort the word.
If the average length of a word is k, sorting takes O( k  log k)
Hence, if there are n words to group, the total time complexity is O( n . k logk )

Space Complexity:
Since we are assuming the time complexity of sorting to be O(k. logk), this means either merge sort or heap sort.
Assume we are using heap sort which has a space complexity of O(1).

Here, we are iterating through the words"
    At each iteration:
        sorting the word and storing it in its corresponding list in the hash table. --> copying the word
After we are done iterating and storing, we return a list of lists.

Since, we are storing all n words of average length k in the hashmap, we are thus creating O(n . k) auxiliary space while
doing so. Hence, the space complexity is O (n . k)
While returning, we create a new list and append the lists from the hash table into this new list.





'''


# Brute-Forece

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """


        #Brute-Force Approach
        dict1 = {}
        arr = []

        # Iterate over all the strings
        for word in strs:

            # Sort each string to find the unique key for all anagrams with these letter
            word_sorted = sorted(word)
            joined_string = "".join(word_sorted)

            if joined_string in dict1:

                dict1[joined_string].append(word)
            else:
                dict1[joined_string] = [word]

        for k in dict1:
            arr.append(dict1[k])

        return arr


