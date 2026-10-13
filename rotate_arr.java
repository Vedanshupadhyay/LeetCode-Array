class Solution {
    public void rotate(int[] nums, int k) {
        
        int l = nums.length;
        k = k % nums.length;

        int ar[]= new int [l];

        for(int i =0;i<nums.length;i++){
            ar[(k+i) % l] = nums[i];
        }
        for(int i =0;i<nums.length;i++){
            nums[i] = ar[i];
        }




    }
}
