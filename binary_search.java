class Solution {
    public int search(int[] nums, int target) {

        int less =0;
        int more =nums.length-1;
        while(less <= more){
            int mid = (less + more )/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                more = mid -1;
            }
            else{
                less = mid+1;
            }
        }
        return -1;
    }
}
