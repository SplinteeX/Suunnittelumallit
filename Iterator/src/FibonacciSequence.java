import java.util.Iterator;

public class FibonacciSequence implements Sequence {

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}