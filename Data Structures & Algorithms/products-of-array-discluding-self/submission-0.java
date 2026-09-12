class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int pre = 1 , suf = 1;

        for(int i = 0 ; i < nums.length ; i++){
            
            pre = pre * nums[i];
            prefix[i] = pre;

            suf = suf * nums[nums.length - i - 1];
            suffix[nums.length - i - 1] = suf;

        }
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int prefixPro = i > 0 ? prefix[i -1] : 1;
            int postPro = i < nums.length - 1 ? suffix[ i+1 ] : 1;
            
            output[i] = prefixPro * postPro;
        }
        
        return output;
    }
}  
