package AlgosLists;

import java.lang.annotation.Target;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ArrayListAlgos implements Algos {


    public void validation(List<String> list, String target) throws RuntimeException {
        if (target == null||list == null) {
            throw new IllegalArgumentException(Errors.NULL_ERROR);
        }

        try {
            Integer.parseInt(target);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Errors.INT_PARSE_ERROR);
        }

    }


    public boolean linearSearch(List<String> list, String target) throws IllegalArgumentException {

        validation(list, target);

        int tar = Integer.parseInt(target);

        int l = list.size();
        boolean found = false;
        int i = 0;
        while (!found && i < l) {
            if (list.get(i).equals(target)) {
                found = true;
            }
            i++;

        }
        return found;
    }


    public boolean binarySearch(List<String> list, String target) throws IllegalArgumentException {

        validation(list, target);

        boolean found = false;
        int low = 0;
        int high = list.size();
        int mid;


        while (!found && low != high && low != high + 1) {
            mid = (high - low) / 2 + low;

            if (mid == tar) {
                found = true;
            } else if (tar < mid) {
                high = mid;
            } else {
                low = mid + 1;

            }
        }

        return found;


    }


    public List<String> bubbleSort(List<String> list) throws IllegalArgumentException {


        validation(list," ");
        int length = list.size();
        int count = 0;
        boolean switched = true;
        for (int i = 0; i < length - 1; i++) {
            if (!switched) {
                System.out.println(list.toString());
                System.out.println(count);
                return list;
            }
            switched = false;
            for (int j = 0; j < ((length - 1) - i); j++) {
                count++;
                int vj0 = list.get(j);
                int vj1 = list.get(j + 1);
                if (vj0 > vj1) {
                    list.set(j, vj1);
                    list.set((j + 1), vj0);
                    switched = true;
                }
            }

        }
        System.out.println(list.toString());
        System.out.println(count);
        return list;
    }


}
