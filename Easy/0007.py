class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
		    
        sign = 1 if x>0 else -1
        rst = sign * int(str(abs(x))[::-1])		 #[::-1], it starts from the end towards the first taking each element. It reverses the string
        return rst if -(2**31)-1 < rst < 2**31 else 0