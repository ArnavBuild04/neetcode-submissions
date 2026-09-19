class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        
        for(int i = temperatures.length - 1 ; i >= 0 ; i --){
             
            if(stack.empty()) {

                stack.push(i);
                ans[i]=0;

            } 
            else{

                while(!stack.empty() && temperatures[stack.peek()] <= temperatures[i]){
                    stack.pop();
                }
                
                if(!stack.empty()){
                    ans[i] = stack.peek() - i;
                }
                else{
                    ans[i] = 0;
                }
                stack.push(i);

            }

        }

        return ans;
    }
}
