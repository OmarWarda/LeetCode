import java.io.*;
import java.util.*;

public class Lonelyinteger {
    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();

    }

    public static void main(String[] args) throws IOException {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(1);
        x.add(2);
        x.add(2);
        x.add(3);
        x.add(3);
        x.add(4);
        int res = lonelyinteger(x);
        System.out.println("Unique Number is: " + res);
    }
}
