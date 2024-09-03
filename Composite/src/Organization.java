import java.util.ArrayList;
import java.util.List;

interface Organization {
    void add(Organization component);
    void remove(Organization component);
    String getName();
    double getSalary();
    void printStructure(StringBuilder xmlBuilder);
}
