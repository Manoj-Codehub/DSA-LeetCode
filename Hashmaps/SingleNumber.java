import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find number with count 1
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
//leet gateway error (copied-raw)
