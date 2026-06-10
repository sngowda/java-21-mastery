package dsa_day_01;

public class MinimumElement {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int min = nums[0];

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("The minimum element is "+min);
    }
}
