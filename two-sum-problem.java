
/*O(n) runtime, O(n) space – Hash table:
We could reduce the runtime complexity of looking up a value to O(1) using a hash map
that maps a value to its index.*/


import java.util.*;

class Main {

//--------------[Two SUM function]------------------
    public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];

        map.put(nums[i], i);

        if(map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }
    }

    throw new IllegalArgumentException("No solution");
}

//---------------[ End of Two SUM function]-------------------

//---------------[Main function]-----------------------------

   public static void main(String[] args) {
    int[] array = new int[]{1, 9, 9, 3, 0, 3, 1, 2};
    System.out.println(Arrays.toString(twoSum(array, 12)));
}

//----------[End of Main Function]----------------------------
}
