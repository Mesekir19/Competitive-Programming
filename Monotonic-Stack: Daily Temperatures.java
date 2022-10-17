class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> stack=new Stack();
        
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]< temperatures[i]){
                int index=stack.pop();
                int diff=i-index;
                ans[index]=diff;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int i=stack.pop();
            ans[i]=0;
        }
        return ans;
    }
}
