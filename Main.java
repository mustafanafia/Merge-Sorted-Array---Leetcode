import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int nums1[] = { 0,1,2,55,6};

        int nums2[] = { 100,3,2};

        int m = 5;
        int n = 3;



        Main o = new Main();
        o.merge(nums1,m,nums2,n);

    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[m+n];
        

        for(int i =0; i< nums1.length; i++){
            nums3[i] = nums1[i];
        }

        for(int i =0; i< nums2.length; i++){
            nums3[m + i] = nums2[i];
        }


        Arrays.sort(nums3);


        System.out.println(Arrays.toString(Arrays.stream(nums3).toArray()));

    }
}

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i = 0, j = m; i < n; i++) {
//            nums1[j] = nums2[i];
//            j++;
//        }
//        Arrays.sort(nums1);
//    }