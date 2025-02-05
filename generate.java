import java.util.ArrayList;
import java.util.List;

public class generate {

    public static int generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Create NumRows empty lists inside listOfLists
        for (int i = 0; i < numRows; i++) {
            listOfLists.add(new ArrayList<>());
        }
        for (int i = 0; i < listOfLists.size(); i++) {
            for (List<Integer> list : listOfLists) {
                System.out.println(list.size());
                list.add(1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

}
