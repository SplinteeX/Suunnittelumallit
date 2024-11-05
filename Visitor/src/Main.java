public class Main {
    public static void main(String[] args) {
        // Creating files
        File file1 = new File("document.txt", 10);
        File file2 = new File("image.jpg", 5);
        File file3 = new File("video.mp4", 100);

        // Creating directories
        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        Directory media = new Directory("media");

        // Building the directory structure
        root.addElement(documents);
        root.addElement(media);
        documents.addElement(file1);
        media.addElement(file2);
        media.addElement(file3);

        // Applying SizeCalculatorVisitor
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size of all files: " + sizeVisitor.getTotalSize() + " MB");

        // Applying SearchVisitor with ".txt" search pattern
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Files matching pattern '.txt':");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println("- " + file.getName());
        }
    }
}
