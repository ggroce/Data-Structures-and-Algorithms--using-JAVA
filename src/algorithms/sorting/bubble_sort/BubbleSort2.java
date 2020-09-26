package algorithms.sorting.bubble_sort;

import java.util.Arrays;

public class BubbleSort2 {

    public int[] booblaySort(int[] arrayToSort) {
        int tmp;
        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < arrayToSort.length - 1 - counter; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = tmp;
                    isSorted = false;
                }
            }
            counter++;
        }

        return arrayToSort;
    }

    public static void main(String[] args) {
        int[] arrayUnsorted = {2, 5, 1, 4, 10, 13, 0, 43, 1, 3};
        BubbleSort2 bubbleSort2 = new BubbleSort2();
        bubbleSort2.booblaySort(arrayUnsorted);
        System.out.println(Arrays.toString(arrayUnsorted));
    }
}
