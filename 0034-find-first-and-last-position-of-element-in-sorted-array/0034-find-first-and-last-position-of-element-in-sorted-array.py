class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        if n==0: return [-1, -1]
        i=bisect.bisect_left(nums, target)
        if i==n or nums[i]>target: return [-1, -1]
        j=bisect.bisect_right(nums, target)
        return [i, j-1]
        