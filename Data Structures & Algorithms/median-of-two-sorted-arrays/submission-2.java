class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length){

            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            
        }

        int x = nums1.length;
        int y = nums2.length;

        int target = (x+y+1)/2;

        int l = 0;
        int r = x;

        while(l <= r){
            
            int mid = (l+r)/2;
            int cut2 = target - mid;

            int l1 = mid <= 0 ? Integer.MIN_VALUE : nums1[mid-1];
            int r1 = mid >= x ? Integer.MAX_VALUE : nums1[mid];
            int l2 = cut2 <= 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int r2 = cut2 >= y ? Integer.MAX_VALUE : nums2[cut2];


            if(l1 <= r2 && l2 <= r1){
                
                if((x+y)%2 == 0) return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                else return Math.max(l1,l2);

            }
            else if(l2 > r1) l = mid + 1;
            else r = mid - 1; 
          
        }

        return 0.0;
    }
}
