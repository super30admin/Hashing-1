# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
  def isIsomorphic(self, s: str, t: str) -> bool:
    t_list = list(t)
    s_list = list(s)
    t_dict = dict()
    s_dict = dict()
    if len(t_list) != len(s_list):
      return False
    s_count = 0        
    t_count = 0
    for i in range(0, len(s_list)):
      if s_list[i] not in s_dict.keys():
        s_count += 1
        s_dict[s_list[i]] = s_count

      if t_list[i] not in t_dict.keys():
        t_count += 1
        t_dict[t_list[i]] = t_count

      if t_dict[t_list[i]] != s_dict[s_list[i]]:
        return False
    return True