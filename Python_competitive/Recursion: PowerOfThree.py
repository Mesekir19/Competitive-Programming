class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n==1:
            return True
        if n < 3 :
            return False
        if not n%3 :
            return self.isPowerOfThree(n/3)
        return False
        
