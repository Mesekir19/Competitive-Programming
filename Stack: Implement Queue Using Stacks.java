class MyQueue {
    
    private Stack<Integer> pushSt=new Stack<>();
    private Stack<Integer> popSt=new Stack<>();
    
    public void push(int x) {
        pushSt.push(x);
    }
    
    public int pop() {
        if(popSt.isEmpty()){
            shiftingStack();
        }
        return popSt.pop();
    }
    
    public int peek() {
        if(popSt.isEmpty()){
            shiftingStack();
        }
        return popSt.peek();
    }
    
    public boolean empty() {
        return popSt.isEmpty() && pushSt.isEmpty();
    }
    public void shiftingStack(){
        while(!pushSt.isEmpty()){
            int temp= pushSt.pop();
            popSt.push(temp);
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
