class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int length=people.length;
        int length2=length-1;
        int j=0;
        int count=0;
        Arrays.sort(people);
//         for(int i=0; i<length; i++){
//            for(int k=0; k<length; k++){
//                 int temp=0;
//                if(people[i]> people[k]){
//                    temp=people[i];
//                    people[i]=people[k];
//                    people[k]=temp;
//                }
               
//         } 
//       }
        while(j<=length2){
            if(people[j]+people[length2] <= limit){
                j++;
            }
            count++;
            length2--;
            
        }
        return count;
        
    }
}
