class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        
        int a;
        int b;
        for(String s: tokens){
            if("+-*/".contains(s)){
                if("+".equals(s)){
                    stack.push(stack.pop()+stack.pop());
                }else if("-".equals(s)){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a-b);
                }else if("*".equals(s)){
                    stack.push(stack.pop()*stack.pop());
                }else{
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a/b);
                }
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
