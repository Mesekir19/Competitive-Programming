class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowel=new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int start=0;
        int end=0;
        int sum=0;
        int max=0;
        while(end<k){
            if(vowel.contains(s.charAt(end))){
                sum++;
            }
            end++;
        }
        end--;
        max=sum;
        while(end<s.length()-1){
           if(vowel.contains(s.charAt(start))){
               sum--;
           }
            end++;
            start++;
           if(vowel.contains(s.charAt(end))){
               sum++;   
           }
            max=Math.max(max,sum);
        }
        return max;
        
    }
}
