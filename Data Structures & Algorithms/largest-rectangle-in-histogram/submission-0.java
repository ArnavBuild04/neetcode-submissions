class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] stl = new int[heights.length];
        int[] str = new int[heights.length];

        Stack<Integer> stack = new Stack<>();

        for( int i = 0 ; i < heights.length ; i++ ){    

               while(!stack.empty() && heights[stack.peek()] >= heights[i]){
                  stack.pop();
               }

               if(!stack.empty()) {
                 stl[i] = stack.peek();
               }
               else stl[i] = -1;
            
               stack.push(i);
        }
        
        stack.clear();
        
        for( int i = heights.length-1 ; i>=0 ; i-- ){    

            while(!stack.empty() && heights[stack.peek()] >= heights[i]){
                  stack.pop();
            }

            if(!stack.empty()) {
                str[i] = stack.peek();
            }
            else str[i] = -1;
            
            stack.push(i);
        }
        
        int ans = 0;

        for(int i = 0 ; i < heights.length ; i++){
           
           int left  = stl[i] == - 1 ? i : i - stl[i] - 1; 
           int right = str[i] == -1 ? heights.length - i - 1: str[i] - i - 1;
           
           ans = Math.max(ans , heights[i] * (left + right + 1));
        }
        
        return ans;
    }
}
