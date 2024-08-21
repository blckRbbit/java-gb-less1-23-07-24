package less6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

    private static int[] arr = new int[10];

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.fillArr();

        System.out.println(Arrays.toString(arr));
        System.out.println(task1.getUniquePercent(arr));

    }

    private String getUniquePercent(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        return set.size() * 100 / (double) arr.length + " %";

    }


    private void fillArr() {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 24);
        }
    }
}
