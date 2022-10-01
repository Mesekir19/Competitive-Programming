class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int first=0;
        int last= height.length-1;
         while(first<last){
             if(height[first]<height[last]){
                area=Math.max(area,height[first]*(last-first));
                 first++;
             }else{
                area=Math.max(area,height[last]*(last-first));
                 last--;
             }
         }
        return area;
             
        
    }
}
