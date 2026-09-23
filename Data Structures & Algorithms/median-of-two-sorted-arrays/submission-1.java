class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int x = nums1.length;
        int y = nums2.length;

        int target = (x+y)/2;

        
        int i = 0;
        int j = 0;

        int prev = 0;
        int curr = 0;
        

        for(int k = 0 ; k <= target ; k++){

            prev = curr;
            
            if(i < x && (j >= y || nums1[i] <= nums2[j])){
                curr = nums1[i];
                i++;
            }
            else{
                curr = nums2[j];
                j++;
            }

        }

        if((x+y)%2 == 0) return (prev+curr)/2.0;

        return curr;
    }
}
