# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        arr = s.split()  # dog cat cat fish
        dic1 = {}
        dic2 = {}

        if len(pattern) != len(arr):  # False
            return False

        for i in range(len(arr)):  # i ranges from 0 to 3
            if arr[i] not in dic1:
                dic1[arr[i]] = pattern[i]

            elif dic1[arr[i]] != pattern[i]:
                return False

            else:
                break

        for j in range(len(pattern)):
            if pattern[j] not in dic2:
                dic2[pattern[j]] = arr[j]

            elif dic2[pattern[j]] != arr[j]:
                return False

            else:
                pass
        return True