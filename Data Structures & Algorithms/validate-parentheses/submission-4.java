class Solution {
    public boolean isValid(String s) {

       Stack<Character> stack = new Stack<>();

       for(char ch : s.toCharArray()){
          
          if(ch == '(' || ch == '{' || ch == '['){
             stack.push(ch);
          }
          else {
              if(stack.size() > 0){

               switch(ch){
                  case ')' : if(stack.peek() != '(') return false;
                            else stack.pop();
                            break;

                  case '}' : if(stack.peek() != '{') return false;
                            else stack.pop();
                            break;

                  case ']' : if(stack.peek() != '[') return false;
                            else stack.pop();
                            break;

                  default  : return false;
                }

              }
              else return false;
            } 
       }  

       return stack.size() == 0;

    }
}
