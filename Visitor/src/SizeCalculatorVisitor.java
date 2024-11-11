public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        // No action needed here for directories in terms of size.
    }

    public int getTotalSize() {
        return totalSize;
    }
}