
class Employee implements Organization {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void add(Organization component) {
        throw new UnsupportedOperationException("Cannot add to an employee");
    }
    @Override
    public void remove(Organization component) {
        throw new UnsupportedOperationException("Cannot remove from an employee");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public void printStructure(StringBuilder xmlBuilder) {
        xmlBuilder.append("<employee><name>").append(name).append("</name><salary>").append(salary).append("</salary></employee>");
    }
}
