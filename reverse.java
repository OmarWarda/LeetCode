public class reverse {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] testArr = { 1, 2, 3, 4, 5, 6 };
        reverse(testArr, 0, testArr.length - 1);
        for (int i : testArr) {
            System.out.print(i + " ");
        }
    }
}
