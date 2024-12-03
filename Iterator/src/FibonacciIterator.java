import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int prev = 0; // The first Fibonacci number
    private int current = 1; // The second Fibonacci number

    @Override
    public boolean hasNext() {
        return true; // Fibonacci sequence is theoretically infinite
    }

    @Override
    public Integer next() {
        int nextValue = prev + current; // Generate the next Fibonacci number
        prev = current; // Update the previous value
        current = nextValue; // Update the current value
        return prev; // Return the current Fibonacci number
    }
}