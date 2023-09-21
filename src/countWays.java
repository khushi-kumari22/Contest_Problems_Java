public class countWays {
    public static void main(String[] args) {
        int[] nums = {6,0,3,3,6,7,2,7}; // Replace this with your input array
        int ways = countWays(nums);
        System.out.println(ways);
    }
    public static int countWays(int[] nums) {
        int count = 0;
        int max = nums.length;
        int ans = 0;
        for (int i = 0; i < max; i++) {
            if (nums[i] < max) {
                ans = nums[i];
            }
        }
            max = max - 1;
            for (int j = 0; j < ans; j++) {
                if (nums[j] < ans) {
                    count++;
                }
            }
        return count;
    }
}
