import java.util.Arrays;
public class Runner {

    public static void main(String[] args) {

        int[] nums = {6, 4, 3, 9, 2, 5};
        int max = ArrayAlgorithms.maximum(nums);
        System.out.println(max);
        int[] nums2 = {-8, -3, -7, -10};
        int max2 = ArrayAlgorithms.maximum(nums2);
        System.out.println(max2);

        System.out.println("----");

        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }


    }






