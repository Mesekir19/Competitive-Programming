class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n==1:
            return True
        if n < 4 :
            return False
        if not n%4 :
            return self.isPowerOfFour(n/4)
        return False
        
