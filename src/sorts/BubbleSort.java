package sorts;

import utils.ArrayPrinter;

public class BubbleSort {

    public static boolean isTracingModeOn = false;
    
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            ArrayPrinter.printStepIfTracingEnabled(isTracingModeOn, (i + 1), arr);

            if (!swapped) break; // Optimization
        }
    }
}
