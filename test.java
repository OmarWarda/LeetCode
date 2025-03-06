import java.util.Arrays;

public class test {
    public static int[] findMinMaxSums(int n, int[] arr, int k) {
        int maxSum = 0;
        int minSum = 0;

        for (int i = k; i < n; i++) {
            maxSum += arr[i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            minSum += arr[i];
        }
        return new int[] { maxSum, minSum };
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 1, 1, 1, 1, 1, 1 };
        int k = 3;

        // int n = 5;
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int k = 1;

        // int n = 3;
        // int[] arr = { 5, 6, 7 };
        // int k = 3;
        int[] result = findMinMaxSums(n, arr, k);
        System.out.println(Arrays.toString(result));

    }
}
