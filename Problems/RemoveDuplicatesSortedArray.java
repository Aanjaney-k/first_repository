import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        
        System.out.println("Length after removing duplicates: " + length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, length)));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; 
        for (int j = 1; j < nums.length; j++) { 
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
