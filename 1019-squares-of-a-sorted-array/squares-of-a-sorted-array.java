class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = n - 1;

        for (int k = n - 1; k >= 0; k--) {
            int leftsquare = nums[i] * nums[i];
            int rightsquare = nums[j] * nums[j];

            if (leftsquare > rightsquare) {
                ans[k] = leftsquare;
                i++;
            } else {
                ans[k] = rightsquare;
                j--;
            }
        }

        return ans;
    }
}