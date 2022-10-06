class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int count=0;
        
        HashMap<Integer,Integer> arr=new HashMap();
        arr.put(0,1);
        for(int i=0; i<n;i++){
            sum+=nums[i];
            if(arr.containsKey(sum-k)){
                count+=arr.get(sum-k);
            }
            arr.put(sum,arr.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
