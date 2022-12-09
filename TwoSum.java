
import java.util.*;
class HelloWorld {
    
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(m1.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=m1.get(target-nums[i]);
                return result;
            }
            m1.put(nums[i],i);


        }
        return result;
    }
    
    
    public static void main(String[] args) {
 int nums[] = {2,7,11,15};
        int target=9;
        HelloWorld s1=new HelloWorld();
System.out.println(Arrays.toString(s1.twoSum(nums,target)
));

    }
}
