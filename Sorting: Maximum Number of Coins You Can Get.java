class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int n=piles.length;
        int i=n-2;
        int num=piles.length/3; 
        int ans=0;
        int count=0;
        while(num>0){
            ans+=piles[i];
            i=i-2;
            num--;
            
        }
        return ans;
    }
}
