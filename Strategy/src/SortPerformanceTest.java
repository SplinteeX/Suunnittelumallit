// SortPerformanceTest.java
import java.util.Arrays;
import java.util.Random;

public class SortPerformanceTest {
    private static final int SMALL_ARRAY_SIZE = 30;
    private static final int LARGE_ARRAY_SIZE = 100_000;

    public static void main(String[] args) {
        Random random = new Random();

        int[] smallArray = random.ints(SMALL_ARRAY_SIZE, 0, 1000).toArray();
        int[] largeArray = random.ints(LARGE_ARRAY_SIZE, 0, 1000).toArray();

        Sorter sorter = new Sorter();
        SortStrategy[] strategies = { new BubbleSort(), new QuickSort(), new MergeSort() };
        String[] strategyNames = { "Bubble Sort", "Quick Sort", "Merge Sort" };

        System.out.println("Performance on Small Array:");
        for (int i = 0; i < strategies.length; i++) {
            int[] arrayCopy = Arrays.copyOf(smallArray, smallArray.length);
            sorter.setSortStrategy(strategies[i]);
            long startTime = System.nanoTime();
            sorter.sort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.printf("%s took %d ns%n", strategyNames[i], (endTime - startTime));
        }

        System.out.println("\nPerformance on Large Array:");
        for (int i = 0; i < strategies.length; i++) {
            int[] arrayCopy = Arrays.copyOf(largeArray, largeArray.length);
            sorter.setSortStrategy(strategies[i]);
            long startTime = System.nanoTime();
            sorter.sort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.printf("%s took %d ns%n", strategyNames[i], (endTime - startTime));
        }
    }
}
