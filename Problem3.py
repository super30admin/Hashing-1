'''
1. Split the string into a list of words. Initialize a dictionary
2. Traverse through the pattern and if the character is not present in the dictionary, add into it.
3. If the character exists and value in dictionary doesnt match to string OR the string already belongs to another letter of pattern return False.
 If there's a succesful traversal of entire pattern return True.

Time Complexity: O(n)
Space Complexity: O(n)
'''

pattern = "abba"
string = "dog cat cat dog"
pattern2 = "abba"
string2 = "dog cat cat fish"
pattern3 = "aaaa"
string3 = "dog cat cat dog"
pattern4 = "abba"
string4 = "dog dog dog dog"

def checkPatternFollowed(string,pattern):
    if len(string.split())!=len(pattern):
        return False
    ref = {}
    str_list = string.split()
    for i in range(len(pattern)):
        if pattern[i] not in ref.keys():
            if str_list[i] in ref.values():
                return False
            ref[pattern[i]] = str_list[i]
        elif ref[pattern[i]] != str_list[i]:
            return False
    return True

print(checkPatternFollowed(string,pattern))
print(checkPatternFollowed(string2,pattern2))
print(checkPatternFollowed(string3,pattern3))
print(checkPatternFollowed(string4,pattern4))
         
