class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int sum=0;
        int ans=0;
        int n=nums.length;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n;i++){
            if(i<firstLen){
                sum+=nums[i];
                a[i]=sum;
            }else{
                sum+=nums[i]-nums[i-firstLen];
                a[i]=Math.max(a[i-1],sum);
            }
        }
        sum=0;
        for(int i=n-1; i>=0;i--){
            if(i+secondLen>=n){
                sum+=nums[i];
                b[i]=sum;
            }else{
                sum+=nums[i]-nums[i+secondLen];
                b[i]=Math.max(b[i+1],sum);
            }
        }
        
        for(int i=firstLen-1; i<n-secondLen;i++){
            ans=Math.max(ans,a[i]+b[i+1]);
        }
        
        a=new int[n];
        b=new int[n];
        sum=0;
        for(int i=0; i<n;i++){
            if(i<secondLen){
                sum+=nums[i];
                a[i]=sum;
            }else{
                sum+=nums[i]-nums[i-secondLen];
                a[i]=Math.max(a[i-1],sum);
            }
        }
        sum=0;
        for(int i=n-1; i>=0;i--){
            if(i+firstLen>=n){
                sum+=nums[i];
                b[i]=sum;
            }else{
                sum+=nums[i]-nums[i+firstLen];
                b[i]=Math.max(b[i+1],sum);
            }
        }
        
        for(int i=secondLen-1; i<n-firstLen;i++){
            ans=Math.max(ans,a[i]+b[i+1]);
        }
        return ans;

    }
}
