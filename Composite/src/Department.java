import java.util.ArrayList;
import java.util.List;

public class Department implements Organization {
    private String name;
    private List<Organization> organizations = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }
    @Override
    public void add(Organization component) {
        organizations.add(component);
    }
    @Override
    public void remove(Organization component) {
        organizations.remove(component);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Organization component : organizations) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }
    @Override
    public void printStructure(StringBuilder xmlBuilder) {
        xmlBuilder.append("<Department name=\"").append(name).append("\">\n");
        for (Organization component : organizations) {
            component.printStructure(xmlBuilder);
        }
        xmlBuilder.append("</Department>\n");
    }

}
