import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        System.out.println(result);
        System.out.println(max);
        return result;
    }

    public static void main(String[] args) {
        int[] candies = { 1, 3, 9 };
        int extraCandies = 4;
        kidsWithCandies(candies, extraCandies);
    }
}
