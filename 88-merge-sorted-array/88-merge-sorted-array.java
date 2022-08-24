class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int one = 0;
        int two = 0;
        
        int[] arr = new int[m+n];
        int i = 0;
        
        while (one < m && two < n) {
            if (nums1[one] <= nums2[two]) {
                arr[i] = nums1[one];
                one++;
            } else {
                arr[i] = nums2[two];
                two++;
            }
            i++;
        }
        
        while (one < m) {
            arr[i] = nums1[one];
            one++;
            i++;
        }
        
        while (two < n) {
            arr[i] = nums2[two];
            two++;
            i++;
        }
        
        for (int t = 0; t < m+n; t++) {
            nums1[t] = arr[t];
        }
    }
}