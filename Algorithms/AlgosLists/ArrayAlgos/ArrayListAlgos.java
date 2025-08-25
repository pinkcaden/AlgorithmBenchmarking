package ArrayAlgos;

import java.sql.Array;
import java.util.*;


public class ArrayListAlgos implements Algos {


    public boolean linearSearch(List<Integer> list, int target) throws IllegalArgumentException {


        int l = list.size();
        boolean found = false;
        int i = 0;
        while (!found && i < l) {
            if (list.get(i) == target) {
                found = true;
            }
            i++;

        }
        return found;
    }


    public boolean binarySearch(List<Integer> list, int target) throws IllegalArgumentException {


        boolean found = false;
        int low = 0;
        int high = list.size();
        int mid;


        while (!found && low != high && low != high + 1) {
            mid = (high - low) / 2 + low;

            if (mid == target) {
                found = true;
            } else if (target < mid) {
                high = mid;
            } else {
                low = mid + 1;

            }
        }

        return found;


    }

    // Features O(n^2) TC at W and A. At A TC is calc using distance between stops. At W TC is sum of n natural numbers formula.
    // O(n) TC at B, no swaps. O(1) SC at W.
    static public ArrayList<Integer> bubbleSort(ArrayList<Integer> list) throws IllegalArgumentException {


        int length = list.size();
        int count = 0;
        boolean switched = true;
        for (int i = 0; i < length - 1; i++) {
            if (!switched) {

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

        return list;
    }

    // Features O(n*log(n)) TC in all cases. O(n) SC. Very predictable.
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) throws IllegalArgumentException {


        int len = list.size();

        if (len <= 1) {
            return list;
        }

        int mid = len / 2;

        ArrayList<Integer> leftU = new ArrayList<Integer>(list.subList(0, mid));
        ArrayList<Integer> leftS = mergeSort(leftU);

        ArrayList<Integer> rightU = new ArrayList<Integer>(list.subList((mid + 1), len));
        ArrayList<Integer> rightS = mergeSort(rightU);


        return merge(leftS, rightS);


    }






public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) throws IllegalArgumentException {


    int rInd = 0;

    int lInd = 0;

    ArrayList<Integer> merged = new ArrayList<>();

    while (lInd < left.size() && rInd < right.size()) {

        merged.add(Math.min(left.get(lInd), right.get(rInd)));

        lInd++;
        rInd++;

    }
    if (left.isEmpty()) {
        merged.addAll(right);
    } else if (right.isEmpty()) {
        merged.addAll(left);
    }
    return merged;


}

public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) throws IllegalArgumentException {


        for (int i = 1; i < list.size(); i++) {
            int selection = list.get(i);
            for (int j = i - 1; j >= 0; j--) {
                int vj0 = list.get(j);
                int vj1 = list.get(j + 1);
                if (vj1 < vj0) {
                    list.set(j, vj1);
                    list.set((j + 1), vj0);
                }
            }


        }
    return list;

}




}
