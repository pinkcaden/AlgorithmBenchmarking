package AlgosLists;

import java.util.ArrayList;

public class Verification {

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
