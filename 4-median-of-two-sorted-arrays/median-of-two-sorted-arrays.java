class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        if (total % 2 == 1) {
            return getKth(nums1, 0, nums2, 0, total / 2 + 1);
        } else {
            int left = getKth(nums1, 0, nums2, 0, total / 2);
            int right = getKth(nums1, 0, nums2, 0, total / 2 + 1);
            return (left + right) / 2.0;
        }
    }

    private int getKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (start1 >= nums1.length) {
            return nums2[start2 + k - 1];
        }
        if (start2 >= nums2.length) {
            return nums1[start1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int half = k / 2;
        int mid1 = (start1 + half - 1 < nums1.length)
                ? nums1[start1 + half - 1]
                : Integer.MAX_VALUE;

        int mid2 = (start2 + half - 1 < nums2.length)
                ? nums2[start2 + half - 1]
                : Integer.MAX_VALUE;

        if (mid1 < mid2) {
            return getKth(nums1, start1 + half, nums2, start2, k - half);
        } else {
            return getKth(nums1, start1, nums2, start2 + half, k - half);
        }
    }
}
