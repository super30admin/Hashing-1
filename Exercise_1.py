#Time Complexity : O(N), N being the total number letters in array.
#Space Complexity : O(N), because a dictionary was created with the values. 
#Did this code successfully run on Leetcode : No leetcode link found. 
#Any problem you faced while coding this : I had done a similar one previously
#so did not run into as much problems. I did have to search how to add in a set. 
#And I had to change set to tuples to add to dictionary. 

#Your code here along with comments explaining your approach in three sentences only
'''Created a dictionary with key being the tuple of the word but in alphabetical order. 
Then, for each word, place the word in array of values corresponding to the key. 
'''
def group_anagrams(array):
    dictionary = {}
    for a in array:
        # create a set with letter of each word. 
        a_set = set()
        for i in a:
            a_set.add(i)
        #turn set into a tuple. 
        a_tuple = tuple(a_set)
        #create a dictionary where tuple is key. 
        if a_tuple in dictionary:
            dictionary[a_tuple].append(a)
        else:
            dictionary[a_tuple] = []
            dictionary[a_tuple].append(a)
    result = []
    #place dictionary values into an array. 
    for value in dictionary.values():
        result.append(value)
    return result
a = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(group_anagrams(a))
            