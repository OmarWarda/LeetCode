import java.io.*;
import java.util.*;
import java.util.stream.*;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = arr.size(); // Number of rows (and columns since it's a square matrix)

        for (int i = 0; i < n; i++) {
            int test = arr.get(i).get(i);
            primaryDiagonalSum += test; // Left-to-right diagonal
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i); // Right-to-left diagonal
        }

        // Calculate the absolute difference
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        // Test with a sample 3x3 matrix
        List<List<Integer>> arr = new ArrayList<>();

        // Sample input matrix:
        // 1 2 3
        // 4 5 6
        // 9 8 9
        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(9, 8, 9));

        // Calculate the diagonal difference
        int result = diagonalDifference(arr);

        // Print the result
        System.out.println("The absolute diagonal difference is: " + result);
    }
}
