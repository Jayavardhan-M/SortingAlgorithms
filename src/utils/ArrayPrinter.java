package utils;

public class ArrayPrinter {

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Print step/iteration if tracing mode is on
    public static void printStepIfTracingEnabled(boolean isTracingModeOn, int step, int[] arr) {
        if (isTracingModeOn) {
            System.out.print("Step/Iteration " + step + ": ");
            printArray(arr);
        }
    }
}
