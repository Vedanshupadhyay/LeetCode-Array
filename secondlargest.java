class Main {
    public static void main(String[] args) {
          
int nums[] = {5,6,3,9,6,4,2};
  
  int max = nums[0];
  int secmax = -1;

  for(int i =1;i<nums.length;i++){
    if(nums[i] > max){
      secmax = max;
      max = nums[i];
    }
    else if(nums[i]< max && nums[i]> secmax){
      secmax = nums[i];
      
    }
    
  }
        System.out.println(secmax);


    }
}
