package algorithms.sorting.insertion_sort;

import java.util.Arrays;

public class InsertionSort2 {

    public int[] insertionSort2(int[] arrayToSort) {
        int tmp;

        for(int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                tmp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i + 1];
                arrayToSort[i + 1] = tmp;

                int j = i;
                while (j > 0 && (arrayToSort[j] < arrayToSort[j - 1])) {
                    tmp = arrayToSort[j - 1];
                    arrayToSort[j - 1] = arrayToSort[j];
                    arrayToSort[j] = tmp;
                    j--;
                }
            }
        }

        return arrayToSort;
    }

    public static void main(String[] args) {
        int[] sortMe = {16, 2, 9, 0, 1, 4, 11, 5, 2, 8, 3};
        InsertionSort2 insertionSort2 = new InsertionSort2();
        insertionSort2.insertionSort2(sortMe);
        System.out.println(Arrays.toString(sortMe));

    }
}
