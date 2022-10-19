class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>0;i--){
            for(int j=1;j<=i;j++){
                if(arr[j]==i+1){
                    reverse(arr,j);
                    ans.add(j+1);
                }
            }
            reverse(arr,i);
            ans.add(i+1);
        }
        return ans;
    }
    
    private void reverse(int[] arr,int jIndex){
        for(int i=0;i<=jIndex/2;i++){
            int temp=arr[i];
            arr[i]=arr[jIndex-i];
            arr[jIndex-i]=temp;
        }
    }
}
