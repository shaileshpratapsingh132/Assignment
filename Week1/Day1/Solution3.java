class Solution3 {

    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Solution3 obj = new Solution3();

        int[] nums = { 3, 2, 2, 3, 1, 4, 5, 67, 7, 9 };
        int k = obj.removeElement(nums, 3);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}