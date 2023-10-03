# TC : O(s) where s is the length of String s
# SC : O(1) where s is the length of String s but the only 26 characters are possible

# Approach - As input strings are of same length, we iterate over string and have a 2 maps that
# stores the mapping of each index character b/w 2 strings

def check_isomorphic(s, t):
    # Always s and t have same length 
    mapping_s_t = {}
    mapping_t_s = {}
    
    for c1, c2 in zip(s, t):
        
        # Case 1: No mapping exists in either of the dictionaries
        if (c1 not in mapping_s_t) and (c2 not in mapping_t_s):
            mapping_s_t[c1] = c2
            mapping_t_s[c2] = c1
        
        # Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
        # it doesn't match in either of the dictionaries or both            
        elif mapping_s_t.get(c1) != c2 or mapping_t_s.get(c2) != c1:
            return False
        
    return True

def main():
    print(check_isomorphic("egg", "add"))
    print(check_isomorphic("foo", "bar"))
    print(check_isomorphic("paper", "title"))
    print(check_isomorphic("eggf", "abbb"))


if __name__ == "__main__":
    main()