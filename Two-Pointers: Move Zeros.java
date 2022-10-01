class Solution {
    public void moveZeroes(int[] nums) {
        int length=nums.length;
        
        int j=0;
        int i=1;
        while(i<length){
            if(nums[j]!=0){
                j++;
                i++;
            }else if(nums[i]==0){
                i++;
            }else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
            
        
        // for(int i=0; i<length-1; i++){
        //     if(nums[i]==0){
        //         j=i;
        //         while(j<length-1){
        //             nums[j]=nums[j+1];
        //             j++;
        //             if(j==length-1){
        //                 nums[length-1]=0;
        //             }
        //         }
        //     }
        // }
        for(int k=0; k<length-1; k++){
            System.out.print(nums[k]+",");
        }
    }
}
