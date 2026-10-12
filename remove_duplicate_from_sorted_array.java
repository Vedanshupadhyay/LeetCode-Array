class Solution {
    public static void main(String[] args) {
int nums[] = {3,3,9,9,4,2};
        int in = 1;
    
        for(int i =1;i<nums.length;i++){
            if(nums[i] != nums[in-1]){
                nums[in] = nums[i];
                in++;
            }
        }

        return in;


    }
}
