package AlgosLists;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;


public class Algorithms {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        Random random = new Random(time.toNanoOfDay());

        ArrayList<Integer> list = new ArrayList<Integer>();

        int upB = -1;

        int lowB = 1;

        int range = upB - lowB;

        int target = 0;

        int length = 1000;


        for (int i = 0; i < length; i++) {

            list.addLast((random.nextInt() % range) - lowB);
        }
        int randEl = list.get(length / 2);


        System.out.println(Verification.isOrdered(bubbleSort(list)));

    }


    private static boolean linearSearch(ArrayList<Integer> list, int target) {
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
    private static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        int length = list.size();
        int count = 0;
        boolean switched = true;
        for (int i = 0; i < length - 1; i++) {
            if (!switched){
                System.out.println(list.toString());
                System.out.println(count);
//                return list;
            }
            switched = false;
            for (int j = 0; j < length - 1; j++){
                count++;
                int vj0 = list.get(j);
                int vj1 = list.get(j+1);
                if (vj0 > vj1) {
                    list.set(j, vj1);
                    list.set((j+1), vj0);
                    switched = true;
                }
            }

        }
        System.out.println(list.toString());
        System.out.println(count);
        return list;
    }




}
