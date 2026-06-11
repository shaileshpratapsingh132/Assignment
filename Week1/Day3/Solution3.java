package Week1.Day3;

class Solution3 {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {

        Solution3 obj = new Solution3();

        int[] nums = { 4, 1, 2, 1, 2 };

        System.out.println(obj.singleNumber(nums));
    }
}