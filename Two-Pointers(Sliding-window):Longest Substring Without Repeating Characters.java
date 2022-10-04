class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        int max=0;
        int right=0;
        int left=0;
        while(right<length){
            int indexFirst=s.indexOf(s.charAt(right),left);
            if(indexFirst!=right){
                left=indexFirst+1;
                
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        
        return max;
    }
}
