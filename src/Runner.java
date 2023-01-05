import java.util.Arrays;
public class Runner {

    public static void main(String[] args) {

        int[] nums = {6, 4, 3, 9, 2, 5};
        int min = ArrayAlgorithms.minimum(nums);
        System.out.println(min);
        int[] nums2 = {-4, 5, -7, 3};
        int min2 = ArrayAlgorithms.minimum(nums2);
        System.out.println(min2);

        System.out.println("----");

        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));


    }



}


