
# using two dictionaries to bidirectionally map letters in string 1 and string 2

def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        mydict1 = {}
        mydict2 = {}

        for i in range(len(s)):

            if s[i] in mydict1:
                if mydict1[s[i]] != t[i]:
                    return False
            else:
                if t[i] in mydict2:
                    return False
                mydict1[s[i]] = t[i]
                mydict2[t[i]] = s[i]
        return True

# sorting each word and mapping, anangrams of that word in a dictionary and then returning list of the dictionary values 
def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        mywords = {}
        for mystr in strs:
            word = str(sorted(mystr))
            if word in mywords:
                mywords[word].append(mystr)
            else:
                mywords[word] = [mystr]
        return list(mywords.values())

# using two dictionaries to bidirectionally map letters in pattern  to thge words in string

def wordPattern(self, pattern: str, s: str) -> bool:

        mydict1 = {}
        mydict2 = {}
        mywords = s.split(" ")

        if len(mywords) != len(pattern):
            return False
        for i in range(len(pattern)):         
            if pattern[i] in mydict1:
                if mydict1[pattern[i]] != mywords[i]:
                    return False
            else:
                if mywords[i] in mydict2:
                    return False
                mydict1[pattern[i]] = mywords[i]
                mydict2[mywords[i]] = pattern[i]
        return True

        

        
        