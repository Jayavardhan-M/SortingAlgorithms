package utils;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayGenerator {

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        return arr;
    }
}
