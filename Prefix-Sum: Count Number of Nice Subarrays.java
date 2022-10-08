class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int[] arr=new int[n+1];
        Arrays.fill(arr,0);
        arr[0]=1;
        int ans=0;
       
        for(int i=0; i<n; i++){
            sum+=(nums[i]&1);
            if(sum>=k){
                ans+=arr[sum-k];
            }
            arr[sum]+=1;
        }
        return ans;
    }
}
