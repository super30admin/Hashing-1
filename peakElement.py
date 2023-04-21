#Time complexity: O(log n)
#Space complexity: O(1)

class Solution:
    def findPeakElement(self, nums) -> int:

        if len(nums) == 1:
            return 0
        low = 0
        high = len(nums) -1 

        while low <= high:

            med = low + (high - low) // 2

            if ((med == 0 and nums[med] > nums[med+1]) or (med == len(nums) - 1 and nums[med] > nums[med-1]) or (nums[med] > nums[med-1] and nums[med]> nums[med+1])):
                return med

            elif (nums[med] < nums[med+1]):
                low = med + 1
            else:
                high = med - 1

        return -1

nums = [1, 2, 3, 1]
res = Solution()
output = res.findPeakElement(nums)
print(output)