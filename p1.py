#TC= O(nklogk)
#SC = O(nk)
# if runs successfully on leetcode: YES

def groupAnagrams(strs):

    mydict = {} #{"['a', 'e', 't']": ['eat', 'tea', 'ate']}

    for word in strs:
        #string is immutable in py, so we use it 
        #to store the key 
        key = str(sorted(word))
        if key not in mydict:
            mydict[key] = [word]
        else:
            mydict[key] += [word]

    return list(mydict.values())


#driver code to test
if __name__ == '__main__':
    strs = ["eat","tea","tan","ate","nat","bat"]
    ans = groupAnagrams(strs)

    #print ans
    for i in range(0, len(ans)):
        print("group" + str(i))
        for j in range(0, len(ans[i])):
            print(ans[i][j])