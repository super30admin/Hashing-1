class Solution:
    '''
    Time complexity: O(n)
    Space complexity: O(n)
    '''
    def wordPattern(self, pattern: str, s: str) -> bool:
        # use a dict to keep track of what each key is supposed to be
        
        hashmap_pattern = {}

        hashmap_string = {}


        # split the list of strings
        string_list = s.split(' ')

        # assert same length
        if len(string_list) != len(pattern):
            return False

        for i in range(len(pattern)):
            # check if its in hashmap pattern
            if pattern[i] in hashmap_pattern:
                if hashmap_pattern[pattern[i]] != string_list[i]:
                    return False
            else:
                hashmap_pattern[pattern[i]] = string_list[i]
            # cross check if in hashmap string
            if string_list[i] in hashmap_string:
                if hashmap_string[string_list[i]] != pattern[i]:
                    return False
            else:
                hashmap_string[string_list[i]] = pattern[i]

        return True