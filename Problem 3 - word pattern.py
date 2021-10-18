# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
  def wordPattern(self, pattern: str, s: str) -> bool:
    pattern_list = list(pattern)
    s_list = s.split(' ')
    pattern_dict = dict()
    s_dict = dict()
    print(pattern_list)
    print(s_list)
    if len(pattern_list) != len(s_list):
      return False
    s_count = 0        
    pattern_count = 0
    for i in range(0, len(s_list)):
      if s_list[i] not in s_dict.keys():
        s_count += 1
        s_dict[s_list[i]] = s_count
      
      if pattern_list[i] not in pattern_dict.keys():
        pattern_count += 1
        pattern_dict[pattern_list[i]] = pattern_count
    
      if pattern_dict[pattern_list[i]] != s_dict[s_list[i]]:
        return False
    return True
            
            
                
        
            