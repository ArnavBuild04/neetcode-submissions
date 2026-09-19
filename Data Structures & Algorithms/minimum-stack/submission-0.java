class MinStack {

    private Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        
        if(stack.empty()){
            stack.push(new int[]{val,val});
        }
        else{
            int peek = stack.peek()[1];
            if(peek > val) {
               stack.push(new int[]{val,val});
            }
            else stack.push(new int[]{val,peek});
        }

    }
    
    public void pop() {
        stack.pop();
        return;
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}
