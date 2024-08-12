package Assessment.Marathon;

import java.util.Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,3},new int[]{2})));
    }
    public static int[] merge(int nums1[],int nums2[]) {
        int n = nums1.length;
        int m = nums2.length;
        int a[] = new int[n + m];
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                a[idx++] = nums1[i++];
            } else {
                a[idx++] = nums2[j++];
            }
        }
        if (i != n) {
            while (i < n) {
                a[idx++] = nums1[i++];
            }
        }
        if (j != m) {
            while (j < m) {
                a[idx++] = nums2[j++];
            }
        }
        return a;
    }
}
