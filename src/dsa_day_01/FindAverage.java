package dsa_day_01;

public class FindAverage {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        int sum = 0;

        for (int i=0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int avg = sum/ nums.length;
        System.out.println("The average is "+avg);
    }
}
