class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        // Arrays.sort(nums);
        int start=0;
        int end=n-1;
        int i=0;
        while(i<=end && start<end){
            if(nums[i]==0){
                nums[i]=nums[start];
                nums[start]=0;
                start++;
                i++;
            }else if(nums[i]==2){
                nums[i]=nums[end];
                nums[end]=2;
                end--;
            }else{
                i++;
            }
        }
    }
}
