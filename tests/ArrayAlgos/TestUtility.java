package ArrayAlgos;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUtility {

    static ArrayList<Integer> CsvStringToIntArray(String string) {


        int[] numbers = Arrays.stream(string.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        };
        return list;
    }
    public static boolean isOrdered(ArrayList<Integer> list) {

        int l = list.size();


        for (int i = 1; i < l; i++) {

            if (list.get(i - 1) > list.get(i)) {
                return false;
            }

        }
        return true;

    }

}
