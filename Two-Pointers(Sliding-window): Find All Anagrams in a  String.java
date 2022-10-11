class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int left=0;
        int right=0;
        int count = p.length();
        List<Integer> ans=new ArrayList();
        int[] charCount=new int[26];
        if(n==0 || s==null) return ans;
        
        for(char c: p.toCharArray()){
            charCount[c-'a']++;
        }
        while(right<n){
            if(charCount[s.charAt(right++)-'a']-- >=1){
                count--;
            }
            if(count==0){
                ans.add(left);
            }
            if(right - left == p.length() && charCount[s.charAt(left++)-'a']++ >=0){
                count++;
                
            }
        }
        return ans;
        
    }
}
