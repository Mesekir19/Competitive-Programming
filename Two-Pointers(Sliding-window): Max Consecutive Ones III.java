class Solution {
    public int longestOnes(int[] nums, int k) {
        int length=nums.length;
        int count=0;
        int i=0;
        for(; i<length;i++){
            if(nums[i]==0){
                k--;
            }
            if(k<0){
                if(nums[count]==0){
                    k++;
                } 
             count++;
            }
        }
        return i-count;
    }
}
