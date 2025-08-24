package AlgosLists;

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


//    public boolean radixSearch(List<String> list, String target) throws IllegalArgumentException {
//
//        Queue initial
//    }

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
    public List<Integer> bubbleSort(List<Integer> list) throws IllegalArgumentException {


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
    public List<Integer> mergeSort(List<Integer> list) throws IllegalArgumentException {


        int len = list.size();

        if (len <= 1) {
            return list;
        }

        int mid = len / 2;

        List<Integer> left = mergeSort(list.subList(0, mid));

        List<Integer> right = mergeSort(list.subList(mid + 1, len));

        return merge(left, right);
    }

    public List<Integer> merge(List<Integer> left, List<Integer> right) throws IllegalArgumentException {


        int rInd = 0;

        int lInd = 0;

        List<Integer> merged = new ArrayList<>();

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


}
