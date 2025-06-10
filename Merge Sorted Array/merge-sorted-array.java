class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // copy n to m
        if (m == 0) {
            for (int i = 0; i < n; i++)
                nums1[i] = nums2[i];
            return;
        }

        // nothing to merge
        if (n == 0)
            return;

        // take a copy of nums1
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = nums1[i];
        }

        // initialize counters to track both arrays to merge
        int nums1Counter = 0, nums2Counter = 0;
        
        // compare element-by-element, if one array is done, merge the second immediately
        for (int i = 0; i < m + n; i++) {
            if (nums2Counter > n - 1 || (nums1Counter <= m - 1 && nums[nums1Counter] <= nums2[nums2Counter])) {
                nums1[i] = nums[nums1Counter];
                nums1Counter++;
            } else {
                nums1[i] = nums2[nums2Counter];
                nums2Counter++;
            }
        }

    }
}
