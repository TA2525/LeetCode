class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
          if (dict.containsKey(target-nums[i])) {
            return new int[]{dict.get(target-nums[i]), i};
          } else {
            dict.put(nums[i], i);
          }
        }
        return null;
    }
}