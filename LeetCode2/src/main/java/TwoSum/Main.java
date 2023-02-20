package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7,1,2};
        System.out.println(twoSum(numbers, 12));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] twoInt = new int[2];
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i])) {
                twoInt[0] = map.get(nums[i]);
                twoInt[1] = map.get(target - nums[i]);
                return twoInt;
            }
        }

        Map<Character, Integer> map2 = new HashMap<>();
        System.out.println(map2);
        return twoInt;
    }


}
