class Solution {
    public int totalFruit(int[] fruits) {
        int length=fruits.length;
        int last=-1;
        int lastSec=-1;
        int lastCount=0;
        int currentMax=0;
        int max=0;
        
        for(Integer fruit:fruits){
            if(fruit == last || fruit==lastSec){
                currentMax++;
            }else{
                currentMax=lastCount+1; 
            }
            if(fruit == last){
                lastCount++;
            }else{
                lastCount=1;
            }
            if(fruit != last){
                lastSec=last;
                last=fruit;
            }
            max=Math.max(currentMax,max);
        }
    
        return max;
    }
}
