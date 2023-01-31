#Time Complexity : O(N), N being the length of pattern or number of words.
#Space Complexity : O(N), because a dictionary was created with the values. 
#Did this code successfully run on Leetcode : No leetcode link found. 
#Any problem you faced while coding this : I got a little stuck when testing regarding
#the tuples and sets, and just general debugging.

#Your code here along with comments explaining your approach in three sentences only
''' Create a dictionary where keys are the pattern letter and values are indices. Do 
the same for the string where the keys are the words, and the values are indices. 
Convert the values of both dictionaries to set of tuples. If they are equal, then it
is considered that the pattern are the same. 
'''
#returns the pattern as a form of a set of tuples
def pattern_letters(string):
    dictionary = {}
    for i in range(len(string)):
        s = string[i]
        if s in dictionary.keys():
            dictionary[s].append(i)
        else:
            dictionary[s] = []
            dictionary[s].append(i)
    a_set = dictionary.values()
    result = set()
    for a in a_set:
        result.add(tuple(a))
    return result

#return the pattern as a set of tuples, for the string. 
def pattern_words(string):
    array = string.split(" ")
    dictionary = {}
    for i in range(len(array)):
        word = array[i]
        if word in dictionary.keys():
            dictionary[word].append(i)
        else:
            dictionary[word] = []
            dictionary[word].append(i)
    a_set = dictionary.values()
    result = set()
    for a in a_set:
        result.add(tuple(a))
    return result

def same_pattern(letters, words):
    #if the patterns equal, then return True. 
    pattern1 = pattern_letters(letters)
    pattern2 = pattern_words(words)
    return pattern1==pattern2

pattern = "abba"
string = "dog cat cat dog"

print(same_pattern(pattern, string))

pattern = "abba"
string = "dog cat cat fish"

print(same_pattern(pattern, string))