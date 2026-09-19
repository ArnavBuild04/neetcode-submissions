class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
            int a , b;
            switch(s){
                case "+" :  a = stack.peek();
                            stack.pop();
                            b = stack.peek();
                            stack.pop();
                            stack.push(a+b);
                            break;

                case "-" :  a = stack.peek();
                            stack.pop();
                            b = stack.peek();
                            stack.pop();
                            stack.push(b-a);
                            break;

                case "*" :  a = stack.peek();
                            stack.pop();
                            b = stack.peek();
                            stack.pop();
                            stack.push(a*b);
                            break;

                case "/" :  a = stack.peek();
                            stack.pop();
                            b = stack.peek();
                            stack.pop();
                            stack.push(b/a);
                            break;

                default :   break;
            }
          } else {
              stack.push(Integer.parseInt(s));
          }
        }

        return stack.pop();
    }
}
