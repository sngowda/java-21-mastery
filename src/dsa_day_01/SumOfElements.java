package dsa_day_01;

public class SumOfElements {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        int sum = 0;

        for (int i=0; i< nums.length; i++) {
            sum = sum + nums[i];
        }

        System.out.println("The sum is "+sum);
    }
}
