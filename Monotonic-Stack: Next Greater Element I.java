class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map=new HashMap();
        int[] ans=new int[nums1.length];
        Stack<Integer> stack=new Stack();
        
        for(int i=0; i<nums2.length; i++){
            while(!stack.isEmpty() && stack.peek()< nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        
        for(int i=0; i<ans.length;i++){
            ans[i]=map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}
