#Time Complexity : O(N), N being the length of string.
#Space Complexity : O(N), because a dictionary was created with the values. 
#Did this code successfully run on Leetcode : No leetcode link found. 
#Any problem you faced while coding this : I got a little stuck when testing regarding
#the tuples and sets, and just general debugging. Forgot to return a value in to_set 
#function.  

#Your code here along with comments explaining your approach in three sentences only
'''Created a dictionary with values as indices and keys as letter. Then if the values of the 
dictionary are the same, I'm considering them isomorphic.  
'''

def to_set(string):
    # create a dictionary where the key is the letter and the value is array of indices. 
    dictionary={}
    for i in range(len(string)):
        s=string[i]
        if s in dictionary.keys():
            dictionary[s].append(i)
        else:
            dictionary[s]=[]
            dictionary[s].append(i)
    #takes the values and create a set from the indices. 
    a_set = dictionary.values()
    result = set()
    for a in a_set:
        result.add(tuple(a))
    return result

def isomorphic(s, t):
    set1 = to_set(s)
    set2 = to_set(t)
    # if the sets are equal, then the strings are isomorphic. 
    return set1==set2

s = "egg"
t = "add"

s1 = "foo"
t1 = "bar"

s2 = "paper"
t2 = "title"

print(isomorphic(s, t))
print(isomorphic(s1, t1))
print(isomorphic(s2, t2))