# Time: O(n) because we are looping on the string
# Space: O(n) n elements in the hashmap and set


# First have a mapping of str s to t in the hashmap
# Then add the values inside the set to mimic reverse mapping
# If there are any different values for a particular key return false
# And if the value is already present in the set means it is already used and the first condition checks that the key is not there so return false here as well
# If nothing add to map and set

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = {}
        my_set = set()
        if (len(s) != len(t)):
            return False
        for key, val in zip(s,t):
            if key in mapping and mapping[key] != val:
                return False
            elif key not in mapping and val in my_set:
                return False
            else:
                mapping[key] = val
                my_set.add(val)
        return True
