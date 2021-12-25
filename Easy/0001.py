class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict = {}
        for i,n in enumerate(nums): 
        # enumrate gives iterator,nums[iterator]
            if n in dict:
                return [dict[n],i]
            else:
                dict[target - n] = i


