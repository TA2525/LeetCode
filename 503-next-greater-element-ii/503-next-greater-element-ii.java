class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int p = i + 1; p < nums.length; p++) {
                if (nums[p] > nums[i]) {
                    answer[i] = nums[p];
                    found = true;
                    break;
                }
            }
            if (!found) {
                for (int q = 0; q < i; q++) {
                    if (nums[q] > nums[i]) {
                    answer[i] = nums[q];
                    found = true;
                    break;
                }
                }
            }
            if (!found) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}