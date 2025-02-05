import java.util.Arrays;
import java.util.List;

public class moves {

    public static int moves(List<Integer> arr) {
        int i = 0;
        int j = arr.size() - 1;
        int count = 0;
        while (i <= j) {
            if (arr.get(i) % 2 != 0 && arr.get(j) % 2 == 0) {
                count++;
                i++;
                j--;
            }
            if (arr.get(i) % 2 == 0) {
                i++;
            }
            if (arr.get(j) % 2 != 0) {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result3 = moves.moves(arr);
        System.out.println(result3);
    }

}
