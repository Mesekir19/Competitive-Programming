class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int start=0;
        int end=n-1;
        int count=0;
        while(start < end){
            int sum=nums[start]+nums[end];
            if(sum==k){
                start++;
                end--;
                count++;
            }else if(sum>k){
                end--;
            }else{
                start++;
            }
        }
        return count;
    }
}
