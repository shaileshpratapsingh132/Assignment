class Solution2 {

    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Solution2 obj = new Solution2();

        int[] nums = { 1, 1, 2, 2, 2, 4, 5, 6, 7, 8 };

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}