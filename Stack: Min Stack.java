class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    
    public void push(int val) {
        if(stack2.isEmpty()|| val<=stack2.peek()){
            stack2.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(stack2.peek())){
            stack2.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
