
import java.util.*;

public class Main {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                int end = target - nums[i];
                if (map.containsKey(end)){
                    return new int[]{i, map.get(end)};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }



    public static void main(String[] args) {
//        Generic<Integer> generic = new Generic<Integer>(123);
//        System.out.println(generic.getKey());
//        Generic<String> str = new Generic<String>("123");
//        System.out.println(generic.getKey());



    }
}
