import java.util.*;

public class twosum {
    
        
        public static int[] twosum( int [] nums ,  int target) {
            
        
            
            
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i =0;i<= nums.length;i++){
                int result = target - nums[i];
                
                if(map.containsKey(result)){
                    return new int [] {map.get(result), i};

                }

                map.put(nums[i], i);
            
            
            }

            return new int[] {};
        }

        public static void main(String[] args) {
            int [] nums = {2 , 7 , 11 ,14 };
            int target = 9;
            int[] ans = twosum(nums, target);
            System.out.println(Arrays.toString(ans));
        }
        }









    

