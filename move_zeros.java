class Main {
    public static void main(String[] args) {

int nums[] = {0,0,3,9,6,4,2};

         int s = 0;

     for(int i=0;i<nums.length;i++){
        if(nums[i] != 0){
            nums[s] = nums[i];
            s++;
        }
      
      }
    for(int i =s ;i<nums.length;i++){
        nums[i] = 0;
        
    }

    }
}
