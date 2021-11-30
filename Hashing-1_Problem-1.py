    def findPeakElement(self, nums: List[int]) -> int:
        """
        1. As the requirement is to run the code in O(log n) time, we can use the Binary search
        Time Complexity = O(log n)
        Space Complexity = O(1)
        """
        if not nums or len(nums) == 0:
            return False
        
        low = 0
        high = len(nums) - 1
        while (low <= high):
            mid = low + (high - low) // 2 #To avoid integer overflow
            if (mid == (len(nums) - 1) or nums[mid] > nums[mid+1]) and (mid ==  0  or nums[mid] > nums[mid - 1]):
                return mid
            elif nums[mid + 1] > nums[mid]:
                low = mid + 1
            else:
                high = mid - 1
        return 54232