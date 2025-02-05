import java.util.*;

public class GetMinCores {

    public static int getMinCores(List<Integer> start, List<Integer> end) {
        int[] startArr = new int[start.size()];
        int[] endArr = new int[end.size()];

        // Populate the arrays from the lists
        for (int i = 0; i < start.size(); i++) {
            startArr[i] = start.get(i);
            endArr[i] = end.get(i);
        }

        // Sort both arrays
        Arrays.sort(startArr);
        Arrays.sort(endArr);

        int coresNeeded = 0;
        int currentCores = 0;
        int i = 0, j = 0;

        // Loop until we process all the processes
        while (i < startArr.length) {
            // System.out.println(startArr[i]);
            // System.out.println(endArr[j]);
            if (startArr[i] <= endArr[j]) {

                // A new process is starting before the earliest one ends, we need more cores
                currentCores++;
                coresNeeded = Math.max(coresNeeded, currentCores);
                i++;
            } else {
                // A process has ended, so we free up a core
                currentCores--;
                j++;
            }
        }

        return coresNeeded; // the minimum cores needed
    }

    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(1, 3, 4);
        List<Integer> end = Arrays.asList(3, 5, 6);

        int result = getMinCores(start, end);
        System.out.println("Minimum number of cores: " + result); // Output should be 2
    }
}