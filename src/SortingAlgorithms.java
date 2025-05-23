/**
 * Coded by Jayavardhan M
 */

import sorts.*;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortingAlgorithms {

    public static final String NEW_LINE = "\n";
    public static final String DESIGN_LINE = "************************************************************";
    public static final String WELCOME_TEXT = DESIGN_LINE + NEW_LINE
            + "Welcome to Sorting Algorithms by Jayavardhan M" + NEW_LINE + NEW_LINE
            + "Enter Your Sort Algorithm:" + NEW_LINE
            + "1. Selection Sort" + NEW_LINE
            + "2. Bubble Sort" + NEW_LINE
            + "3. Insertion Sort" + NEW_LINE
            + "4. Heap Sort" + NEW_LINE
            + "5. Quick Sort" + NEW_LINE;

    public static void main(String[] args) {
        System.out.print(WELCOME_TEXT);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(NEW_LINE + "Choose an option (e.g., 1): ");
            int choice = scanner.nextInt();

            System.out.print("Enter array size: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] arr = generateRandomArray(size, 0, 100); // Random values between 0 and 99

            System.out.println(NEW_LINE + "Original Array:");
            printArray(arr);

            switch (choice) {
                case 1 -> {
                    SelectionSort.selectionSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Selection Sort:");
                }
                case 2 -> {
                    BubbleSort.bubbleSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Bubble Sort:");
                }
                case 3 -> {
                    InsertionSort.insertionSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Insertion Sort:");
                }
                case 4 -> {
                    HeapSort.heapSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Heap Sort:");
                }
                case 5 -> {
                    QuickSort.quickSort(arr, 0, arr.length - 1);
                    System.out.println(NEW_LINE + "Sorted Array using Quick Sort:");
                }
                default -> {
                    System.out.println(NEW_LINE + "Invalid choice.");
                    return;
                }
            }

            printArray(arr);
            System.out.println(NEW_LINE + "Thank You!!" + NEW_LINE + DESIGN_LINE);
        }
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
