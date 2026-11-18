class Solution {
    public int majorityElement(int[] nums) {
    
int c= nums[0];
int j= 1;

for(int i =1;i<nums.length;i++){
    if(c == nums[i]){
        j++;
    }
    else{
        j--;       
    }
    if(j ==0){
        c= nums[i];
        j=1;
    }
 
}
return c;

    }   
}
