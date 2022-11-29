#   Assumptions:
#       Input will be lower case english alphabets
#       Length of s and t will be same
#   Time: O(n)
#   Space: O(n)
#   Logic: maintain and check the mapping(s->t) in dictionary and make the decision
def isomorphic(s,t):
    staging_dict = {}
    for i in range(len(s)):
        if s[i] in staging_dict:
            if staging_dict[s[i]] != t[i]:
                return False
        else:
            staging_dict[s[i]] = t[i]
    return True


print(isomorphic('egg','foo'))
print(isomorphic('egg','foa'))
print(isomorphic('',''))