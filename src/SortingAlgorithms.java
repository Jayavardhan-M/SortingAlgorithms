/**
 * Coded by Jayavardhan M
 */

import sorts.*;
import utils.*;

import java.util.Scanner;

public class SortingAlgorithms {

    public static final String NEW_LINE = "\n";
    public static final String DESIGN_LINE = "************************************************************";
    public static final String WELCOME_TEXT = DESIGN_LINE + NEW_LINE
            + "Welcome to Sorting Algorithms by Jayavardhan M" + NEW_LINE + DESIGN_LINE;

    public static void main(String[] args) {

        System.out.println(WELCOME_TEXT);

        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {

            printMenu();

            int choice = getValidChoice(scanner);
            int size = getValidSize(scanner);
            boolean isTracingModeOn = getValidBoolean(scanner);

            int[] arr = ArrayGenerator.generateRandomArray(size, 0, 100);

            System.out.println(NEW_LINE + "Original Array:");
            ArrayPrinter.printArray(arr);

            System.out.println((!isTracingModeOn) ?
                    NEW_LINE + "(Turn on tracing mode for steps/iterations)" : "");

            switch (choice) {
                case 1 -> {
                    SelectionSort.isTracingModeOn = isTracingModeOn;
                    SelectionSort.selectionSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Selection Sort:");
                }
                case 2 -> {
                    BubbleSort.isTracingModeOn = isTracingModeOn;
                    BubbleSort.bubbleSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Bubble Sort:");
                }
                case 3 -> {
                    InsertionSort.isTracingModeOn = isTracingModeOn;
                    InsertionSort.insertionSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Insertion Sort:");
                }
                case 4 -> {
                    HeapSort.isTracingModeOn = isTracingModeOn;
                    HeapSort.heapSort(arr);
                    System.out.println(NEW_LINE + "Sorted Array using Heap Sort:");
                }
                case 5 -> {
                    QuickSort.isTracingModeOn = isTracingModeOn;
                    QuickSort.quickSort(arr, 0, arr.length - 1);
                    System.out.println(NEW_LINE + "Sorted Array using Quick Sort:");
                }
            }

            ArrayPrinter.printArray(arr);

            System.out.print(NEW_LINE + "Would you like to try another algorithm? (yes/no): ");
            String again = scanner.next().trim().toLowerCase();
            continueRunning = again.equals("yes") || again.equals("y");
            if (continueRunning) System.out.print(NEW_LINE + DESIGN_LINE + NEW_LINE);
        }

        System.out.print(NEW_LINE + "Exiting Application... Thank You!!");
        System.out.print(NEW_LINE + DESIGN_LINE + NEW_LINE);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println(NEW_LINE + "Choose a Sorting Algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Heap Sort");
        System.out.println("5. Quick Sort");
    }

    private static int getValidChoice(Scanner scanner) {
        while (true) {
            System.out.print("Enter choice (1-5): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 5) return choice;
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }

    private static int getValidSize(Scanner scanner) {
        while (true) {
            System.out.print("Enter array size: ");
            if (scanner.hasNextInt()) {
                int size = scanner.nextInt();
                if (size > 0) return size;
            } else {
                scanner.next();
            }
            System.out.println("Invalid size. Please enter a positive integer.");
        }
    }

    private static boolean getValidBoolean(Scanner scanner) {
        while (true) {
            System.out.print("Turn on Tracing Mode? (true/false): ");
            String input = scanner.next().trim().toLowerCase();

            if (input.equals("true")) return true;
            if (input.equals("false")) return false;

            System.out.println("Invalid input. Please enter 'true' or 'false'.");
        }
    }
}
