class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastCharIndex=new int[26];
        int max=0;
        int count=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            lastCharIndex[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            int val=lastCharIndex[s.charAt(i)-'a'];
            count++;
            max=Math.max(max,val);
            if(i==max){
                ans.add(count); 
                count=0;
            }
        }
        return ans;
    }
}
