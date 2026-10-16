class Solution {
    public int searchInsert(int[] nums, int target) {

    
   int lh =0;
   int rh = nums.length-1;
   
    while(lh <= rh){
        int mid = (lh + rh)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                rh = mid-1;
            }
            else{
                lh = mid+1;
            }
    
    
    
    }

        return lh;

    }
}
