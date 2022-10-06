class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int prevSum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(prevSum==sum-nums[i]-prevSum){
                return i;
            }
            prevSum+=nums[i];
        }
        return -1;
   
    }
}
